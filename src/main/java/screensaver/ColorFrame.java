package screensaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

@Component
@Scope("prototype")
public abstract class ColorFrame extends JFrame {
    @Autowired
    private Color color;
    private int sizeNumber = 3;

    public ColorFrame() {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public ColorFrame(int sizeNumber) {
        this.sizeNumber = sizeNumber;
        setSize(this.sizeNumber * 100, this.sizeNumber * 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public int getNumOfFrames() {
        return sizeNumber;
    }

    public void setNumOfFrames(int sizeNumber) {
        this.sizeNumber = sizeNumber;
    }

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(1700), random.nextInt(800));
        getContentPane().setBackground(getColor());
        repaint();
    }

    protected abstract Color getColor();
}
