/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Rubens
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String ("Gustavo");
        String res;
        System.out.println("Nome1: "+nome1);
        System.out.println("Nome2: "+nome2);
        System.out.println("Nome3: "+nome3);
        res = (nome1==nome3)?"igual":"diferente";
        System.out.println("\nResultado da comparação entre Nome1 e Nome3 com operador relacional: "+res);
        res = (nome1.equals(nome3))?"igual" :"diferente";
        System.out.println("Resultado da comparação entre Nome1 e Nome3 com metódo equals: "+res);
        res = (nome2==nome3)?"igual":"diferente";
        System.out.println("\nResultado da comparação entre Nome2 e Nome3 com operador relacional: "+res);
        res = (nome2.equals(nome3))?"igual" :"diferente";
        System.out.println("Resultado da comparação entre Nome2 e Nome3 com metódo equals: "+res);        
        res = (nome1==nome2)?"igual":"diferente";
        System.out.println("\nResultado da comparação entre Nome1 e Nome2 com operador relacional: "+res);
        res = (nome2.equals(nome3))?"igual" :"diferente";
        System.out.println("Resultado da comparação entre Nome1 e Nome2 com metódo equals: "+res);        
        
    }
    
}
