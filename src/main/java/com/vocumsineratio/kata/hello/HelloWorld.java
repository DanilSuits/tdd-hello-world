/**
 * Copyright Vast 2019. All Rights Reserved.
 * <p/>
 * http://www.vast.com
 */
package com.vocumsineratio.kata.hello;

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

    public static void writeTo(OutputStream out) {
        PrintStream printStream = printStream(out);
        writeTo(printStream);
    }

    static PrintStream printStream(OutputStream out) {
        final String encoding = "UTF-8";
        final boolean autoFlush = true;
        try {
            return
                    new PrintStream(
                            out,
                            autoFlush,
                            encoding
                    );

        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(encoding, e);
        }
    }
}
