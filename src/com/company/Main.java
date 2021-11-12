/********************************************************************************
 * Name             : Nirmal L.Y.T.
 * Index No         : 19/ENG/072
 * Registration No  : EN93921
 *********************************************************************************/

/********************************************************************************
 * In here I have tried two methods and One method got some errors.
 * So the first code is presented.
 *
 * Other one is uploaded to github.
 * https://github.com/timnirmal/Football-Simulation-Java-CLI.git
 *********************************************************************************/


package com.company;

import java.util.*;

// Football game simulator
public class Main {
    public static void main(String[] args) {

        String status = "";
        String lastGoalPlayedBy = "";
        // get current time
        Date date = new Date();
        long time = date.getTime();

        // List of colors
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "White", "Black", "Pink", "Yellow"));

        // HashMap to store teams
        HashMap<String, Team> teams = new LinkedHashMap<String, Team>();

        // Create two teams
        for (int i = 0; i < 2; i++) {
            // Create Team as Team-1
            Team team1 = new Team();

            // Get random color from colors
            int randomColor = (int) (Math.random() * colors.size());
            String color = colors.get(randomColor);

            // Remove Selected random color from colors
            colors.remove(color);

            team1.setTeamName("Team-" + (i + 1));
            team1.setTeamNumber(i + 1);
            team1.setTeamScore(0);
            team1.setTeamColor(color);

            // Create 18 players and add to Team team1
            for (int j = 0; j < 18; j++) {
                // Generate random number between 1 and 10
                int randomNumber = (int) (Math.random() * 10) + 1;

                Player player = new Player();

                player.setName("Player " + (j + 1));
                player.setTeam("Team-" + i);
                player.setPlayerNumber(j + 1);
                // 12 - 18 players positions is substitute
                if (j >= 12) {
                    player.setPlayerPosition("Substitute");
                } else {
                    player.setPlayerPosition("Player");
                }
                player.setPlayerScore(0);
                player.setPlayerSkill(randomNumber);
                team1.addPlayer(player);
            }

            // Change Player1 as Goalie
            team1.getPlayers().get(0).setPlayerPosition("Goalie");

            // add Coach and Doctor for team1
            Coach coach = new Coach();
            coach.setName("Coach");
            coach.setTeam("Team-" + i);
            team1.setCoach(coach);

            Doctor doctor = new Doctor();
            doctor.setName("Doctor");
            doctor.setTeam("Team-" + i);
            team1.setDoctor(doctor);

            teams.put("Team-" + (i + 1), team1);
        }

        /////// Now 2 Teams are done and added to teams HashMap

        int team1Score = 0;
        int team2Score = 0;

        // Game starts by tossing
        // A random number is selected from 1 and 2
        int tossWinner = (int) (Math.random() * 2) + 1;

        System.out.println("\nToss Winner is Team-" + tossWinner);


        // Now team is selected and they can start the game

        // But we need to define method to players to play the game
        // For that each player is assigned skill level (For now it just skill not specified one)
        // Generate a randrom number from 1 to 10
        // -> Lets set that at initializing team

        // If that random number is larger than skill level of player then player get a goal
        // -> Now in each iteration of game, randomly select a player from team and a random number is generated

        // Next
        // Player skills are seperated into 4 categories
        // Goalie (1) - Blocking (2) - Passing (3) - Shooting (4)
        // Defender (4) - Protect


        // Time begin
        long startTime = System.currentTimeMillis();

        //// First Half ////
        status = "First Half";
        long timeInterval = 45L;

        while (System.currentTimeMillis() - startTime < timeInterval) {

            // Match Goes Here
            // Scoreboard
            Scoreboard(status, lastGoalPlayedBy, teams, startTime);

            // Random number from 2 to 10
            int randomPlayer = (int) (Math.random() * 10) + 2;

            // Print random player
            System.out.println("Player " + randomPlayer + " has the Goal");

            // Select random number from 1 to 11
            int randomNumber = (int) (Math.random() * 11) + 1;

            // if random number is 11
            if (randomNumber == 11) {
                // Goal out of the field
                // So team changes
                tossWinner = (tossWinner == 1) ? 2 : 1;
                System.out.println("Team-" + tossWinner + " is now Playing");
            }

            // If random number is lesser than player skill then player get a goal
            if (randomNumber < teams.get("Team-" + tossWinner).getPlayers().get(randomPlayer).getPlayerSkill()) {
                // Player get a goal
                teams.get("Team-" + tossWinner).getPlayers().get(randomPlayer).setPlayerScore(teams.get("Team-" + tossWinner).getPlayers().get(randomPlayer).getPlayerScore() + 1);

                // Team-tosswinner in teams HashMap (set) Score increased 1
                teams.get("Team-" + tossWinner).setTeamScore(teams.get("Team-" + tossWinner).getTeamScore() + 1);

                // Team score is incremented
                if (tossWinner == 1) {
                    team1Score++;
                } else {
                    team2Score++;
                }

                // Print player name and score
                lastGoalPlayedBy = teams.get("Team-" + tossWinner).getPlayers().get(randomPlayer).getName();
                System.out.println(lastGoalPlayedBy + " scored a goal");

            } else {
                // Player won't get a goal. Change teams after goal
                tossWinner = (tossWinner == 1) ? 2 : 1;
                //print team changed
                System.out.println("No Goal\nTeam-" + tossWinner + " is now Playing");
            }
            //System.out.println("\nTeam-1 Score " + team1Score + "  Team-2 Score " + team2Score);
            System.out.println("\n");

            // Clear console
            System.out.print("\033[H\033[2J");
            System.out.flush();

        }


        //// Interval ////
        status = "Interval";
        timeInterval = 15L;

        System.out.println("Interval");

        Scoreboard(status, lastGoalPlayedBy, teams, startTime);

        // Sleep for 15 seconds
        try {
            Thread.sleep(timeInterval * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n\nInterval ends in 15s.");

        // Clear console
        System.out.print("\033[H\033[2J");
        System.out.flush();


        //// Second Half ////
        status = "Second Half";
        timeInterval = 45L;
        startTime = System.currentTimeMillis();

        while (System.currentTimeMillis() - startTime < timeInterval) {
            Scoreboard(status, lastGoalPlayedBy, teams, startTime);

            // Random number from 2 to 10
            int randomPlayer = (int) (Math.random() * 10) + 2;
            System.out.println("Player " + randomPlayer + " has the Goal");

            // Select random number from 1 to 11
            int randomNumber = (int) (Math.random() * 11) + 1;
            if (randomNumber == 11) {
                tossWinner = (tossWinner == 1) ? 2 : 1;
                System.out.println("Team-" + tossWinner + " is now Playing");
            }

            // If random number is lesser than player skill then player get a goal
            if (randomNumber < teams.get("Team-" + tossWinner).getPlayers().get(randomPlayer).getPlayerSkill()) {
                // Player get a goal
                teams.get("Team-" + tossWinner).getPlayers().get(randomPlayer).setPlayerScore(teams.get("Team-" + tossWinner).getPlayers().get(randomPlayer).getPlayerScore() + 1);
                teams.get("Team-" + tossWinner).setTeamScore(teams.get("Team-" + tossWinner).getTeamScore() + 1);

                // Team score is incremented
                if (tossWinner == 1) team1Score++;
                else team2Score++;

                lastGoalPlayedBy = teams.get("Team-" + tossWinner).getPlayers().get(randomPlayer).getName();
                System.out.println(lastGoalPlayedBy + " scored a goal");
            } else {
                tossWinner = (tossWinner == 1) ? 2 : 1;
                System.out.println("No Goal\nTeam-" + tossWinner + " is now Playing");
            }
            System.out.println("\n");

            // Clear console
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        //////////////////////////////////////////////////////////  WINNER CHOOSING METHOD //////////////////////////////////////////////////////////

        // At the end of the second Half Choose winner

        if (team1Score > team2Score) {
            System.out.println("Team 1 wins!");
        } else if (team1Score < team2Score) {
            System.out.println("Team 2 wins!");
        } else {
            System.out.println("It's a tie!");

            // Now additional 15 min time is given for players
            //// Extra 15 min ////
            status = "Extra Time";
            timeInterval = 150L;

            while (System.currentTimeMillis() - startTime < timeInterval) {
                Scoreboard(status, lastGoalPlayedBy, teams, startTime);

                // Random number from 2 to 10
                int randomPlayer = (int) (Math.random() * 10) + 2;
                System.out.println("Player " + randomPlayer + " has the Goal");
                int randomNumber = (int) (Math.random() * 11) + 1;

                // if random number is 11
                if (randomNumber == 11) {
                    tossWinner = (tossWinner == 1) ? 2 : 1;
                    System.out.println("Team-" + tossWinner + " is now Playing");
                }

                // If random number is lesser than player skill then player get a goal
                if (randomNumber < teams.get("Team-" + tossWinner).getPlayers().get(randomPlayer).getPlayerSkill()) {
                    teams.get("Team-" + tossWinner).getPlayers().get(randomPlayer).setPlayerScore(teams.get("Team-" + tossWinner).getPlayers().get(randomPlayer).getPlayerScore() + 1);
                    teams.get("Team-" + tossWinner).setTeamScore(teams.get("Team-" + tossWinner).getTeamScore() + 1);
                    if (tossWinner == 1) team1Score++;
                    else team2Score++;

                    // Print player name and score
                    lastGoalPlayedBy = teams.get("Team-" + tossWinner).getPlayers().get(randomPlayer).getName();
                    System.out.println(lastGoalPlayedBy + " scored a goal");
                } else {
                    tossWinner = (tossWinner == 1) ? 2 : 1;
                    System.out.println("No Goal\nTeam-" + tossWinner + " is now Playing");
                }
                System.out.println("\n");

                // Clear console
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }

            // Clear console
            System.out.print("\033[H\033[2J");
            System.out.flush();

            if (team1Score > team2Score) {
                System.out.println("Team 1 wins!");
            } else if (team1Score < team2Score) {
                System.out.println("Team 2 wins!");
            } else {
                // Now 5 opportunities given for shoot the ball.
                int team1Shots = 0;
                int team2Shots = 0;

                // Penalty shootout
                status = "Penalty Shootout";

                team1Shots = getTeam1Shots(team1Shots);
                team2Shots = getTeam1Shots(team2Shots);

                if (team1Shots > team2Shots) {
                    System.out.println("Team 1 wins!");
                } else if (team1Shots < team2Shots) {
                    System.out.println("Team 2 wins!");
                } else {
                    System.out.println("It's a tie!");
                }

            }
        }


        System.out.println("\nTeam Details " + teams.keySet());

        // Print items in hashmap
        for (String key : teams.keySet()) {
            System.out.println(key + " " + teams.get(key).getTeamName());
            System.out.println(teams.get(key).getPlayers());
            System.out.println(teams.get(key).getCoach().getName());
            System.out.println(teams.get(key).getDoctor().getName());
            System.out.println(teams.get(key).toStrings());
            System.out.println("\n");
        }

    }

    private static int getTeam1Shots(int team1Shots) {
        for (int i = 0; i < 5; i++) {
            // Random number from -2 to 7
            int randomPlayer = (int) (Math.random() * 7) - 2;
            team1Shots += randomPlayer;
        }
        return team1Shots;
    }

    private static void Scoreboard(String status, String lastGoalPlayedBy, HashMap<String, Team> teams, long startTime) {
        //////////////////////////////////////////////////////////////////////// SCORE BOARD ////////////////////////////////////////////////////////////////////////

        System.out.print("\t\t\t");
        // Names of two teams
        for (String key : teams.keySet()) {
            System.out.print(teams.get(key).getTeamName() + "\t\t\t");
        }
        System.out.print("\nScore " + "\t\t\t");


        // Number of goals in each team
        for (String key : teams.keySet()) {
            System.out.print(teams.get(key).getTeamScore() + "\t\t\t");
        }

        // Last goal played by whom
        System.out.print("\n\nLast Goal Played By " + lastGoalPlayedBy);
        // Period of the game : first half / interval / second half / extra time / penalty shots to end the game
        System.out.print("\nPeriod of Game " + status);

        // Time to end the game
        System.out.println("\nTime to End the Game " + (System.currentTimeMillis() - startTime) + " S\n");

        //////////////////////////////////////////////////////////////////////// SCORE BOARD ////////////////////////////////////////////////////////////////////////
    }
}