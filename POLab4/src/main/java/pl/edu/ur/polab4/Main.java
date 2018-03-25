package pl.edu.ur.polab4;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5

        int a, b, c, d;
        float e;
        System.out.println("Wybierz figure do obliczeń wpisując '1'-kwadrat,'2'-prostokąt,'3'-koło,'4'-kula,'5'-sześcian,'6'-prostopadłościan,'7'-stożek");
        Scanner odczyt = new Scanner(System.in);
        d = odczyt.nextInt();
        switch (d) {
            case 1: {
                System.out.println("podaj bok");
                a = odczyt.nextInt();
                obliczanieFigur Kwadrat = new obliczanieFigur(a);
                Kwadrat.kwadrat();
                break;
            }
            case 2: {
                System.out.println("podaj bok");
                a = odczyt.nextInt();
                System.out.println("podaj 2-gi bok");
                b = odczyt.nextInt();
                obliczanieFigur prostokąt = new obliczanieFigur(a, b);
                prostokąt.prostokąt();
                break;

            }
            case 3: {
                System.out.println("podaj promień");
                e = odczyt.nextFloat();
                obliczanieFigur koło = new obliczanieFigur(e);
                koło.koło();
                break;

            }
            case 4: {
                System.out.println("podaj promień");
                e = odczyt.nextFloat();
                obliczanieFigur kula = new obliczanieFigur(e);
                kula.kula();
                break;

            }
            case 5: {
                System.out.println("podaj bok");
                a = odczyt.nextInt();
                obliczanieFigur sześcian = new obliczanieFigur(a);
                sześcian.sześcian();
                break;
            }
            case 6: {
                System.out.println("podaj bok");
                a = odczyt.nextInt();
                System.out.println("podaj 2-gi bok");
                b = odczyt.nextInt();
                System.out.println("podaj 3-ci bok");
                c = odczyt.nextInt();
                obliczanieFigur prostopadłościan = new obliczanieFigur(a, b, c);
                prostopadłościan.prostopadłościan();
                break;

            }

            case 7: {
                System.out.println("podaj promień");
                e = odczyt.nextFloat();
                System.out.println("podaj wysokość");
                b = odczyt.nextInt();
                System.out.println("podaj tworzącą");
                c = odczyt.nextInt();
                obliczanieFigur stożek = new obliczanieFigur(e, b, c);
                stożek.stożek();
                break;

            }
        }
       
        String f, g, h;
        
        int i;
        wprowadzDane[] stud=new wprowadzDane[100];
        for (i=0;i<100;i++){
          stud[i]=new wprowadzDane(" "," ",0,0," ");
        }
        System.out.println("Czy chcesz wprowadzić dane studentów wybierz '1' tak '2' nie");
        b = odczyt.nextInt();
        if (b==1){
            for(i=0;i<1;){
            System.out.println("Wybierz numer studenta na tablicy");
            c = odczyt.nextInt();
            System.out.println("Podaj dane studenta:");
            System.out.println("imie: ");
            f = odczyt.next();
            System.out.println("Nazwisko: ");
            g = odczyt.next();
            System.out.println("indeks: ");
            a = odczyt.nextInt();
            System.out.println("rok: ");
            d = odczyt.nextInt();
            System.out.println("Specjalizacja: ");
            h = odczyt.next();
            stud[c]=new wprowadzDane(f,g,a,d,h);
            stud[c].student();
            System.out.println("Czy chcesz zmienić dane wpisywanego studenta wybierz '1' tak lub '2' nie");
            b = odczyt.nextInt();
            if (b==1){
                System.out.println("Podaj dane studenta:");
            System.out.println("imie: ");
            f = odczyt.next();
            System.out.println("Nazwisko: ");
            g = odczyt.next();
            System.out.println("indeks: ");
            a = odczyt.nextInt();
            System.out.println("rok: ");
            d = odczyt.nextInt();
            System.out.println("Specjalizacja: ");
            h = odczyt.next();
            stud[c]=new wprowadzDane(f,g,a,d,h);
            stud[c].student();
            }
                        System.out.println("Jeśli skończyłeś tworzenie studentów wybierz 1 jeśli nie wpisz inną liczbę");
                        b = odczyt.nextInt();
            if (b==1){
                break;
            }  
            }
        } 
            System.out.println("wybierz indeks  tablicy należący do studenta którego chcesz wyświetlić");
            c = odczyt.nextInt();
            stud[c].student();
            System.out.println("Czy chcesz wyświetlić wszystkich studentów '1'-tak,'2'-nie");
            c = odczyt.nextInt();
            if (c==1)
            System.out.println("Wszyscy studenci:");
              for (i=0;i<100;i++){
                  stud[i].student();
        }
            System.out.println("Wybierz zakres studentów do wyświetlenia");
            System.out.println("od");
            c = odczyt.nextInt();
            System.out.println("do");
            b = odczyt.nextInt();
            
            for (i=c;i<b;i++){
                stud[i].student();
        }
        }
    
}
