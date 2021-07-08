/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author Rubens
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner (System.in);
        System.out.print("Digite o ano no qual nascestes: ");
        int nas = teclado.nextInt();
        int i = 2021 - nas;
        System.out.print("Voce tem: " + i + " anos e você é ");
        if (i>=18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }
    }
}
