package org.example;
//import org.springframework.beans.factory.annotation.Value;

import org.springframework.beans.factory.annotation.Value;

public class TestEnvPrint implements EnvPrint{
    @Value("${app.env}")
    private String env;

    @Override
    public void printEnv() {
        System.out.println("TestEnvPrint env is: "+ env);
    }
}
