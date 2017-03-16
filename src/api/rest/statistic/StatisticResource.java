package api.rest.statistic;

import java.util.Collections;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import fight.Class;
import fight.Combination;
import statistic.Statistic;

@Path("statistics-api/")
public class StatisticResource {

	private Statistic stats = new Statistic(Collections.emptyList());

	@GET
	@Path("combination")
	public Response getStatisticForCombination(@QueryParam(value = "firstClass") Class firstClass,
			@QueryParam(value = "secondClass") Class secondClass) {
		Combination combination = new Combination(firstClass, secondClass);
		// TODO: build an Statistic API to separately return the needed
		// information

		return Response.ok(combination).build();
	}

}
