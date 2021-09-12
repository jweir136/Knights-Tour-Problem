
public class KnightsTour {
    private int[][] board;

    public static void main(String[] args) {
        new KnightsTour(8);
    }
    
    public KnightsTour(int N) {
        this.board = new int[N][N];
        initBoard();
        printBoard();
    }

    // Set all spaces in board to -1, except for the first space.
    // The first space will hold a 0.
    private void initBoard() {
        for (int i = 0; i < this.board.length; i++)
            for (int j = 0; j < this.board[0].length; j++)
                this.board[i][j] = -1;
        this.board[0][0] = 0;
    }

    private void printBoard() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[0].length; j++)
                System.out.print(this.board[i][j] + " ");
            System.out.print("\n");
        }
    }
}