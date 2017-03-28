package sda.ArenaStatisticTracker.api.rest.statistic;

import java.util.Collection;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import sda.ArenaStatisticTracker.fight.Fight;
import sda.ArenaStatisticTracker.fight.business.FightService;



@Path("/statistics-api")
public class StatisticResource {

    @Inject
    private FightService fightService;

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
