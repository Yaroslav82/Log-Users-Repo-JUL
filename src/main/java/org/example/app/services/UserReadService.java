package org.example.app.services;

import lombok.AllArgsConstructor;
import org.example.app.database.DBCheck;
import org.example.app.entities.User;
import org.example.app.exceptions.DBException;
import org.example.app.repositories.UserReadRepository;
import org.example.app.utils.Constants;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

@AllArgsConstructor
public class UserReadService {

    private final UserReadRepository repository;
    private static final Logger LOGGER =
            Logger.getLogger(UserReadService.class.getName());

    public String readUsers() {
        if (DBCheck.isDBExists()) {
            try {
                throw new DBException(Constants.DB_ABSENT_MSG);
            } catch (DBException e) {
                LOGGER.log(Level.SEVERE, Constants.LOG_DB_ABSENT_MSG);
                return e.getMessage();
            }
        }

        List<User> list = repository.readUsers();

        if (list != null) {

            if (!list.isEmpty()) {
                AtomicInteger count = new AtomicInteger(0);
                StringBuilder stringBuilder = new StringBuilder();
                list.forEach((user) ->
                        stringBuilder.append(count.incrementAndGet())
                                .append(") id: ")
                                .append(user.getId())
                                .append(", ")
                                .append(user.getName())
                                .append(", ")
                                .append(user.getPhone())
                                .append(", ")
                                .append(user.getEmail())
                                .append("\n")
                );
                return "\n___________ USERS ___________\n" + stringBuilder;
            }
        }
        LOGGER.log(Level.WARNING, Constants.LOG_DATA_ABSENT_MSG);
        return Constants.DATA_ABSENT_MSG;
    }
}
