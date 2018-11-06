package com.sundar.graphdbDemo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Sundar Gsv
 * @Date 06/11/18
 * @ClassDescription
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFound extends RuntimeException {
    public NotFound() {
        super();
    }
    public NotFound(String message, Throwable cause) {
        super(message, cause);
    }
    public NotFound(String message) {
        super(message);
    }
    public NotFound(Throwable cause) {
        super(cause);
    }
}
