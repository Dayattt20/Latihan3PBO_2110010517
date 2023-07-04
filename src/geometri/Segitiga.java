package geometri;

public class Segitiga {
    double alas, tinggi, sisimiring;
   
   public Segitiga (double alas, double tinggi, double sisimiring) {
       this.alas = alas;
       this.sisimiring = sisimiring;
       this.tinggi = tinggi;
    }
   
   double setLuas(){
       return 0.5 * alas * tinggi;
   }
   
   double setKeliling() {
       return alas + tinggi + sisimiring; 
   }
}