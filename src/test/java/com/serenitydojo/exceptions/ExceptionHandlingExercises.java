package com.serenitydojo;

import com.serenitydojo.exceptions.FileLoader;
import com.serenitydojo.exceptions.MissingWelcomeFileException;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithExceptions {

    // - Handle a declared exception
    // - Catch a declared exception and return a value
    // - Catch a declared exception and throw a custom exception
    // - Custom logic that throws a custom exception when no result is found
    // - Using the Finally block to clean up

    /**
     * Exercise 1 - Handling exceptions
     * Uncomment the code in this test and make it work.
     * You will need to modify the FileLoader class so that it correctly handles an IOException
     */
    @Test
    public void workingWithDeclaredExceptions() throws IOException {
        FileLoader fileLoader = new FileLoader();
        assertThat(fileLoader.readHelloWorld()).isEqualTo("Hello World");
    }

    /**
     * Exercise 2 - Catching exceptions
     *
     */
    @Test
    public void catchingExceptions() throws  IOException{
        FileLoader fileLoader = new FileLoader();
        assertThat(fileLoader.fileContainsText("hello.txt","Hello World")).isTrue();
    }

    @Test
    public void catchingExceptionsWhenTheFileDoesNotExist() throws IOException{
        FileLoader fileLoader = new FileLoader();
        assertThat(fileLoader.fileContainsText("does-not-exist.txt","Hello World")).isFalse();
    }

    /**
     * Exercise 3 - Throwing custom exceptions
     */
    @Test(expected = MissingWelcomeFileException.class)
    public void catchingCustomExceptionsWhenTheFileDoesNotExist() throws IOException {
        FileLoader fileLoader = new FileLoader();
        assertThat(fileLoader.fileHasText("does-not-exist.txt","Hello World")).isFalse();
    }
}
