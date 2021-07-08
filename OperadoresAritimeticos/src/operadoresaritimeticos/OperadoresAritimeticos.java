/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritimeticos;

/**
 *
 * @author Rubens
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int n = 0;
        double n1 = 100;
        double n2 = Math.round(1 + Math.random() * (10-1));
        System.out.println("n2 = " + n2);
        do {
            double n3 = 0.8;
            n1 = Math.pow(n1,n3);
            n2 = Math.sqrt(n2);
            double m = (n1 + Math.ceil(n2))/2;
            System.out.println(++n + "ª Media: entre " + Math.floor(n1) + " e " + Math.ceil(n2) + " = " + Math.round(m));
        n1++;
        n2++;
        } while (n < 10);
        
    }
    
}
