package part_2;

public class Light {
    private boolean isOn;

    public void turnOn(){
        this.isOn = true;
        System.out.println("[Light] Turning ON");
    }

    public void turnOff(){
        this.isOn = false;
        System.out.println("[Light] Turning OFF");
    }

    public boolean isOn() {
        return isOn;
    }
}
