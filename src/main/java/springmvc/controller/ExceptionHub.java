package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHub {

	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value= Exception.class)
	public String handleException() {
		return "error";
	}
}
