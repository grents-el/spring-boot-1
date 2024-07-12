package org.example;

import org.springframework.stereotype.Component;

@Component
public class ProfileWorker {
    public ProfileWorker(EnvPrint envPrint) {
        this.envPrint = envPrint;
    }
    public void doWork(){
        envPrint.printEnv();
    }

    private final EnvPrint envPrint;
}
