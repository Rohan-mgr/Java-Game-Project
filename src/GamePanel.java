import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;

public class GamePanel extends JPanel implements Runnable, KeyListener{
    //dimensions

    public static final int WIDTH = 320;
    public static final int HEIGHT = 240;
    public static final int SCALE = 2;

    //game thread
    private Thread thread;
    private boolean running;
    private int FPS = 60;
    private long targetTime = 1000/FPS;
    //image
    private BufferedImage image;
    private Graphics2D g;

    public GamePanel() {
        super();
        setPreferredSize(
                new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        setFocusable(true);
        requestFocus();
    }

    public void addNotify() {
        super.addNotify();
        if(thread == null) {
            thread = new Thread(this);
            addKeyListener(this);
            thread.start();
        }
    }

    public void run() {

    }

    public void keyTyped(KeyEvent key) {}
    public void keyPressed(KeyEvent key) {}
    public void keyReleased(KeyEvent key) {}
}
