package sda.ArenaStatisticTracker.fight.business;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import sda.ArenaStatisticTracker.fight.Fight;

@Stateless
public class FightService {

    @PersistenceContext(unitName = "testPU")
    private EntityManager em;

    public Collection<Fight> findAllFights() {
        TypedQuery<Fight> query = em.createNamedQuery("Fight.findAll", Fight.class);
        return query.getResultList();
    }

    public Collection<Fight> storeFights(Collection<Fight> fights) {
        em.persist(fights);
        return fights;
    }

    public Fight storeFight(Fight fight) {
        em.persist(fight);
        return fight;
    }
}
