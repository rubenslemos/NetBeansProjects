/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author Rubens
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //vetor 01
        int n[] = {3,2,8,7,5,4};
        int pren = Arrays.binarySearch(n, 8);// fazer busca no vetor
        Arrays.sort(n); //ordena vetor
        System.out.println("Tamanho do meu vetor: " +n.length);
        for (int c=0; c<=n.length-1; c++){
            System.out.println("Posicao do vetor: "+ c+" Valor inserido: "+ n[c]);
        }
        int posn = Arrays.binarySearch(n, 8);// fazer busca no vetor
        System.out.println("Posição do valor 8 antes de ordenar o vetor: " + pren); //imprime a posicao que achou o valor q procurava
        System.out.println("Posição do valor 8 depois de ordenar o vetor: " + posn); //imprime a posicao que achou o valor q procurava
        //vetor 02
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        String tot[] ={"31","28","31","30","31","30","31","31","30","31","30","31"};
        System.out.println("Tamanho dos meus vetores: " +mes.length);
        for(int i = 0; i<mes.length; i++){
            System.out.println("Mês: "+mes[i]+" Dias: "+tot[i]);
        }
        //vetor 03
        double v[] = {3.5, 2.75, 9, -4.5};
        int aa = -1;
        int pre = Arrays.binarySearch(v, 9.0);// fazer busca no vetor
        Arrays.sort(v); //ordena vetor
        System.out.println("Tamanho dos meus vetores: " +v.length);
        for(double valor: v){
            aa++;
            System.out.println("Posicao do vetor: "+ aa +" Valor inserido: "+valor);
        }
        int pos = Arrays.binarySearch(v, 9.0); // fazer busca no vetor
        System.out.println("Posição do valor 9.0 antes de ordenar o vetor: " + pre); //imprime a posicao que achou o valor q procurava
        System.out.println("Posição do valor 9.0 depois de ordenar o vetor: " + pos); //imprime a posicao que achou o valor q procurava
        //vetor 04
        int vetor[] = new int[20];
        aa = -1;
        Arrays.fill(vetor, 9); //preenche o vetor com o mesmo valor em todas posições
        /*int posvet = Arrays.binarySearch(vetor, 9);
       System.out.println("Posição do valor 9 no vetor: " + posvet);*/
        for(int valor: vetor){
            aa++;
           System.out.println("Posicao do vetor: "+ aa +" Valor inserido: "+valor);
        }
    }
    }
