package com.infosys.jerseyrest.configuration;

import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConfiguration extends ResourceConfig {

    public JerseyConfiguration(){
        packages("com.infosys.jerseyrest.resource");
    }
}
