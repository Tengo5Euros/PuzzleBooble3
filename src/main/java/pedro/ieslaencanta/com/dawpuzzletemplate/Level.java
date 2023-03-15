package pedro.ieslaencanta.com.dawpuzzletemplate;

import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Level {
    private String sound;
    private int level;
    private Dimension2D original_size;

    private GraphicsContext bggc;
    private String background_top;
    private String background_down;
    private Point2D topposition;
    private Point2D downposition;
    private int starty;
    private BubbleType matrix;

    public Level(int starty, BubbleType matrix, int x, int y,int level){

        this.setStarty(starty);
        this.setMatrix(matrix);
        this.setSound(new String());
        this.level=level;
        this.setBackground_down(new String());
        this.setTopposition(new Point2D(x,y));
        this.setDownposition(new Point2D(x,y));
    }
    public Level(BubbleType matrix){
        this.setMatrix(matrix);
    }

    public void paintBackground(GraphicsContext gc){
        Image imagen = Resources.getInstance().getImage("fondos");
        if(level==1){
            this.bggc.drawImage(imagen, 16, 17,this.original_size.getWidth(),this.original_size.getHeight(),0,0,
                    this.original_size.getWidth()*Game.SCALE,this.original_size.getHeight()*Game.SCALE);
        }
        if (level==2){
            this.bggc.drawImage(imagen, 344, 17,this.original_size.getWidth(),this.original_size.getHeight(),0,0,
                    this.original_size.getWidth()*Game.SCALE,this.original_size.getHeight()*Game.SCALE);
        }
        if (level==3){
            this.bggc.drawImage(imagen, 16, 544,this.original_size.getWidth(),this.original_size.getHeight(),0,0,
                    this.original_size.getWidth()*Game.SCALE,this.original_size.getHeight()*Game.SCALE);
        }

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

    public Point2D getTopposition() {
        return topposition;
    }

    public void setTopposition(Point2D topposition) {
        this.topposition = topposition;
    }

    public Point2D getDownposition() {
        return downposition;
    }

    public void setDownposition(Point2D downposition) {
        this.downposition = downposition;
    }

    public int getStarty() {
        return starty;
    }

    public void setStarty(int starty) {
        this.starty = starty;
    }

    public BubbleType getMatrix() {
        return matrix;
    }

    public void setMatrix(BubbleType matrix) {
        this.matrix = matrix;
    }
}
