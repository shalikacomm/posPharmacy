package com.shatec.pos.pospharmacy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by amantha on 9/16/2017.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.shatec.pos.pospharmacy"})
 public class PharmacyPosMain {

    public static void main(String[] args) {
        SpringApplication.run(PharmacyPosMain.class,args);
    }
}
