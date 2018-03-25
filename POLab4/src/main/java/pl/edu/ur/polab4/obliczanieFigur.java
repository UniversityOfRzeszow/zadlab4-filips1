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
public class obliczanieFigur {

    public String nazwa;
    public int bok_1;
    public int bok_2;
    public int bok_3;
    public float promień;
    public int tworząca;

    public obliczanieFigur(float promień, int bok_3, int tworząca) {
        this.promień = promień;
        this.bok_3=bok_3;
        this.tworząca = tworząca;
    }

    public obliczanieFigur(int bok_1, int bok_2, int bok_3) {
        this.bok_1 = bok_1;
        this.bok_2 = bok_2;
        this.bok_3 = bok_3;

    }

    public obliczanieFigur(int bok_1, int bok_2) {
        this.bok_1 = bok_1;
        this.bok_2 = bok_2;

    }

    public obliczanieFigur(float promień) {
        this.promień = promień;

    }

     public obliczanieFigur(int bok_1) {
        this.bok_1 = bok_1;

    }

    public void kwadrat() {
        System.out.println("kwadrat");
        System.out.println("bok_1: " + this.bok_1);
        System.out.println("pole: " + this.bok_1 * this.bok_1);
        System.out.println("obwód: " + this.bok_1 * 4);
    }

    public void prostokąt() {
        System.out.println("prostokąt");
        System.out.println("bok_1: " + this.bok_1);
        System.out.println("bok_2: " + this.bok_2);
        System.out.println("pole: " + this.bok_2 * this.bok_1);
        System.out.println("obwód: " + (this.bok_2 * 2 + this.bok_1 * 2));

    }

    public void koło() {
        System.out.println("koło ");
        System.out.println("promień: " + this.promień);
        System.out.println("pole: " + this.promień * this.promień * Math.PI);
        System.out.println("obwód: " + 2 * this.promień * Math.PI);

    }

    public void sześcian() {
        System.out.println("sześcian");
        System.out.println("bok_1: " + this.bok_1);
        System.out.println("objętość: " + Math.pow(this.bok_1, 3));
        System.out.println("pole: " + 6 * Math.pow(this.bok_1, 2));
    }

    public void prostopadłościan() {
        System.out.println("prostopadłościan ");
        System.out.println("bok_1: " + this.bok_1);
        System.out.println("bok_2: " + this.bok_2);
        System.out.println("bok_3: " + this.bok_3);
        System.out.println("objętość: " + this.bok_1 * this.bok_2 * this.bok_3);
        System.out.println("pole: " + (this.bok_1 * this.bok_2 * 2 + this.bok_1 * this.bok_3 * 2 + this.bok_2 * this.bok_3 * 2));
    }

    public void stożek() {
        System.out.println("stożek");
        System.out.println("promień: " + this.promień);
        System.out.println("wysokość: " + this.bok_3);
        System.out.println("tworząca: " + this.tworząca);
        System.out.println("objętość: " + this.promień * this.promień / 3 * Math.PI * this.bok_3);
        System.out.println("pole: " + this.promień * Math.PI * (this.promień * this.tworząca));

    }

    public void kula() {
        System.out.println("kula ");
        System.out.println("promień: " + this.promień);
        System.out.println("objętość: " + Math.pow(this.promień, 3)*Math.PI * 4 / 3);
        System.out.println("pole: " + 4 * this.promień * Math.PI * this.promień);

    }
}
