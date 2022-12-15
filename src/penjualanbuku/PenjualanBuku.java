/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package penjualanbuku;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author otnie
 */

public class PenjualanBuku{

    /**
    * @param args the command line arguments
    */
    static String namaToko, alamat, pemilik, karyawan, email, no_telp, notelp, biaya, nama, usia;
    static String description, detailProduk, packing;

    public static void main(String[] args){

        PenjualanBuku toko = new PenjualanBuku();
        EventBazar even = new EventBazar();
        Toko to = new Toko();
        Autentikasi auten = new Autentikasi();
        Buku buku = new Buku();
        Karyawan karyawan1 = new Karyawan();
        Pemesanan pesan = new Pemesanan();
        KaryawanToko anggota = new KaryawanToko();
        Komentar komen = new Komentar();
        RiwayatPembelian riwayatPembelian = new RiwayatPembelian();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Komentar.shows show = komen.new  shows();

        //tanggal
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String tgl_jam = sdf.format(dt);
        String n = tgl_jam;


        /* PROFIL TOKO BUKU JAYA SUKSES */
        Toko profil = new Toko();
        Toko Toko[] = new Toko[100];
        for (int i = 0; i < Toko.length; i++){
            Toko[i] = new Toko(namaToko, alamat, pemilik, karyawan, email, no_telp);
        }
        Toko[0].setToko("Toko Buku Jaya Sukses", "Porsea", "Otniel Simanungkalit", "1. Gilbert", "jayasukses21@gmail.com", "0812425354");

        /* DESKRIPSI TOKO BUKU JAYA SUKSES */
        Deskripsi deskrip = new Deskripsi();
        Deskripsi Deskripsi[] = new Deskripsi[100];
        for (int i = 0; i < Deskripsi.length; i++) {
            Deskripsi[i] = new Deskripsi(description, detailProduk, packing);
        }
        Deskripsi[0].setDeskripsi("Terimakasih telah berkunjung ke Toko Buku Jaya Sukses", "Anda Dapat memesan buku yang anda inginkan kami pasti memberikan yang terbaik untuk anda.",
                "Kami pastikan Pengiriman barang anda sesuai dengan pesanan dan selamat sampai tujuan");
        Deskripsi[1].setDeskripsi("Terimakasih telah berkunjung ke Toko Buku Jaya Sukses", "Anda Dapat memesan buku yang anda inginkan kami pasti memberikan yang terbaik untuk anda.",
                "Kami pastikan Pengiriman barang anda sesuai dengan pesanan dan selamat sampai tujuan");
        Deskripsi[2].setDeskripsi("Terimakasih telah berkunjung ke Toko Buku Jaya Sukses", "Anda Dapat memesan buku yang anda inginkan kami pasti memberikan yang terbaik untuk anda.",
                "Kami pastikan Pengiriman barang anda sesuai dengan pesanan dan selamat sampai tujuan");


        /* EVENT BAZAR TOKO BUKU JAYA SUKSES */
        EventBazar event = new EventBazar();
        event.addEventBazar("Bazar Akbar", "25/12/2022", "Medan merdeka");
        event.addEventBazar("Inovasi", "30/12/2022", "Balige");

        //Buku
        buku.addBuku("Matematika Diskrit", 100, 2000000, TipeBuku.PELAJARAN, "Erlangga");
        buku.addBuku("Cinderala", 20, 2500000, TipeBuku.NOVEL, "Gramedia");


        /* KOMENTAR */
        Komentar komentar = new Komentar();

        /* PENGEMBALIAN BUKU */
        PengembalianBuku form = new PengembalianBuku();
        String status = null;

        int awal, utama, sub;
        do {
            toko.menuLogin();
            System.out.print("Login sebagai : ");
            awal = scan.nextInt();
            if (awal == 1) {
                auten.loginAdmin();
                do {
                    toko.menuUtamaAdmin();
                    System.out.print("Pilih : ");
                    utama = scan.nextInt();
                    if (utama == 1) {
                        do {
                            for (int i = 0; i < Toko.length; i++) {
                                if (Toko[i].getNamaToko()!= null) {
                                    System.out.println("\n\t ======= Profil Toko Buku Jaya Sukses ========");
                                    Toko[i].display();
                                }
                            }
                            System.out.println("1. Edit ");
                            System.out.println("0. Back");
                            System.out.print("Pilih : ");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                to.editToko();
                                Toko[0].setToko(namaToko, alamat, pemilik, karyawan, email, no_telp);
                            }

                        } while (sub != 0);
                    }
                    if (utama == 2) {
                        do {
                            System.out.println("\n\t ======= Deskripsi Toko Buku Jaya Sukses ========");
                            for (int i = 0; i < Deskripsi.length; i++) {
                                if (Deskripsi[i].getDescription()!= null) {
                                    System.out.println(i + 1 + ".");
                                    Deskripsi[i].display();
                                }
                            }
                            System.out.println("1. Tambah Deskripsi ");
                            System.out.println("2. Edit Deskripsi ");
                            System.out.println("3. Hapus Deskripsi ");
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                int x = 0;
                                int t = 0;
                                for (int i = 0; i < Deskripsi .length; i++) {
                                    if (Deskripsi [i].getDescription()== null) {
                                        t = i;
                                        x = 1;
                                        break;
                                    } else {

                                    }
                                }
                                if (x == 1) {
                                    System.out.println("==================================");
                                    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
                                    System.out.printf("Deskripsi : ");
                                    description = scan.next();
                                    Deskripsi[t].setDescription(description);
                                    System.out.printf("Detail : ");
                                    detailProduk = scan.next();
                                    Deskripsi[t].setDetailProduk(detailProduk);
                                    System.out.printf("Deskripsi ke: ");
                                    packing = scan.next();
                                    Deskripsi[t].setPacking(packing);
                                    System.out.println("==================================");
                                    System.out.println(" Deskripsi Berhasil Ditambahkan ");
                                } else {
                                    System.out.println("Deskripsi gagal ditambahkan");
                                }
                            }

                            if (sub == 2) {
                                System.out.println("===== Edit Deskripsi =====");
                                for (int i = 0; i < Deskripsi.length; i++) {
                                    if (Deskripsi[i].getDescription()!= null) {
                                        System.out.println(i + 1 + ".");
                                        Deskripsi[i].display();
                                    }
                                }
                                System.out.println("Pilih Deskripsi ke : ");
                                int in = scan.nextInt();
                                int ac = in - 1;
                                System.out.printf("Deskripsi  : ");
                                description = scan.next();
                                System.out.print("Detail : ");
                                detailProduk = scan.next();
                                System.out.printf("System Packing : ");
                                packing = scan.next();
                                Deskripsi[ac].setDeskripsi(description, detailProduk, packing);
                            }

                            if (sub == 3) {
                                System.out.printf("Masukkan Deskripsi ke berapa yang ingin anda hapus: ");
                                int in = scan.nextInt();
                                int ac = in - 1;
                                Deskripsi[ac].setDeskripsi(null, null, null);
                                System.out.println("----- Deskripsi Berhasil dihapus-----");
                                for (int i = ac + 1; i < Deskripsi.length; i++) {
                                    Deskripsi[i - 1] = Deskripsi[i];
                                }
                                Deskripsi[Deskripsi.length - 1].setDeskripsi(null, null, null);
                            }
                        } while (sub != 0);
                    }
                    if (utama == 3) {
                        int dl;
                        do {
                            System.out.println("======= Kelola Buku =======");
                            buku.tampilBuku();
                            System.out.println("\n");

                            System.out.println("1. Tambah Buku");
                            System.out.println("2. Edit Buku");
                            System.out.println("3. Hapus Buku");
                            System.out.println("4. Daftar Pesanan");
                            System.out.println("0. Keluar");
                            System.out.println("Pilih : ");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                String nama, tipe, alamat;
                                int jumlah_buku, harga;
                                System.out.printf("Nama Buku: ");
                                nama = scan.next();
                                System.out.printf("Stok Buku : ");
                                jumlah_buku = scan.nextInt();
                                System.out.printf("Harga Buku : ");
                                harga = scan.nextInt();
                                System.out.println("Pilihan : Pelajaran, Tutorial, Novel");
                                System.out.printf("Tipe : ");
                                tipe = scan.next().toUpperCase();
                                System.out.printf("Penerbit : ");
                                alamat = scan.next();
                                buku.addBuku(nama, jumlah_buku, harga, TipeBuku.valueOf(tipe), alamat);

                            }
                            if (sub == 2) {
                                String nama, tipe, alamat;
                                int jumlah_buku, harga;
                                System.out.println("Pilih Buku : ");
                                dl = scan.nextInt();

                                if (dl > 0) {
                                    System.out.printf("Nama : ");
                                    nama = scan.next();
                                    System.out.printf("Jumlah Buku : ");
                                    jumlah_buku = scan.nextInt();
                                    System.out.printf("Harga : ");
                                    harga = scan.nextInt();
                                    System.out.println("Pilihan : Standar, Delux, VIP");
                                    System.out.printf("Tipe : ");
                                    tipe = scan.next();
                                    System.out.printf("Alamat : ");
                                    alamat = scan.next();
                                    buku.updateBuku(nama, jumlah_buku, harga, TipeBuku.valueOf(tipe), alamat, dl - 1);
                                } else {
                                    break;
                                }

                            }
                            if (sub == 3) {
                                System.out.println("Pilih Buku yang ingin dihapus : ");
                                dl = scan.nextInt();
                                if (dl > 0) {
                                    buku.deleteBuku(dl - 1);
                                } else {
                                    break;
                                }
                            }

                            if (sub == 4) {
                                int ops;
                                int jumlah_buku;
                                String nama, alamat;
                                long no_telp;
                                pesan.show();
                                String satu = "Tolak Pesanan";
                                String dua = "Terima Pesanan";
                                //                            pesan.
                                System.out.println("Pilih pesanan : ");
                                ops = scan.nextInt();
                                System.out.println("Action :");
                                System.out.println("1. Terima");
                                System.out.println("2. Tolak");
                                System.out.println("Pilih");

                                dl = scan.nextInt();
                                if (dl == 1) {
                                    pesan.updateBuku(ops - 1, jumlah_buku = pesan.pemesanan.get(ops - 1).jumlah_buku, nama = pesan.pemesanan.get(ops - 1).nama, alamat = pesan.pemesanan.get(ops - 1).alamat, no_telp = pesan.pemesanan.get(ops - 1).no_telp, status = dua);
                                }
                                if (dl == 2) {
                                    pesan.updateBuku(ops - 1, jumlah_buku = pesan.pemesanan.get(ops - 1).jumlah_buku, nama = pesan.nama, alamat = pesan.pemesanan.get(ops - 1).alamat, no_telp = pesan.no_telp, status = satu);
                                }
                            }

                        } while (sub != 0);
                    }
                    if (utama == 4) {
                        int dl;
                        do {
                            System.out.println("======= Event Bazar Buku =======");
                            event.tampilEventBazar();
                            System.out.println("1. Tambah Event Bazar");
                            System.out.println("2. Edit Event Bazar");
                            System.out.println("3. Hapus Event Bazar");
                            System.out.println("0. Keluar");
                            System.out.println("Pilih : ");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                String pemilik, penyelanggara;
                                System.out.printf("Judul : ");
                                description = scan.next();
                                System.out.printf("Tanggal : ");
                                pemilik = scan.next();
                                System.out.println("Penyelenggara : ");
                                penyelanggara = scan.next();
                                event.addEventBazar(description, pemilik, penyelanggara);
                            }
                            if (sub == 2) {
                                String description, pemilik, penyelanggara;
                                System.out.println("Pilih Event ke : ");
                                dl = scan.nextInt();

                                if (dl > 0) {
                                    System.out.printf("Nama Event : ");
                                    description = scan.next();
                                    System.out.printf("Tanggal : ");
                                    pemilik = scan.next();
                                    System.out.println("Tempat : ");
                                    penyelanggara = scan.next();
                                    event.updateEventBazar(dl - 1, description, pemilik, penyelanggara);
                                } else {
                                    break;
                                }
                            }
                            if (sub == 3) {
                                System.out.println("Pilih Event : ");
                                dl = scan.nextInt();
                                if (dl > 0) {
                                    event.deleteEventBazar(dl - 1);
                                } else {
                                    break;
                                }
                            }

                        } while (sub != 0);
                    }
                    if(utama == 5){
                        int dl;

                    do {
                        int stok, harga;
                        String nama;

                        System.out.println("======= Data Karayawan Toko =======");
                        karyawan1.tampilKaryawan();
                        System.out.println("\n");

                        System.out.println("1. Tambah Karyawan");
                        System.out.println("2. Edit Data Karyawan");
                        System.out.println("3. Hapus Data Karyawan");
                        System.out.println("0. Keluar");
                        System.out.println("Pilih : ");
                        sub = scan.nextInt();
                        if (sub == 1) {
                            System.out.printf("Nama : ");
                            nama = scan.next();
                            System.out.printf("Usia : ");
                            usia = scan.next();
                            System.out.printf("No Telepon : ");
                            notelp = scan.next();

                            karyawan1.addKaryawan(nama, usia, notelp);

                        }
                        if (sub == 2) {

                            System.out.println("Pilih Data yang mau di Edit : ");
                            dl = scan.nextInt();

                            if (dl > 0) {
                                System.out.printf("Nama Karyawan : ");
                                nama = scan.next();
                                System.out.printf("Usia : ");
                                usia = scan.next();
                                System.out.printf("Notelp : ");
                                notelp = scan.next();

                                karyawan1.updateKaryawan(nama, usia, notelp, dl - 1);
                            } else {
                                break;
                            }
                        }
                        if (sub == 3) {
                            System.out.println("Pilih Penjualan : ");
                            dl = scan.nextInt();
                            if (dl > 0) {
                                karyawan1.deleteKaryawan(dl - 1);
                            } else {
                                break;
                            }
                        }

                    } while (sub != 0);
                    }

