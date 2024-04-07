package victormr.desafiouol.exceptions;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ControllerExceptionHandler {
//DataIntegrityViolationException
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity threatNoSuchElementException(NoSuchElementException exception){
        ExceptionDto dto = new ExceptionDto("Essa lista não possui mais usuários disponíveis",  "400");
        return ResponseEntity.badRequest().body(dto);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity threatDataIntegrityViolationException(DataIntegrityViolationException exception){
        ExceptionDto dto = new ExceptionDto("Insira dados diferentes para diferentes 'players', 'phone' e 'email', são atributos unicos",  "400");
        return ResponseEntity.badRequest().body(dto);
    }
}
