package aircraft;

public class Aircraft {

  public enum Type{
    JETPLANE,
    HELICOPTER,
    BALLON
  }

  public String name;
  public float longitude;
  public float latitude;
  public float height;
  public Aircraft(){
    IO.println("Aircraft created");
  }
}
