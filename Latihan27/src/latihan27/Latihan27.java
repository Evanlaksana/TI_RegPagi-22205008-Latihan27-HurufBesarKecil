/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan27;
import java.util.Scanner;
public class Latihan27 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        
        String kalimatBesar = kalimat.toUpperCase();
        String kalimatKecil = kalimat.toLowerCase();
        
        System.out.println("\n=====Hasil Formatting=====");
        System.out.println("Huruf Besar : " +kalimatBesar);
        System.out.println("Huruf Kecil: " +kalimatKecil);
        
    }
}
    
    
