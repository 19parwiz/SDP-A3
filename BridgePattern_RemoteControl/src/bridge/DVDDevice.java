package bridge;

public class DVDDevice implements Device {

    @Override
    public void powerOn() {
        System.out.println("DVD Player is powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("DVD Player is powered off.");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("DVD does not support channel switching.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("DVD Player volume set to " + volume);
    }
}
