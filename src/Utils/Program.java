package Utils;

import javax.swing.*;
import javax.swing.plaf.basic.BasicPanelUI;
import java.awt.*;

public class Program extends JFrame implements Runnable {

    public int width;
    public int height;
    public boolean isRunning = false;
    protected JPanel background = new JPanel();

    public Program() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();

        width = (int)screen.getWidth();
        height = (int)screen.getHeight();

        run();

        ProgramHandler.programs.add(this);
    }

    public void close() {
        if (ProgramHandler.programs.size() <= 1) {
            ProgramHandler.programs.clear();
            System.exit(0);
        } else {
            this.setVisible(false);
        }
        ProgramHandler.programs.remove(this);
    }

    @Override
    public void run() {
        GridLayout layout = new GridLayout();

        layout.setColumns(1);
        layout.setRows(15);

        background.setLayout(layout);
        background.setAutoscrolls(true);
        background.setBackground(Color.decode("#272727"));

        this.setTitle("Hello there");
        this.setBounds(0, 0, width, height);
        this.setResizable(false);
        this.setFocusable(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(background);

//        this.setVisible(true);
    }
}
