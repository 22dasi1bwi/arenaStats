package api.rest.statistic;

import java.util.Collections;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import statistic.Statistic;

@Path("/statistics-api")
public class StatisticResource {

    private Statistic stats = new Statistic(Collections.emptyList());

    @GET
    @Path("/combination")
    public String getStatisticForCombination() {
        //        Combination combination = new Combination(Arrays.asList(firstClass, secondClass));
        // TODO: build an Statistic API to separately return the needed
        // information

        return "hello";
    }
}
