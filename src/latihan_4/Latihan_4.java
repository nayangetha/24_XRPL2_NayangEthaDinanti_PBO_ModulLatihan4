/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_4;
import java.util.Scanner;
/**
 *
 * @author MOKLET1
 */
public class Latihan_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner masukan = new Scanner(System.in);
        
        //Deklarasi variabel lokal
        int a,b;
        
        //Input data oleh user
        System.out.print("Masukkan nilai a :");
        a = masukan.nextInt();
        System.out.print("Masukkan nilai b :");
        b = masukan.nextInt();
        System.out.println();
        //Memanggil variabel yang telah diinputkan data oleh user untuk ditampilkan
        System.out.println("Nilai Variabel yang ada pada program :");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    
}
