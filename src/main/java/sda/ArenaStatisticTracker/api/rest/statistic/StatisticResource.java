package sda.ArenaStatisticTracker.api.rest.statistic;

import java.util.Arrays;
import java.util.Collection;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.common.collect.Sets;

import sda.ArenaStatisticTracker.build.Build;
import sda.ArenaStatisticTracker.build.Talent;
import sda.ArenaStatisticTracker.fight.Combination;
import sda.ArenaStatisticTracker.fight.Fight;
import sda.ArenaStatisticTracker.fight.Result;
import sda.ArenaStatisticTracker.fight.WoWClass;
import sda.ArenaStatisticTracker.fight.business.FightService;



@Path("/statistics-api")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class StatisticResource {

    @Inject
    private FightService fightService;

    @GET
    @Path("/combination")
    public Collection<Fight> getStatisticForCombination() {
    	testCreate();
        System.out.println("FIGHT-SERVICE: " + fightService);
        return fightService.findAllFights();
    }
    
    private void testCreate(){
    	Fight f =  new Fight(new Combination(Arrays.asList(WoWClass.MONK_WINDWALKER, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN, "nice, nice, nice");
    	
    	fightService.storeFight(f);
    }
}
