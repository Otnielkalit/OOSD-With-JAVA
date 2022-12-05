/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbuku;

import java.util.ArrayList;

/**
 *
 * @author otnie
 */
public class CustomerService {
    String isi,tanggal,biaya;
    ArrayList<CustomerService> keluaran = new ArrayList();
    public CustomerService() {
    }

    public CustomerService(String isi, String tanggal, String biaya) {
        this.isi = isi;
        this.tanggal = tanggal;
        this.biaya = biaya;
    }
    
    public void tampil(){
        System.out.println("No"+"\tJudul"+"\t\tTanggal"+"\t\t\tBiaya");
        for(int i = 0;i<keluaran.size();i++){
            System.out.println(i+1+"\t"+keluaran.get(i).isi+"\t\t"+keluaran.get(i).tanggal+"\t\t"+"Rp."+keluaran.get(i).biaya);
        }
    }
    
    public void addLaporan(String isi, String tanggal, String biaya){
        keluaran.add(new CustomerService(isi,tanggal,biaya));
    }
    
    public void updateLaporan(int opsi,String isi, String tanggal, String biaya){
        keluaran.set(opsi,new CustomerService(isi,tanggal,biaya));
    }
    
    public void deleteLaporan(int opsi){
        for(int i=0;i<keluaran.size();i++){
            if(opsi == i){
                keluaran.remove(i);
            }
        }
    }
}
