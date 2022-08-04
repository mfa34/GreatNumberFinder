import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz :");
        n = input.nextInt();
        int i =1 ;
        int toplam =0;
        if (n<=0){
            System.out.print("Lutfen pozitif tam sayi giriniz .");
        }
        else {
            while (i<n){
                if (n % i ==0){
                    toplam+=i;
                }
                i ++ ;
            }
            if (toplam==n){
                System.out.println(n + "sayisi mukemmel bir sayidir.");
            }
            else {
                System.out.println(n + "sayisi mukemmel bir sayi degildir .");
            }
        }
    }
}
