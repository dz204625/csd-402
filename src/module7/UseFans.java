package module7;

import module6.Fan;

public class UseFans {
    public static void displayingFan(Fan fan) {
        String fanStatus = fan.isFanOn() ? "on" : "off";
        System.out.println("Fan's " +
                "speed is " + fan.getSpeed() +
                ", fan is " + fanStatus + ".");
    }

    public static void displayingFans(Fan[] fansCollection) {
        for (Fan fan : fansCollection) {
            displayingFan(fan);
        }
    }

    public static void main(String[] args) {
        Fan[] fansCollection = new Fan[3];
        fansCollection[0] = new Fan(13, true, 9, "black");
        fansCollection[1] = new Fan(5, false, 6, "white");
        fansCollection[2] = new Fan(6, true, 20, "pink");
        displayingFans(fansCollection);
    }

}
