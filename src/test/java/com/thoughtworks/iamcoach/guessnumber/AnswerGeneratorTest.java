package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;


public class AnswerGeneratorTest {

    private AnswerGenerator answerGenerator;
    @Before
    public void init(){
        answerGenerator = new AnswerGenerator();
    }

    @Test
    public void result_length_should_be_4(){

        String result = answerGenerator.generate();

        assertThat(result.length()).isEqualTo(4);
    }


}
