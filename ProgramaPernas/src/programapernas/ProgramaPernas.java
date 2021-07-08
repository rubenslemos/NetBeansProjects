/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Rubens
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite quantas pernas o bicho que esta pensando tem: ");
        int pernas = teclado.nextInt();
        String tipo;
        System.out.print("Isso é : ");
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "tripe";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 5:
                tipo ="Aranha de seis patas manca";
                break;
            case 6:
                tipo = "Aranha de seis patas";
                break;
            case 7:
                tipo = "Aranha de oito patas manca";
                break;
            case 8:
                tipo = "Aranha de oito patas";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
    
}
