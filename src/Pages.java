//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Pages {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your age, please:");
        int age = scanner.nextInt();
        int dateAge = (100 - age);
        System.out.println("" + age + " you should at least read: " + dateAge + " pages");
        scanner.close();
    }
}
