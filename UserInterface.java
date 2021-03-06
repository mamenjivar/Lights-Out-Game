/**
 * Author: Miguel Menjivar
 * 
 * Date: April 15, 2020
 * 
 * UserInterface:
 * Will hold all the print statements of the game
 */
public class UserInterface {
    public void title() {
        System.out.println("Light's Out!!");
        System.out.println("");
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
     * Prompts user with how to play the game
     */
    public void howToPlayGame() {
        System.out.println("Lights Out!\n"
                        + "In this particular game, you will be presented with a 5x5 grid\n"
                        + "with a series of numbers on those tiles that signify that they\n"
                        + "are 'on'. If no numbers are presented on the tile, then they are\n"
                        + "considered 'off'. The goal of the game is to try and turn off all\n"
                        + "the lights in the game by inputting the number specified. The caveat\n"
                        + "is that if you toggle a light off, the top/bottom, left/right of the\n"
                        + "light that was chosen will be inverted if it were on or off. Find a way\n"
                        + "to turn off all the lights and you win the game!");
    }

    /**
     * A simple about author page with little information
     */
    public void author() {
        System.out.println("Created by: Miguel Menjivar\n"
                        + "Date: April 15, 2020\n"
                        + "Github: https://github.com/mamenjivar"
                        + "Github Repository: https://github.com/mamenjivar/Lights-Out-Game");
    }

    /**
     * prompts user that tile can't be chosen
     * because it's already false
     */
    public void tileIsFalse() {
        System.out.println("Tile is can't be chosen => already FALSE");
    }

    /**
     * When the user pickes a letter not a number when
     * the menu prompts the use of a number instead
     */
    public void notANumberError(){
        System.out.println("Please enter a NUMBER not a letter\n");
    }

    /**
     * when the user chooses a tile that is not in the grid
     */
    public void invalidTile() {
        System.out.println("Invalid tile, please choose another one");
    }

    /**
     * 
     */
    public void makeAChoice() {
        System.out.println("");
        System.out.print(">> ");
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
     * When user clears the board successfully
     * win the game
     */
    public void youWon() {
        System.out.println("You have won the game!\n"
                        + "You have emptied the board!");
    }

    /**
     * When the user decides to exit the game. 
     */
    public void exitGame(){
        System.out.println("Game Exited...\n Goodbye...");
    }

    /**
     * generates an empty board just for reference
     */
    public void testBoardBlank() {
        System.out.println("_____________________");
        System.out.println("|   |   |   |   |   |");
        System.out.println("|   |   |   |   |   |");
        System.out.println("|___|___|___|___|___|");
        System.out.println("|   |   |   |   |   |");
        System.out.println("|   |   |   |   |   |");
        System.out.println("|___|___|___|___|___|");
        System.out.println("|   |   |   |   |   |");
        System.out.println("|   |   |   |   |   |");
        System.out.println("|___|___|___|___|___|");
        System.out.println("|   |   |   |   |   |");
        System.out.println("|   |   |   |   |   |");
        System.out.println("|___|___|___|___|___|");
        System.out.println("|   |   |   |   |   |");
        System.out.println("|   |   |   |   |   |");
        System.out.println("|___|___|___|___|___|");
    }

    /**
     * prints an empty board with indexes for reference
     */
    public void testBoardFilled() {
        System.out.println("__________________________");
        System.out.println("|    |    |    |    |    |");
        System.out.println("| 00 | 01 | 02 | 03 | 04 |");
        System.out.println("|____|____|____|____|____|");
        System.out.println("|    |    |    |    |    |");
        System.out.println("| 10 | 11 | 12 | 13 | 14 |");
        System.out.println("|____|____|____|____|____|");
        System.out.println("|    |    |    |    |    |");
        System.out.println("| 20 | 21 | 22 | 23 | 24 |");
        System.out.println("|____|____|____|____|____|");
        System.out.println("|    |    |    |    |    |");
        System.out.println("| 30 | 31 | 32 | 33 | 34 |");
        System.out.println("|____|____|____|____|____|");
        System.out.println("|    |    |    |    |    |");
        System.out.println("| 40 | 41 | 42 | 43 | 44 |");
        System.out.println("|____|____|____|____|____|");
    }

    /**
     * prints fixed board with conditions 
     * of true/false tiles
     * 
     * @param testBoardPrint
     */
    public void booleanTestBoard(boolean[][] testBoardPrint) {
        System.out.println("__________________________");
        System.out.println("|    |    |    |    |    |");
        System.out.println("| " + ((testBoardPrint[0][0] == true) ? "00" : "  ") + " | "
                + ((testBoardPrint[0][1] == true) ? "01" : "  ") + " | "
                + ((testBoardPrint[0][2] == true) ? "02" : "  ") + " | "
                + ((testBoardPrint[0][3] == true) ? "03" : "  ") + " | "
                + ((testBoardPrint[0][4] == true) ? "04" : "  ") + " |");
        System.out.println("|____|____|____|____|____|");
        System.out.println("|    |    |    |    |    |");
        System.out.println("| " + ((testBoardPrint[1][0] == true) ? "10" : "  ") + " | "
                + ((testBoardPrint[1][1] == true) ? "11" : "  ") + " | "
                + ((testBoardPrint[1][2] == true) ? "12" : "  ") + " | "
                + ((testBoardPrint[1][3] == true) ? "13" : "  ") + " | "
                + ((testBoardPrint[1][4] == true) ? "14" : "  ") + " |");
        System.out.println("|____|____|____|____|____|");
        System.out.println("|    |    |    |    |    |");
        System.out.println("| " + ((testBoardPrint[2][0] == true) ? "20" : "  ") + " | "
                + ((testBoardPrint[2][1] == true) ? "21" : "  ") + " | "
                + ((testBoardPrint[2][2] == true) ? "22" : "  ") + " | "
                + ((testBoardPrint[2][3] == true) ? "23" : "  ") + " | "
                + ((testBoardPrint[2][4] == true) ? "24" : "  ") + " |");
        System.out.println("|____|____|____|____|____|");
        System.out.println("|    |    |    |    |    |");
        System.out.println("| " + ((testBoardPrint[3][0] == true) ? "30" : "  ") + " | "
                + ((testBoardPrint[3][1] == true) ? "31" : "  ") + " | "
                + ((testBoardPrint[3][2] == true) ? "32" : "  ") + " | "
                + ((testBoardPrint[3][3] == true) ? "33" : "  ") + " | "
                + ((testBoardPrint[3][4] == true) ? "34" : "  ") + " |");
        System.out.println("|____|____|____|____|____|");
        System.out.println("|    |    |    |    |    |");
        System.out.println("| " + ((testBoardPrint[4][0] == true) ? "40" : "  ") + " | "
                + ((testBoardPrint[4][1] == true) ? "41" : "  ") + " | "
                + ((testBoardPrint[4][2] == true) ? "42" : "  ") + " | "
                + ((testBoardPrint[4][3] == true) ? "43" : "  ") + " | "
                + ((testBoardPrint[4][4] == true) ? "44" : "  ") + " |");
        System.out.println("|____|____|____|____|____|");
    }
}