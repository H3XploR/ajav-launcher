/*
 *  Creation du package WeatherProvider
 *
 * */

package WeatherProvider;
import Coordinates.Coordinates;

public class WeatherProvider {
  private void WeatherProvider(){
    System.out.println("Class WeatherProvider created"); 
  }
  public String getCurrentWeather(Coordinates p_coordinates){
    System.out.println("getCurrentWeather called");
    return "error";
  }
}
