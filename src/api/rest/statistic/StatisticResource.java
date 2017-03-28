package api.rest.statistic;

import java.util.Collection;
import java.util.Collections;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import fight.Fight;
import fight.business.FightService;
import statistic.Statistic;

@Path("/statistics-api")
public class StatisticResource {

    @Inject
    private FightService fightService;

    private Statistic stats = new Statistic(Collections.emptyList());

    @GET
    @Path("/combination")
    public Collection<Fight> getStatisticForCombination() {
        //        Combination combination = new Combination(Arrays.asList(firstClass, secondClass));
        // TODO: build an Statistic API to separately return the needed
        // information
        System.out.println("FIGHT-SERVICE: " + fightService);
        return fightService.findAllFights();
    }
}
