    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package avaliacao.n1;

import java.util.Scanner; // biblioteca de Scaner para realizar leituras

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 08/03/24
 * @brief class Prova01
 */
// Classe criada Prova01 no seguinte caminho
// C:\Users\lucas\Documents\NetBeansProjects\lucasreis\src\main\java\avaliacao\n1
public class Prova01 {
   // metado para iniciar o aplicativo java
    public static void main(String[] args) { 
  
          int opcao =0, qde_expresso=0,qde_capuccino=0,qde_leite_com_cafe=0, qde_cafe_sem_acucar =0,qde_cafes_vendidos,qde_valor_parcial = 0; // declarando variaveis do tipo inteiro ambas iniciando com valor 0 exeto a variavel qde_cafes_vendidos
double valor_expresso,valor_capuccino,valor_leite_com_cafe, valor_cafe_sem_acucar,valor_cafes_vendidos, valor_parcial; // declarando variaveis do tipo double ;
// chama a classe Scanner para obter entrada a partir da janela de comando
Scanner sc = new Scanner(System.in); 

// entra no laço de reptição ate e ler os valores informado pelo usuario quando valor for = a 4 ele sai do laço e totatila os valores informado pelo usuario
// se o valor informado for maior que 4 imprime na tela opcao invalida
do{
    // solicita ao usuário o valor de entrada opcao de de 1,2,3 e 4
    System.out.println("forneça uma opcao:\n"+"1 - cafe expresso;\n"+"2 - cafe capuccino;\n"+"3 - leite com cafe;\n" +"4 - cafe sem acucar;\n" +"5 - pagar parcialmente;\n" +"6 - pagamento total;");
    opcao = sc.nextInt(); // ler os valores informado pelo usuario
    if ( opcao == 1 ) qde_expresso++;  // armazena o primo valor e soma com outro valor informado 
else if (opcao == 2) qde_capuccino++;  // armazena o primo valor e soma com outro valor informado 
else if (opcao == 3) qde_leite_com_cafe++; // armazena o primo valor e soma com outro valor informado 
else if (opcao == 4) qde_cafe_sem_acucar++;
 
else if (opcao != 6) System.out.println("Opção inválida"); // se usuario informar valor maior que 4 imprime opcao invalida

} while ( opcao != 6 );
    
   valor_expresso = qde_expresso*0.75; // valor do cafe expresso
   valor_cafe_sem_acucar = qde_cafe_sem_acucar * 0.50; // valor do cafe sem açucar.
   valor_capuccino = qde_capuccino;
   valor_leite_com_cafe = qde_leite_com_cafe*1.25;  // valor do cafe com leite 
   qde_cafes_vendidos = qde_expresso + qde_capuccino + qde_leite_com_cafe + qde_cafe_sem_acucar; // faz a soma dos itens escolhidos
    valor_cafes_vendidos = valor_expresso + valor_capuccino + valor_leite_com_cafe + valor_cafe_sem_acucar; // soma os valores informado pelo ususario
   
    
    
    

    
    // ler as opcao informada pelo usuario salva os valores e faz a soma do mesmo quando usuario digitar o valor 4

// imprime o resultado do pedido do cleinte
        System.out.println("Qde cafe expresso :"+ qde_expresso+" - valor: "+valor_expresso); // imprime o resultado armazendo em valor expresso
         System.out.println("Qde cafe capuccino :"+ qde_capuccino+" - valor: "+valor_capuccino); // imprime o resultado armazendo em valor capuccino
         System.out.println("Qde leite com café :"+ qde_leite_com_cafe+" - valor: "+valor_leite_com_cafe);// imprime o resultado armazendo em valor leite com cafe
          System.out.println("Qde cafe expresso :"+ qde_cafe_sem_acucar+" - valor: "+valor_cafe_sem_acucar); // imprime o resultado armazendo em cafe sem acuar
         System.out.println("Qde cafés vendidos :"+ qde_cafes_vendidos+" - valor total: "+valor_cafes_vendidos); // imprime o resultado armazendo em  valor_cafes_vendidos
  
        
    }
}

