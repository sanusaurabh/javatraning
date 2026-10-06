public class TemperatureCheck {

    public static void main(String[] args) {

        int temperature = 15;

        if (temperature >= 30) {
            System.out.println("Hot");

        } else if (temperature >= 20) {
            System.out.println("Normal");

        } else {
            System.out.println("Cold");
        }
    }
}