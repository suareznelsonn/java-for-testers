package com.serenitydojo.exceptions;

import org.assertj.core.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class WhenWorkingWithExceptions {
    @Test
    public void shouldCountsTheWordsInAString(){
    WordCounter wordCounter = new WordCounter();

    int numberOfWords = wordCounter.numberOfWordsIn("some string");
    assertThat(numberOfWords).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroForANullString(){
        WordCounter wordCounter = new WordCounter();

        assertThat(wordCounter.numberOfWordsIn(null)).isEqualTo(0);
    }
}