                    if (utama == 6) {
                        int a;

                        System.out.println("\t======= Pengembalian Buku & Penilaian  ======");
                        System.out.println("1. Daftar Request Pengembalian Buku");
                        System.out.println("2. Daftar Komentar");
                        System.out.println("0. Keluar");
                        a = scan.nextInt();
                        if (a == 1) {
                            System.out.println("\t====== Daftar Pengembalian Buku =======");
                            form.tampil();
                        }
                        if (a == 2) {
                            System.out.println("\t====== Daftar Komentar ======");
                            show.tampil();
                        }
                    }
                } while (utama != 0);
            }
            if (awal == 2) {
                auten.loginPembeli();
                do {
                    toko.menuUtamaCustomer();
                    System.out.print("Pilih : ");
                    utama = scan.nextInt();
                    if (utama == 1) {
                        do{
                            for (int i = 0; i < Toko.length; i++) {
                                if (Toko[i].getNamaToko()!= null) {
                                    System.out.printf(i + 1 + ".");
                                    Toko[i].display();
                                }
                            }
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                        }while(sub !=0);
                    }
                    if (utama == 2) {
                        do{
                            System.out.println("\n\t ======= Deskripsi Toko Buku Jaya Sukses ========");
                            for (int i = 0; i < Deskripsi.length; i++) {
                                if (Deskripsi[i].getDescription()!= null) {
                                    System.out.println(i + 1 + ".");
                                    Deskripsi[i].display();
                                }
                            }
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                        }while(sub !=0);
                    }
                    if (utama == 3) {
                        do{
                            event.tampilEventBazar();
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                        }while(sub !=0);
                    }
                    if (utama == 4) {
                        try {
                            do {
                                System.out.println("\t======== Daftar Buku =======");
                                buku.tampilBuku();
                                System.out.println("\n\t======== Daftar Penjualan Buku =======");
                                pesan.show();
                                System.out.println("\n");
                                int dl;
                                int jumlah_buku, jumlah, total, alamat1;
                                String nama1, lokasi1 = null;
                                long no_telp;
                                System.out.println("Buku Nomor ke : ");
                                dl = scan.nextInt();
                                int pos = dl - 1;
                                for (int i = 0; i < buku.buku.size(); i++) {
                                    if (pos == i) {
                                        System.out.println(buku.buku.get(i).nama);
                                        lokasi1 = buku.buku.get(i).nama;
                                    }
                                }
                                System.out.print("Nama : ");
                                nama1 = scan.next();
                                System.out.print("No Telepon :");
                                no_telp = scan.nextLong();
                                System.out.print("Alamat : ");
                                alamat = scan.next();
                                System.out.print("Jumlah BUku : ");
                                jumlah_buku = scan.nextInt();
                                for (int i = 0; i < buku.buku.size(); i++) {
                                    if (pos == i) {
                                        System.out.println(buku.buku.get(i).nama);
                                        System.out.println("Otniel");
                                        jumlah = buku.buku.get(i).jumlah_buku;
                                        System.out.println(jumlah);
                                        buku.updateBuku(buku.buku.get(dl - 1).nama, buku.buku.get(dl - 1).jumlah_buku = jumlah, utama = buku.buku.get(dl - 1).harga, buku.buku.get(dl - 1).tipeBuku.PELAJARAN, buku.buku.get(dl - 1).alamat, dl - 1);

                                    }
                                }
                                System.out.print("Total Harga : Rp.");
                                for (int i = 0; i < buku.buku.size(); i++) {
                                    if (pos == i) {
                                        total = jumlah_buku * buku.buku.get(i).harga;
                                        System.out.println(total);
                                    }
                                }
                                int asd;
                                System.out.println("Apakah anda yakin memesan ?");
                                System.out.println("1. Ya\n2. Tidak");
                                asd = scan.nextInt();
                                if (asd == 1) {
                                    pesan.pesanBuku(jumlah_buku, nama1, no_telp, lokasi1, status = "Proses");
                                } else if (asd == 2) {
                                    break;
                                }
                                for (int i = 0; i < buku.buku.size(); i++) {
                                    if (pos == i) {
                                        if (buku.buku.get(i).jumlah_buku < 0) {
                                            System.out.println("Stok Buku Tidak Mencukupi");
                                            pesan.hapusPemesanan(i);
                                        }
                                    }
                                }
                                System.out.println("0. Keluar");
                                sub = scan.nextInt();
                            } while (sub != 0);
                        }catch (Exception e){

                        }
                    }
                    if (utama == 5) {
                        String hal, namaAnda, namaBuku;
                        System.out.println("\t======= Pengembalian Buku =======");
                        System.out.print("Alasan : ");
                        hal = scan.next();
                        System.out.print("Nama Anda : ");
                        namaAnda = scan.next();
                        System.out.print("Nama Buku : ");
                        namaBuku = scan.next();
                        form.addPermohonan(hal, namaBuku, namaBuku);
                    }
                    if (utama == 6) {
                        System.out.println("======= Data Karyawan Toko =======");
                        karyawan1.tampilKaryawan();
                        System.out.println("\n");
                    }
                    if (utama == 7) {
                        System.out.println("History Pembelian");
//                        riwayatPembelian.show();
                        if(status == "Proses") {
                            pesan.show();
                        } else if(status == "Terima Pesanan") {
                            pesan.showWithDate();
                        }
                    }
                    if (utama == 8) {
                        String koment = null;
                        String nama;
                        System.out.println("\t========== Berikan Penilaian Anda  ==========");
                        System.out.println("Nama Anda : ");
                        nama = scan.next();
                        System.out.print("Masukkan Penilaian Anda : ");
                        koment = scan.next();
                        komen.addKomentar(nama,koment);
                    }
                } while (utama != 0);
            }
        } while (awal != 0);
    }
    public void menuLogin(){
        System.out.println("|| ========  Selamat datang di Toko Buku Jaya Suskse Silahkan Login ======== ||");
        System.out.println("1. Login Sebagai Admin ");
        System.out.println("2. Login Sebagai Pembeli");
        System.out.println("0. Keluar");
    }
    public void menuUtamaAdmin() {
        System.out.println("========= Selamat Datang Admin Baen hamu na denggan tu Customer ==========");
        System.out.println("\t   ====== ADMIN TOKO BUKU JAYA SUKSES =======");
        System.out.println("\t   || ================================== ||");
        System.out.println("1. Profil Toko Buku Jaya Sukses");
        System.out.println("2. Deskripsi Toko");
        System.out.println("3. Buku yang dijual");
        System.out.println("4. Event Bazar Buku");
        System.out.println("5. Daftar Karyawan Toko Buku Jaya Sukses");
        System.out.println("6. Pengembalian Buku dan Daftar Komentar");
        System.out.println("0. Back");
    }

    public void menuUtamaCustomer() {
        System.out.println("========= Selamat Datang Customer kami Buku adalah jendela Dunia ==========");
        System.out.println("\t   || ================================== ||");
        System.out.println("1. Profil Toko Buku Jaya Suskes");
        System.out.println("2. Deskripsi Toko");
        System.out.println("3. Informasi Bazar Buku");
        System.out.println("4. Pemesanan Buku");
        System.out.println("5. Pengembalian Buku");
        System.out.println("6. Data Karyawan");
        System.out.println("7. Riwayat Pembelian");
        System.out.println("8. Komentar");
        System.out.println("0. Back");
    }
}