package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.Null;

import java.util.*;

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
        String resultElements = "";

        for(int i = 0;i < result.length(); i++){
            if(resultElements.contains(result.charAt(i)+"")){
                isRepeat = true;
            }else{
                resultElements += result.charAt(i);
            }
        }

        assertThat(isRepeat).isEqualTo(false);
    }


}
