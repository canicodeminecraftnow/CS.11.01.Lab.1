import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your age, please:");
        int age = scanner.nextInt();
        int dateAge = (age / 2) + 7;
        System.out.println(age+ " year olds should date somebody who is at least "+ dateAge + " years old");
        scanner.close();
    }
}