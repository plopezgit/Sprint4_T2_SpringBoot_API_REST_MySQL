package cat.itacademy.barcelonactiva.lopez.pedro.s04.t02.n02.exception;

import org.springframework.http.HttpStatus;

public class FruitException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

    public FruitException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
