import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    private int[][] gameBoard;
    private boolean[][] mineBoard;
    private int rowSize;
    private int colSize;
    private int totalMines;
    private int remainingTiles;

    public MineSweeper(int rowSize, int colSize) {
        this.rowSize = rowSize;
        this.colSize = colSize;
        gameBoard = new int[rowSize][colSize];
        mineBoard = new boolean[rowSize][colSize];
        totalMines = (rowSize * colSize) / 4;
        remainingTiles = rowSize * colSize;
        initializeBoard();
        placeMines();
    }

    private void initializeBoard() {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                gameBoard[i][j] = -1;
            }
        }
    }

    private void placeMines() {
        Random random = new Random();
        int minesPlaced = 0;
        while (minesPlaced < totalMines) {
            int randomRow = random.nextInt(rowSize);
            int randomCol = random.nextInt(colSize);
            if (!mineBoard[randomRow][randomCol]) {
                mineBoard[randomRow][randomCol] = true;
                minesPlaced++;
            }
        }
    }

    private boolean isValidCoordinate(int row, int col) {
        return row >= 0 && row < rowSize && col >= 0 && col < colSize;
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValidCoordinate(i, j) && mineBoard[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printGameBoard() {
        System.out.println("Mayın Tarlası Oyunu");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (gameBoard[i][j] == -1) {
                    System.out.print("# ");
                } else if (gameBoard[i][j] == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print(gameBoard[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean playGame() {
        Scanner scanner = new Scanner(System.in);

        while (remainingTiles > totalMines) {
            printGameBoard();
            System.out.print("Satır seçin (0 ile " + (rowSize - 1) + " arasında): ");
            int selectedRow = scanner.nextInt();

            System.out.print("Sütun seçin (0 ile " + (colSize - 1) + " arasında): ");
            int selectedCol = scanner.nextInt();

            if (!isValidCoordinate(selectedRow, selectedCol)) {
                System.out.println("Geçersiz bir nokta seçtiniz. Tekrar deneyin.");
                continue;
            }

            if (mineBoard[selectedRow][selectedCol]) {
                System.out.println("Mayına bastınız! Oyunu kaybettiniz.");
                return false;
            } else {
                int adjacentMines = countAdjacentMines(selectedRow, selectedCol);
                gameBoard[selectedRow][selectedCol] = adjacentMines;
                remainingTiles--;
            }
        }

        System.out.println("Tebrikler! Tüm güvenli bölgeleri seçtiniz. Oyunu kazandınız!");
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısını girin: ");
        int rowSize = scanner.nextInt();

        System.out.print("Sütun sayısını girin: ");
        int colSize = scanner.nextInt();

        MineSweeper mineSweeper = new MineSweeper(rowSize, colSize);
        mineSweeper.playGame();
    }
}
