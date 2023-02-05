package academy.learnprogramming;

import java.util.ArrayList;

public class Team <T extends League> implements Comparable<Team<T>>{

    private String name;
    private int played = 0, won = 0, lost = 0, drew = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void match(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            this.won++;
            message = " beat ";

        }else if(ourScore < theirScore){
            this.lost++;
            message = " lost to ";
        }else{
            this.drew++;
            message = " drew with ";
        }
        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            this.match(null,theirScore,ourScore);
        }

    }
    public int ranking(){
        return (won*2 + drew);
    }


    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }else if (this.ranking() < team.ranking()){
            return 1;
        }else{
            return 0;
        }
    }
}
