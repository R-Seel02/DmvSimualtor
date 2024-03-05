import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the DMV, grab a ticket and wait in line, boy there is a long line today");

        Random random = new Random();
        int userNumber = random.nextInt(100) + 1;

        System.out.println("Your number is " + userNumber + " Sir stop yelling and wait in line");

        for (int i = userNumber + 1; i <= 100; i++) {
            System.out.println("Calling number " + i);
        }
        for (int i = 1; i < userNumber; i++) {
        }

        System.out.println("Calling number " + userNumber);
        System.out.println("Sorry, you don't have the required paperwork, please come again! ");

    }
}