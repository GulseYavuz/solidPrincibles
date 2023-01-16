
public class Windows98Machine  {

    StandardKeyboardMachine standardKeyboard;
    MonitorMachine monitor;

    public Windows98Machine(StandardKeyboardMachine standardKeyboard, MonitorMachine monitor){
        this.standardKeyboard = standardKeyboard;
        this.monitor = monitor;
    }

   public void calistir(){
        standardKeyboard.add();
        monitor.update();
   }

}

