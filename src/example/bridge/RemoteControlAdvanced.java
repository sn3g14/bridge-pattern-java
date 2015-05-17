package example.bridge;

/**
 * Advanced remote control with additional support for 
 * PLAY, PAUSE, STOP, EJECT commands.
 */
public class RemoteControlAdvanced extends RemoteControl {

    public RemoteControlAdvanced(IRemoteControllable remoteDevice) {
        super(remoteDevice);
    }

    public void playPressed() {
        remoteDevice.playSignal();
    }

    public void pausePressed() {
        remoteDevice.pauseSignal();
    }

    public void stopPressed() {
        remoteDevice.stopSignal();
    }

    public void ejectPressed() {
        remoteDevice.ejectSignal();
    }   
}
