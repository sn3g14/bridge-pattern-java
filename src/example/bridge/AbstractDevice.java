package example.bridge;

/**
 * The base functionality that is the same for
 * all remote devices (television, blu-ray player).
 * 
 * Both devices can be turned off and on.
 * Both devices offer the possiblity to change the current volume.
 */
public abstract class AbstractDevice implements IRemote {
    
    private boolean powerState; /* on/off */
    private int currentVolume;
    
    /**
     * POWER pressed.
     * Switches the device on or off.
     */
    @Override
    public void powerPressed() {
        this.powerState = !this.powerState;
    }

    /**
     * UP pressed.
     * Turns volume up.
     */
    @Override
    public void upPressed() {
        // no validation
        this.currentVolume += 1;
    }

    /**
     * DOWN pressed.
     * Turns volume down.
     */    
    @Override
    public void downPressed() {
        // no validation
        this.currentVolume -= 1;
    }
}
