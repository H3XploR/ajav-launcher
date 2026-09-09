/*
 *  Je ne comprend rien au package je vais onc lire la doc a ce sujet.
 *
 *
 * */

package simulator;
import java.io.File;
import java.nio.file.Path;
import java.io.IOException;
import java.lang.Byte;
import java.io.FileReader;
import java.lang.Character;
import aircraft.Aircraft;

public class Simulator {
  /*
   * The first line of the file contains a positive integer. 
   * This number represents how many times the simulation runs.
   * In our case, this will be the number of times a weather change 
   * is triggered
   *
   */
  public int howManyTime;
  public static void main(String[] args) {

    try {

      IO.println("main launched");
      IO.print("trying to take arg: ");
      IO.println(args[0]);

      FileReader readerScenario = new FileReader(args[0]);

      int intCharacter = 0;
      while (intCharacter != -1){
        intCharacter = readerScenario.read();
        char c = (char) intCharacter;
        IO.print(c);
      }
      IO.println();
    } catch (IOException e) {

    } finally {
      IO.println("program terminated.");
    }
  }
}
