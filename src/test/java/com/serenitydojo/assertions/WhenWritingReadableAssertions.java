package com.serenitydojo.assertions;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Percentage;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Percentage.withPercentage;

public class WhenWritingReadableAssertions {

    @Test
    public void whenTwoNumbersAreEqual() {
        int a = 5;
        int b = 10;
        int c = 20;
        int sum = a + b + c;

        // Check that the sum is 35
        Assertions.assertThat(sum).isEqualTo(35);
    }

    @Test
    public void whenANumberIsGreaterThanAnother() {
        int a = 5;
        int b = 10;
        int c = 20;
        int sum = a + b + c;

        // Check that the sum is greater than 30
        Assertions.assertThat(sum).isGreaterThan(30);
    }

    @Test
    public void whenANumberIsInACertainInterval() {
        int a = 5;
        int b = 10;
        int sum = a + b;

        // Check that the sum is between 10 and 20
        Assertions.assertThat(sum).isBetween(10,20);
    }

    @Test
    public void whenANumberIsCloseToAnotherValue() {
        double roughlyOneHundred = 99;

        // Check that the sum is within 10% of 100
        assertThat(roughlyOneHundred).isCloseTo(100, withPercentage((10)));
    }

    @Test
    public void whenAStringIsEqualToAnother() {
        String color = "red";

        // Check that the string has a value of 'red'
        Assertions.assertThat(color).contains("red");
    }

    @Test
    public void whenAStringIsEqualIgnoringCase() {
        String color = "RED";

        // Check that the string has a value of 'red' (ignoring case)
        Assertions.assertThat(color).containsIgnoringCase("red");
    }

    @Test
    public void whenAStringContainsOnlyDigits() {
        String licenseNumber = "12345";

        // Check that the value contains only digits
        assertThat(licenseNumber).containsPattern("^[0-9]+$");
    }

    @Test
    public void whenAStringStartsWithAValue() {
        String colors = "red,green,blue";

        // Check that the value starts with 'red'
        Assertions.assertThat(colors).startsWith("red");
    }

    @Test
    public void whenAStringEndsWithAValue() {
        String colors = "red,green,blue";

        // Check that the value ends with 'blue'
        Assertions.assertThat(colors).endsWith("blue");
    }


    @Test
    public void whenAListContainsAValue() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains "red"
        Assertions.assertThat(colors).contains("red");
    }

    @Test
    public void whenAListContainsASetOfValues() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains "red" and "blue
        Assertions.assertThat(colors).contains("red","blue");
    }

    @Test
    public void whenAListHasASpecificSize() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains 3 elements
        Assertions.assertThat(colors).hasSize(3);
    }

    @Test
    public void whenAListContainsExactlyASetOfValues() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains exactly "red","green" and "blue"
        assertThat(colors).containsExactly("red","green","blue");
    }

    @Test
    public void whenAListContainsExactlyASetOfValuesInAnyOrder() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains "red","blue" and "green" in any order
        assertThat(colors).containsExactlyInAnyOrder("green","red","blue");
    }




}
