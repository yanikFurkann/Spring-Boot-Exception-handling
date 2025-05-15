package com.furkanyanik.exception;

public class BaseException extends RuntimeException{

	public BaseException () {
			
	}
	
	
	public BaseException (ErorMessage erorMessage) {
		super(erorMessage.getErorMessage());
		
	}
	
	
}
