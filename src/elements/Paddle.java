package elements;

import javax.swing.ImageIcon;
import utils.Commons;
import core.BreakoutBoard;

public class Paddle extends Sprite  {

	private int dx;

    public Paddle() {
        initPaddle();        
    }
    
    private void initPaddle() {
        loadImage();
        getImageDimensions();

        resetState();
    }
    
    private void loadImage() {
        image = new ImageIcon("resources/images/paddle.png").getImage();
    }    

    public void move() {
        x += dx;
        if (x <= 0) {
            x = 0;
        }
        if (x >= Commons.WIDTH - imageWidth) {
            x = Commons.WIDTH - imageWidth;
        }
    }


    public void makeMove(int move) {
    	if(move == BreakoutBoard.LEFT) {
    		dx = -1;
    	} else if(move == BreakoutBoard.RIGHT) {
    		dx = 1;
    	}
    }
    
    
    private void resetState() {
        x = Commons.INIT_PADDLE_X;
        y = Commons.INIT_PADDLE_Y;
    }
}
