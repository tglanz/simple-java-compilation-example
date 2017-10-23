package com.tglanz.app;

import java.util.Scanner;
import com.tglanz.app.util.SomeUtility;

public class Program {

    private static final Scanner _stdIn = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Main: Initializing some utility");
        System.out.println("Main: Enter some string...");

        String input = _stdIn.nextLine();
        SomeUtility someUtility = new SomeUtility(input);
        someUtility.PrintStr();
    }
}