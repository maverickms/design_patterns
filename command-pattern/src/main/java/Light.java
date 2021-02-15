// a receiver
public class Light {
    String lightName;

    public Light(String lightName) {
        this.lightName = lightName;
    }

    public void on() {
        System.out.println(this.lightName + " turned on!");
    }

    public void off() {
        System.out.println(this.lightName + " turned off");
    }
}
