package penjualanbuku;
import java.util.ArrayList;

public class Karyawan {

    String nama;
    String usia;
    String notelp;


    ArrayList<Karyawan> karyawan = new ArrayList();

    public Karyawan(String nama, String usia, String notelp) {
        this.nama = nama;
        this.usia = usia;
        this.notelp = notelp;
    }

    public Karyawan() {
    }

    public void tampilKaryawan(){
       int num = 0;
        for(Karyawan karyawan : karyawan){
//            System.out.println(++num +". "
//                    +"\t"+ karyawan.nama
//                    +"\t"+ karyawan.usia
//                    +"\t"+ karyawan.notelp
//            );
            num++;
            System.out.println("Nomor" +num);
            System.out.println("Nama Karyawan   :"+karyawan.nama);
            System.out.println("Usia            :"+karyawan.usia);
            System.out.println("Nomor Telepon   :"+karyawan.notelp);
            System.out.println("|| =================================== ||");
        }
    }
//    public void tampilKaryawan(){
//        System.out.println("No" +"\tNama" + "\tUsia"+"\tNomor Telepon");
//        for(int i=0;i<karyawan.size();i++){
//            System.out.println(i+1+". "
//                    +"\t"+ karyawan.get(i).nama
//                    +"\t"+ karyawan.get(i).usia
//                    +"\t"+ karyawan.get(i).notelp
//
//            );
//        }
//    }

    public void addKaryawan(String nama, String usia, String notelp){
        karyawan.add(new Karyawan(nama, usia, notelp));
    }

    public void deleteKaryawan(int opsi){
        for(int i=0;i<karyawan.size();i++){
            if(opsi==i){
                karyawan.remove(i);
            }
        }
    }

    public void updateKaryawan(String nama, String usia, String notelp, int opsi){
        karyawan.set(opsi, new Karyawan(nama, usia, notelp));
    }
}
