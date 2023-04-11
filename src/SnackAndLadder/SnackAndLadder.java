package SnackAndLadder;

public class SnackAndLadder {
    static double dice(){
        double random = Math.floor(Math.random() * (6 - 1 + 1) + 1);
        return random;
    }
    public static void main(String[] args) {
        int player1=0;
        System.out.println(player1);
        int dice = (int)  dice();
        System.out.println(dice);
    }
}
