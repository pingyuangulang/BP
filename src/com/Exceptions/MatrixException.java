package com.Exceptions;

public class MatrixException extends Exception{
    
    //异常信息
    private String message;
    
    public MatrixException() {
    }
    
    public MatrixException(String message) {
        super(message);
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
