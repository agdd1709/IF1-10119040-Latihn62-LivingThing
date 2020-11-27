/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan62.livingthing;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program ini memuat data untuk menampilkan program
 * living thing menggunkan metode pendektan
 */
public abstract class LivingThing {
    public abstract void jalan(String nama);
    
    public void nafas(String nama){
        System.out.println(nama + " Bernafas");
    }
    
    public void makan(String nama){
        System.out.println(nama + " Makan");
    }
}
