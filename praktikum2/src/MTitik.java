/*Nama File : Titik.java
Deskripsi
Pembuat 
tanggal
 */
public class MTitik {
    public static void main(String[] args){
        //Membuat objek titik
        Titik t1 = new Titik(1,1);
        t1.printTitik();

        System.out.println("Geser sejauh (2, 3)");
        t1.geser(2, 3);
        t1.printTitik();

        System.out.println("Titik t1 di kuadran :" + t1.getKuadran());
        System.out.println("Jarak titik t1 dengan pusat : " + t1.getJarakPusat());

        t1.refleksiX();
        System.out.println("Setelah refleksiX: ");
        t1.printTitik();
        
        t1.refleksiY();
        System.out.print("Setelah refleksiY: ");
        t1.printTitik();
        
        t1 = new Titik(2, -3);
        System.out.print("t1 awal: "); 
        t1.printTitik();
       
        Titik hasil = t1.getrefleksiX();
        System.out.print("setelah getrefleksiX(): "); 
        hasil.printTitik();
     
        hasil.getrefleksiY();
        System.out.print("setelah getrefleksiY() pada hasil: "); 
        hasil.printTitik();
    }
}
