import java.util.Scanner;

public class bedingteEntscheidungAufgabe2 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Stein [0] - Schere [1] - Papier [2] - Brunnen [3]");
        int p = Scanner.nextInt();
        int c = (int)((Math.random()) * 4);
        String winner = "Unbekannt";
        System.out.println("Player [" + p + "] vs " + "Computer [" + c + "]");
        if(p==0) {
            if(c==0) {
                winner = "Unentschieden";
            } else if(c==1) {
                winner = "Player";
            } else if(c==2) {
                winner = "Computer";
            } else if(c==3) {
                winner = "Computer";
            }
        } else if(p==1) {
            if(c==0) {
                winner = "Computer";
            } else if(c==1) {
                winner = "Unentschieden";
            } else if(c==2) {
                winner = "Player";
            } else if(c==3) {
                winner = "Computer";
            }
        } else if(p==2) {
            if(c==0) {
                winner = "Player";
            } else if(c==1) {
                winner = "Computer";
            } else if(c==2) {
                winner = "Unentschieden";
            } else if(c==3) {
                winner = "Player";
            }
        } else if(p==3) {
            if(c==0) {
                winner = "Player";
            } else if(c==1) {
                winner = "Player";
            } else if(c==2) {
                winner = "Computer";
            } else if(c==3) {
                winner = "Unentschieden";
            }
        }
        System.out.println("Gewinner: " + winner);
    }

}
