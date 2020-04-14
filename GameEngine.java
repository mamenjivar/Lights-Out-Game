
/**
 * Author: Miguel Menjivar
 * 
 * Date: April 14, 2020
 * 
 * GameEngine.java
 * This file will hold all game logic
 */
import java.util.Scanner;

public class GameEngine {
    UserInterface ui;
    Scanner kb;

    int mainMenuChoice;

    /**
     * Default constructor
     */
    GameEngine() {
        ui = new UserInterface();
        kb = new Scanner(System.in);
    }

    /**
     * The start of the game
     * Introduction
     */
    public void start(){
        ui.title();
        mainMenu();


    }

    /**
     * Main menu for the beginning of he game
     */
    public void mainMenu(){
        boolean mainMenuLoop = true;

        while(mainMenuLoop){
            ui.mainMenuPrompt();

            try{
                mainMenuChoice = kb.nextInt();
                
            } catch(Exception e){
                System.out.println("");
                System.out.println(e);
                kb.next();
                ui.notANumberError();

            }
            
            switch (mainMenuChoice) {
                case 1: // play game
                    mainMenuLoop = false;
                    break;
                case 2: // how-to-play-game
                    mainMenuLoop = false;
                    break;
                case 3: // exit game
                    mainMenuLoop = false;
                    exit();
                    break;
                default: // choice doesn't exist
                    ui.mainMenuOptionNotFound();
            }
        }
    }



    /**
     * When the user decides
     * to end the game
     */
    public void exit(){
        ui.exitGame();
        System.exit(0);
    }
}