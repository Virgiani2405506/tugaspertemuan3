/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspertemuan3_2;

/**
 *
 * @author LENOVO
     * TUGAS PERTEMUAN KETIGA
     * NIM GENAP
     * NO.2
 */
import java.util.Scanner;
public class TugasPertemuan3_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Input
        System.out.println("Masukkan a,b dan c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        if(a > b && a > c){
            System.out.printf("%d adalah bilangan terbesar dari %d dan %d", a, b, c);
        }else if(b > c && b > a){
            System.out.printf("%d adalah bilangan terbesar dari %d dan %d", b, c, a);
        }else{ 
            System.out.printf("%d adalah bilangan terbesar dari %d dan %d", c, a, b);
        }
    }
}
