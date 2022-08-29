import java.util.Scanner;

public class HeadsTails {
    public static void main(String[] args) {
        System.out.println("Enter how many times tp play:");
        try (Scanner scan = new Scanner(System.in)) {
            play(scan.nextInt());
        }
    }
    public static void play(int n) {
        if (n <= 0) {
            System.out.println("Game Over!");
            return;
        }
        int tails = 0;
        int heads = 0;
        while (n > 0) {
            int output = result();
            if (output == 0) {
                System.out.println("Heads!");
                heads++;
            }
            else if (output == 1) {
                System.out.println("Tails!");
                tails++;
            }
            n--;
        }
        System.out.println("Number of Heads is: ");
        System.out.println(heads);
        System.out.println("Number of Tails is: ");
        System.out.println(tails);
    }
    public static int result() {
        int max = 1;
        int min = 0;
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }
}
