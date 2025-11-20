import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Pls don't ask about the if statements. Ty.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        read();
    }

    public static String read() throws FileNotFoundException {
        Team orange = new Team("orange");
        Team yellow = new Team("yellow");
        Team red = new Team("red");
        Team indigo = new Team("indigo");
        Team violet = new Team("violet");
        Team green = new Team("green");
        Team blue = new Team("blue");
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
//                System.out.print(s.next());
//                System.out.println(" " + s.next());
                team1 = s.next();
                team2 = s.next();
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
                if (score1 > score2){
                    if (team1 == "orange"){
                        orange.addwins();
                    } else {
                        if (team1 == "yellow"){
                            yellow.addwins();
                        } else {
                            if (team1 == "red"){
                                red.addwins();
                            } else {
                                if (team1 == "indigo"){
                                    indigo.addwins();
                                } else {
                                    if (team1 == "violet"){
                                        violet.addwins();
                                    } else {
                                        if (team1 == "green"){
                                            green.addwins();
                                        } else {
                                            if (team1 == "blue"){
                                                blue.addwins();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (score1 < score2){
                        if (team1 == "orange"){
                            orange.addwins();
                        } else {
                            if (team1 == "yellow"){
                                yellow.addwins();
                            } else {
                                if (team1 == "red"){
                                    red.addwins();
                                } else {
                                    if (team1 == "indigo"){
                                        indigo.addwins();
                                    } else {
                                        if (team1 == "violet"){
                                            violet.addwins();
                                        } else {
                                            if (team1 == "green"){
                                                green.addwins();
                                            } else {
                                                if (team1 == "blue"){
                                                    blue.addwins();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                current = 0;
                active = 1;
                score1 = 0;
                score2 = 0;
            }
        }
        System.out.println(score1);
        System.out.println(score2);
        return null;
    }
}
