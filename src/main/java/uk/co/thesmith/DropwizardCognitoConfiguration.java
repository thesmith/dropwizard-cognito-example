package uk.co.thesmith;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import javax.validation.constraints.NotNull;

public class DropwizardCognitoConfiguration extends Configuration {

    @JsonProperty
    @NotNull
    private String googleClientId;

    @JsonProperty
    @NotNull
    private String googleScope;

    @JsonProperty
    @NotNull
    private String awsIdentityPoolId;

    @JsonProperty
    @NotNull
    private String awsRegion;

    public String getGoogleClientId() {
        return googleClientId;
    }

    public String getGoogleScope() {
        return googleScope;
    }

    public String getAwsIdentityPoolId() {
        return awsIdentityPoolId;
    }

    public String getAwsRegion() {
        return awsRegion;
    }
}
