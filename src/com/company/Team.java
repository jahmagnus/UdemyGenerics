package com.company;

import java.util.ArrayList;

public class Team<T extends Player> {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name){
        this.name = name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(player.getName() + " is already on the team");
            return false;
        }
        members.add(player);
        System.out.println(player.getName() + " picked for team" + this.name);
        return true;
    }

    public int numPlayers(){
        return members.size();
    }


    public void matchResult (Team opponent, int ourScore, int theirScore){

        String message;

        if (ourScore > theirScore){
            won++;
            message = " Beat ";
        } else if (theirScore > ourScore){
            message = " lost to ";
            lost++;
        }
        else {
            message = " Drew with ";
            tied++;
        }

        played++;

        if (opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, ourScore, theirScore);
        }
    }

    public int ranking(){
        return (won*2) + tied;
    }

    public String getName() {
        return name;
    }
}
