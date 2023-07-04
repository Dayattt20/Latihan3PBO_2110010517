package geometri;

public class Main {
   public static void main(String[] args) {
    double radiusLingkaran = 5.0;
    Lingkaran lingkaran = new Lingkaran(radiusLingkaran);
    System.out.println("Luas Lingkaran: " + lingkaran.luas());
    System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
    
   
    Segitiga luas = new Segitiga(2,3,1);
    Segitiga keliling = new Segitiga(2,6,6);        
    System.out.println("Hasil    ="+luas.setLuas());
    System.out.println("Hasil   ="+keliling.setKeliling());
    }
}
