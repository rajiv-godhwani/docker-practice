package us.cogitate.hookcopy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by rgodhwani on 4/26/2017.
 * Copyright (2017) by Cogitate Technology Solution
 */
@EnableAutoConfiguration
public class Main {

    public static void main(String... args) {
        SpringApplication.run(new Object[]{Main.class, HookCopy.class}, args);
    }
}
