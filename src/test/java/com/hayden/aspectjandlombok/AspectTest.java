package com.hayden.aspectjandlombok;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class AspectTest {
    @Test
    void contextLoads()
    {
        ToAspect toAspect = new ToAspect();
        assertThat(toAspect.getProperty()).isEqualTo("hello");
        toAspect.someFunction("hello you");
        assertThat(toAspect.getProperty()).isEqualTo("hello you");
    }
}
