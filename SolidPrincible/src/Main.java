import javax.management.monitor.Monitor;

public class Main {
    public static void main(String[] args) {

        Windows98Machine windows98Machine = new Windows98Machine(new HPKeyboard(), new HPMonitor());
        windows98Machine.calistir();

    }
}