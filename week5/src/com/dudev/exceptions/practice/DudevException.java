package com.dudev.exceptions.practice;

import java.io.FileNotFoundException;
import java.util.Map;

public class DudevException extends RuntimeException{

    public static void main(String[] args) {

    }

    public DudevException(Throwable cause) {
        super(cause);
    }

    public DudevException(String message) {
        super(message);
    }


}
