package com.company;

public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<> ("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);


        System.out.println(adelaideCrows.numPlayers());


        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam  = new Team<>("Manchester UTD");
        soccerTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourneDemons = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("banks");
        melbourneDemons.addPlayer(banks);

        Team<FootballPlayer> sydneySwans = new Team<>("Sydney Swans");
        FootballPlayer Lockett = new FootballPlayer("Lockett");
        sydneySwans.addPlayer(Lockett);

        Team<FootballPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorne.matchResult(fremantle, 1, 0);
        hawthorne.matchResult(adelaideCrows, 0, 1);

        adelaideCrows.matchResult(fremantle, 2, 1);
        adelaideCrows.matchResult(hawthorne, 1,1 );
    }
}
