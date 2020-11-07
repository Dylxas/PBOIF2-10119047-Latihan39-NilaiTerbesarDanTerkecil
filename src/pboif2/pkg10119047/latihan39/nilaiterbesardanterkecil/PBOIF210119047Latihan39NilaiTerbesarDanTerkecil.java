/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan39.nilaiterbesardanterkecil;
import data.Nilai;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM NILAI TERBESAR DAN TERKECIL
 */

public class PBOIF210119047Latihan39NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        
        Scanner input = new Scanner(System.in);
        Nilai nilai = new Nilai();
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.printf("Masukan Nama Petugas: ");
        nama = input.nextLine();
        
        nilai.getMhs();
        nilai.isiNilai(nilai.banyakMhs);

    }
    
}
