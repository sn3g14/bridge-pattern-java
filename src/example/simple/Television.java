package example.simple;

public class Television {
    
    private boolean power; /* on/off */
    private int currentVolume;
    private int currentChannel;

    public boolean getPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    
    public void setCurrentVolume(int currentVolume) {
        // no validation
        this.currentVolume = currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        // no validation
        this.currentChannel = currentChannel;
    }    
}
