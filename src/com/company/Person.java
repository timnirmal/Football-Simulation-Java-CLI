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

    public Player(String name, String team, int playerNumber, String position, int noOfGoals, int Skill) {
        super(name, team);
        this.playerNumber = playerNumber;
        this.position = position;
        this.noOfGoals = noOfGoals;
        this.Skill = Skill;
    }

    public Player() {
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

class Coach extends Person {
    // Only one coach per team
}

class Doctor extends Person {
    // Only one doctor per team
}

class referees extends Person {
    // There are 5 Referees
    // 1 Main and 4 Corners
}
