package bukiet.connect4;


public class ConnectBoard {
    private int width;
    private int height;
    private char[][] board;
    private final char empty = ' ';



    public ConnectBoard(int height, int width) {
        this.width = width;
        this.height = height;
        this.board = new char[height][width];

        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                board[h][w] = empty;

            }
        }
    }

    public char[][] getBoard() {
        return board;
    }

    public void displayBoard() {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print("|_" + board[row][col]);
            }
            System.out.println("|");
        }
    }

    public void insert(char color, int col) {

        for (int row = height - 1; row >= 0; row--) {
            if (board[row][col] == empty) {
                board[row][col] = color;
                return;
            }

        }
    }

    public char calculateWinner() {

        for (int row = 0; row < height; row++) {
            for (int col = 0; col <= width - 4; col++) {
                char color = board[row][col];
                if (board[row][col] != empty
                        &&
                        board[row][col + 1] == color
                        && board[row][col + 2] == color
                        && board[row][col + 3] == color) {
                    return color;
                }
            }
        }

        for (int row = 0; row <= height - 4; row++) {
            for (int col = 0; col < width; col++) {
                char color = board[row][col];
                if (board[row][col] != empty
                        &&
                        board[row + 1][col] == color
                        &&
                        board[row + 2][col] == color
                        &&
                        board[row + 3][col] == color) {
                    return color;
                }
            }
        }
        for (int row = 0; row <= height - 4; row++) {
            for (int col = 0; col < width - 4; col++) {
                char color = board[row][col];
                if (board[row][col] != empty
                        &&
                        board[row + 1][col + 1] == color
                        &&
                        board[row + 2][col + 2] == color
                        &&
                        board[row + 3][col + 3] == color) {
                    return color;
                }

            }
        }
        for (int row = 3; row < height; row++) {
            for (int col = 0; col <= width - 4; col++) {
                char color = board[row][col];
                if (board[row][col] != empty
                        &&
                        col + 3 < width && row - 3 >= 0
                        &&
                        board[row - 1][col + 1] == color
                        &&
                        board[row - 2][col + 2] == color
                        &&
                        board[row - 3][col + 3] == color) {
                    return color;
                }
            }
        }

        return empty;
    }


    public boolean isFull(int col)

    {
        for (int i = 0; i < height; i++) {
            if (board[i][col] == empty) {
                return false;
            }
        }
        return true;
    }




}