/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbuku;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author otnie
 */
public class  EventBazar{
    String judul;
    String waktu;
    String penyelanggara;
    ArrayList<EventBazar> eventBazar = new ArrayList();

    public EventBazar() {
    }
    
    public EventBazar(String judul, String waktu, String penyelanggara) {
        this.judul = judul;
        this.waktu = waktu;
        this.penyelanggara = penyelanggara;
    }
    
    public void tampilEventBazar(){
        System.out.println("No." + "\tJudul"+"\tTanggal"+"\t\tPenyelenggara");
        for(int i=0;i<eventBazar.size();i++){
            System.out.println(i+1+". "+"\t"+eventBazar.get(i).judul
                    +"\t"+ eventBazar.get(i).waktu
                    +"\t"+ eventBazar.get(i).penyelanggara);
        }
    }
    
    public void addEventBazar(String judul, String waktu, String penyelanggara){
        eventBazar.add(new EventBazar(judul,waktu,penyelanggara));
    }
    
    public void deleteEventBazar(int opsi){
        for(int i=0;i<eventBazar.size();i++){
            if(opsi==i){
                eventBazar.remove(i);
            }
        }
    }
    
    public void updateEventBazar(int opsi,String judul, String waktu, String penyelanggara){
        eventBazar.set(opsi, new EventBazar(judul,waktu,penyelanggara));
    }
}
