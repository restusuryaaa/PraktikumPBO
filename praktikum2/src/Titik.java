/*Nama File : Titik.java
* Deskripsi : Berisi atribut dan method dalam class Titik
* Pembuat : Restu Surya
* Tanggal : 25 Februari 2026
 */

public class Titik {
    /*******ATRIBUT********/
    double absis;
    double ordinat;

    /********METHOD*********/
    //Konstruktor untuk membuat titik
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    Titik(double x, double y){
        absis = x;
        ordinat = y;
    }

    //Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //menggeser absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //menggeser ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //Menggeser ordinat titik sebesar x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //Menentukan kuadran titik
    int getKuadran(){
        if(this.absis > 0 && this.ordinat>0) return 1;
        if(this.absis < 0 && this.ordinat>0) return 2;
        if(this.absis < 0 && this.ordinat < 0) return 3;
        if(this.absis > 0 && this.ordinat < 0) return 4;
        return 0;
    }

    //Mengembalikan jarak titik saat ini ke titik pusat
    double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    //Mengembalikan jarak titik saat ini dengan titik yang kita masukan
    double getJarak(Titik t){
        return Math.sqrt(
            Math.pow(this.absis - t.getAbsis(), 2) + 
            Math.pow(this.ordinat - t.getOrdinat(), 2));
    }

    //ubah ordinat menjadi nilai berlawanan (kali -1)
    void refleksiX(){
        ordinat = -ordinat;
    }
    
    //ubah absis menjadi nilai berlawanan (kali -1)
    void refleksiY (){
        absis = -absis; // sama dengan absis *= -1;
    }
    
    //Mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //Mengembalikan nilai refleksiX
    Titik getrefleksiX(){
        refleksiX();
        return this;
    }

    //mengembalikan nilai refleksiY
    Titik getrefleksiY(){
        refleksiY();
        return this;
    }
}
