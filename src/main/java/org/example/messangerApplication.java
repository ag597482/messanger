package org.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class messangerApplication extends Application<messangerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new messangerApplication().run(args);
    }

    @Override
    public String getName() {
        return "messanger";
    }

    @Override
    public void initialize(final Bootstrap<messangerConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final messangerConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
