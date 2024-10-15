package facade;

public class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade() {
        light = new Light();
        thermostat = new Thermostat();
        securitySystem = new SecuritySystem();
        entertainmentSystem = new EntertainmentSystem();
    }

    public void leaveHome() {
        securitySystem.activate();
        light.turnOff();
        thermostat.setTemperature(15); // Set to low temperature when leaving
        System.out.println("Leaving home...");
    }

    public void arriveHome() {
        securitySystem.deactivate();
        light.turnOn();
        thermostat.setTemperature(22); // Set to comfortable temperature when arriving
        System.out.println("Welcome home!");
    }

    public void nightMode() {
        light.turnOff();
        thermostat.setTemperature(18); // Set to a cooler temperature at night
        System.out.println("Night mode activated");
    }

    public void movieMode() {
        light.turnOff();
        entertainmentSystem.playMovie();
        System.out.println("Movie mode activated");
    }
}
