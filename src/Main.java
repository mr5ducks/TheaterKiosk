import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("input age: ");
        int ageInput = in.nextInt();

        if (ageInput >= 21) {
        System.out.println("you get a wristband!!!! ");
        }
in.close();

    }
}