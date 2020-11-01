/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116417.latihan25.ejaannama;
import java.util.Scanner;

/**
 *
 * @author Akmal
 *  NAMA        : GILANG PANJI WANENG PATI
 *  KELAS       : PBO2
 *  NIM         : 10116417
 *  DESKRIPSI   : BERISI TENTANG PROGRAM EJAAN NAMA
 */
public class PBO210116417Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String Nama;
        int Panjang;
        char huruf;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Nama depan untuk di eja : ");
        Nama = scanner.nextLine();
        
        Panjang = Nama.length();
        
        System.out.println("Ejaan untuk " + Nama + " adalah : ");
        
        for (int i = 0; i < Panjang; i++){
            System.out.println("Huruf ke-" + (i+1) + " : " + Nama.charAt(i));
        }
        System.out.println("Devoloped by  Gilang Panji Waneng Pati");
        
    }
    
}
