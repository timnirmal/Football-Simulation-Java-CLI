package com.company;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private String teamColor;
    private int teamNumber;
    private int teamScore;

    List<Player> players = new ArrayList<Player>();

    public Team() {}

    public Team (String teamName, String teamColor, int teamNumber) {
        this.teamName = teamName;
        this.teamColor = teamColor;
        this.teamNumber = teamNumber;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamColor() {
        return teamColor;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeamColor(String teamColor) {
        this.teamColor = teamColor;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public void setTeamScore(int teamScore) {
        this.teamScore = teamScore;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addScore(int score) {
        teamScore += score;
    }

    public void removeScore(int score) {
        teamScore -= score;
    }

    public void resetScore() {
        teamScore = 0;
    }

    public void resetPlayers() {
        players.clear();
    }

    public void resetTeam() {
        resetScore();
        resetPlayers();
    }

    public String toStrings() {
        return "Team Name: " + teamName + "\n" +
                "Team Color: " + teamColor + "\n" +
                "Team Number: " + teamNumber + "\n" +
                "Team Score: " + teamScore + "\n";
    }


}
