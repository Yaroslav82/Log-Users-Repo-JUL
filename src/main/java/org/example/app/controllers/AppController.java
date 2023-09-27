package org.example.app.controllers;

import lombok.AllArgsConstructor;
import org.example.app.services.AppService;
import org.example.app.utils.Constants;
import org.example.app.utils.OptionChecker;
import org.example.app.views.AppView;

@AllArgsConstructor
public class AppController {

    private final AppService service;
    private final AppView view;

    public void runApp() {
        filterChoice(view.chooseOption());
    }

    private void filterChoice(int choice) {
        switch (choice) {
            case 1 -> service.createUser();
            case 2 -> service.readUsers();
            case 3 -> service.updateUser();
            case 4 -> service.deleteUser();
            case 0 -> view.getOutput(choice, Constants.APP_CLOSE_MSG);
            default -> OptionChecker.getNoSuchOption(choice);
        }
    }
}
