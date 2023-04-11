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
        System.out.println(player1);
        int dice = (int) dice();
        System.out.println(dice);
        int cond = condition();
        System.out.println(cond);
        switch (cond) {
            case 0:
                System.out.println("No Play");
                player1 = 0;
                break;
            case 1:
                System.out.println("Ladder");
                player1 = player1 + dice;
                break;
            case 2:
                System.out.println("Snack");
                player1 = player1 - dice;
                break;
        }
    }
}
