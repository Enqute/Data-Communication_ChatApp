package Views;

import Utils.Program;

public class ServerPage extends Program implements Runnable {

    public ServerPage() {
//        this.setTitle("");
    }

    @Override
    public void run() {
        super.run();
        this.setVisible(true);
    }
}
