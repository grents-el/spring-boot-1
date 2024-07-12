package org.example;

import org.springframework.beans.factory.annotation.Value;

public class ProdEnvPrint implements EnvPrint{
    @Value("${app.env}")
    private String env;
    @Override
    public void printEnv() {
        System.out.println("ProdEnvPrint env is :"+env);
    }
}
