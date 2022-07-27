package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void main(String[] args) {
        toFahrenheit(20);
    }
    public static void toFahrenheit(int temperatureCelsius){
        System.out.println(temperatureCelsius * 1.8 + 32);
    }
}
