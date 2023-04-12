package SnackAndLadder;

public class SnackAndLadder {
    static double dice() {
        double random = Math.floor(Math.random() * (6 - 1 + 1) + 1);
        return random;
    }

    static int condition() {
        int cond = (int) (Math.random() * 10) % 3;
        return cond;
    }

    public static void main(String[] args) {
        int player1 = 0;
        int player2 = 0;
        int dice;
        int cond;
        int temp = 0;
        int dicecount = 0;
        System.out.println(player1);
        while ((player1 != 100) || (player2 != 100)) {
            dice = (int) dice();
            dicecount++;
            cond = condition();
            switch (cond) {
                case 0:
                    temp = 0;
                    break;
                case 1:
                    temp = dice;
                    break;
                case 2:
                    temp = dice;
                    break;
            }
            if (dicecount % 2 == 0) {
                player2 = player2 + temp;
                if (player2 < 0)
                    player2 = 0;
                else if (player2 > 100) {
                    player2 = player2 - temp;
                }
            } else if (dicecount % 2 != 0) {
                player1 = player1 + temp;
                if (player1 < 0)
                    player1 = 0;
                else if (player1 > 100) {
                    player1 = player1 - temp;
                }
            }
            if ((player1 == 100) || (player2 == 100)) {
                System.out.println("Player 1 last state = " + player1);
                System.out.println("Player 2 last state = " + player2);
                break;
            }
        }
        if (player1 == 100)
            System.out.println("player - 1 Won");
        else if (player2 == 100) {
            System.out.println("Player - 2 Won");
        }
        System.out.println("Total number of times die rolled = " + dicecount);
    }
}