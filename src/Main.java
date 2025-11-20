import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Team orange = new Team("orange");
        Team yellow = new Team("yellow");
        Team red = new Team("red");
        Team indigo = new Team("indigo");
        Team violet = new Team("violet");
        Team green = new Team("green");
        Team blue = new Team("blue");
        read();
    }

    public static String read() throws FileNotFoundException {
        int score1 = 0;
        int score2 = 0;
        int team = 1;
        String team1 = "";
        String team2 = "";
        String x = null;
        int current = 0;
        int active = 1;
        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);
        String input = "";
        while (s.hasNext()) {
                System.out.print(s.next());
                System.out.println(" " + s.next());
                //team1 = s.next();
                //team2 = s.next();
            while (s.hasNextInt()){
                current = s.nextInt();
                System.out.println(active);
                if (current > 0){
                    if (active % 2 == 1){
                        score1 = score1 + current;
                    } else {
                        if (active % 2 == 0){
                            score2 = score2 + current;
                        }
                    }
                } else {
                    if (current == 0){
                        active++;
                    }
                }
                if (team1 == "orange"){

                } else {
                    if (team1 == "yellow"){

                    } else {
                        if (team1 == "red"){

                        } else {
                            if (team1 == "indigo"){

                            } else {
                                if (team1 == "violet"){

                                } else {
                                    if (team1 == "green"){

                                    } else {
                                        if (team1 == "blue"){

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(score1);
        System.out.println(score2);
        return null;
    }
}
