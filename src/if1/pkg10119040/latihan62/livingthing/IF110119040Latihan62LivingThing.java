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
public class IF110119040Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Someone someone = new Someone();
        someone.setNama("Agus Deri Dermawan");
        someone.jalan(someone.getNama());
        someone.nafas(someone.getNama());
        someone.makan(someone.getNama());
    }
    
}
