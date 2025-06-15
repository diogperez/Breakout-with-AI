package elements;

import javax.swing.ImageIcon;

import utils.Commons;

public class Ball extends Sprite {

    private int xdir;
    private int ydir;

    public Ball() {
        initBall();
    }

    private void initBall() {
        xdir = 1;
        ydir = -1;

        loadImage();
        getImageDimensions();
        resetState();
    }

    private void loadImage() {
        image = new ImageIcon("resources/images/ball.png").getImage();
    }

    public void move() {
        x += xdir;// + Math.random()*4 - 2;
        y += ydir;
        if (x == 0) {
            setXDir(1);
        }
        if (x >= Commons.WIDTH - imageWidth) {
            setXDir(-1);
        }
        if (y <= 0) {
            setYDir(1);
        }
    }

    private void resetState() {
        x = Commons.INIT_BALL_X;
        y = Commons.INIT_BALL_Y;
    }

    public void setXDir(int x) {
        xdir = x;
    }

    public void setYDir(int y) {
        ydir = y;
    }

    public int getYDir() {
        return ydir;
    }
}
