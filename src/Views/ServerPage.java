package Views;

import Controller.Server;
import Utils.Program;

public class ServerPage extends Program {

    public ServerPage() {
        this.setVisible(true);
    }

    @Override
    public void run() {
        super.run();

        // the ui part

        Server server = new Server();
        server.run();
    }
}
