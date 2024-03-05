import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the DMV please take a ticket!");

        Random random = new Random();
        int userNumber = random.nextInt(100) + 1;

        System.out.println("Your number is " + userNumber + ". Please wait until your number is called.");

        for (int i = userNumber + 1; i <= 100; i++) {
            System.out.println("Calling number " + i);
        }
        for (int i = 1; i < userNumber; i++) {
        }

        System.out.println("Calling number " + userNumber);
        System.out.println("Sorry, you don't have the required paperwork ");

    }
}