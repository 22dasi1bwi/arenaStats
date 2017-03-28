package sda.ArenaStatisticTracker.api.rest.base;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.fasterxml.jackson.databind.ObjectMapper;

@ApplicationPath("/api")
public class JAXRSConfiguration extends Application {

    public JAXRSConfiguration() {
    	ObjectMapper mapper = new ObjectMapper();
    }
}