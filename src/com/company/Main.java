package com.company;

public class Main {

    public static void main(String[] args) {

        LeagueTable<Team<FootballPlayer>> footballLeague = new LeagueTable<>("AFL League table");

        Team<FootballPlayer> adelaideCrows = new Team<> ("Adelaide Crows");
        Team<FootballPlayer> melbourneDemons = new Team<>("Melbourne");
        Team<FootballPlayer> sydneySwans = new Team<>("Sydney Swans");
        Team<FootballPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        Team <BaseballPlayer> chicago = new Team<>("Chicago Cubs");

        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(sydneySwans);
        footballLeague.addTeam(hawthorne);
        footballLeague.addTeam(melbourneDemons);
        footballLeague.addTeam(fremantle);

        adelaideCrows.matchResult(sydneySwans, 56, 101);
        adelaideCrows.matchResult(hawthorne, 156, 101);
        adelaideCrows.matchResult(melbourneDemons, 56, 15);
        adelaideCrows.matchResult(fremantle, 57, 101);

        sydneySwans.matchResult(adelaideCrows, 102, 101);
        sydneySwans.matchResult(hawthorne, 156, 101);
        sydneySwans.matchResult(melbourneDemons, 56, 15);
        sydneySwans.matchResult(fremantle, 102, 101);

        hawthorne.matchResult(sydneySwans, 56, 101);
        hawthorne.matchResult(adelaideCrows, 156, 101);
        hawthorne.matchResult(melbourneDemons, 56, 15);
        hawthorne.matchResult(fremantle, 57, 101);

        melbourneDemons.matchResult(sydneySwans, 56, 10);
        melbourneDemons.matchResult(hawthorne, 45, 101);
        melbourneDemons.matchResult(adelaideCrows, 56, 15);
        melbourneDemons.matchResult(fremantle, 57, 101);

        fremantle.matchResult(sydneySwans, 56, 10);
        fremantle.matchResult(hawthorne, 156, 101);
        fremantle.matchResult(melbourneDemons, 56, 115);
        fremantle.matchResult(adelaideCrows, 57, 101);

        footballLeague.showLeagueTable();

    }
}
