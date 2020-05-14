package screensaver;

import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.awt.*;

public class ColorFrame extends JFrame {
    @Autowired
    private Color color;

    public ColorFrame() {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void ShowOnRandomPlace(){

    }
}
