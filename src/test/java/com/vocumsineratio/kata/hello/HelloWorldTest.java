package com.vocumsineratio.kata.hello;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Danil Suits (danil@vast.com)
 */
public class HelloWorldTest {
    @Test
    public void it_writes_to_standard_out() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);

        {
            final PrintStream originalOut = System.out;

            try {
                System.setOut(out);

                String[] args = new String[0];
                HelloWorld.main(args);

            } finally {
                System.setOut(originalOut);
            }
        }

        assertEquals(
                "Hello World\n",
                baos.toString()
        );
    }
}