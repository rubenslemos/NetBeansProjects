/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Rubens
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1, a = 0;
        System.out.println("Primeiro i = " + i);
        System.out.println("Primeiro a = " + a);
        while (i < 10){
            ++a;
            i = i + 1;
            if (a > 6){
                ++i;
            }
            System.out.println("i = " + i);
            System.out.println("a = " + a);
        }
        System.out.println("Final i = " + i);
        System.out.println("Final a = " + a);
    }
    
    
}
