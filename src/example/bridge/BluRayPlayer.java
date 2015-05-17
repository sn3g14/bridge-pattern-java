package example.bridge;

/**
 * By pressing NEXT or PREVIOUS on the remote control
 * the blu-ray player will skip to the next or previous chapter.
 */
public class BluRayPlayer extends AbstractDevice {

    private int currentChapter;
    
    @Override
    public void nextSignal() {
        // no validation
        this.currentChapter += 1;
        System.out.println("blue-ray player next chapter");
    }

    @Override
    public void previousSignal() {
        // no validation
        this.currentChapter -= 1;
        System.out.println("blue-ray player previous chapter");
    }

    @Override
    public void playSignal() {
        System.out.println("blue-ray player play");
    }

    @Override
    public void pauseSignal() {
        System.out.println("blue-ray player pause");
    }

    @Override
    public void stopSignal() {
        System.out.println("blue-ray player stop");
    }

    @Override
    public void ejectSignal() {
        System.out.println("blue-ray player eject");
    }
}
