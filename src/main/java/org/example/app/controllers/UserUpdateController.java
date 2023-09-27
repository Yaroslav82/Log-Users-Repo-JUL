package org.example.app.controllers;

import lombok.AllArgsConstructor;
import org.example.app.services.UserUpdateService;
import org.example.app.utils.AppStarter;
import org.example.app.views.UserUpdateView;

@AllArgsConstructor
public class UserUpdateController {

    private final UserUpdateService service;
    private final UserUpdateView view;

    public void updateUser() {
        view.getOutput(service.updateUser(view.getData()));
        AppStarter.startApp();
    }
}
