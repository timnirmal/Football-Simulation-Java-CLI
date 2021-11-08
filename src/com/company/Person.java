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
    private String noOfGoals;
    private int Skill;

    public Player (String name, String team, int playerNumber, String position, String noOfGoals, int Skill) {
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
    }



    public void setPlayerPosition(String goalie) {
    }

    public void setPlayerScore(int i) {
    }

    public void setPlayerSkill(int i) {
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

    public String toString() {
        return "Player: " + name + " " + team + " " + playerNumber + " " + position + " " + noOfGoals + " " + Skill;
    }




}

class couches extends Person {
}

class doctors extends Person {

}

// Refree Details are not nessesary
class referees {}





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