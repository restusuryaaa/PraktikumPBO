/*Nama FIle : Titik.java
* Deskripsi : Berisi atribut dan method dalam class Titik
* Pembuat : Restu Surya
* tanggal : 20 Februari 2026
 */

public class Mtitik {
    public static void main(String[] args){
        // Membuat objek titik
        Titik t1 = new Titik();
        t1.printTitik();
        
        // Mengubah absis dan ordinat
        t1.setAbsis(3.0);
        t1.setOrdinat(4.0);
        t1.printTitik();
        
        // Menggeser titik
        t1.geser(1.0, 2.0);
        t1.printTitik();
        
        // Menggunakan getter
        System.out.println("Absis: " + t1.getAbsis());
        System.out.println("Ordinat: " + t1.getOrdinat());
    }
}
