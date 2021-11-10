package com.company;

public class Person {
    protected String name;
    protected String team;

    public Person() {

    }
    public Person(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }


}

class Player extends Person {
    private int playerNumber;
    private String position;
    private int noOfGoals;
    private int Skill;
    private int xPlayerPosition;
    private int yPlayerPosition;

    public Player (String name, String team, int playerNumber, String position, int noOfGoals, int Skill) {
        super(name, team);
        this.playerNumber = playerNumber;
        this.position = position;
        this.noOfGoals = noOfGoals;
        this.Skill = Skill;
    }

    public Player () {
        super();
    }

    public Player(String name, String team) {
        super(name, team);
    }

    public void setPlayerNumber(int i) {
        playerNumber = i;
    }

    public void setPlayerPosition(String goalie) {
        position = goalie;
    }

    public void setPlayerScore(int i) {
        noOfGoals = i;
    }

    public void setPlayerSkill(int i) {
        Skill = i;
    }

    public void setPlayerPositionX(int i) {
        xPlayerPosition = i;
    }

    public void setPlayerPositionY(int i) {
        yPlayerPosition = i;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public String getPlayerPosition() {
        return position;
    }

    public int getPlayerScore() {
        return Skill;
    }

    public int getPlayerSkill() {
        return Skill;
    }

    public int getPlayerPositionX() {
        return xPlayerPosition;
    }

    public int getPlayerPositionY() {
        return yPlayerPosition;
    }

    public String toString() {
        return "Player: " + name + " " + team + " " + playerNumber + " " + position + " " + noOfGoals + " " + Skill + " " + xPlayerPosition + " " + yPlayerPosition;
    }




}

class Coach extends Person {
    // Only one coach per team
}

class Doctor extends Person {
    // Only one doctor per team
}

// Refree Details are not nessesary
class referees {
    // There are 5 Referees
    // 1 Main and 4 Corners
}





/*
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
*/