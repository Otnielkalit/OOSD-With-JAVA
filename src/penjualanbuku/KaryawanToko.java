package penjualanbuku;
import  java.util.ArrayList;

public class KaryawanToko {
    String nama,usia, notelp;
    ArrayList<KaryawanToko> keluaran = new ArrayList();
    public KaryawanToko() {
    }

    public KaryawanToko(String nama, String usia, String notelp) {
        this.nama = nama;
        this.usia = usia;
        this.notelp = notelp;
    }

    public void tampil(){
        int num = 0;
        System.out.println("No"+"\tNama Karyawan"+"\t\tUsia"+"\t\t\tNo Telepon");
        for(int i = 0;i<keluaran.size();i++){
            System.out.println(i+1+"\t"+keluaran.get(i).nama+"\t\t"+keluaran.get(i).usia+"\t\t"+"Rp."+keluaran.get(i).notelp);

            num++;
            System.out.println("Nama Karyawan   :"+keluaran.get(i).nama);
            System.out.println("Usia Karyawan   :"+keluaran.get(i).usia);
            System.out.println("Nomor Telepin   :"+keluaran.get(i).notelp);
            System.out.println("|| ============================================== ||");
        }
    }

    public void addKaryawan(String nama, String usia, String notelp){
        keluaran.add(new KaryawanToko(nama,usia,notelp));
    }

    public void updateKaryawan(int opsi,String nama, String usia, String notelp){
        keluaran.set(opsi,new KaryawanToko(nama,usia,notelp));
    }

    public void deleteKaryawan(int opsi){
        for(int i=0;i<keluaran.size();i++){
            if(opsi == i){
                keluaran.remove(i);
            }
        }
    }
}
