/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest1;

import java.util.ArrayList;

public class Furniture {
    public static void main(String[] args) {
        // Membuat ArrayList produk
        ArrayList<Posttest1> products = new ArrayList<>();

        // Menginisialisasi objek produk dan menambahkannya ke ArrayList
        Posttest1 product1 = new Posttest1("Laptop", 8000000, "Laptop dengan prosesor cepat.");
        products.add(product1);

        Posttest1 product2 = new Posttest1("Smartphone", 5000000, "Ponsel pintar dengan kamera berkualitas.");
        products.add(product2);

        Posttest1 product3 = new Posttest1("Kamera DSLR", 12000000, "Kamera digital dengan lensa yang dapat diganti.");
        products.add(product3);

        Posttest1 product4 = new Posttest1("TV LED", 6000000, "TV LED dengan layar 42 inci.");
        products.add(product4);

        Posttest1 product5 = new Posttest1("Console Game", 3000000, "Konsol game untuk hiburan di rumah.");
        products.add(product5);

        // Memanggil method displayProducts dari kelas Product untuk menampilkan informasi produk
        Posttest1.displayPosttest1(products);
    }
}
