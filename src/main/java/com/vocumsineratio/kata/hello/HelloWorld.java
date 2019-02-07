/**
 * Copyright Vast 2019. All Rights Reserved.
 * <p/>
 * http://www.vast.com
 */
package com.vocumsineratio.kata.hello;

import java.io.PrintStream;

/**
 * @author Danil Suits (danil@vast.com)
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static void writeTo(PrintStream out) {
        out.println("Hello World");
    }
}
