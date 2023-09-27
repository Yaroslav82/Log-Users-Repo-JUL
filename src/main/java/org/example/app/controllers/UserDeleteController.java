package org.example.app.controllers;

import lombok.AllArgsConstructor;
import org.example.app.services.UserDeleteService;
import org.example.app.utils.AppStarter;
import org.example.app.views.UserDeleteView;

@AllArgsConstructor
public class UserDeleteController {

    private final UserDeleteService service;
    private final UserDeleteView view;

    public void deleteUser() {
        view.getOutput(service.deleteUser(view.getData()));
        AppStarter.startApp();
    }
}
