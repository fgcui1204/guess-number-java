package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class CompareNumberTest {
    @Test
    public void result_length_should_4(){
        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234","1243");

        assertThat(result.length()).isEqualTo(4);
    }
}
