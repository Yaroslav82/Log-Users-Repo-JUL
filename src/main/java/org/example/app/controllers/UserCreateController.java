package org.example.app.controllers;

import lombok.AllArgsConstructor;
import org.example.app.services.UserCreateService;
import org.example.app.utils.AppStarter;
import org.example.app.views.UserCreateView;

@AllArgsConstructor
public class UserCreateController {

    private final UserCreateService service;
    private final UserCreateView view;

    public void createUser() {
        view.getOutput(service.createUser(view.getData()));
        AppStarter.startApp();
    }
}
