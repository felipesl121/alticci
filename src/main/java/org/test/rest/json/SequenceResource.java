package org.test.rest.json;

import cache.Alticci;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.math.BigInteger;


@Path("/alticci")
public class SequenceResource {
    @Inject
    Alticci alticci;

    @GET
    @Path("/{nthNumber}")
    public Sequence getnThSequece(String nthNumber) {
        int nth = Integer.parseInt(nthNumber);
        long start = System.currentTimeMillis();
        BigInteger value = alticci.getNthAlticci(nth);
        long end = System.currentTimeMillis();

        return new Sequence(value, nth, end-start);
    }
}

