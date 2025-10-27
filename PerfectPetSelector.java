// Name: Arrune Nimalan
// Date: 10/16/2025
//Description:  This program gets the user's name, favorite season, and favorite color and determines the perfect pet for them based on their answers. 
import java.util.Scanner;
public class PerfectPetSelector {
    public static void main (String[] args){
        //ask the user for input (name, season, and color)
        Scanner obj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter your name.");
        String  name = obj.nextLine().toLowerCase(); // Read users name

        System.out.println("Enter your favorite season.");
        String season = obj.nextLine().toLowerCase(); // Read users favorite season

        System.out.println("Enter your favorite color (either red, blue, or green).");
        String color  = obj.nextLine().toLowerCase(); // Read users favorite color
        
        //variables set up
        boolean startsWithConsonant = "aeiou".indexOf(name.charAt(0)) == -1; // Checks if the users name starts with a consonant
        boolean startsWithVowel = !startsWithConsonant;
        String pet = "pet rock"; // if the person does not qualify for any, they recieve a pet rock
        
        //If and else if statements for finding the right pet
        if (color.equals("blue") && season.equals ("spring")) {
            pet = "ostrich";
        }
        else if (color.equals("green") && startsWithConsonant && season.equals("winter")){
            pet = "giraffe";
        }
        else if (color.equals("blue") && season.equals("fall")){
            pet = "alligator";
        }
        else if (color.equals("red") && startsWithVowel){
            pet = "porcupine";
        }
        else if (color.equals("red") && startsWithConsonant){
            pet = "panda";
        }
        else if (color.equals ("green") && !season.equals("fall")){
            pet = "dog";
        }
        else if (startsWithConsonant && color.equals("blue") && !season.equals("summer") && !season.equals("fall")){
            pet = "axolotl";
        }
        else if (season.equals("summer") && startsWithVowel){
            pet = "pony";
        }
        
        //Prints the result
        System.out.println("Your perfect pet is a " + pet);
        obj.close();
    }
}