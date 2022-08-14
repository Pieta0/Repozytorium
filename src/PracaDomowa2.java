
/*
Zapytaj uzytkownika o wiek.
W przypadku gdy ma mniej niz 18 lat wypisz na ekranie informacje ze nie moze kupic alkoholu.
Gdy ma wiecej niz 18 lat to podziekuj za zakupy.

 */


import java.util.Scanner;

public class PracaDomowa2 {


    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek: " );
        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println("Dziękujemy za zakupy");
        }
            else {
                System.out.println("Nie masz 18 lat nie mozesz kupic alkoholu gowniazu.");
            }




    }
}
