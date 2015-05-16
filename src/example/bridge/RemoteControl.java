package example.bridge;

public class RemoteControl implements IRemote {

    private IRemote remoteDevice;
    
    public RemoteControl(IRemote remoteDevice) {
        this.remoteDevice = remoteDevice;
    }
    
    public void setRemoteDevice(IRemote remoteDevice) {
        this.remoteDevice = remoteDevice;
    }
    
    @Override
    public void powerPressed() {
        remoteDevice.powerPressed();
    }

    @Override
    public void upPressed() {
        remoteDevice.upPressed();
    }

    @Override
    public void downPressed() {
        remoteDevice.downPressed();
    }

    @Override
    public void nextPressed() {
        remoteDevice.nextPressed();
    }

    @Override
    public void previousPressed() {
        remoteDevice.previousPressed();
    }

    @Override
    public void playPressed() {
        remoteDevice.playPressed();
    }

    @Override
    public void pausePressed() {
        remoteDevice.pausePressed();
    }

    @Override
    public void stopPressed() {
        remoteDevice.stopPressed();
    }

    @Override
    public void ejectPressed() {
        remoteDevice.ejectPressed();
    }
}
