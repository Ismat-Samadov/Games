import java.util.Scanner;

import java.lang.Math;

public class Game {
    public static void main(String[] args) {
        start();
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int n = sc.nextInt();
        // int rng= (int) Math.random()*100 +1 ;

        // sc.close();
        int number = rng();


    }

    public static int rng() {
        return (int) (Math.random() * 100) + 1;
    }

    public static void start() {
        System.out.println("Let the game begin!");
    }

    public static void tooSmall() {
        System.out.println("Your number is too small. Please, try again.");
    }

    public static void tooHigh() {
        System.out.println("Your number is too big. Please, try again.");
    }

    public static void Congrats() {
        System.out.println("Congratulations, Ismat!");
    }

}
