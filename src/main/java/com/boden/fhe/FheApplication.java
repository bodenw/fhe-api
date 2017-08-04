package com.boden.fhe;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class FheApplication extends Application<FheConfiguration> {

    public static void main(final String[] args) throws Exception {
        new FheApplication().run(args);
    }

    @Override
    public String getName() {
        return "fhe-api";
    }

    @Override
    public void initialize(final Bootstrap<FheConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final FheConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
