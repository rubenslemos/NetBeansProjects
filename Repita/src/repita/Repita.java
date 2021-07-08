/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repita;
import javax.swing.JOptionPane;
/**
 *
 * @author Rubens
 */
public class Repita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, pares =0, impares =0, total = 0 , media=0;
        int cem = 0;
        do{
         n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>informe um Numero: <br><em>"
                 + "(Valor 0 interrompe)</em></html>"));
        s ++;
        if (n%2 == 0){
            pares++;
        } else{
            impares++;
        }
        if (n >=100){
            cem++;
        }
        total += n;
        media = total/s;
        }while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr> " + "<br>Total de Valores: "
                + s + "<br><br>Total de Pares: " + pares +"<br><br>Total de Impares: " + impares +
                "<br><br>Acima de 100: " + cem +"<br><br>Soma dos Valores: " + total +
                "<br><br>Media dos Valores: " + media +"<br></html>");
    }
    
}
