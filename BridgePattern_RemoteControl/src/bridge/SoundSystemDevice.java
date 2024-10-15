package bridge;

public class SoundSystemDevice implements Device {

    @Override
    public void powerOn() {
        System.out.println("Sound System is powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Sound System is powered off.");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sound System does not support channels.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Sound System volume set to " + volume);
    }
}
