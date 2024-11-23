
/**
 * Write a description of class rental_kendaraan here.
 *
 * @author winda naff
 * @version 07 Nov 2024
 */

import java.util.ArrayList;
import java.util.HashMap;

public class rental_kendaraan{
    private ArrayList<kendaraan> daftar_kendaraan = new ArrayList<>();
    private HashMap<String, kendaraan> daftar_penyewa = new HashMap<>();

    public void tambah_kendaraan(kendaraan kendaraan){
        daftar_kendaraan.add(kendaraan);
    }
    
    public void sewa_kendaraan(String nama_penyewa, kendaraan kendaraan){
        if(daftar_kendaraan.contains(kendaraan)){
            daftar_penyewa.put(nama_penyewa, kendaraan);
            daftar_kendaraan.remove(kendaraan);
        }
        else{
            System.out.println("Kendaraan gk ada, mau nyewa apa lu?");
        }
    }
    
    public void tampilkan_kendaraan(){
        System.out.println("Daftar kendaraan yg ada : ");
        for(kendaraan k : daftar_kendaraan){
            k.tampilkan();
            System.out.println("---------------");
        }
    }
    
    public void tampilkan_penyewa(){
        System.out.println("Daftar Penyewa: ");
        for(String nama : daftar_penyewa.keySet()) {
            System.out.println("Nama Penyewa: " + nama);
            daftar_penyewa.get(nama).tampilkan();
            System.out.println("---------------");
        }
    }
}
