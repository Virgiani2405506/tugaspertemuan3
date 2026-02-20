/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspertemuan3_1;

/**
 *
 * @author LENOVO
 * TUGAS PERTEMUAN KETIGA
 * NIM GENAP
 * NO.1
 */
import java.util.Scanner;
public class TugasPertemuan3_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Input
        System.out.println("Masukkan a,b,c : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        
        if(a >= 1000 && a <= 10000){
            System.out.printf("a: %d adalah ribuan.\n", a);
        }else{
            System.out.printf("a: %d bukan ribuan.\n", a);
        }
        
        if(b >= 1000 && b <= 10000){
            System.out.printf("b: %d adalah ribuan.\n", b);
        }else{
            System.out.printf("b: %d bukan ribuan.\n", b);
        }
        
        if(c >= 1000 && c <= 10000){
            System.out.printf("c: %d adalah ribuan.\n", c);
        }else{
            System.out.printf("c: %d bukan ribuan.", c);
        }
    }
}