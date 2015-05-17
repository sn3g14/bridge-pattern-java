package example.bridge;

/**
 * By pressing NEXT or PREVIOUS on the remote control
 * the television will skip to next or previous channel.
 */
public class Television extends AbstractDevice {

    private int currentChannel;
    
    /**
     * NEXT pressed.
     * Go to next channel.
     */
    @Override
    public void nextSignal() {
        // no validation
        this.currentChannel +=1;
        System.out.println("tv next channel");
    }

    /**
     * PREVIOUS pressed.
     * Go to previous channel. 
     */
    @Override
    public void previousSignal() {
        // no validation
        this.currentChannel -= 1;
        System.out.println("tv previous channel");
    }

    @Override
    public void playSignal() { /* play not supported by this device */ }

    @Override
    public void pauseSignal() { /* pause not supported by this device */ }

    @Override
    public void stopSignal() { /* stop no supported by this device */ }

    @Override
    public void ejectSignal() { /* eject not supported by this device */ }
}
