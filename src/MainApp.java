
import example.bridge.BluRayPlayer;
import example.bridge.RemoteControl;
import example.bridge.Television;

public class MainApp {  
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl(new Television());
        control.nextPressed();
        control.setRemoteDevice(new BluRayPlayer());
        control.playPressed();
        control.nextPressed();
        control.stopPressed();
    }
}
