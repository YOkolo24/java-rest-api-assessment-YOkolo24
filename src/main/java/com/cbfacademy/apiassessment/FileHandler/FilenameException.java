package com.cbfacademy.apiassessment.FileHandler;

// Deals with exception when file name isn't in the expected .json format
public class FilenameException extends Exception {
    public FilenameException(String message) {
        super(message);
    }
    
}
