import java.lang.Math;
import java.util.*;

public class Board {

    private int numRows;
    private int numCols;
    private int squareSize;
    private int numMines;
    private boolean[][] mineLoc;

    public Board() {
        new Board(40, 40, 30, 100);
    }

    public Board(int numRows, int numCols, int squareSize, int numMines) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.squareSize = squareSize;



    }

    public void generateMines(int clickR, int clickC) {
        boolean[] visited = new boolean[numRows * numCols];

        mineLoc[clickR][clickC] = true;
//        visited[clickR * numCols + clickC] = true;

        for (int i = 0; i < numMines;) {
            int n = (int)(Math.random() * numRows * numCols);
            int r = n / numCols;
            int c = n % numCols;

            if (!mineLoc[r][c]) {
                mineLoc[r][c] = true;
                ++i;
            }


        }
    }
}
