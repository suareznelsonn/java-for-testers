package com.serenitydojo.exceptions;

public class WordCounter {

    public int numberOfWordsIn(String value){
        if(value == null){
            return 0;
        }
        int numberOfWords = value.split("\\W").length;
        return numberOfWords;
    }
}
