package bridge;

public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        Device dvd = new DVDDevice();
        Device soundSystem = new SoundSystemDevice();

        RemoteControl basicRemote = new BasicRemote(tv);
        RemoteControl advancedRemote = new AdvancedRemote(dvd);

        // Basic remote controlling the TV
        basicRemote.powerOn();
        basicRemote.setChannel(5);
        basicRemote.setVolume(20);
        basicRemote.powerOff();

        System.out.println("------");

        // Advanced remote controlling the DVD Player
        advancedRemote.powerOn();
        advancedRemote.setVolume(30);
        ((AdvancedRemote) advancedRemote).mute();
        advancedRemote.powerOff();

        System.out.println("------");

        // Basic remote controlling the Sound System
        basicRemote = new BasicRemote(soundSystem);
        basicRemote.powerOn();
        basicRemote.setVolume(15);
        basicRemote.powerOff();
    }
}
