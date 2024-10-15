package facade;

public class SmartHomeApp {
    public static void main(String[] args) {
        SmartHomeFacade smartHome = new SmartHomeFacade();

        // Simulate arriving home
        smartHome.arriveHome();

        // Simulate leaving home
        smartHome.leaveHome();

        // Simulate activating night mode
        smartHome.nightMode();

        // Simulate activating movie mode
        smartHome.movieMode();
    }
}
