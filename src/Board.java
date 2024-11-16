package src;

import src.Pieces.Piece;

import java.util.Arrays;

public class Board {

    private Piece[][] boardMatrix;

    Board(){
        setBoardMatrix(new Piece[8][8]);
    }

    public Piece[][] getBoardMatrix() {
        return boardMatrix;
    }

    public void setBoardMatrix(Piece[][] boardMatrix) {
        this.boardMatrix = boardMatrix;
    }

    public Piece getPieceByCoordinates(int x, int y){
        //TODO: handle null
        return boardMatrix[x][y];
    }



}
