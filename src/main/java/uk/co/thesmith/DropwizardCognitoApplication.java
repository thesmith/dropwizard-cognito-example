package uk.co.thesmith;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import uk.co.thesmith.resources.IndexResource;

public class DropwizardCognitoApplication extends Application<DropwizardCognitoConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardCognitoApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<DropwizardCognitoConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle<>());
    }

    @Override
    public void run(final DropwizardCognitoConfiguration configuration,
                    final Environment environment) {

        environment.jersey().register(new IndexResource(configuration));
    }
}
