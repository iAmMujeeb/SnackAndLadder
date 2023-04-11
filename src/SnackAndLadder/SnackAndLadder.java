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
        int dice = 0;
        int cond = 0;
        int temp = 0;
        System.out.println(player1);
        while (player1 != 100) {
            dice = (int) dice();
            cond = condition();
            switch (cond) {
                case 0:
                    temp = 0;
                    break;
                case 1:
                    temp = player1 + dice;
                    break;
                case 2:
                    temp = player1 - dice;
                    break;
            }
            player1 = player1 + temp;
            if (player1 < 0)
                player1 = 0;
        }
        System.out.println(player1);
        if (player1 == 100)
            System.out.println("You Won");
    }
}
