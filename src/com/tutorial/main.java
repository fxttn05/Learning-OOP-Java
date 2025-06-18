package com.tutorial;

// membuat class sebagai template
class Mahasigma {
    String nama;
    String umur;
    String NPM;
}

public class Main {
    public static void main(String[] args) throws Exception {
        
        //membuat object
        Mahasigma mahasigma = new Mahasigma();

        //masukkan data
        mahasigma.nama  = "Fattan Gamteng";
        mahasigma.umur  = "20"
        mahasigma.NPM   = "10123692";

        //print out
        System.out.println(mahasigma.nama);
        System.out.println(mahasigma.umur);
        System.out.println(mahasigma.NPM);

    }
}
