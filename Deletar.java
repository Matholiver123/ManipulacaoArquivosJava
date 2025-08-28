import java.io.File;  

public class Deletar {
  public static void main(String[] args) { 
    File nome = new File("Matheus.txt"); 

    if (nome.delete()) { 
      System.out.println("Delete o Arquivo: " + nome.getName());
    } else {
      System.out.println("Falha ao excluir o arquivo.");
    } 
  } 
}