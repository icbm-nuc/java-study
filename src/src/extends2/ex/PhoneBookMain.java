package extends2.ex;

import java.util.Scanner;

public class PhoneBookMain {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int count = scanner.nextInt();

        PhoneBook phoneBook = new PhoneBook(count);
        phoneBook.run();
    }

}
