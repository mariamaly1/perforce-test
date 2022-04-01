import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
        ArrayList<String> deckOfCards = new ArrayList <String>();
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        Random r = new Random();
        int result = 0;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number between 0 and 52 to get a random hand of cards");

        int number = myObj.nextInt();  // Read user input

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j< ranks.length; j++){
                deckOfCards.add(suits[i]+ " : " + ranks[j]);
            }  
        }

        for (int i = 0; i < number; i++) {
          result = r.nextInt(deckOfCards.size());
          System.out.println("deckOfCards ----> "+deckOfCards.get(result));
          deckOfCards.remove(i);
        }
	}
}
