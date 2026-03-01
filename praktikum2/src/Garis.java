/*Nama File : Garis.java
* Deskripsi : Berisi atribut dan method dalam class Garis
* Pembuat : Restu Surya
* Tanggal : 1 Maret 2026
 */

public class Garis {
    /************ATRIBUT***********/
    Titik T1;
    Titik T2;
    static int counterGaris;

    /************METHOD***********/
    //Konstruktor membuat garis
    Garis(){
        T1 = new Titik();
        T2 = new Titik(1,1);
        counterGaris++;
    }

    //Konstruktor dg variable
    Garis(Titik t1, Titik t2){
        T1 = t1;
        T2 = t2;
        counterGaris++;
    }

    //Mengembalikan titik awal garis
    Titik getT1(){
        return T1;
    }

    //Mengembalikan titik akhir garis
    Titik getT2(){
        return T2;
    }

    //Memindahkan titik awal 
    void setT1(Titik t1){
        T1 = t1;
    }

    //Memindahkan titik akhir
    void setT2(Titik t2){
        T2 = t2;
    }

    //mendapatkan atribut static counterGaris
    static int getCounterGaris(){
        return counterGaris;
    }

    //Menghitung panjang garis
    double getPanjangGaris(){
        double x1 = T1.getAbsis();
        double y1 = T1.getOrdinat();
        double x2 = T2.getAbsis();
        double y2 = T2.getOrdinat();

        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }

    //Menghitung gradien garis
    double getGradien(){
        double x1 = T1.getAbsis();
        double y1 = T1.getOrdinat();
        double x2 = T2.getAbsis();
        double y2 = T2.getOrdinat();

        return (y2-y1) / (x2-x1);
    }

    //Menghitung titik tengah garis
    Titik getTitikTengah(){
        double x1 = T1.getAbsis();
        double y1 = T1.getOrdinat();
        double x2 = T2.getAbsis();
        double y2 = T2.getOrdinat();

        double xTengah = (x1 + x2) / 2;
        double yTengah = (y1 + y2) / 2;

        return new Titik(xTengah, yTengah);
    }

    //Mengecek apakah sejajar dengan garis lain
    boolean isSejajar(Garis g){
        return this.getGradien() == g.getGradien();
    }

    //Mengecek apakah tegak lurus dengan garis lain
    boolean isTegakLurus(Garis g){
        return this.getGradien() * g.getGradien() == -1;
    }

    //Menampilkan titik awal dan akhir garis
    void printGaris(){
        System.out.print("Titik Awal  : (" + T1.getAbsis() + ", " + T1.getOrdinat() + ") ");
        System.out.println("Titik Akhir : (" + T2.getAbsis() + ", " + T2.getOrdinat() + ")");
    }
}
