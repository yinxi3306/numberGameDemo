package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DivisibleDemo {
    public void requirement1(int n){
        String s = "";
        if (n>0 && n<=100){
            for (int i = 1; i <= n; i++) {
                s=i+"";
                if(checkDiv3(i)&&checkDiv5(i)){
                    s="FizzBuzz";
                }else if (checkDiv3(i)){
                    s="Fizz";
                }else if(checkDiv5(i)){
                    s="Buzz";
                }else {

                }
                System.out.println(s);
            }

        }
    }

    public void requirement2(int n){
        String s = "";
        if (n>0 && n<=100){
            for (int i = 1; i <= n; i++) {
                s=i+"";
                if(checkDiv3(i)&&checkDiv5(i)){
                    s="FizzBuzz";
                }else if (checkDiv3(i)||s.contains("3")){
                    s="Fizz";
                }else if(checkDiv5(i)||s.contains("5")){
                    s="Buzz";
                }else {

                }
                System.out.println(s);
            }

        }
    }

    private boolean checkDiv3(int n){
        return n%3==0;
    }
    private boolean checkDiv5(int n){
        return n%5==0;
    }

}
