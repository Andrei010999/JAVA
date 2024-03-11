import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = 0;
        int max = 20;
        int randomNo = (int) (Math.random()*(max-min+1)+min);
        Scanner in = new Scanner(System.in);
        int input;
        System.out.println("Enter a number");

        do {
            input = in.nextInt();
            if (input == randomNo){
                System.out.println("Correct!");
            }else if (input>randomNo){
                System.out.println("Number too high, try again");
            }
            else if (input<randomNo){
                System.out.println("Number too low, try again");
            }


        }while (randomNo != input);

    }
}