import Utils.Program;
import Utils.ProgramHandler;
import Views.ServerPage;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends Program {

    public void close() {
        super.close();
    }

    public Main() {
        JButton gotoServerPage = new JButton("Go to server");
        gotoServerPage.setSize(140, 50);
        gotoServerPage.setBorder(null);
        gotoServerPage.setBackground(Color.decode("#0073e6"));
        gotoServerPage.setForeground(Color.decode("#ffffff"));
        gotoServerPage.setFont(new Font("Open Sans", Font.BOLD, 15));

        background.add(gotoServerPage);
    }

    @Override
    public void run() {
        super.run();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch(Exception e) {
            e.printStackTrace();
        }
        ProgramHandler.programs = new ArrayList<>();
        new Main();
    }

}