/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author Rubens
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 1;
        while (cc <= 20) {
            cc++;
            if (cc % 2 != 0){
                continue;
            }
            if (cc <10){
            System.out.println("Cambalhota "+ 0+cc);
        } else{
            System.out.println("Cambalhota "+ cc);    
            }
        if(cc == 18){
            break;
        }
    }
    System.out.println("O break nao vai impedir de eu dar a Cambalhota 20");
}    
}
