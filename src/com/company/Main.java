package com.company;

import java.util.*;

// Football game simulator
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Things in Scorecard
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
            System.out.println("Random color is " + color);
            // Remove color from colors
            colors.remove(color);

            team1.setTeamName("Team-"+i);
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

            teams.put("Team-"+i, team1);
        }

        System.out.println(teams.get("Team-1").getPlayers().get(0).toString());

        // Print Team-1 size
        System.out.println("Team-1 size is " + teams.get("Team-1").getPlayers().size());

        /////// Now 2 Teams are done and added to teams HashMap


        int team1Score = 0;
        int team2Score = 0;

        // Game starts by tossing
        // A random number is selected from 1 and 2
        int tossWinner = (int) (Math.random() * 2) + 1;
        System.out.println("Toss Winner is " + tossWinner);


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
        long timeInterval = 900L;

        while (System.currentTimeMillis() - startTime < timeInterval) {
            // Match Goes Here
            // Since tosswinner is selected they got the chance to play the match first
            // Select random player from team1
            int randomPlayer = (int) (Math.random() * teams.get("Team-"+tossWinner).getPlayers().size());

            // Select random number from 1 to 11
            int randomNumber = (int) (Math.random() * 11) + 1;

            // if random number is 11
            if (randomNumber == 11) {
                // Goal out of the field
                // So team changes

            }
            // If random number is greater than player skill then player get a goal
            if (randomNumber < teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerSkill()) {
                // Player get a goal
                teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).setPlayerScore(teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerScore() + 1);

                // Team in teams HashMap set teamscore by 1
                teams.get("Team-"+tossWinner).setTeamScore(teams.get("Team-"+tossWinner).getTeamScore() + 1);

                // Team score is incremented
                if (tossWinner == 1) {
                    team1Score++;
                }
                else {
                    team2Score++;
                }

                // Print player name and score
                System.out.println(teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getName() + " scored a goal");

                // Print team score
                System.out.println("Team-"+tossWinner + " score is " + teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerScore());
            }
            else {

            }

        }

        //// Second Half ////
        timeInterval = 900L;

        while (System.currentTimeMillis() - startTime < timeInterval) {
            // Match Goes Here
        }




        /*
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
                if (team1Score > team2Score) {
                    System.out.println("Team 1 wins!");
                } else if (team1Score < team2Score) {
                    System.out.println("Team 2 wins!");
                } else {
                    System.out.println("It's a tie!");

                    // Now 5 opportunities given for shoot the ball.
                    int team1Shots = 0;
                    int team2Shots = 0;

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
        */


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

// Rules
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
