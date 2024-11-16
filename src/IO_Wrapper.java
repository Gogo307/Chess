package src;

import java.util.Scanner;

public class IO_Wrapper {

    private final Scanner scanner = new Scanner(System.in);
    private Board board;

    public Move getMove() {
        String[] data = scanner.nextLine().split(" ");
        return new Move(Integer.parseInt(data[0]), Integer.parseInt(data[1]),
                Integer.parseInt(data[2]), Integer.parseInt(data[3]));
    }

    public void printBoard() {

        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {

                System.out.print(board.getBoardMatrix()[r][c] + " ");
            }
            System.out.println();
        }

    }
}
