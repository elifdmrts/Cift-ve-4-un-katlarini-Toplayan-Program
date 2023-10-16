import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        int toplam = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Sayıyı Giriniz: ");
            n = scanner.nextInt();
            if (n % 2 == 0 && n % 4 == 0){
                toplam += n;
            }
        }while (n %2==0);
            System.out.println("Çift ve 4'ün Katı Olan Sayıların Toplamı: "+toplam);
            scanner.close();






    }
}