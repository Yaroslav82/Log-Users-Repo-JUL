package org.example.app.controllers;

import lombok.AllArgsConstructor;
import org.example.app.services.UserReadService;
import org.example.app.utils.AppStarter;
import org.example.app.views.UserReadView;

@AllArgsConstructor
public class UserReadController {

    private final UserReadService service;
    private final UserReadView view;

    public void readUsers() {
        view.getOutput(service.readUsers());
        AppStarter.startApp();
    }
}
