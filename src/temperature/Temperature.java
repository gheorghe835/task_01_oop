package temperature;

public class Temperature { 
    private double value;
    public Temperature(double value){
        this.value = value;
    }
    public double getValue(){
        return value;
    }
    public void setValue(double value){
        this.value = value;
    }

    // Metodă pentru a converti temperatura din Celsius în Fahrenheit
    public double celciusToFahrenheit(){
        return (value * 9 / 5) + 32;
    }
    // Metodă pentru a converti temperatura din Fahrenheit în Celsius
    public double fahrenheitToCelcius(){
        return (value - 32) * 5 / 9;
    }
}
