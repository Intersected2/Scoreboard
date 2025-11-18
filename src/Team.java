public class Team {
    String teamname;
    int score;
    int wins;
    public Team(String name){
        this.teamname = name;
    }
    public int addwins(){
        wins++;
        return 0;
    }
    public int getwins (){
        return wins;
    }
}
