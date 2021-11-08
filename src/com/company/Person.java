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