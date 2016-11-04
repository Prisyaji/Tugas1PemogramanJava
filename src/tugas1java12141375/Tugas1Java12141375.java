package tugas1java12141375;

import javax.swing.JOptionPane;

public class Tugas1Java12141375 {
    
    public static void main(String[] args) {
    
    JOptionPane.showMessageDialog(null, "Tugas 1 Pemograman Java\n Nama : Prisyliawan Aji Suroso\n Nim : 12141375");
    // inisialisasi variabel
     int jumlah;
        
        jumlah = Integer.valueOf(JOptionPane.showInputDialog("Jumlah Karakter Segitiga : "));
                
        // Bentuk Segitiga Siku Kiri Atas 
        System.out.println("Bentuk Segitiga siku Kiri Atas");
        for(int a=0;a<jumlah;a++) {
            for(int b=a;b<jumlah;b++) {
                System.out.print("*");
            }
        System.out.println();
        }
       // Bentuk Segitiga Siku Kiri Bawah      
        System.out.print("Bentuk Segitiga siku Kiri Bawah");
        for(int c=0;c<=jumlah;c++) {
            for(int d=0; d<c; d++) {
                System.out.print("*");
            }
        System.out.println();
        }
        