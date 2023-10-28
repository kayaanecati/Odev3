import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
            // Soru 1
/*
* Derleme Zamanı Hataları (Compile-Time Errors)
* Çalışma Zamanı Hataları (Runtime Errors)
* Mantıksal Hatalar
* En az hata ile kod yazmak için
*İyi Planlama
* Test Odaklı Geliştirme
* Kod İncelemeleri
* İyi Programlama İlkelerine Uygunluk
* Hata İzleme ve Kayıt

 */


        // Soru 3
        Scanner scan = new Scanner(System.in);
        boolean kontrol = true;
        int rastgeleSayi = (int) ((Math.random() * 100) + 1);
        System.out.println(rastgeleSayi);
        while (kontrol) {
            try {
                int kullaniciSayi = Integer.parseInt(JOptionPane.showInputDialog("1 ila 100 arasında bir sayı giriniz"));
                if (rastgeleSayi == kullaniciSayi) {
                    JOptionPane.showMessageDialog(null, "Tebrikler bildiniz", null, JOptionPane.OK_OPTION);
                    kontrol = false;
                }
                else if (kullaniciSayi < 1 || kullaniciSayi > 100) {
                    JOptionPane.showMessageDialog(null, "1 ila 100 arasında sayı girmediniz.Lütfen tekrar deneyiniz!", null, JOptionPane.OK_OPTION);
                }else{
                    if (kullaniciSayi < rastgeleSayi){
                        JOptionPane.showMessageDialog(null, "Lütfen daha büyük bir sayı giriniz!", null, JOptionPane.OK_OPTION);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Lütfen daha küçük bir sayı giriniz!", null, JOptionPane.OK_OPTION);

                }

            } catch (NumberFormatException n) {

                JOptionPane.showMessageDialog(null, "Sayı girmediniz.Lütfen sayı giriniz!", null, JOptionPane.OK_OPTION);
            }
        }


//Soru 4
        for(int i =113; i<999; i++){
            boolean check = true;
            int c=i%10;
            int b=(i/10)%10;
            int a=i/100;
            int cba=c * 100 + b * 10 + a;
            int ab=a * 10 + b;
            int bc=b * 10 + c;
            int cb=c * 10 + b;
            int ba=b * 10 + a;
            for(int j =2; j<i; j++) {
                if (cba<i+1) {
                    check = false;
                    break;
                }
                if (i % j == 0) {
                    check = false;
                    break;
                }
                if (cba % j == 0) {
                    check = false;
                    break;
                }
                if(ab>j)
                    if (ab % j == 0) {
                        check = false;
                        break;
                    }
                if(bc>j)
                    if (bc % j == 0) {
                        check = false;
                        break;
                    }
                if(cb>j)
                    if (cb % j == 0) {
                        check = false;
                        break;
                    }
                if(ba>j)
                    if (ba % j == 0) {
                        check = false;
                        break;
                    }
            }
            if (check)
                System.out.println(i);
        }








// Soru 5

        System.out.println("Tüm değerleri asal mı? .. "+ isPrimeX(11));

    }
    public static boolean isPrimeX(int x){

        if (asalMi(x)){
            int toplam = 0;
            while (x > 0) {
                toplam += x % 10;
                x /= 10;
            }
            if(asalMi(toplam)){

                while (toplam>=10){
                    toplam += toplam%10;
                    toplam/=10;

                }
                return (asalMi(toplam));
            }
        }



        return false;
    }
    public static boolean asalMi(int sayi){
        if (sayi <= 1) {
            return false;
        }
        else if (sayi <= 3) {
            return true;
        }
        boolean check = false;
        for (int i = 2; i < sayi; i++) {
            if(sayi % i !=0){
                check = true;

        }
        }
        return check;
    }




}
