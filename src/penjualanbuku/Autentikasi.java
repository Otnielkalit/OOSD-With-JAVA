/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbuku;

import java.util.Scanner;

/**
 *
 * @author otnie
 */
public class Autentikasi {
    private String username;
    private String password;
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void loginAdmin(){
        System.out.println("Login sebagai admin");
        Scanner scan = new Scanner(System.in);
        Autentikasi autentikasi = new Autentikasi();
        System.out.println("================================");
        System.out.print("Username: ");
        username = scan.nextLine();
        System.out.println("================================");
        System.out.print("Password: ");
        password = scan.nextLine();
        
         if("Admin".equals(username) && "admin123".equals(password)){
            System.out.println("Selamat Datang Admin");
        }else{
            System.out.println("Gagal Login, masukan username & password yang benar");
            autentikasi.loginAdmin();
        }
    }
    
    public void loginPembeli() {
        Scanner scan = new Scanner(System.in);
        Autentikasi autentikasi = new Autentikasi();
        System.out.println("================================");
        System.out.print("Username: ");
        username = scan.nextLine();
        System.out.println("================================");
        System.out.print("Password: ");
        password = scan.nextLine();
        System.out.println("================================");

        if("Pembeli".equals(username) && "pembeli123".equals(password)){
            System.out.println("Selamat Datang Customer kami!");
        }else{
            System.out.println("Gagal Login, masukkan username & password yang benar");
            autentikasi.loginPembeli();
        }
    }  
}
