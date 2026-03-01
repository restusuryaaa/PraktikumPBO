/*Nama File : MGaris.java
Deskripsi : File main garis
Pembuat : Restu Surya
tanggal : 1 Maret 2026
 */

public class MGaris {
    public static void main(String[] args){
        //Membuat objek garis
        Garis G1 = new Garis();
        System.out.println("Garis G1 adalah :");
        G1.printGaris();

        Titik t1 = new Titik();
        Titik t2 = new Titik(-4,3);

        System.out.println("Garis G2 adalah :");
        Garis G2 = new Garis(t1, t2);
        G2.printGaris();

        System.out.println("Jumlah garis yang telah dibuat : " + Garis.getCounterGaris());

        System.out.println("Memindahkan titik awal G1 ke (4,5)");
        G1.setT1(new Titik(4,5));
        System.out.println("Garis G1 setelah dipindahkan :");
        G1.printGaris();

        System.out.println("Panjang garis G1 : " + G1.getPanjangGaris());

        System.out.println("Gradien garis G1 : " + G1.getGradien());
        System.out.println("Gradien garis G2 : " + G2.getGradien());
    }
}
