package uk.co.thesmith.resources;

import uk.co.thesmith.DropwizardCognitoConfiguration;
import uk.co.thesmith.views.IndexView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class IndexResource {

    private final DropwizardCognitoConfiguration configuration;

    public IndexResource(DropwizardCognitoConfiguration configuration) {
        this.configuration = configuration;
    }

    @GET
    public IndexView index() {
        return new IndexView(configuration);
    }
}
