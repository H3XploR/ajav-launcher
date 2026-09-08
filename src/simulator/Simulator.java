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

public class Simulator {

  public static void main(String[] args) {

    try {

      IO.println("main launched");
      IO.print("trying to take arg: ");
      IO.println(args[0]);

      FileReader readerScenario = new FileReader(args[0]);

      for (int i = 0; i < 100; i++){
        int intCharacter = readerScenario.read();
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
