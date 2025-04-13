package module6;

public class Main {
    public static void main(String[] args) {
        Fan defaultFan = new Fan();
        Fan fan = new Fan(13, true, 9, "black");

        System.out.println(defaultFan.toString());
        System.out.println(fan.toString());
    }
}
