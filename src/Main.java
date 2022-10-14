import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //added comment here to test git push

        String r = "rock";
        String p = "paper";
        String s = "scissors";

        String [] plays = {r,p,s};

        boolean quit = false;

        String compPlay;
        String yourPlay;

        int index;

        while(!quit){
            System.out.println("What's your move?");
            yourPlay = scanner.nextLine().toLowerCase();

            index = random.nextInt(3);
            compPlay = plays[index];

            System.out.println("Your play: " + yourPlay + " Computer's play: " + compPlay);


            if(yourPlay.equals(compPlay)){
                System.out.println("Draw!");
            } else if(yourPlay.equals(r) && compPlay.equals(p)){
                System.out.println("Loss!");
            }  else if(yourPlay.equals(p) && compPlay.equals(r)){
                System.out.println("Win!");
            } else if(yourPlay.equals(p) && compPlay.equals(s)){
                System.out.println("Loss!");
            } else if(yourPlay.equals(s) && compPlay.equals(p)){
                System.out.println("Win!");
            } else if(yourPlay.equals(r) && compPlay.equals(s)){
                System.out.println("Win!");
            } else if(yourPlay.equals(s) && compPlay.equals(r)){
                System.out.println("Loss!");
            }
        }
    }
}

//