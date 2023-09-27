package org.example.app.views;

import java.util.Scanner;

public class UserDeleteView extends BaseView {

    @Override
    public String[] getData() {
        Scanner scanner = new Scanner(System.in);
        String title = "Enter user's ID: ";
        System.out.print(title);
        String id = scanner.nextLine().trim();
        return new String[]{id};
    }
}
