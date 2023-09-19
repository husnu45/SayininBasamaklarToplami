import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner getData = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz : ");

        int number = getData.nextInt();

        int sum = 0;

        int tempNumber = number;

        while (tempNumber != 0){

            int digit = tempNumber % 10 ; // Girilen Sayının Son Basamağını Alır

            sum += digit;                // Toplamımızı Günceller

            tempNumber /= 10 ;         // Sayının Son Basamağını Atma

        }

        System.out.println("Sayının Basamaklar Toplamı : " + sum);

    }

}
