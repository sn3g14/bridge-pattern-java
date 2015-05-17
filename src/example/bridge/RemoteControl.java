package example.bridge;

/**
 * Base remote control that supports
 * POWER, UP, DOWN, NEXT, PREVIOUS commands.
 */
public class RemoteControl {

    protected IRemoteControllable remoteDevice;
    
    public RemoteControl(IRemoteControllable remoteDevice) {
        this.remoteDevice = remoteDevice;
    }
    
    public void setRemoteDevice(IRemoteControllable remoteDevice) {
        this.remoteDevice = remoteDevice;
    }
    
    public void powerPressed() {
        remoteDevice.powerSignal();
    }

    public void upPressed() {
        remoteDevice.upSignal();
    }

    public void downPressed() {
        remoteDevice.downSignal();
    }

    public void nextPressed() {
        remoteDevice.nextSignal();
    }
    
    public void previousPressed() {
        remoteDevice.previousSignal();
    }
}
