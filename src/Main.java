import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz : ");
        int age = input.nextInt();
        int result = age % 12;
        System.out.println(result);
    }
}