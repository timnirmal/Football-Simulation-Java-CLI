package com.company;

import java.util.ArrayList;
import java.util.List;

// Football game simulator
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Things in Scorecard
        // Time and First Half | Second Half | Interval
        // Score of Each team

        int team1Score = 0;
        int team2Score = 0;

        // Game starts by tossing
        // A random number is selected from 1 and 2
        for (int i = 0; i < 10; i++) {
            int tossWinner = (int) (Math.random() * 2) + 1;
            System.out.println("Toss Winner is " + tossWinner);
        }

        // Now team is selected and they can start the game

        // Goalie (1) - Blocking (2) - Passing (3) - Shooting (4)
        // Defender (4) - Protect
        // Midfielder (3)
        // Striker (3)

        // But for now Goalie(1), Player(10) and Substitute(7) are used.

        // Create Team 1
        // Team team1 = new Team();
        // team1.setTeamName("Team 1");
        // team1.setTeamId(1);
        // team1.setTeamScore(0);
        // team1.setTeamGoalie(1);
        // team1.setTeamPlayer(10);
        // team1.setTeamSubstitute(7);

        Player player1 = new Player();
        player1.setPlayerNumber(1);
        player1.setName("Player 1");
        player1.setPlayerPosition("Goalie");
        player1.setPlayerScore(0);
        player1.setTeam("Team-1");



        // Create Team as Team-1
        Team team1 = new Team();

        team1.setTeamName("Team-1");
        team1.setTeamNumber(1);
        team1.setTeamScore(0);
        team1.setTeamColor("Red");
        team1.addPlayer(player1);

        // Create Team as Team-2
        Team team2 = new Team();

        team1.setTeamName("Team-1");
        team1.setTeamNumber(1);
        team1.setTeamScore(0);
        team1.setTeamColor("Red");
        team1.addPlayer(player1);

        // Create 18 players and add to Team team1
        for (int i = 0; i < 18; i++) {
            Player player = new Player();
            player.setPlayerNumber(i + 1);
            player.setName("Player " + (i + 1));
            player.setPlayerPosition("Player");
            player.setPlayerScore(0);
            player.setTeam("Team-1");
            team1.addPlayer(player);
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
