package com.hexaware.challenge.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class PlayerNotFoundException extends ResponseStatusException {

	public PlayerNotFoundException(HttpStatusCode status, String reason) {
		super(status, reason);

	}

}
