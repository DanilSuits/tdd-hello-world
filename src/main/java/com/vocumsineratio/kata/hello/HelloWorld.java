/**
 * Copyright Vast 2019. All Rights Reserved.
 * <p/>
 * http://www.vast.com
 */
package com.vocumsineratio.kata.hello;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 * @author Danil Suits (danil@vast.com)
 */
public class HelloWorld {
    public static void main(String[] args) {
        writeTo(System.out);
    }

    public static void writeTo(PrintStream out) {
        out.println("Hello World");
    }

    public static void writeTo(OutputStream baos) {
        final String encoding =  "UTF-8";
        boolean autoFlush = true;
        try {
            writeTo(new PrintStream(baos, autoFlush, encoding));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(encoding, e);
        }
    }
}
