/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.la_rpl;

/**
 *
 * @author LENOVO
 */
public class LA_RPL {

    public static void main(String[] args) {
        // Membuat objek dari class Kucing
        Kucing kucing = new Kucing();
        kucing.setNama("Miko");
        kucing.suara();

        // Membuat objek dari class Anjing
        Anjing anjing = new Anjing();
        anjing.setNama("Buddy");
        anjing.suara();

        // Menampilkan pesan selesai
        System.out.println("Program selesai dijalankan.");
    }
}
