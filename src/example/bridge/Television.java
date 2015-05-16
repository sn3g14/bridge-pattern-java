package example.bridge;

/**
 * By pressing NEXT or PREVIOUS on the remote device
 * the television will switch the channel accordingly.
 */
public class Television extends AbstractDevice {

    private int currentChannel;
    
    /**
     * NEXT pressed.
     * Go to next channel.
     */
    @Override
    public void nextPressed() {
        // no validation
        this.currentChannel +=1;
        System.out.println("tv next channel");
    }

    /**
     * PREVIOUS pressed.
     * Go to previous channel. 
     */
    @Override
    public void previousPressed() {
        // no validation
        this.currentChannel -= 1;
        System.out.println("tv previous channel");
    }

    @Override
    public void playPressed() { /* play not supported by this device */ }

    @Override
    public void pausePressed() { /* pause not supported by this device */ }

    @Override
    public void stopPressed() { /* stop no supported by this device */ }

    @Override
    public void ejectPressed() { /* eject not supported by this device */ }
}
