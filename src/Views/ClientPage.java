package Views;

import Controller.Client;
import Utils.Program;

public class ClientPage extends Program {

    @Override
    public void run() {
        super.run();

        //

        Client client = new Client();
        client.run();
    }

}
