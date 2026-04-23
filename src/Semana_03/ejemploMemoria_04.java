/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_03;

/**
 *
 * @author LENOVO
 */
import java.util.*;
public class ejemploMemoria_04 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        
        System.gc();
        long m1 = r.freeMemory();
        List<Integer> al = new ArrayList<>(); 
        for(int i=0; i<100000; i++) al.add(i);
        long m2 = r.freeMemory();
        System.out.println("ArrayList consumio: " + (m1 - m2) / 1024 + " KB");
        
        System.gc();
        long m3 = r.freeMemory();
        List<Integer> ll = new LinkedList<>();
        for(int i=0; i<100000; i++) ll.add(i);      
        long m4 = r.freeMemory();
        System.out.println("LinkedList consumio: " + (m3 - m4) / 1024 + " KB");
    }
}
