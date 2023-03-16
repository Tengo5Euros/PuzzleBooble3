package pedro.ieslaencanta.com.dawpuzzletemplate;

import javafx.geometry.Dimension2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;

public class Level {
    private String sound;
    private int level;
    private Dimension2D original_size;

    private GraphicsContext bggc;
    private String background_top;
    private String background_down;

    private Dimension2D tablero;
    private int starty;
    private BubbleType[][] matrix;

    public Level(){
    this.tablero= tablero;
    this.setMatrix(new BubbleType[5][5]);
    }

    public Level(int x, int y, BubbleType[][] matrix, int starty){
        this.matrix= matrix;
        this.starty=starty;



    }
    public Level(BubbleType[] matrix){

    }

    public void paintBackground(GraphicsContext gc){


    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getBackground_top() {
        return background_top;
    }

    public void setBackground_top(String background_top) {
        this.background_top = background_top;
    }

    public String getBackground_down() {
        return background_down;
    }

    public void setBackground_down(String background_down) {
        this.background_down = background_down;
    }



    public int getStarty() {
        return starty;
    }

    public void setStarty(int starty) {
        this.starty = starty;
    }


    public BubbleType[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(BubbleType[][] matrix) {
        this.matrix = matrix;
    }

    public Dimension2D getTablero() {
        return tablero;
    }

    public void setTablero(Dimension2D tablero) {
        this.tablero = tablero;
    }
}
