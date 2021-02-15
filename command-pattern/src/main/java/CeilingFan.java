// a receiver
public class CeilingFan {
    String fanName;

    public CeilingFan(String lightName) {
        this.fanName = lightName;
    }

    public void on() {
        System.out.println(this.fanName + " turned on!");
    }

    public void off() {
        System.out.println(this.fanName + " turned off");
    }
}
