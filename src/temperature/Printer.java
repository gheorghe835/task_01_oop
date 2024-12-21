package temperature;

public class Printer {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(43.2);
        System.out.println("  Temperatura: " + temperature.getValue() + " - in celsius sunt: " + temperature.fahrenheitToCelcius() + 
         ", in fahreinheit sunt: " + temperature.celciusToFahrenheit());
        temperature.setValue(33);
        System.out.println("  Temperatura in celsius: " + temperature.getValue() + " - in fahrenheit sunt: " + 
        temperature.celciusToFahrenheit()); 
        System.out.println("  Temperatura in fahrenheit: " + temperature.getValue() + " - in celsius sunt: " + 
        temperature.fahrenheitToCelcius()); 
    }
}
