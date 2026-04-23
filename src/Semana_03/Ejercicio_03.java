/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_03;

/**
 *
 * @author LENOVO
 */
import java.util.Arrays;

public class Ejercicio_03 {
    
    static void view(int v[]){
        for(Integer i:v){
            System.out.print(i+"\t");
        }
    }
    
    static boolean search(int v[], int s){
        boolean band=false;
        for(Integer i:v){
            if(i==s){
                band=true;
                break;
            }
        }
        return band;
    }

    //Metodo burbuja
    static void sort(int v[]){
        int temp;
        for (int i = 0; i < 6; i++) {
            for (int j = i+1; j < 7; j++) {
                if(v[i]>v[j]){
                    temp=v[i];
                    v[i]=v[j];
                    v[j]=temp;
                }
            }
        }
    }
    
    static int bsearch(int[] arr, int objetivo ){
        int inicio = 0, fin = arr.length - 1;
    
    //Metodo Binario
    while (inicio <= fin) {
        int medio = (inicio + fin) / 2;

        if (arr[medio] == objetivo) return medio;
        if (arr[medio] < objetivo) inicio = medio + 1;
        else fin = medio - 1;
    }

    return -1;

    }
    public void TiempodeOrdenamiento(int v[]){
        long inicio =  System.nanoTime();
        long fin = System.nanoTime();
        }
    public static void main(String[] args) {
        int v[]={6,8,5,7,7,14,15};
        view(v);
        if(search(v,20))
            System.out.println("\nValue true");
        else
            System.out.println("\nValue false");
        long inicio = System.nanoTime();
        sort(v);
        long fin = System.nanoTime();
        long tiempo = inicio - fin;
        
        view(v);
        if(bsearch(v, 20)==-1)
            System.out.println("\nValue false");
        else
            System.out.println("\nValue true");
    }   
}


