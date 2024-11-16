package src;

import java.util.Arrays;

public class Board {

    private String[][] board;

    Board(){
        setBoard(new String[8][8]);
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    public String[][] createANewGame(){
        Arrays.stream(board).forEach(a -> Arrays.fill(a, "-"));


        board[0][0] = "r";
        board[7][0] = "r";
        board[7][7] = "r";
        board[0][7] = "r";

        board[0][1] = "k";
        board[7][6] = "k";
        board[7][1] = "k";
        board[0][6] = "k";

        board[0][2] = "b";
        board[7][5] = "b";
        board[7][2] = "b";
        board[0][5] = "b";

        board[0][3] = "q";
        board[7][3] = "q";

        board[0][4] = "K";
        board[7][4] = "K";


        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                if (r == 1 || r == 6) {
                    board[r][c] = "p";
                }
            }
        }
        return board;
    }

    public void printBoard(){

        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {

                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }

    }

    public void move(int currentRow, int currentColumn, int newRow, int newColumn){

        int a = currentRow;
        int b = currentColumn;
        currentRow = newRow;
        currentColumn = newColumn;



        board[currentRow][currentColumn] = board[a][b];
        board[a][b] = "-";

        printBoard();

    }
}
