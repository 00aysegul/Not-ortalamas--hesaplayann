import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int  matematik,fizik,kimya,turkce,tarih,muzik ;
        Scanner inp= new Scanner(System.in);
        System.out.println("Matematik notunuz: ");
        matematik =inp.nextInt();
        System.out.println("Fizik notunuz: ");
        fizik= inp.nextInt();
        System.out.println("Kimya notunuz:");
        kimya=inp.nextInt();
        System.out.println("Türkçe notunuz:");
        turkce=inp.nextInt();
        System.out.println("Tarih notunuz: ");
        tarih=inp.nextInt();
        System.out.println("Müzik notunuz:");
        muzik= inp.nextInt();
        int toplam= (matematik+fizik+kimya+turkce+tarih+muzik);
        double ortalama= toplam/6.0;

        System.out.println("Ortalamanız: " +ortalama  );
        String sonuc= (ortalama >= 60 ? "Sınıfı geçti": "Sınıfta kaldı");
        System.out.println(sonuc);
        


























    }
}