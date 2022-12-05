import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        int number;
        int tempNumber = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                tempNumber += i;
            }
        }

        if(tempNumber == number) {
            System.out.printf("%s is a perfect number", number);
        }
        else {
            System.out.printf("%s is NOT a perfect number", number);
        }
    }
}
