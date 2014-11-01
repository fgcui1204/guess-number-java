package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class CompareNumberTest {

    private CompareNumber compareNumber;

    @Before
    public void before(){
        compareNumber = new CompareNumber();
    }

    @Test
    public void result_length_should_4(){
        String result = compareNumber.compare("1234","1243");

        assertThat(result.length()).isEqualTo(4);
    }

    @Test
    public void result_should_be_all_A(){
        String result = compareNumber.compare("1234","1234");

        assertThat(result).isEqualTo("4A0B");
    }

    @Test
    public void result_should_be_all_B(){
        String result = compareNumber.compare("1234","4321");

        assertThat(result).isEqualTo("0A4B");
    }
}
