package src;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));


        Board board = new Board();

        board.createANewGame();
        board.printBoard();

        board.move(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

    }

}
