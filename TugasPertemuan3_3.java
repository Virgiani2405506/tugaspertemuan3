/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspertemuan3_3;

/**
 *
 * @author LENOVO
 * TUGAS PERTEMUAN KETIGA
 * NIM GENAP
 * NO.3
 */

import java.util.Scanner;
public class TugasPertemuan3_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Jam masuk : ");
        int jamMasuk = input.nextInt();
        
        System.out.println("Jam Keluar : ");
        int jamKeluar = input.nextInt();
        
        int lamaParkir;
        int tarif;
        
        //Lama Parkir
        if(jamKeluar > jamMasuk){
            lamaParkir = jamKeluar-jamMasuk;
        }else{
            lamaParkir = (12-jamMasuk)+jamKeluar;
        }
        
        //Tarif
        if(lamaParkir <=2){
            tarif = 1500;
        }else{
            tarif = 1500 + ((lamaParkir-2)*1000);
        }
        System.out.printf("Tarif parkir anda Rp%d", tarif);
    }
}
