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


        // Things in Scorecard
        // Names of two teams
        // Number of goals in each team
        // Last goal played by whom
        // Period of the game : first half / interval / second half / extra time / penalty shots to end the game
        // Time to end the game

        // Time and First Half | Second Half | Interval
        // Score of Each team

        // Goalie (1) - Blocking (2) - Passing (3) - Shooting (4)
        // Defender (4) - Protect
        // Midfielder (3)
        // Striker (3)

        // But for now Goalie(1), Player(10) and Substitute(7) are used.



        // List of colors
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "White", "Black", "Pink", "Yellow"));

        HashMap<String ,Team> teams = new LinkedHashMap<String ,Team>();

        for (int i = 0; i < 2; i++) {
            // Create Team as Team-1
            Team team1 = new Team();

            // Get random color from colors
            int randomColor = (int) (Math.random() * colors.size());
            String color = colors.get(randomColor);
            //System.out.println("Random color is " + color);
            // Remove color from colors
            colors.remove(color);

            team1.setTeamName("Team-"+(i+1));
            team1.setTeamNumber(i+1);
            team1.setTeamScore(0);
            team1.setTeamColor(color);

            // Create 18 players and add to Team team1
            for (int j = 0; j < 18; j++) {
                // Generate random number between 1 and 10
                int randomNumber = (int) (Math.random() * 10) + 1;

                Player player = new Player();

                player.setName("Player " + (j + 1));
                player.setTeam("Team-"+i);
                player.setPlayerNumber(j + 1);
                // 12 - 18 players positions is substitute
                if (j >= 12) {
                    player.setPlayerPosition("Substitute");
                }
                else {
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
            coach.setTeam("Team-"+i);
            team1.setCoach(coach);

            Doctor doctor = new Doctor();
            doctor.setName("Doctor");
            doctor.setTeam("Team-"+i);
            team1.setDoctor(doctor);

            teams.put("Team-"+(i+1), team1);
        }

        //System.out.println(teams.get("Team-1").getPlayers().get(0).toString());

        // Print Team-1 size
        //System.out.println("Team-1 size is " + teams.get("Team-1").getPlayers().size());








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
        long timeInterval = 50L;

        // Print team1Score and team2Score
        //System.out.println("\nTeam-1 Score is " + team1Score + "  Team-2 Score is " + team2Score);

        while (System.currentTimeMillis() - startTime < timeInterval) {

            // Match Goes Here

            //////////////////////////////////////////////////////////////////////// SCORE BOARD ////////////////////////////////////////////////////////////////////////


            System.out.print("\t\t\t");
            // Names of two teams
            for (String key : teams.keySet()) {
                //System.out.printf(key + " name is " + teams.get(key).getTeamName());
                System.out.print(teams.get(key).getTeamName()+"\t\t\t");
            }
            System.out.print("\nScore "+"\t\t\t");


            // Number of goals in each team
            for (String key : teams.keySet()) {
                System.out.print(teams.get(key).getTeamScore()+"\t\t\t");
            }

            // Last goal played by whom
            System.out.print("\n\nLast Goal Played By " + lastGoalPlayedBy);
            // Period of the game : first half / interval / second half / extra time / penalty shots to end the game
            System.out.print("\nPeriod of Game " + status);

            // Time to end = System.currentTimeMillis() - startTime

            // Time to end the game
            System.out.println("\nTime to End the Game " + (System.currentTimeMillis() - startTime) + "\n");


            //////////////////////////////////////////////////////////////////////// SCORE BOARD ////////////////////////////////////////////////////////////////////////


















            // Since tosswinner is selected they got the chance to play the match first
            // Select random player from team1
            //int randomPlayer = (int) (Math.random() * teams.get("Team-"+tossWinner).getPlayers().size());

            // Select random player from team1 except Goalie
            // Fix : Goalie | Player1 is selected (Not sure but need to check)
            //int randomPlayer = (int) (Math.random() * (teams.get("Team-"+tossWinner).getPlayers().size() - 1)) + 1;

            // Random number from 1 to 11
            int randomPlayer = (int) (Math.random() * 10) + 2;


            // Print random player
            System.out.println("Random player is " + randomPlayer);

            // Select random number from 1 to 11
            int randomNumber = (int) (Math.random() * 11) + 1;

            // if random number is 11
            if (randomNumber == 11) {
                // Goal out of the field
                // So team changes
                tossWinner = (tossWinner == 1) ? 2 : 1;
                System.out.println("Team-"+tossWinner + " is now Playing");
            }

            // If random number is lesser than player skill then player get a goal
            if (randomNumber < teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerSkill()) {
                // Player get a goal
                teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).setPlayerScore(teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerScore() + 1);

                // Team in teams HashMap set teamster by 1
                teams.get("Team-"+tossWinner).setTeamScore(teams.get("Team-"+tossWinner).getTeamScore() + 1);

                // Team score is incremented
                if (tossWinner == 1) {
                    team1Score++;
                }
                else {
                    team2Score++;
                }

                // Print player name and score
                lastGoalPlayedBy = teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getName();
                System.out.println(lastGoalPlayedBy + " scored a goal");


            }
            else {
                // Player won't get a goal
                // For now lets change teams after goal
                tossWinner = (tossWinner == 1) ? 2 : 1;
                //print team changed
                System.out.println("No Goal\nTeam-"+tossWinner + " is now Playing");
            }
            //System.out.println("\nTeam-1 Score " + team1Score + "  Team-2 Score " + team2Score);
            System.out.println("\n");

        }

        //// Interval ////
        status = "Interval";
        timeInterval = 150L;

        while (System.currentTimeMillis() - startTime < timeInterval) {
            // Match Goes Here
        }
        
        
        //// Second Half ////
        status = "Second Half";
        timeInterval = 450L;

        while (System.currentTimeMillis() - startTime < timeInterval) {
            // Match Goes Here
        }


        // At the end of the second Half Choose winner
        {
            if (team1Score > team2Score) {
                System.out.println("Team 1 wins!");
            }
            else if (team1Score < team2Score) {
                System.out.println("Team 2 wins!");
            }
            else {
                System.out.println("It's a tie!");

                // Now additional 15 min time is given for players
                //// Extra 15 min ////
                status = "Extra Time";
                timeInterval = 150L;

                while (System.currentTimeMillis() - startTime < timeInterval) {
                    // Match Goes Here
                }





                if (team1Score > team2Score) {
                    System.out.println("Team 1 wins!");
                } else if (team1Score < team2Score) {
                    System.out.println("Team 2 wins!");
                } else {
                    System.out.println("It's a tie!");

                    // Now 5 opportunities given for shoot the ball.
                    int team1Shots = 0;
                    int team2Shots = 0;

                    // Penalty shootout
                    status = "Penalty Shootout";

                    if (team1Shots > team2Shots) {
                        System.out.println("Team 1 wins!");
                    } else if (team1Shots < team2Shots) {
                        System.out.println("Team 2 wins!");
                    } else {
                        System.out.println("It's a tie!");
                    }

                }
            }
        }

        System.out.println("Items in HashMap are " + teams.keySet());

        // Print items in hashmap
        for (String key : teams.keySet()) {
            System.out.println(key + " " + teams.get(key));
            System.out.println(teams.get(key).getPlayers());
            System.out.println(teams.get(key).getCoach());
            System.out.println(teams.get(key).getDoctor());
            System.out.println(teams.get(key).toStrings());
            System.out.println("\n");
        }

        // 2d matrix of characters
        char[][] matrix = new char[19][29];

        matrix = new char[][]{
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X',},
        };



        // Change console color
        System.out.println("\u001B[31m");

        // print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+", ");
            }
            System.out.println();
        }


        // Length = 64 + some value
        // Width = 44 + some value
    }
}

