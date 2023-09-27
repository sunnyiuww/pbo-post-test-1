/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

import java.util.ArrayList;

public class Posttest1 {
    public String name;
    public double price;
    public String description;

    public Posttest1(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void displayProductInfo() {
        System.out.println("Nama Produk: " + name);
        System.out.println("Harga: Rp." + price);
        System.out.println("Deskripsi: " + description);
        System.out.println();
    }

    public static void displayPosttest1(ArrayList<Posttest1> products) {
        // Menampilkan informasi produk menggunakan perulangan
        for (Posttest1 product : products) {
            product.displayProductInfo();
        }
    }
}
