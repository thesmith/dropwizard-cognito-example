package uk.co.thesmith.views;

import io.dropwizard.views.View;
import uk.co.thesmith.DropwizardCognitoConfiguration;

public class IndexView extends View {

    private final DropwizardCognitoConfiguration configuration;

    public IndexView(DropwizardCognitoConfiguration configuration) {
        super("index.mustache");
        this.configuration = configuration;
    }

    public DropwizardCognitoConfiguration getConfiguration() {
        return configuration;
    }
}
