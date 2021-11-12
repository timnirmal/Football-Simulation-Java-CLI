package com.company;

import java.util.*;

// Football game simulator
public class Main {
    public static void main(String[] args) {

        // 2d matrix of characters
        char[][] matrix = new char[19][29];

        matrix  = new char[][]{
                //0    1    2    3    4    5    6    7    8    9   10   11   12   13   14   15   16   17   18   19   20   21   22   23   24   25   26   27   28   29   30   31   32   33   34
                {'|', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '|'}, //0
                {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'}, //1
                {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'}, //2
                {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'}, //3
                {'|', '-', '-', '-', '-', '-', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '-', '-', '-', '-', '-', '|'}, //4
                {'|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|'}, //5
                {'|', '-', '-', '-', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ', '-', '-', '-', '|'}, //6
                {'|', ' ', ' ', '|', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '-', '-', '-', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ', '|', ' ', ' ', '|'}, //7
                {'|', ' ', ' ', '|', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '/', ' ', ' ', ' ', '\\', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ', '|', ' ', ' ', '|'}, //8
                {'|', ' ', ' ', '|', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ', '|', ' ', ' ', '|'}, //9
                {'|', ' ', ' ', '|', '0', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', '0', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', '0', '|', ' ', ' ', '|'}, //10
                {'|', ' ', ' ', '|', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ', '|', ' ', ' ', '|'}, //11
                {'|', ' ', ' ', '|', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '\\', ' ', ' ', ' ', '/', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ', '|', ' ', ' ', '|'}, //12
                {'|', ' ', ' ', '|', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '-', '-', '-', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ', '|', ' ', ' ', '|'}, //13
                {'|', '-', '-', '-', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ', '-', '-', '-', '|'}, //14
                {'|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|'}, //15
                {'|', '-', '-', '-', '-', '-', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '-', '-', '-', '-', '-', '|'}, //16
                {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'}, //17
                {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'}, //18
                {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'}, //19
                {'|', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '|'}, //20
        };






        // Goal Postion x and y
        int goalX = 17;
        int goalY = 10;

        matrix[goalY][goalX] = 'G';











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
                int kickSkill = (int) (Math.random() * 10) + 4;
                int speedSkill = (int) (Math.random() * 10) + 2;

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
                player.setPlayerKickSkill(kickSkill);
                player.setPlayerSpeedSkill(speedSkill);
                team1.addPlayer(player);
            }

            // Change Player1 as Goalie
            team1.getPlayers().get(0).setPlayerPosition("Goalie");
            // Change Player2 as Main Striker
            team1.getPlayers().get(11).setPlayerPosition("MainStriker");

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


        ///////////////////////// Initialize the game //////////////////////////////

        {
            // For team 1

            // (2,10) -> X (Goalie)
            matrix[10][2] = 'X';
            teams.get("Team-1").getPlayers().get(0).setPlayerPositionX(2);
            teams.get("Team-1").getPlayers().get(0).setPlayerPositionY(10);

            
            // (17,9) -> X (Main Sticker - Initial Kick)

            matrix[9][17] = 'X';
            // set Player 1 object in team-1 Xposition and yposition
            teams.get("Team-1").getPlayers().get(10).setPlayerPositionX(17);
            teams.get("Team-1").getPlayers().get(10).setPlayerPositionY(9);

            // for 9 with 3 , 6, 14, 17 (Players - Back)

            // (9,3) -> X
            matrix[3][9] = 'X';
            teams.get("Team-1").getPlayers().get(1).setPlayerPositionX(9);
            teams.get("Team-1").getPlayers().get(1).setPlayerPositionY(3);

            // (9, 6) -> X
            matrix[6][9] = 'X';
            teams.get("Team-1").getPlayers().get(2).setPlayerPositionX(9);
            teams.get("Team-1").getPlayers().get(2).setPlayerPositionY(6);


            // (9, 14) -> X
            matrix[14][9] = 'X';
            teams.get("Team-1").getPlayers().get(3).setPlayerPositionX(9);
            teams.get("Team-1").getPlayers().get(3).setPlayerPositionY(14);

            // (9, 17) -> X
            matrix[17][9] = 'X';
            teams.get("Team-1").getPlayers().get(4).setPlayerPositionX(9);
            teams.get("Team-1").getPlayers().get(4).setPlayerPositionY(17);


            // for 12 with 3, 6, 14, 17 (Players - Front)

            // (12,3) -> X
            matrix[3][12] = 'X';
            teams.get("Team-1").getPlayers().get(5).setPlayerPositionX(12);
            teams.get("Team-1").getPlayers().get(5).setPlayerPositionY(3);

            // (12, 6) -> X
            matrix[6][12] = 'X';
            teams.get("Team-1").getPlayers().get(6).setPlayerPositionX(12);
            teams.get("Team-1").getPlayers().get(6).setPlayerPositionY(6);

            // (12, 14) -> X
            matrix[14][12] = 'X';
            teams.get("Team-1").getPlayers().get(7).setPlayerPositionX(12);
            teams.get("Team-1").getPlayers().get(7).setPlayerPositionY(14);

            // (12, 17) -> X
            matrix[17][12] = 'X';
            teams.get("Team-1").getPlayers().get(8).setPlayerPositionX(12);
            teams.get("Team-1").getPlayers().get(8).setPlayerPositionY(17);

            // for 15 with 15 19 (Players - Striker)

            // (5,15) -> X
            matrix[5][15] = 'X';
            teams.get("Team-1").getPlayers().get(9).setPlayerPositionX(15);
            teams.get("Team-1").getPlayers().get(9).setPlayerPositionY(5);

            // (15,15) -> X
            //matrix[15][15] = 'X';
            //teams.get("Team-1").getPlayers().get(10).setPlayerPositionX(15);
            //teams.get("Team-1").getPlayers().get(10).setPlayerPositionY(15);




            ////// For Team 2 //////

            // (32,10) -> X (Goalie)
            matrix[10][32] = 'O';
            teams.get("Team-2").getPlayers().get(0).setPlayerPositionX(32);
            teams.get("Team-2").getPlayers().get(0).setPlayerPositionY(10);

            // (17,11) -> O (Main Sticker - Initial Kick)

            matrix[11][17] = 'O';
            // set Player 1 object in team-1 Xposition and yposition
            teams.get("Team-2").getPlayers().get(10).setPlayerPositionX(17);
            teams.get("Team-2").getPlayers().get(10).setPlayerPositionY(11);

            // for 25 with 3, 6, 14, 17 (Players - Back)

            // (3, 25) -> O
            matrix[3][25] = 'O';
            teams.get("Team-2").getPlayers().get(1).setPlayerPositionX(3);
            teams.get("Team-2").getPlayers().get(1).setPlayerPositionY(25);


            // (6, 25) -> O
            matrix[6][25] = 'O';
            teams.get("Team-2").getPlayers().get(2).setPlayerPositionX(6);
            teams.get("Team-2").getPlayers().get(2).setPlayerPositionY(25);

            // (14, 25) -> O
            matrix[14][25] = 'O';
            teams.get("Team-2").getPlayers().get(3).setPlayerPositionX(14);
            teams.get("Team-2").getPlayers().get(3).setPlayerPositionY(25);

            // (17, 25) -> O
            matrix[17][25] = 'O';
            teams.get("Team-2").getPlayers().get(4).setPlayerPositionX(17);
            teams.get("Team-2").getPlayers().get(4).setPlayerPositionY(25);

            // for 22 with 3, 6, 14, 17 (Players - Front)

            // (3, 22) -> O
            matrix[3][22] = 'O';
            teams.get("Team-2").getPlayers().get(5).setPlayerPositionX(3);
            teams.get("Team-2").getPlayers().get(5).setPlayerPositionY(22);

            // (6, 22) -> O
            matrix[6][22] = 'O';
            teams.get("Team-2").getPlayers().get(6).setPlayerPositionX(6);
            teams.get("Team-2").getPlayers().get(6).setPlayerPositionY(22);

            // (14, 22) -> O
            matrix[14][22] = 'O';
            teams.get("Team-2").getPlayers().get(7).setPlayerPositionX(14);
            teams.get("Team-2").getPlayers().get(7).setPlayerPositionY(22);

            // (17, 22) -> O
            matrix[17][22] = 'O';
            teams.get("Team-2").getPlayers().get(8).setPlayerPositionX(17);
            teams.get("Team-2").getPlayers().get(8).setPlayerPositionY(22);


            // for 5 with 15 19 (Players - Striker)

            // (19,5) -> O
            //matrix[5][19] = 'O';
            //teams.get("Team-2").getPlayers().get(9).setPlayerPositionX(19);
            //teams.get("Team-2").getPlayers().get(9).setPlayerPositionY(5);

            // (19,15) -> O
            matrix[15][19] = 'O';
            teams.get("Team-2").getPlayers().get(9).setPlayerPositionX(19);
            teams.get("Team-2").getPlayers().get(9).setPlayerPositionY(15);


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






        /////// Now 2 Teams are done and added to teams HashMap


        int team1Score = 0;
        int team2Score = 0;

        // Game starts by tossing
        // A random number is selected from 1 and 2
        int tossWinner = (int) (Math.random() * 2) + 1;
        System.out.println("\nToss Winner is Team-" + tossWinner);

        boolean initialKick = true;

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
        long timeInterval = 1000L;

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

            int randomPlayer;
            int xDirection;
            int yDirection;
            char tossWinnerChar;
            int playingTeam = tossWinner;

            // If tema- tosswinner is 1 then
            if (tossWinner == 1) {
                xDirection = 1;
                yDirection = 1;
                tossWinnerChar = 'X';
            }
            else {
                xDirection = -1;
                yDirection = -1;
                tossWinnerChar = 'O';
            }

            // Random number from 1 to 11

            //
            if (initialKick) {
                randomPlayer = 10;
                initialKick = false;

                //===================================================== INITIAL KICK ======================================================//

                // Player 1 of team- + tosswiner get Xposition
                System.out.println("\nInitial Kick " );

                // Team 1 is X and Team 2 is Y
                // Team 1 is in -x direction and Team 2 is in +x direction
                // So Team 1 will kick in the +x direction and Team 2 will kick in the -x direction
                // But since this is initial kick, direction changes and to randomly picked player

                randomPlayer = 10;

                // We need players 10 kicking skill
                System.out.println(teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerKickSkill());

                // This is X amount ball moves in Y direction
                //MovementGenerator(teams.get("Team-"+tossWinner).getPlayers().get(10).getPlayerKickSkill());

                // This is X amount ball moves in X direction
                //MovementGenerator(teams.get("Team-"+tossWinner).getPlayers().get(10).getPlayerKickSkill());


                // Clear current ball position
                matrix[goalY][goalX] = ' ';

                // Move ball in X direction
                // Only for initial kick xDirection will be changed
                goalX = goalX - (xDirection * MovementGenerator(teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerKickSkill()));
                // Move ball in Y direction
                goalY = goalY + MovementGenerator(teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerKickSkill());

                // Print goal position
                matrix[goalY][goalX] = 'G';

                //===================================================== INITIAL KICK ======================================================//

                // print matrix
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j]+" ");
                    }
                    System.out.println();
                }

                /*
                // Sleep for 2 seconds
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                */

                //===================================================== PLAYER MOVEMENT ======================================================//

                // Players current position
                int playerX = teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerPositionX();
                int playerY = teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerPositionY();

                // Players new position
                int newPlayerX = playerX + MovementGenerator(teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerSpeedSkill());
                int newPlayerY = playerY + MovementGenerator(teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerSpeedSkill());

                // Set new positions for player
                teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).setPlayerPositionX(newPlayerX);
                teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).setPlayerPositionY(newPlayerY);

                // Display new positions
                System.out.println("Player " + randomPlayer + " new position " + newPlayerX + " " + newPlayerY);

                // Clear matrix[playrey][playerx] position
                matrix[playerY][playerX] = ' ';

                // If team- tosswinner is 1 then
                if (tossWinner == 1) {

                    matrix[newPlayerY][newPlayerX] = 'X';
                }
                else {
                    matrix[newPlayerY][newPlayerX] = 'O';
                }

                //===================================================== PLAYER MOVEMENT ======================================================//

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


            }
            else {
                randomPlayer = (int) (Math.random() * 10) + 2;

                // Select the closet players from each team.

                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                //////////////////////////////////////////////////////////////////////// CLOSER PLAYER FIND AND DO MOVEMENTS ///////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


                // Create hashmap of distance and player id
                HashMap<Double, Integer> playerDistance = new HashMap<Double, Integer>();

                // clear hashmap
                playerDistance.clear();

                // Print gaol position
                System.out.println("Goal position " + goalX + " " + goalY + "\n");






                // For each player in team 1
                for (int i = 1; i < 11; i++) {
                    // Get xpositions
                    int playerX = teams.get("Team-1").getPlayers().get(i).getPlayerPositionX();
                    int playerY = teams.get("Team-1").getPlayers().get(i).getPlayerPositionY();

                    // distance from goal
                    //int pyth = (Math.abs(playerX - goalX)) ^ 2 + (Math.abs(playerY - goalY)) ^ 2;
                    int pyth = ((Math.abs(playerX - goalX) ^ 2) + (Math.abs(playerY - goalY) ^ 2));
                    double distance = Math.sqrt(pyth);


                    //Player Number
                    int playerId = teams.get("Team-1").getPlayers().get(i).getPlayerNumber();

                    /*

                        System.out.println("Player " + (i+1) + " position " + playerX + " " + playerY);
                        System.out.println(Math.abs(playerX - goalX));
                        System.out.println((Math.abs(playerX - goalX)^2));
                        System.out.println(Math.abs(playerY - goalY));
                        System.out.println((Math.abs(playerY - goalY)^2));
                        System.out.println(((Math.abs(playerX - goalX)^2) + (Math.abs(playerY - goalY)^2)));
                        System.out.println("Double " + pyth);
                        System.out.println("Double " + ((Math.abs(playerX - goalX)^2) + (Math.abs(playerY - goalY)^2)));

                        //convert int to double
                        double pythDouble = pyth;

                        System.out.println("Double " + pythDouble);
                        System.out.println(Math.sqrt(pyth));
                        //System.out.println(squareRoot(pyth, 0.00001));
                    */

                    // Print distance
                    System.out.println("Distance from goal " + distance + " for player " + playerId + " at position " + playerX + " " + playerY);

                    //add distance and player id to hashmap
                    playerDistance.put(distance, playerId);
                }

                // Print hashmap
                System.out.println(playerDistance);

                // Sort hash map by distance
                List<Double> distanceList = new ArrayList<Double>(playerDistance.keySet());

                Collections.sort(distanceList);
                // Get lowest distance from distance list
                double lowestDistance = distanceList.get(0);

                // Get player id from lowest distance
                int playerIdTeam1 = playerDistance.get(lowestDistance);

                // Print player id
                System.out.println("Player " + playerIdTeam1 + " is the closest to the goal And " + lowestDistance);


                // Create hashmap of distance and player id
                HashMap<Double, Integer> playerDistance2 = new HashMap<Double, Integer>();

                // clear hashmap
                playerDistance2.clear();


                // For team 2
                for (int i = 1; i < 11; i++) {
                    // Get xpositions
                    int playerX = teams.get("Team-2").getPlayers().get(i).getPlayerPositionX();
                    int playerY = teams.get("Team-2").getPlayers().get(i).getPlayerPositionY();

                    // distance from goal
                    //int pyth = (Math.abs(playerX - goalX)) ^ 2 + (Math.abs(playerY - goalY)) ^ 2;
                    int pyth = ((Math.abs(playerX - goalX) ^ 2) + (Math.abs(playerY - goalY) ^ 2));
                    double distance = Math.sqrt(pyth);


                    //Player Number
                    int playerId = teams.get("Team-2").getPlayers().get(i).getPlayerNumber();

                    /*

                        System.out.println("Player " + (i+1) + " position " + playerX + " " + playerY);
                        System.out.println(Math.abs(playerX - goalX));
                        System.out.println((Math.abs(playerX - goalX)^2));
                        System.out.println(Math.abs(playerY - goalY));
                        System.out.println((Math.abs(playerY - goalY)^2));
                        System.out.println(((Math.abs(playerX - goalX)^2) + (Math.abs(playerY - goalY)^2)));
                        System.out.println("Double " + pyth);
                        System.out.println("Double " + ((Math.abs(playerX - goalX)^2) + (Math.abs(playerY - goalY)^2)));

                        //convert int to double
                        double pythDouble = pyth;

                        System.out.println("Double " + pythDouble);
                        System.out.println(Math.sqrt(pyth));
                        //System.out.println(squareRoot(pyth, 0.00001));
                    */

                    // Print distance
                    System.out.println("Distance from goal " + distance + " for player " + playerId + " at position " + playerX + " " + playerY);

                    //add distance and player id to hashmap
                    playerDistance2.put(distance, playerId);
                }

                // Print hashmap
                System.out.println(playerDistance2);

                // Sort hash map by distance
                List<Double> distanceList2 = new ArrayList<Double>(playerDistance2.keySet());
                Collections.sort(distanceList);
                // Get lowest distance from distance list
                double lowestDistance2 = distanceList2.get(0);

                // Get player id from lowest distance
                int playerIdTeam2 = playerDistance2.get(lowestDistance2);

                // Print player id
                System.out.println("Player " + playerIdTeam2 + " is the closest to the goal And " + lowestDistance2);


                ///// Now pick the Closet player

                if (lowestDistance < lowestDistance2) {
                    System.out.println("Team 1 is the closest to the goal");
                    System.out.println("Player " + playerIdTeam1 + " is the closest to the goal");
                    randomPlayer = playerIdTeam1;
                    playingTeam = 1;
                }
                else if (lowestDistance2 < lowestDistance) {
                    System.out.println("Team 2 is the closest to the goal");
                    System.out.println("Player " + playerIdTeam2 + " is the closest to the goal");
                    randomPlayer = playerIdTeam2;
                    playingTeam = 2;
                }
                else {
                    System.out.println("Both teams are equally close to the goal. No Goal");
                    continue;
                }

            }


            // Print random player
            System.out.println("Random player is " + randomPlayer);

            // Now we have the closet player to the goal from the two teams. And Team 1 or Team 2

            // Clear current ball position
            matrix[goalY][goalX] = ' ';

            // Move ball in X direction
            // Only for initial kick xDirection will be changed
            goalX = goalX - (xDirection * MovementGenerator(teams.get("Team-"+playingTeam).getPlayers().get(randomPlayer).getPlayerKickSkill()));
            // Move ball in Y direction
            goalY = goalY + MovementGenerator(teams.get("Team-"+playingTeam).getPlayers().get(randomPlayer).getPlayerKickSkill());

            // Print goal position
            matrix[goalY][goalX] = 'G';

            // Print Random Player Movement

            tossWinner = playingTeam;

            // Players current position
            System.out.println("Position "+ teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerPositionX());
            System.out.println("Position "+ teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerPositionY());


            PlayerMovement(matrix, teams, tossWinner, randomPlayer,xDirection,yDirection);

            // Players current position
            System.out.println("Position "+ teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerPositionX());
            System.out.println("Position "+ teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerPositionY());

            //////////////////////////////////////////////////////////////////////// CLOSER PLAYER FIND AND DO MOVEMENTS ///////////////////////////////////////////////////

                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            //////////////////////////////////////////////////////////////////////// REST OF THE PLAYERS MOVEMENTS /////////////////////////////////////////////////////////

            // Now we need to move rest of the players



            // playing team
            // Loop through all players except the random player
            for (int i = 1; i < 10; i++) {
                // print player object
                System.out.println("\n" + teams.get("Team-"+tossWinner).getPlayers().get(i));

                // Print team 1 in hashmap
                System.out.println(teams.get("Team-1"));



                // Get player xposition and yposition
                int playerX = teams.get("Team-"+playingTeam).getPlayers().get(i).getPlayerPositionX();
                int playerY = teams.get("Team-"+playingTeam).getPlayers().get(i).getPlayerPositionY();

                // player position - goal position
                int playerPositionX = playerX - goalX;
                int playerPositionY = playerY - goalY;

                // when y>0 player is above the goal
                // Same for x and y

                // In team 2
                // - of the team 1

                // If boundary foun hchange direction

                // Find goal to net

                playerX = PlayerDirection(playerPositionX);
                playerY = PlayerDirection(playerPositionY);


                if (tossWinner == 2) {
                    playerX = -playerX;
                    playerY = -playerY;
                }


                if (i != randomPlayer) {
                    // Print for player number
                    System.out.println("For Player " + i);

                    // Move player
                    PlayerMovement(matrix, teams, playingTeam, i, playerX, playerY);

                    // Print Matrix
                    printMatrix(matrix);

                }
            }

            // Other team
            int defendingTeam = playingTeam == 1 ? 2 : 1;

            // For player in other team
            for (int i = 1; i < 11; i++) {

                System.out.println("Second Team");

                // Get player xposition and yposition
                int playerX = teams.get("Team-"+defendingTeam).getPlayers().get(i).getPlayerPositionX();
                int playerY = teams.get("Team-"+defendingTeam).getPlayers().get(i).getPlayerPositionY();

                // player position - goal position
                int playerPositionX = playerX - goalX;
                int playerPositionY = playerY - goalY;

                // when y>0 player is above the goal
                // Same for x and y

                // In team 2
                // - of the team 1

                // If boundary foun hchange direction

                // Find goal to net

                playerX = PlayerDirection(playerPositionX);
                playerY = PlayerDirection(playerPositionY);

                if (tossWinner == 2) {
                    playerX = -playerX;
                    playerY = -playerY;
                }

                // Move player
                PlayerMovement(matrix, teams, defendingTeam, i, playerX, playerY);
                printMatrix(matrix);
            }

















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
            if (randomNumber < 100) {
                /*
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


                // Change team-tosswinner team player randomplayer xposition yposition
                //teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).setPlayerPositionX(6);


                // We need to set up initial kick

                // Get the ball current position
                // Find the closet player from each team
                // Evaluate the time taken to reach ball by distance and speed
                // kick the ball by distance of his kick skill
                // Repeat this

                // If goal goes out of the field then team changes

                // Kick direction is the goal area x and y direction.

                // Move direction is the ball current position x and y direction.


                //get team-1 player 3 xposition and yposition
                playerX = teams.get("Team-1").getPlayers().get(3).getPlayerPositionX();
                playerY = teams.get("Team-1").getPlayers().get(3).getPlayerPositionY();

                //matrix[playerY][playerX] = 'd';


             */

                printMatrix(matrix);

                // Clear hashmap

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


        // Kick Ball
        //


        // Length = 16(64) + some value (13)
        // Width = 11(44) + some value (8)
    }

    // This is setuped for Team1, Team 2 will - of the result
    private static int PlayerDirection(int playerPosition) {
        int Direction;
        int[] DirectionArray;

        if (playerPosition < 0) {
            DirectionArray = new int[]{1, 1, -1};
        }
        else {
            DirectionArray = new int[]{1, -1, -1};
        }
        Direction = DirectionArray[(int) (Math.random() * DirectionArray.length)];
        return Direction;
    }

    private static void printMatrix(char[][] matrix) {
        // Change console color
        System.out.println("\u001B[31m");

        // print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void PlayerMovement(char[][] matrix, HashMap<String, Team> teams, int tossWinner, int randomPlayer, int xDirection, int yDirection) {
        //===================================================== PLAYER MOVEMENT ======================================================//

        // X and Y direction decide


        // Get goal positions

        // Players current position
        int playerX = teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerPositionX();
        int playerY = teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerPositionY();

        System.out.println("Player X: " + playerX + " Player Y: " + playerY + "Need to change");

        matrix[playerX][playerY] = ' ';


        // Print current position
        System.out.println("Player " + randomPlayer + " is at " + playerX + " " + playerY);

        int generatedX = MovementGenerator(teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerSpeedSkill());
        int generatedY = MovementGenerator(teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerSpeedSkill());

        // Print generated position
        System.out.println("Player " + randomPlayer + " Generated values are " + (generatedX) + " " + (generatedY));

        // Players new position
        int newPlayerX = playerX + (xDirection * generatedX);
        int newPlayerY = playerY + (yDirection * generatedY);

        // size of matrix
        int matrixSizeX = matrix.length;        // Goal Lines
        int matrixSizeY = matrix[0].length;     // Side Lines

        // Display new positions
        System.out.println("Player " + randomPlayer + " new position " + newPlayerX + " " + newPlayerY);

        // Print matrix size
        System.out.println("Matrix size " + matrixSizeX + " " + matrixSizeY);

        // Check if player is out of bounds (Side Lines)
        if (newPlayerX < 0 || newPlayerX >= matrixSizeX) {
            newPlayerX = playerX;
            System.out.println("Player " + teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getName() + " is out of bounds!");
            xDirection = -xDirection;
            newPlayerX = playerX +  (2 * xDirection * generatedX);
            // print new position
            System.out.println("NewX "+newPlayerX);
        }

        if (newPlayerY < 0 || newPlayerY >= matrixSizeY) {
            newPlayerY = playerY;
            System.out.println("Player " + teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getName() + " is out of bounds!");
            yDirection = -yDirection;
            newPlayerY = playerY + (2 * yDirection * generatedY);
            System.out.println("NewY "+ newPlayerY);
        }


        // Set new positions for player
        teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).setPlayerPositionX(newPlayerX);
        teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).setPlayerPositionY(newPlayerY);

        // Get new positions for player
        System.out.println(teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerPositionX());
        System.out.println(teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getPlayerPositionY());

        // Display new positions
        System.out.println("Player " + randomPlayer + " new position " + newPlayerX + " " + newPlayerY);

        // Clear matrix[playrey][playerx] position
        // if error in matrix call Playermovement again

        // if matrix out of bounds call Playermovement again
        if (newPlayerX < 0 || newPlayerX >= matrixSizeX || newPlayerY < 0 || newPlayerY >= matrixSizeY) {
            System.out.println("Error.....");
        }

        // if matrix out of bounds call Playermovement again
        if (newPlayerX < 0 ) {
            System.out.println("Error...1111111111111111111..............................");
            System.out.println(newPlayerX);
        }
        if ( newPlayerX >= matrixSizeX){
            System.out.println("Error....22222222222222...................................");
            System.out.println(newPlayerX);
            System.out.println(matrixSizeY);
        }
        if (newPlayerY < 0){
            System.out.println("Error....3333333333333......................................");
            System.out.println(newPlayerY);
        }
        if (newPlayerY >= matrixSizeY){
            System.out.println("Error.....44444444444444....................................");
            System.out.println(newPlayerY);
            System.out.println(matrixSizeX);
        }

        // Print player position

        playerX = newPlayerX;
        playerY = newPlayerY;

        System.out.println("Player " + randomPlayer + " new position " + playerX + " " + playerY + " " + newPlayerX + " " + newPlayerY);

        matrix[newPlayerX][newPlayerY] = ' ';

        // If team- tosswinner is 1 then
        if (tossWinner == 1) {
            matrix[newPlayerX][newPlayerY] = 'X';
        }
        else {
            matrix[newPlayerX][newPlayerY] = 'O';
        }
        //===================================================== PLAYER MOVEMENT ======================================================//


    }

    private static int MovementGenerator(int playerSkill) {
        // Then lets get randomMultiplier from 7 to 10
        int randomMultiplier = (int) (Math.random() * 4) + 7;

        // Movement length will be equal to player kicking skill * randomMultiplier / 30
        float movementLength = (float) (playerSkill * randomMultiplier / 30);

        // round movementLength to nearest integer
        movementLength = (float) Math.round(movementLength);

        // Print movementLength Fix : Delete :
        System.out.println("Movement Length " + movementLength);

        // Return movementLength
        return (int) movementLength;
    }





    static double squareRoot(int number, double tolerance) {
        // Assuming the sqrt of n as n only
        double x = number;

        // The closed guess will be stored in the root
        double root;

        // To count the number of iterations
        int count = 0;

        while (true) {
            count++;

            // Calculate more closed x
            root = 0.5 * (x + (number / x));

            // Check for closeness
            if (Math.abs(root - x) < tolerance)
                break;

            // Update root
            x = root;
        }

        return root;
    }


    static double squareRoot(double number) {
        double tolerance = 0.00001;
        // Assuming the sqrt of n as n only
        double x = number;

        // The closed guess will be stored in the root
        double root;

        // To count the number of iterations
        int count = 0;

        while (true) {
            count++;

            // Calculate more closed x
            root = 0.5 * (x + (number / x));

            // Check for closeness
            if (Math.abs(root - x) < tolerance)
                break;

            // Update root
            x = root;
        }

        return root;

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

// 1. Game start from ball in center of the field. - Done
//
// 2. Then team which won the toss get they chance to kick. - KICK OFF -Done
//      The players should be in their initial positions. (4 4 2)
//
// 3. a. First ball is considered as directly go in to the goal or not, or out of the filed. - Not Using now
// 3. b. Then Goto goal, or not, Out of the filed, Passed in to Player (Done) and other conditions are applied.
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



/*

        // Check if player is out of bounds (Side Lines)
        if (newPlayerX < 0 || newPlayerX >= matrixSizeX) {
            System.out.println("Player " + teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getName() + " is out of bounds!");
            // Change playing team
            tossWinner = (tossWinner == 1) ? 2 : 1;
            return;

            // Additionally, we can find the player near the goal from the new team and let him throw ball
        }

        /*else if (newPlayerX >= matrixSizeX) {
            System.out.println("Player " + teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getName() + " is out of bounds!");
            if (tossWinner == 1) {

            }
            else {

            }
        }
        // Add End comment here


        // 0-6 and 14 - 20 are the out of bounds
        // 6 - 14 are the goals

        // if (newPlayerY < 0 || newPlayerY >= matrixSizeY) {
        System.out.println("Player " + teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getName() + " is out of bounds!");
        // Change playing team
        tossWinner = (tossWinner == 1) ? 2 : 1;
        return;
        }

        else if ( 0 <= newPlayerX && newPlayerX <= 6 && 0 <= newPlayerY && newPlayerY <= 6) {

        }

        else if ( newPlayerY < 0) {
        System.out.println("Player " + teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getName() + " is out of bounds!");
        if (tossWinner == 1) {

        }
        else {

        }
        }

        else if (newPlayerY >= matrixSizeY) {
        System.out.println("Player " + teams.get("Team-"+tossWinner).getPlayers().get(randomPlayer).getName() + " is out of bounds!");
        }

*/