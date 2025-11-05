public class ChallengerConvertFahrenheitForCelsius{
  public static void main(String[] args) {
     convertFahrenheitForCelsius(71);
  }

  public static void convertFahrenheitForCelsius(double temperatureFahrenheit){
      final double multipleValueForm = 5.0 / 9;
      final int valueForm = 32;

      final double temperatureCelsius = (temperatureFahrenheit - valueForm) * (multipleValueForm);

      System.out.println("Temperature in Celsius is: " + temperatureCelsius);
  }
}