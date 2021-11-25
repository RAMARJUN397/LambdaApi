package com.test;

public class ResourceNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String msg) {
		super("NotFound 404 Error:" + msg);
		
	}

}