// Football
// Team has 11 to 18 members
// Goalie - Prevents the ball pass into the goal area
// 1 Couches and 1 Doctor

// Find : In the football ground, there is a main referee and four referees in the four edges of the ground. T

// First Half (45 min) | Interval (15 min) | Second Half (45 min)
// If tie, another 15 min will be played.
// If that also tied, each team will given 5 opportunity to shoot ball to the goal.

// Team to play first is choosen by coin toss.
// No penalties.


// Game Rules:

// 1. Game start from ball in center of the field.
//
// 2. Then team which won the toss get they chance to kick. - KICK OFF
//      The players should be in their initial positions. (4 3 3)
//
// 3. a. First ball is considered as directly go in to the goal or not, or out of the filed.
// 3. b. Then Goto goal, or not, Out of the filed, Passed in to Player and other conditions are applied.
//
// 4. When ball go out of the field (Side lines), Change the team and let them to throw the ball from where the ball left the filed
//
// 5. When ball go out from the goal line,
//      CORNER KICK - if defending team have the ball, then they can kick the ball from the Corners.
//      GOAL KICK - if opposing team last touch the ball, goalie of defending team kick ball from the goal box.
//
//  Those are the simples rules used in this Game.
//
//  But there are some other,
//
//  7. Substitution - 3 player can be taken and replaced from the subusing players. No injury are considered.
//




// Defender - Protects the goal area
// Midfielder - Plays the ball between the goal area and the goal
// Forward - Plays the ball between the goal area and the goal
// Goalkeeper - Protects the goal
// Player - Has a name, age, height, weight, and position
// Team - Has a name, and a list of players
// Game - Has a team and a score
// Competition - Has a list of teams and a winner
// League - Has a list of competitions and a winner
// World Cup - Has a list of leagues and a winner

// Classes
// players, couches, referees, and doctors are considered as person.
// The ball, football ground, goal area,and scoreboard are considered as objects


// Kick off
// At the start of the socer period or after goal therir is kick off from the center circle.
// All the socer players must be in the ir side of the filed and kick off player can only be in the circle.(Penalty kick)

// Substitution
// Max 7 subs can be named. But only 3 can be substituted.
// After that if player get injured, no replacement can be done.

// Throw in
// When ball goes out in the filed , the team which touch the ball last losses' possession of the ball.
// The opponenet team get the cahance and they can throw the ball from where the it gone out.


// Corner Kick
// when the defending team last touches the ball and it crosses the goal line, without scoring a goal.
// Opposing team get the chance to Kick the ball from the corner.

// Goal Kick
// When the offensive team last touches the ball and it crosses the goal line, without scoring a goal.
// Goalue get chance to kick the ball from the goal box.

// Penalty KiCk

// Free Kick

// Out of bound

// Team formation
// 4 defenders, 4 midfielders, 2 forwards, 1 goalkeeper

// Goalie can touch ball when in goal box. Cant touch ball when in outside of the goal area.
// Save goal and do drop kicks to far away from the goal area.

// Forwards
