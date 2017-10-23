package com.tglanz.app.util;

public class SomeUtility {

    private final String _str;

    public SomeUtility(String str){
        _str = str;
    }

    public void PrintStr(){
        System.out.println("Str is: " + _str);
    }
}