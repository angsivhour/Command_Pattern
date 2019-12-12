public class StereoOnwithCDCommand implements Command{
    Stereo stereo;
    public StereoOnwithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(90);
    }
}
