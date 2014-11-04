package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {
    private Guess guess;

    @Before
    public void init(){
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn("1234");
        CompareNumber compareNumber = mock(CompareNumber.class);
        when(compareNumber.compare("1234","5678")).thenReturn("0A0B");
        guess = new Guess(answerGenerator,compareNumber);
    }

    @Test
    public void should_return_result(){
        assertThat(guess.judge("5678")).isEqualTo("0A0B");
    }


}
