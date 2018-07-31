package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DivisibleTest {
    @Autowired
    private DivisibleDemo div;
    @Test
    public void requirement1Test() {
        div.requirement1(100);
    }

    @Test
    public void requirement2Test() {
        div.requirement2(100);
    }
}
