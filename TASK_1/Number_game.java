import java.util.Random;
import java.util.*;
public class Number_game {
    public static void main(String[] args) {

        System.out.println("Welcome to guess number Game:"); 
        System.out.println(" You will be asked to guess a number to win the game:");
        System.out.println("You have maximum five attempts of limit-");

        // System.out.println("System's choice:");
        Random r = new Random();
        int a = r.nextInt(1, 100);
        // System.out.println(a);

        int limit=0;
        while(limit<5){

        System.out.println("Enter a number between 1 to 100");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        if(a>num )
        System.out.println("Your number is smaller");
        else if(a<num)
        System.out.println("Your number is greater");
        else if(a==num)
        System.out.println("Congrats! , your number is correct. You won the Game.");
        limit++;
        }
        System.out.println("Oops ! You lost your chances. Better luck next time.");
    }

    
}
