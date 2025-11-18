import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Team orange = new Team("orange");
        Team yellow = new Team("yellow");
        Team red = new Team("red");
        Team
        read();
    }

    public static String read() throws FileNotFoundException {
        int score1 = 0;
        int score2 = 0;
        int team = 1;
        String team1 = null;
        String team2 = null;
        String x = null;
        int current = 0;
        int active = 1;
        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);
        String input = "";
        while (s.hasNextLine()) {
            team1 = s.next();
            team2 = s.next();
            while (s.hasNextInt()){
                current = s.nextInt();
                if (current != 0){
                    if (active == 1){
                        score1 = score1 + current;
                    } else {
                        if (current % 2 == 0){
                            score2 = score2 + current;
                        }
                    }
                } else {
                    if (current == 0){
                        active++;
                    }
                }
            }
        }
        return null;
    }
}
