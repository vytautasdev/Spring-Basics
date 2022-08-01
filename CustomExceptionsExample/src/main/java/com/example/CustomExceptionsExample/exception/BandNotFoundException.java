package com.example.CustomExceptionsExample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Band with given ID does not exist on the server")
public class BandNotFoundException extends EntityNotFoundException {
}
