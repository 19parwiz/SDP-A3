package bridge;

public class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Basic Remote: changing channel...");
        super.setChannel(channel);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Basic Remote: changing volume...");
        super.setVolume(volume);
    }
}
