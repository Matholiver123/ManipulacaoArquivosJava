import java.io.File;  // Importa a classe File
import java.io.FileNotFoundException;  // Importa esta classe para lidar com erros
import java.util.Scanner; // Importa a classe Scanner para ler arquivos de texto

public class Leitura {
  public static void main(String[] args) {
    try {
      File nome = new File("filename.txt"); 
      Scanner myReader = new Scanner(nome); 
      while (myReader.hasNextLine()) { 
        String data = myReader.nextLine(); 
        System.out.println(data);
      }
      myReader.close(); 
    } catch (FileNotFoundException e) {
      System.out.println("Ocorreu um erro."); 
      e.printStackTrace(); 
    }
  }
}
