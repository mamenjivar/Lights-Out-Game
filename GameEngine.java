
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

    // stores value of main menu option
    // chosen by user
    int mainMenuChoice;

    // test board with fixed length, width
    boolean[][] testBoardGame;

    /**
     * Default constructor
     */
    GameEngine() {
        ui = new UserInterface();
        kb = new Scanner(System.in);
        testBoardGame = new boolean[5][5];
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
                kb.nextLine();
                
            } catch(Exception e){
                System.out.println("");
                System.out.println(e);
                kb.next();
                ui.notANumberError();

            }
            
            switch (mainMenuChoice) {
                case 1: // play game
                    mainMenuLoop = false;
                    playGame();
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
     * play game 
     */
    public void playGame() {
        ui.testBoardBlank();
        ui.testBoardFilled();

        populateTestBoardFixed();

        ui.booleanTestBoard(testBoardGame);

        // toggles tiles top/bottom left/right
        toggleBoard();

        System.out.println("you've won the game again!");
        exit();
    }

    /**
     * will toggle tile on or off
     */
    public void toggleBoard() {
        String toggleTile;
        boolean playBoard = true;

        while(playBoard){
            try {
                ui.makeAChoice();
                toggleTile = kb.nextLine();
                String[] split = toggleTile.split("");

                int row = Integer.parseInt(split[0]);
                int col = Integer.parseInt(split[1]);

                // tile is already false
                if (testBoardGame[row][col] == false) {
                    ui.tileIsFalse();
                }

                if (row == 0 && col == 0) {
                    toggleTile(row, col); // center only
                    toggleTile(row + 1, col); // right
                    toggleTile(row, col + 1); // down
                } else if (row == 4 && col == 4) {
                    toggleTile(row, col); // center
                    toggleTile(row - 1, col); // up
                    toggleTile(row, col - 1); // left
                } else if(row == 0 && col == 4) {
                    toggleTile(row, col); // center
                    toggleTile(row, col - 1); // left
                    toggleTile(row + 1, col); // down
                } else if (row == 4 && col == 0){
                    toggleTile(row, col); // center
                    toggleTile(row - 1, col); // up
                    toggleTile(row, col + 1); // right
                } else if (row == 0) {
                    toggleTile(row, col); // center
                    toggleTile(row + 1, col); // down
                    toggleTile(row, col + 1); // right
                    toggleTile(row, col - 1); // left)
                } else if (col == 0) {
                    toggleTile(row, col); // center
                    toggleTile(row, col + 1); // right
                    toggleTile(row - 1, col); // up
                    toggleTile(row + 1, col); // down
                } else if(row == 4) {
                    toggleTile(row, col); // center
                    toggleTile(row - 1, col); // left
                    toggleTile(row, col + 1); // down
                    toggleTile(row, col - 1); // up
                } else if (col == 4) {
                    toggleTile(row, col); // center
                    toggleTile(row, col - 1); // up
                    toggleTile(row - 1, col); // left
                    toggleTile(row + 1, col); // right
                } else if(row >= 5) {
                    ui.invalidTile();
                }else {
                    toggleTile(row, col); // center;
                    toggleTile(row - 1, col); // up
                    toggleTile(row + 1, col); // down
                    toggleTile(row, col + 1); // right
                    toggleTile(row, col - 1); // left
                }

                // prints current game board
                ui.booleanTestBoard(testBoardGame);

                // if the board is all empty
                if(didYouWin()){
                    playBoard = false;

                }
            } catch (Exception e) {
                System.out.println("");
                System.out.println(e);
                kb.next();
                ui.notANumberError();
            }
        }
    }

    /**
     * toggle tile 
     * true => false
     * false => true
     * 
     * @param row
     * @param col
     */
    public void toggleTile(int row, int col){
        testBoardGame[row][col] = !testBoardGame[row][col];
    }

    /**
     * test to see if user win game
     * if all board = false => win game
     * 
     * @return
     */
    public boolean didYouWin() {
        // boolean didYouWin = false;
        for(int row = 0; row < testBoardGame.length; row++){
            for(int col = 0; col < testBoardGame[row].length; col++){
                if(testBoardGame[row][col] == true){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * When the user decides
     * to end the game
     */
    public void exit(){
        ui.exitGame();
        kb.close();
        System.exit(0);
    }

    /**
     * Test board with fixed 
     * values to test game
     */
    public void populateTestBoardFixed() {
        // 1st row
        testBoardGame[0][0] = false;
        testBoardGame[0][1] = false;
        testBoardGame[0][2] = false;
        testBoardGame[0][3] = false;
        testBoardGame[0][4] = false;

        // 2nd row
        testBoardGame[1][0] = false;
        testBoardGame[1][1] = false;
        testBoardGame[1][2] = true;
        testBoardGame[1][3] = false;
        testBoardGame[1][4] = false;

        // 3rd row
        testBoardGame[2][0] = false;
        testBoardGame[2][1] = true;
        testBoardGame[2][2] = true;
        testBoardGame[2][3] = true;
        testBoardGame[2][4] = false;

        // 4th row
        testBoardGame[3][0] = false;
        testBoardGame[3][1] = false;
        testBoardGame[3][2] = true;
        testBoardGame[3][3] = false;
        testBoardGame[3][4] = false;

        // 5th row
        testBoardGame[4][0] = false;
        testBoardGame[4][1] = false;
        testBoardGame[4][2] = false;
        testBoardGame[4][3] = false;
        testBoardGame[4][4] = false;
    }
}