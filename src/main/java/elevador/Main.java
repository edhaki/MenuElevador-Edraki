package elevador;
import java.util.Scanner;

/**
 * 
 *
 * @author Ederson .A Silva
 */
public class Main {


    public static void main(String[] args) {
    /* A principio criei um menu para selecionar se a pessoa quer subir
        ou descer com o Elevador.*/
    Scanner leitor = new Scanner(System.in);
    funcoesElevador menuElevador = new funcoesElevador(5,7,0); 
    
    System.out.println("1 - Subir");
    System.out.println("2 - Descer");
    System.out.println("3 - Sair Elevador");
    int opcao = leitor.nextInt();
    
    switch(opcao){
        case 1: 
    System.out.println("Digite Qual Andar você quer Subir");
    menuElevador.andaresPredio(leitor.nextInt());
   
    
    System.out.println("Quantas Pessoas há no Elevador:");
    menuElevador.entra(leitor.nextInt());
    
    System.out.println("Por favor Digite quantas pessoas Desembarcaram :");
    menuElevador.pessoasForaElevador(leitor.nextInt());
    break;
    
    case 2:
   
    System.out.println("Digite Qual Andar você quer Descer: ");
    menuElevador.descerAndar(leitor.nextInt());
   
    System.out.println("Quantas Pessoas há no Elevador:");
    menuElevador.entra(leitor.nextInt());
    
    System.out.println("Por favor Digite quantas pessoas Desembarcaram :");
    menuElevador.pessoasForaElevador(leitor.nextInt());
    break;
    
    
      
    }
   }
}
    

