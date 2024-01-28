import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, What is your name?");
        String name = scan.nextLine();

        System.out.println("Well, " + name  + " I am thinking of the number between 1 to 100" );
        int myNumber= getRandomNumber(1, 101);

        for(int i=0; i<6; i++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Take a guess");
            int yourGuess = scan2.nextInt();
            
            if (yourGuess==myNumber){
                System.out.println("You guessed Correctly!");
                break;
            }
            else if (yourGuess<myNumber){
                System.out.println("Your guess is Low");
            }
            else if (yourGuess>myNumber){
                System.out.println("Your guess is high");
            }
            if(i>=5){
                System.out.println();
                System.out.println("Nope, The number I was thinking of was "+ myNumber+"!");
            }

        }
    }

    public static int getRandomNumber(int min, int max){
        Random random = new Random();
        return random.ints(min,max).findFirst().getAsInt();
    }
}

