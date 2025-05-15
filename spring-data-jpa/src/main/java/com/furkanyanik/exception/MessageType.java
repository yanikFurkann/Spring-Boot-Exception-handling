package com.furkanyanik.exception;

import lombok.Getter;

@Getter
public enum MessageType {

	NO_RECORD_EXİST("101","Kayıt Bulunamadı."),
PRODUCT_NOT_FOUNT("102","ÜRÜN BULUNAMADI!"),
PRODUCT_SUCCESSFULLY_DELETE("103","ÜRÜN BAŞARIYLA SİLİNDİ");
private String  code;
	
	private String message;
	
	MessageType(String code, String message) {
		
		
		this.code= code;
		this.message= message;
		
	}

	
	
	
	
	
	
	
	
	
	
}
