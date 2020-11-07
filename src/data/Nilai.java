/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM NILAI TERBESAR DAN TERKECIL
 */

public class Nilai {
    public int banyakMhs,max,min;
    
    public void getMhs(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan banyaknya mahasiswa: ");
        banyakMhs = input.nextInt();
    }
    
    public int [] isiNilai(int parBanyakMhs){ 
        Scanner scanner = new Scanner(System.in);
        int [] nilaiMhs = new int [banyakMhs];
        for (int i = 0; i < banyakMhs; i++){
        System.out.print("Nilai mahasiswa ke-" + (i+1) + ": ");
        nilaiMhs[i] = scanner.nextInt();
        }
        max = nilaiMhs[0];
        min = nilaiMhs[0];
        for (int i = 0; i < banyakMhs; i++){
            if (nilaiMhs[i] > max){
                max = nilaiMhs[i];
            }
            else if (nilaiMhs[i] < min){
                min = nilaiMhs[i];
            }
        }
        
        System.out.println("Nilai max = " + max);
        System.out.println("Nilai min = " + min);
        return nilaiMhs;
    }
        
}