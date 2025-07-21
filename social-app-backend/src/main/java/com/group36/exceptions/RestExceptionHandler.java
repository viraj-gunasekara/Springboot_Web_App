package com.group36.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

@RestController
@ControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(UserException.class)
    public ResponseEntity<ApiError> handleUserException(UserException ex, WebRequest request) {
        String uri = ((ServletWebRequest) request).getRequest().getRequestURI();
        ApiError error = new ApiError(ex.getMessage(), uri, LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
	
	
	@ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleOtherException(Exception ex, WebRequest request) {
        String uri = ((ServletWebRequest) request).getRequest().getRequestURI();
        ApiError error = new ApiError(ex.getMessage(), uri, LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
