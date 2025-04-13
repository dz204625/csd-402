package module6;

public class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean isFanOn;
    private int radius;
    private String color;

    public Fan() {
        this.speed = STOPPED;
        this.isFanOn = false;
        this.radius = 6;
        this.color = "white";
    }

    public Fan(int speed, boolean isFanOn, int radius, String color) {
        this.speed = speed;
        this.isFanOn = isFanOn;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isFanOn() {
        return isFanOn;
    }

    public void setFanOn(boolean fanOn) {
        isFanOn = fanOn;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String fanStatus = isFanOn ? "on" : "off";
        return "Fan's " +
                "speed is " + speed +
                ", fan is " + fanStatus + ".";
    }
}
