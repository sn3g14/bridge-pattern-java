package example.bridge;

/**
 * The base functionality that is the same for
 * all remote devices (television, blu-ray player).
 * 
 * Both devices can be turned on and off.
 * Both devices offer the possiblity to change the current volume.
 */
public abstract class AbstractDevice implements IRemoteControllable {
    
    private boolean powerState; /* on/off */
    private int currentVolume;
    
    /**
     * POWER pressed.
     * Switches the device on or off.
     */
    @Override
    public void powerSignal() {
        this.powerState = !this.powerState;
        if(this.powerState) {
            System.out.println("Device "+ this.getClass().getSimpleName() +" switched on");
        } else {
            System.out.println("Device "+ this.getClass().getSimpleName() + " switched off");
        }
    }

    /**
     * UP pressed.
     * Turns volume up.
     */
    @Override
    public void upSignal() {
        // no validation
        this.currentVolume += 1;
    }

    /**
     * DOWN pressed.
     * Turns volume down.
     */    
    @Override
    public void downSignal() {
        // no validation
        this.currentVolume -= 1;
    }
}
