import java.util.Scanner;

public class PracaDomowa {

//napisz program ktory poprosi uzytkownika o 2 liczby, a następnie wykona na nich podstawowe operacje matematyczne

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();
        int res1 = firstNumber + secondNumber;
        System.out.println("wynik dodawania tych liczb: " +res1);
        int res2 = firstNumber - secondNumber;
        System.out.println("Wynik odejmowania tych liczb: "+ res2);
        double res3 = firstNumber / secondNumber;
        System.out.println("Wynik dzielenia tych liczb: "+ res3);
        double res4 = firstNumber * secondNumber;
        System.out.println("wynik mnożenia tych liczb: " + res4 );
        int res5 = firstNumber%secondNumber;
        System.out.println("wynik modulo: " + res5);




    }
}
