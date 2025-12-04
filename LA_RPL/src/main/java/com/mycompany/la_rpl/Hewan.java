/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.la_rpl;

/**
 *
 * @author LENOVO
 */
class Hewan {
    // Contoh ENCAPSULATION: atribut disembunyikan (private)
    private String nama;

    // Method setter dan getter untuk akses data
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Method umum
    public void suara() {
        System.out.println("Hewan bersuara...");
    }
}
