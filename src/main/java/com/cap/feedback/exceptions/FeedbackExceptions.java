package com.cap.feedback.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class FeedbackExceptions extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3535479379271942897L;

	public FeedbackExceptions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FeedbackExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public FeedbackExceptions(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public FeedbackExceptions(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public FeedbackExceptions(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
