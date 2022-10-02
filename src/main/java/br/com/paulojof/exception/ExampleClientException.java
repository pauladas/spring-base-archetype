package br.com.paulojof.exception;

import lombok.Getter;

@Getter
public class ExampleClientException extends Exception {

	private final String errorCode;

	public ExampleClientException(String errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

}
