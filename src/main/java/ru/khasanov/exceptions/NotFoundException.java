package ru.khasanov.exceptions;

import ru.khasanov.http.StatusCode;

/**
 * Created by bulat on 07.01.17.
 */
public class NotFoundException extends FlashException {
    public NotFoundException() {
        super();
        statusCode = StatusCode._404;
    }
}
