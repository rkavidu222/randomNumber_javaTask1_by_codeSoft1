import java.util.Scanner;  //to get user input

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int attempt = 5;
        int score = 0;

        System.out.println("Welcome to the Number Game!");
        System.out.println("The number is between 1 and 100. Its not a float/double value. Its a integer value");
        System.out.println("You have 5 attempts to guess it.");
        System.out.println();

        boolean tryAgain = true;
        while (tryAgain) {
            int randomNumb = 29;
            boolean correct = false;

            for (int i = 1; i <= attempt && !correct; i++) {
                System.out.print("Attempt " + i + ": Enter your guess number: ");
                int guess = sc.nextInt();

                if (guess == randomNumb) {
                    System.out.println("Congratulations! You are win.");
                    correct = true;
                    score += attempt - i + 1;
                } else if (guess < randomNumb) {
                    System.out.println("Its Too low! Try again.");
                } else {
                    System.out.println("Its Too high! Try again.");
                }
            }

            System.out.println();

            if (!correct) {
                System.out.println("Game Over. The Random Number is: " + randomNumb);
                System.out.println();
            }

            System.out.println("Your score is : " + score);
            System.out.print("Do you want to try again? (yes/no): ");
            String again = sc.next();
            tryAgain = again.equals("yes");
        }

        System.out.println("Thank you for joining with us!");
        sc.close();
    }
}
