package com.hayden.aspectjandlombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ToAspect {

    private String property;

    public void someFunction() {}
    public void someFunction(String args) {}

    public void test() {
    }


}