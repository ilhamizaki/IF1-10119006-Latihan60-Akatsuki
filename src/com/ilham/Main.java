/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : class Main Character Akatsuki
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====Program Memilih Karakter Akatsuki=====");
        
        // tampil karakter akatsuki
        Akatsuki akatsuki = new Akatsuki();
        akatsuki.tampilKarakter(akatsuki.namaKarakter);
        AkatsukiTerkuat terkuat = new AkatsukiTerkuat();
        
        System.out.println("\n=======Pilih Karakter Favoritmu=====");
        System.out.print("Nomor Karakter : ");
        Byte pilih = scanner.nextByte();
        
        // tampil karakter
        Character karakter = new Character();
        karakter.pilihKarakter(pilih);
    }
    
}
