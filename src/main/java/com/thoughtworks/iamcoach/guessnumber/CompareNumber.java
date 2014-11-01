package com.thoughtworks.iamcoach.guessnumber;

public class CompareNumber {
    public String compare(String answer, String input) {

        int numberA = 0;
        int numberB = 0;

        for (int i = 0; i < answer.length(); i++){

            if((answer.charAt(i)+"").equals(input.charAt(i)+"")){
                numberA += 1;
            }else if(answer.contains(input.charAt(i)+"")){
                numberB += 1;
            }
        }
        return numberA+"A"+numberB+"B";
    }
}
