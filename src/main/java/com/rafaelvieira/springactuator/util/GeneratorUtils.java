package com.rafaelvieira.springactuator.util;

import java.util.UUID;

public class GeneratorUtils {

    public static String uuid() {
        return UUID.randomUUID().toString();
    }

}
