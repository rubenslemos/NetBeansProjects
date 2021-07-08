/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor;

/**
 *
 * @author Rubens
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int cc=3; cc>=0; cc-= 1){
            System.out.println("Cambalhota "+ 0+(cc+1));
            for (int jj=2; jj>=0; jj--){
                System.out.println("Salto "+ 0+(jj+1));
            }
        }
    }
    
}
