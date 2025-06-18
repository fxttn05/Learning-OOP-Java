package com.tutorial;

// membuat class sebagai template
class Mahasigma {
    String nama;
    String umur;
    String NPM;

    //ini adalah contoh constructor
    //constructor dipanggil saat object pertama kali dibuat
    // Mahasigma(){
    //     System.out.println("Ini adalah Constructor");
    // }

    //constructor dengan parameter
    Mahasigma(String inputNama){
        nama = inputNama;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        
        // new Mahasigma(); 
        // //membuat object
        Mahasigma mahasigma = new Mahasigma("Fattan");
        System.out.println(mahasigma.nama);
        // Mahasigma mahasigma2 = new Mahasigma();

        // //masukkan data
        // mahasigma.nama  = "Fattan Gamteng";
        // mahasigma.umur  = "20";
        // mahasigma.NPM   = "10123692";

        // mahasigma2.nama  = "Andi tidak gamteng";
        // mahasigma2.umur  = "22";
        // mahasigma2.NPM   = "10123999";

        // //print out
        // System.out.println(mahasigma.nama);
        // System.out.println(mahasigma.umur);
        // System.out.println(mahasigma.NPM);

        // System.out.println(mahasigma2.nama);
        // System.out.println(mahasigma2.umur);
        // System.out.println(mahasigma2.NPM);

    }
}
