package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    @Test
    public void result_should_be_number(){

        String result = answerGenerator.generate();
        boolean isNum = true;

        for(int i = 0; i < result.length(); i++){

            int element = result.charAt(i);
            if(element < 49 || element >58){
                isNum = false;
                break;
            }

        }
        assertThat(isNum).isEqualTo(true);
    }

    @Test
    public void result_should_be_not_repeat(){

        String result = answerGenerator.generate();
        boolean isRepeat = false;

        Set<String> resultSet = new HashSet<String>(Arrays.asList(result));

        isRepeat = resultSet.size() - result.length() > 0;

        assertThat(isRepeat).isEqualTo(true);
    }


}
