package temperature;

public class Printer {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(43.2);
        System.out.println("  Temperatura: " + temperature.getValue() + " - in celsius sunt: " + temperature.fahrenheitToCelcius() + 
         ", in fahreinheit sunt: " + temperature.celciusToFahrenheit());
    }
}
