import Controller.Client;
import Utils.Program;
import Utils.ProgramHandler;
import Views.ServerPage;
import Views.WelcomePage;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends Program {

    public void close() {
        super.close();
    }

    public Main() {
//        background.add(gotoServerPage);
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
        Program page = new WelcomePage();
    }

}