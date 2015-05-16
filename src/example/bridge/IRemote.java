package example.bridge;

/**
 * Every remote control implements this commands.
 * Every remote device (television, blu-ray player) that can be controlled 
 * by a remote control understands this commands.
 */
public interface IRemote {
    public void powerPressed();
    public void upPressed();
    public void downPressed();
    public void nextPressed();
    public void previousPressed();
    public void playPressed();
    public void pausePressed();
    public void stopPressed();
    public void ejectPressed();
}
