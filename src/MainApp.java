
import example.bridge.BluRayPlayer;
import example.bridge.RemoteControl;
import example.bridge.RemoteControlAdvanced;
import example.bridge.Television;

public class MainApp {  
    public static void main(String[] args) {    
        Television tv = new Television();
        BluRayPlayer brPlayer = new BluRayPlayer();
        
        // use base remote control to
        // switch on the tv and the blu-ray player
        RemoteControl rcS = new RemoteControl(brPlayer);
        rcS.powerPressed();
        rcS.setRemoteDevice(tv);
        rcS.powerPressed();
        rcS.nextPressed(); // send next channel command to the tv
        
        // use the advanced remote control to send the play signal
        // to the blu-ray player and stop the playback afterwards
        RemoteControlAdvanced rcA = new RemoteControlAdvanced(brPlayer);
        rcA.playPressed();
        rcA.stopPressed();
        
        // switch both devices off
        rcA.powerPressed();
        rcA.setRemoteDevice(tv);
        rcA.powerPressed();
    }
}
