/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author Rubens
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 39;
        String valor = Integer.toString(idade);
        System.out.println("Idade :" + idade);
        String valor2 = "1982.45";
        float ano = Float.parseFloat(valor2);
        System.out.println("Ano de nascimento :" + ano);
    }
    
}
