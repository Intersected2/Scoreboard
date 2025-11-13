import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        read();
    }

    public static String read() throws FileNotFoundException {
        int score1 = 0;
        int score2 = 0;
        int team = 1;
        String team1 = null;
        String team2 = null;
        String x = null;
        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);
        String input = "";
        while (s.hasNext()) {
            while (s.hasNextInt()) {
                if (team == 1) {
                    if (s.nextInt() != 0) {
                        score1 = score1 + s.nextInt();
                    } else {
                        score1 = score1;
                        team = 2;
                    }
                }
                if (team == 2) {
                    if (s.nextInt() != 0) {
                        score2 = score2 + s.nextInt();
                    } else {
                        score2 = score2;
                        team = 1;
                    }
                }

            }
            while (s.hasNext()) {
                team1 = s.next();
                team2 = s.next();
            }
            x = "" + team;
//            score1 = 0;
//            score2 = 0;
//            team = 1;
//            team1 = null;
//            team2 = null;
        }
        System.out.println(score1);
        return null;
    }
}
