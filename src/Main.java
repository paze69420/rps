import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner rps = new Scanner(System.in);
        System.out.println("choose your x{rock(1),paper(2),scissor(3)}");
        int response = rps.nextInt();

        Random random = new Random();
        int x = random.nextInt(3) + 1;
         
        if (x == 1) {
            System.out.println("rock");
        } else if (x == 2) {
            System.out.println("paper");
        } else if (x == 3) {
            System.out.println("scissor");
        }
        if (x == response) {
            System.out.println("draw");
        } else if (x == 1 && response == 2) {
            System.out.println("W");
        } else if (x == 1 && response == 3) {
            System.out.println("L");
        } else if (x == 2 && response == 1) {
            System.out.println("L");
        } else if (x == 2 && response == 3) {
            System.out.println("W");

        } else if (x == 3 && response == 1) {
            System.out.println("W");
        } else if (x == 3 && response == 2) {
            System.out.println("L");
        }
        else{
            System.out.println("invalid choice: "+response);
        }
    }

}








































