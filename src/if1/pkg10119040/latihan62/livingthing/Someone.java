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
public class Someone extends LivingThing {
    private String nama;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    /**
     *
     * @param nama
     */
    @Override
    public void jalan(String nama) {
        System.out.println(nama + " Sedang Berjalan");
    }
    
}
