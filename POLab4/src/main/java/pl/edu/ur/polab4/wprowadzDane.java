/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author ACER
 */
public class wprowadzDane {
        public String imie;
        public String nazwisko;
        public int indeks;
        public int rok;
        public String specjalizacja;

    public wprowadzDane(String imie, String nazwisko, int indeks, int rok, String specjalizacja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
        this.rok = rok;
        this.specjalizacja = specjalizacja;
    }

    public wprowadzDane(String imie, String nazwisko, int indeks, int rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
        this.rok = rok;
    }

    public wprowadzDane(String imie, String nazwisko, int indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public wprowadzDane(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

 
    public void student() {
        System.out.println("imie: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("indeks: " + this.indeks);
        System.out.println("rok: " + this.rok);
        System.out.println("specjalizacja: " + this.specjalizacja);
    }
        
}
