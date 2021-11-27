import processing.core.*;

public class Main extends PApplet {

    private static Board board;

    public void setup() {

        board = new Board();
    }

    public void draw() {

    }

    public void settings() {
        size(600, 600);
    }

    public static void main(String[] args) {
        PApplet.main("Main");


    }
}