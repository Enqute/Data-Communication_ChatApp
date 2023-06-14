package Views;

import Utils.Program;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.beans.EventHandler;

public class WelcomePage extends Program {

    private JPanel createText(final String value, String color,
                              String font, int size, int style, boolean isUp, JComponent component) {
        GridLayout layout = new GridLayout();
        layout.setColumns(1);
        layout.setRows(3);

        JPanel fake = new JPanel();
        fake.setBackground(Color.decode("#272727"));

        JPanel fake2 = new JPanel();
        fake2.setBackground(Color.decode("#272727"));

        JPanel panel = new JPanel();
        panel.setBackground(Color.decode("#272727"));
        panel.setLayout(layout);

        JLabel text = new JLabel(value, JLabel.CENTER);
        text.setFont(new Font(font, style, size));
        text.setForeground(Color.decode(color));

//        Color.decode("#f7d034")

        if (isUp) {
            JPanel pan = new JPanel();
            pan.setBackground(Color.decode("#272727"));

            pan.add(text);

            if (component != null)
                pan.add(component);
            else System.out.println("It is null");

            panel.add(pan);
            panel.add(fake2);
            panel.add(fake);
        } else {
            panel.add(fake2);
            panel.add(fake);
            panel.add(text);
        }

        return panel;
    }

    public void close() {
        super.close();
    }

    public WelcomePage() {
        this.setVisible(true);
    }

    @Override
    public void run() {
        super.run();

        GridLayout layout = new GridLayout();
        layout.setRows(2);
        this.background.setLayout(layout);

        JButton continueBtn = new JButton("Continue");
        continueBtn.setBackground(Color.decode("#1e90ff"));
        continueBtn.setForeground(Color.decode("#f0f0f0"));
        continueBtn.setBorder(new EmptyBorder(10, 20, 10, 20));
        continueBtn.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        continueBtn.addActionListener(e -> {
            ServerPage serverPage = new ServerPage();
            serverPage.run();
            close();
        });

        background.add(createText("Welcome to this chat app!", "#f7d034", "Segoe UI", 100, Font.BOLD, false, continueBtn));
        background.add(createText("Enjoy this TCP based chat app", "#f0f0f0", "Calibri", 25, Font.BOLD, true, continueBtn));
    }

}
