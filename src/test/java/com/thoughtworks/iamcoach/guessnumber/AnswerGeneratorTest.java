package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;


public class AnswerGeneratorTest {

    @Test
    public void result_length_should_be_4(){

        AnswerGenerator answerGenerator = new AnswerGenerator();
        String result = answerGenerator.generate();

        assertThat(result.length()).isEqualTo(4);
    }
}
