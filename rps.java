
import java.util.Scanner;

public class rps {

    public static int getOutput(int input1, int input2) {
        if (input1 == input2) {
            return 0;
        } else if (input1 == 0 && input2 == 1) {
            return 0;
        } else if (input1 == 1 && input2 == 2) {
            return 0;
        } else if (input1 == 2 && input2 == 0) {
            return 0;
        }
        return 1;
    }
    public static String getOutputString(int input) {
        switch (input) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "";
        }
    }
    public static void main(String[] args) {
        int p1 = 0;
        int p2 = 0;
        System.out.println("Welcome to Rock Paper Scissors!" + "\n" + "Input 1 for single-player." + "\n" + "Input 2 for two-player.");
        Scanner scan = new Scanner(System.in);
        int type = scan.nextInt();
        System.out.println("How many times to play?");
        Scanner scan2 = new Scanner(System.in);
        int num = scan2.nextInt();
        if (type <= 1) {
            onePlayer(num, p1, p2);
        }
        else {
            twoPlayer(num, p1, p2);
        }
    }
    public static int onePlayer(int num, int p1, int p2) {
        if (num <= 0) {
            System.out.println("Game Over!" + "\n" + "Player: " + p1 + "\n" + "CPU: " + p2);
            return 1;
        }
        try (Scanner scan = new Scanner(System.in)) {
            int choice = scan.nextInt();
            int cpu = result();
            System.out.println("You Chose: " + getOutputString(choice) + ". CPU Chose: " + getOutputString(cpu));
            if (getOutput(choice, cpu) == 1) {
                System.out.println("You won!");
                return onePlayer(num-1, p1+1, p2);
            }
            System.out.println("CPU won!");
            return onePlayer(num-1, p1, p2+1);
        } 
    }
    public static int twoPlayer(int num, int p1, int p2) {
        if (num <= 0) {
            System.out.println("Game Over!" + "\n" + "Player1: " + p1 + "\n" + "Player2: " + p2);
            return 2;
        }
        try (Scanner scan = new Scanner(System.in)) {
            int choice = scan.nextInt();
            Scanner scan2 = new Scanner(System.in);
            int choice2 = scan2.nextInt();
            System.out.println("You Chose: " + getOutputString(choice) + ". P2 Chose: " + getOutputString(choice2));
            if (getOutput(choice, choice2) == 1) {
                System.out.println("You won!");
                return twoPlayer(num-1, p1+1, p2);
            }
            System.out.println("CPU won!");
            return twoPlayer(num-1, p1, p2+1);
        } 
    }
    public static int result() {
        int max = 2;
        int min = 0;
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }
}
