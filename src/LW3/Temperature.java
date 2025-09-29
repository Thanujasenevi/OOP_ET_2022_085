package LW3;

public class Temperature {
    private double Celcius;
    private double Fahrenheit;

    public Temperature() {
    }

    public Temperature(double celcius, double fahrenheit) {
        Celcius = celcius;
        Fahrenheit = fahrenheit;
    }

    public double getCelcius() {
        return Celcius;
    }

    public double getFahrenheit() {
        return Fahrenheit;
    }

    public void setCelcius(double celcius) {
        Celcius = celcius;
        Fahrenheit= Celcius * 9 / 5 + 32;
    }

    public void setFahrenheit(double fahrenheit) {
        Fahrenheit = fahrenheit;
    }
}