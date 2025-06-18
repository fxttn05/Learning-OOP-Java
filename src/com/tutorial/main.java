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
    Mahasigma(String inputNama, String inputUmur, String inputNPM){
        nama = inputNama;
        umur = inputUmur;
        NPM = inputNPM;

        System.out.println(nama);
        System.out.println(umur);
        System.out.println(NPM);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        
        // contoh dengan constructor
        new Mahasigma("Fattan", "20", "10123692");

        // //membuat object
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
