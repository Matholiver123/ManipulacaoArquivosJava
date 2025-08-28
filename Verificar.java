import java.io.File;  // Importa a classe do arquivo 
import java.io.IOException; // Importa a classe IOException para lidar com erros

public class Verificar{
    public static void main(String[] args) {
      try {
        File nome = new File("Matheus.txt");
        if (nome.createNewFile()) {
          System.out.println("Arquivo criado: " + nome.getName());
        } else {
          System.out.println("O arquivo já existe.");
        }
      } catch (IOException e) {
        System.out.println("Ocorreu um erro.");
        e.printStackTrace();
      }
    }
  }