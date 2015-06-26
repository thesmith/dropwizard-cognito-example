package uk.co.thesmith;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class DropwizardCognitoApplication extends Application<DropwizardCognitoConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardCognitoApplication().run(args);
    }

    @Override
    public void run(final DropwizardCognitoConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
