package ru.guluev.serviceforautorization.controoler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.guluev.serviceforautorization.exceptions.InvalidCredentials;
import ru.guluev.serviceforautorization.exceptions.UnauthorizedUser;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> InvalidCredentials(InvalidCredentials exception) {
        return new ResponseEntity<String>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> UnauthorizedUser(UnauthorizedUser exception) {
        return new ResponseEntity<String>(exception.getMessage(), HttpStatus.UNAUTHORIZED);
    }

}

