package aircraft;
import coordinates.Coordinates;

public class Aircraft {

  public enum Type{
    JETPLANE,
    HELICOPTER,
    BALLON
  }

  protected String name;
  protected long id;
  protected Coordinates coordinates;
  protected Aircraft(long p_id, String p_name, Coordinates p_coordinate){
    IO.println("Constructor Aircraft called");
    IO.println("Aircraft created");
    IO.println("p_id = " + this.id);
    IO.println("p_name = " + this.name);
    IO.println("p_coordinate = " + this.coordinates);
  }
}
