package org.example.app.services;

import org.example.app.controllers.UserCreateController;
import org.example.app.controllers.UserDeleteController;
import org.example.app.controllers.UserReadController;
import org.example.app.controllers.UserUpdateController;
import org.example.app.repositories.UserCreateRepository;
import org.example.app.repositories.UserDeleteRepository;
import org.example.app.repositories.UserReadRepository;
import org.example.app.repositories.UserUpdateRepository;
import org.example.app.views.UserCreateView;
import org.example.app.views.UserDeleteView;
import org.example.app.views.UserReadView;
import org.example.app.views.UserUpdateView;

public class AppService {

    public void createUser() {
        UserCreateRepository repository = new UserCreateRepository();
        UserCreateService service = new UserCreateService(repository);
        UserCreateView view = new UserCreateView();
        UserCreateController controller = new UserCreateController(service, view);
        controller.createUser();
    }

    public void deleteUser() {
        UserDeleteRepository repository = new UserDeleteRepository();
        UserDeleteService service = new UserDeleteService(repository);
        UserDeleteView view = new UserDeleteView();
        UserDeleteController controller = new UserDeleteController(service, view);
        controller.deleteUser();
    }

    public void readUsers() {
        UserReadRepository repository = new UserReadRepository();
        UserReadService service = new UserReadService(repository);
        UserReadView view = new UserReadView();
        UserReadController controller = new UserReadController(service, view);
        controller.readUsers();
    }

    public void updateUser() {
        UserUpdateRepository repository = new UserUpdateRepository();
        UserUpdateService service = new UserUpdateService(repository);
        UserUpdateView view = new UserUpdateView();
        UserUpdateController controller = new UserUpdateController(service, view);
        controller.updateUser();
    }
}

