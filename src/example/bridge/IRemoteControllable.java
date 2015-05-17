package example.bridge;

/**
 * Every remote device (television, blu-ray player) that can be controlled 
 * by a remote control understands this commands.
 */
public interface IRemoteControllable {
    public void powerSignal();
    public void upSignal();
    public void downSignal();
    public void nextSignal();
    public void previousSignal();
    public void playSignal();
    public void pauseSignal();
    public void stopSignal();
    public void ejectSignal();
}
