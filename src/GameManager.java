package src;

import src.Pieces.Piece;

import java.util.Arrays;

public class GameManager {

    private Board board;

    private Boolean isWhite;

    private IO_Wrapper wrapper;

    //private List<Move> moveHistory;


    public void run() {
        init();

        while (true) {
            Move move = wrapper.getMove();

            Piece movedPiece = board.getPieceByCoordinates(move.getStartX(), move.getEndX());
            if (movedPiece != null) {
                movedPiece.goTo(move.getEndX(),move.getEndY());
            }
        }
    }

    private void init () {
            //    Arrays.stream(board.getBoardMatrix()).forEach(a -> Arrays.fill(a, "-"));
/*

            boardMatrix[0][0] = "r";
            boardMatrix[7][0] = "r";
            boardMatrix[7][7] = "r";
            boardMatrix[0][7] = "r";

            boardMatrix[0][1] = "k";
            boardMatrix[7][6] = "k";
            boardMatrix[7][1] = "k";
            boardMatrix[0][6] = "k";

            boardMatrix[0][2] = "b";
            boardMatrix[7][5] = "b";
            boardMatrix[7][2] = "b";
            boardMatrix[0][5] = "b";

            boardMatrix[0][3] = "q";
            boardMatrix[7][3] = "q";

            boardMatrix[0][4] = "K";
            boardMatrix[7][4] = "K";


            for (int r = 0; r < 8; r++) {
                for (int c = 0; c < 8; c++) {
                    if (r == 1 || r == 6) {
                        boardMatrix[r][c] = "p";
                    }
                }
            }
            return boardMatrix;

        }

 */

        }
//
//    public void move(int currentRow, int currentColumn, int newRow, int newColumn){
//
//        int a = currentRow;
//        int b = currentColumn;
//        currentRow = newRow;
//        currentColumn = newColumn;
//
//
//
//        boardMatrix[currentRow][currentColumn] = boardMatrix[a][b];
//        boardMatrix[a][b] = "-";
//
//        printBoard();
//
//    }
    }
