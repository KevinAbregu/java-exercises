package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {



        Team<SpanishLeague> realMadrid = new Team<>("Real Madrid");
        Team<SpanishLeague> atleticoMadrid = new Team<>("Atletico Madrid");
        Team<SpanishLeague> barcelona = new Team<>("FC Barcelona");
        Team<SpanishLeague> cadiz = new Team<>("Cadiz");

        Team<PremierLeague> liverpool = new Team<>("Liverpool");
        Team<PremierLeague> arsenal = new Team<>("Arsenal");
        Team<PremierLeague> manut = new Team<>("Manchester United");

        Team<CalcioLeague> juventus = new Team<>("Juventus");

        ArrayList<Team<SpanishLeague>> spanishLeague = new ArrayList<>();
        spanishLeague.add(realMadrid);
        spanishLeague.add(atleticoMadrid);
        spanishLeague.add(barcelona);
        spanishLeague.add(cadiz);

        ArrayList<Team<PremierLeague>> premier = new ArrayList<>();
        premier.add(liverpool);
        premier.add(arsenal);
        premier.add(manut);

        realMadrid.match(barcelona,5,0);
        realMadrid.match(cadiz,3,1);
        realMadrid.match(atleticoMadrid,4,0);
        cadiz.match(barcelona,3,0);
        cadiz.match(atleticoMadrid,0,0);
        atleticoMadrid.match(barcelona,1,1);

        System.out.println("Ranking Spanish League");
        for(Team team: spanishLeague){
            System.out.println(team.getName() +": " + team.ranking());
        }
        Collections.sort(spanishLeague);

        for(Team team: spanishLeague){
            System.out.println(team.getName() +": " + team.ranking());
        }


    }


}
