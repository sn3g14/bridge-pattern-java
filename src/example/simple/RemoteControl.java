package example.simple;

public class RemoteControl {
    
    private Television television;
    
    public RemoteControl(Television tv) {
        television = tv;
    }
    
    /**
     * POWER pressed.
     * Switches the television on or off.
     */
    public void powerPressed() {
        if(null != television) {
            television.setPower(!this.television.getPower());
        }
    }
    
    /**
     * UP pressed.
     * Turns volume up.
     */
    public void upPressed() {
        if(null != television) {
            television.setCurrentVolume(television.getCurrentVolume() + 1);
        }
    }
    
    /**
     * DOWN pressed.
     * Turns volume down.
     */
    public void downPressed() {
        if(null != television) {
            television.setCurrentVolume(television.getCurrentVolume() - 1);
        }
    }
    
    /**
     * NEXT pressed.
     * Go to next channel.
     */
    public void nextPressed() {
        if(null != television) {
            television.setCurrentChannel(television.getCurrentChannel() + 1);
        }
    }
    
    /**
     * PREVIOUS pressed.
     * Go to previous channel. 
     */
    public void previousPressed() {
        if(null != television) {
            television.setCurrentChannel(television.getCurrentChannel() - 1);
        }
    }
}
