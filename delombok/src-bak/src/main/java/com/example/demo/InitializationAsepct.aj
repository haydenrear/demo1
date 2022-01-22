package com.example.demo;

public aspect InitializationAsepct {
    pointcut point(): initialization(ToAspect.new());
    after(): point() {
        System.out.println("hello");
    }
    pointcut pointcutWithArgs(String args): call(void ToAspect.someFunction(String)) && args(args);
    after(String args): pointcutWithArgs(args) {
        System.out.println("hello " + args);
    }
}
