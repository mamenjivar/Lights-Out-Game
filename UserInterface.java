
/**
 * Author: Miguel Menjivar
 * 
 * Date: April 14, 2020
 * 
 * UserInterface:
 * Will hold all the print statements of the game
 */
public class UserInterface {
    public void title() {
        System.out.println("Light's Out!!");
    }

    /**
     * gives prompt for choices to choose from to user
     */
    public void mainMenuPrompt() {
        System.out.print("Please choose from options below:\n"
                        + "1) Play Game \n"
                        + "2) How to play game \n"
                        + "3) About Author \n"
                        + "4) Exit game\n"
                        + ">> ");
    }

    /**
     * When the user pickes a letter not a number when
     * the menu prompts the use of a number instead
     */
    public void notANumberError(){
        System.out.println("Please enter a NUMBER not a letter\n");
    }

    /**
     * When the user chooses a number outside its range
     */
    public void mainMenuOptionNotFound() {
        System.out.println("");
        System.out.println("Please choose a number from 1-4");
        System.out.println("");
    }

    /**
     * When the user decides to exit the game. 
     */
    public void exitGame(){
        System.out.println("Game Exited...\n Goodbye...");
    }
}