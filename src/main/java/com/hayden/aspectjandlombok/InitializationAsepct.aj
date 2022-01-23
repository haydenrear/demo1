package com.hayden.aspectjandlombok;

import java.io.File;
import java.io.IOException;

public aspect InitializationAsepct {
    pointcut point(ToAspect toAspect): initialization(com.hayden.aspectjandlombok.ToAspect.new()) && target(toAspect);
    after(ToAspect toAspect): point(toAspect) {
        toAspect.setProperty("hello");
    }
    pointcut pointcutWithArgs(ToAspect toAspect, String args): call(void com.hayden.aspectjandlombok.ToAspect.someFunction(java.lang.String)) && args(args) && target(toAspect);
    after(ToAspect toAspect, String args): pointcutWithArgs(toAspect, args) {
        toAspect.setProperty(args);
    }
}
