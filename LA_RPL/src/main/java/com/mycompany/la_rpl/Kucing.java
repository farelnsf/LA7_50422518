/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.la_rpl;

/**
 *
 * @author LENOVO
 */
class Kucing extends Hewan {
    // Contoh POLYMORPHISM: method suara() di-override
    @Override
    public void suara() {
        System.out.println(getNama() + " berkata: Meong!");
    }
}