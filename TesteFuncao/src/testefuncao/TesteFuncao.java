/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao;

/**
 *
 * @author Rubens
 */
public class TesteFuncao {

    /**
     * @param args the command line arguments
     */
    static int somatorio (int a, int b){ //função
        int s = a+b;
        return s;
    }
     
    static void soma (int a, int b){ //procedimento
        int s = a+b;
        System.out.println("Soma = "+ s);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        soma(5,2);
        int sm = somatorio(8,16);
        System.out.println("O valor recebido da função Somatorio = " + sm);
        System.out.println("Vai começar a contagem");
        System.out.println(Operacoes.contador(1,5));
    }
    
}
