package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

//@SpringBootTest
class Demo1ApplicationTests {

//    @Autowired
//    ApplicationContext applicationContext;

    @Test
    void contextLoads()
    {
        ToAspect toAspect = new ToAspect();
        toAspect.someFunction("hello you");
    }

}