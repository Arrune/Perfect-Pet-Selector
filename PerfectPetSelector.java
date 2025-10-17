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
        
        //error messages for idiot proofing
        //Note: I'm struggling to get this to work.
        String errorMessage1 = "It seems that you did not choose a season or made a typo. Please type your favorite season with correct spelling";
        String errorMessage2 = "It seems that you may have wrote the wrong color. Please choose between red, blue, or green and answer the questions with proper spelling";
        
        if (color.equals("blue")){
            if (season.equals("spring")){
            System.out.println("Your perfect pet is an ostrich");
            }
            else if ("aeiou".indexOf(name.charAt(0)) == -1 && (!season.equals("summer")) && (!season.equals("fall"))){
            System.out.println("Your perfect pet is an axolotl");
            }
            else if (season.equals("fall")){
            System.out.println("Your perfect pet is an alligator");
            }
            else {
            System.out.println("Your perfect pet is a rock");
            }

        }
        else if (color.equals("green")){
            if ("aeiou".indexOf(name.charAt(0)) == -1 && (season.equals("winter"))){
            System.out.println("Your perfect pet is a giraffe");
            }
            else if (!season.equals("fall")){
            System.out.println("Your perfect pet is a dog");
            }
            else if (season.equals("summer")){
            System.out.println("Your perfect pet is a pony");
            }
            else {
            System.out.println("Your perfect pet is a rock");
            }
        }
        else if (color.equals("red")){
            if ("aeiou".indexOf(name.charAt(0)) == -1 ){
            System.out.println("Your perfect pet is a porcupine");
            }
            else if ("aeiou".indexOf(name.charAt(0)) != -1){
            System.out.println("Your perfect pet is a panda");
            }
            else if (color.equals("summer")){
            System.out.println("Your perfect pet is a pony");
            }
            else {
                System.out.println("Your perfect pet is rock");
            }
        }
        else if (!color.equals("red") && !color.equals("green") && !color.equals("blue")){
            System.out.println(errorMessage2);
            System.out.println("Enter your favorite color (either red, blue, or green).");
            color  = obj.nextLine().toLowerCase();

        }
        else if (!season.equals("summer") && !season.equals("spring") && !season.equals("fall") && !season.equals("winter")) {
            System.out.println(errorMessage1);
            System.out.println("Enter your favorite season.");
            season = obj.nextLine().toLowerCase();
        }
        else {
            System.out.println("Your perfect pet is rock");
        }
    }
}
