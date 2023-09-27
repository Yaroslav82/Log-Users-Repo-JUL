package org.example.app.views;

import java.util.Scanner;

public class UserUpdateView extends BaseView {

    @Override
    public String[] getData() {
        Scanner scanner = new Scanner(System.in);

        String title = "Enter user's ID: ";
        System.out.print(title);
        String id = scanner.nextLine().trim();

        title = "Enter new phone in format xxx xxx-xxxx: ";
        System.out.print(title);
        String phone = scanner.nextLine().trim();
        return new String[]{id, phone};
    }
}
