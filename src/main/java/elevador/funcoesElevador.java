/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevador;
import java.util.Scanner;
/**
 *
 * @author Ederson .A Silva
 */
public class funcoesElevador {
    private final int totalAndaresPredio;
    private final int qtdPessoasPermitida;
    private final int terreo;
    int novoAndar, qtdPessoas, pessoasElevadorSaida, saidaPessoasElevador;
    int saidaPessoas, terreoAndar,localAndar;
    
    Scanner entrada = new Scanner(System.in);


   public funcoesElevador(int totalAndaresPredio, int qtdPessoasPermitida, int terreo) {
        this.totalAndaresPredio = totalAndaresPredio;
        this.qtdPessoasPermitida = qtdPessoasPermitida;
        this.terreo = terreo;
   }


public void andaresPredio(int novoAndar){
        this.novoAndar = novoAndar;
        if( novoAndar >= totalAndaresPredio){
            System.out.println("Você está no Ultimo Andar não é possivel subir");
            
            } 
        }

public void descerAndar(int terreoAndar){
        this.novoAndar = terreoAndar;
        
        if(terreoAndar <= terreo){
            System.out.println("Você Está no Terreo saia do elevador não é possivel descer");
        }
}


public void entra(int qtdPessoas){
         this.qtdPessoas = qtdPessoas;
         if (qtdPessoas > qtdPessoasPermitida){
         System.out.println("Capacidade maxima Permitida é " + qtdPessoasPermitida + " Por favor desembarque para o Elevador Subir");
         }
         else {
             System.out.println("Total de Pessoas no Elevador: " + qtdPessoas + " Seu Andar escolhido é : " + novoAndar);
         }
}

        
public void pessoasForaElevador (int saidaPessoasElevador){
    this.saidaPessoas = (qtdPessoas - saidaPessoasElevador);
    if (saidaPessoas <= 0){
        System.out.println("Elevador Vazio");
    }
    else {
    System.out.println("Total de pessoas no Elevador é : " + saidaPessoas);
    }
}

}




    
   
    
    

