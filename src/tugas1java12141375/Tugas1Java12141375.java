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
        // Bentuk Segitiga Siku Kanan Atas 
        System.out.println("Bentuk Segitiga siku Kanan Atas");
        for(int a=0; a<jumlah; a++) {
            for(int k=0; k<a; k++) {
                System.out.print(" ");
            }
            for(int b=0; b<(jumlah-a); b++) {
                System.out.print("*");
            }
        System.out.println();
        }
        // Bentuk Segitiga Siku Kanan Bawah
        System.out.print("Bentuk Segitiga siku Kanan Bawah");
        for(int a=0; a<=jumlah; a++) {
            for(int b=0; b<(jumlah-a); b++) {
                System.out.print(" ");
            }
            for(int k=0; k<a; k++) {
                System.out.print("*");
            }
        System.out.println();
        }
        System.out.println();
        // Bentuk Segitiga Sama Kaki  
        System.out.println("Bentuk Segitiga Sama Kaki");
        for(int a=0; a<=jumlah; a++) {
            for (int m=1; m<=jumlah-a; m++) {
                System.out.print (" ");
            }
            for (int m=1; m<2*a; m++) {
                System.out.print ("*");
            }
        System.out.println (" ");
        }
    }
}