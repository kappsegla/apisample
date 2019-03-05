package se.iths.martin.apisample;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class QuoteNotFoundAdvice {

    @ExceptionHandler(QuoteNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String productNotFound(QuoteNotFoundException exception) {
        return exception.getMessage();
    }
}
