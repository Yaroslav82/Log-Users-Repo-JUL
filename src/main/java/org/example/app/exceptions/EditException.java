package org.example.app.exceptions;

import java.util.Map;


public class EditException extends RuntimeException {

    Map<String, String> errors;

    public EditException(String msg, Map<String, String> errors) {
        super(msg);
        this.errors = errors;
    }

    public String getErrors() {
        StringBuilder stringBuilder = new StringBuilder();
        errors.forEach((key, value) ->
                stringBuilder.append("\n>> ")
                        .append(key)
                        .append(": ")
                        .append(value)

        );
        return stringBuilder.toString();
    }

}
