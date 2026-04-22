package Semana_02;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class Ejercicio_de_Tiempo_01 {
    public static void main(String[] args){
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        if(bean.isCurrentThreadCpuTimeSupported()){
            long inicioCPU = bean.getCurrentThreadCpuTime();
        }
        int n  = 10000000;
        for (int i = 0; i < n;i++){
            int x = i * 2;
        }
    }
}

