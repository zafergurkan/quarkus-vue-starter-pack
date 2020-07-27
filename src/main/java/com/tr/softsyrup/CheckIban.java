package com.tr.softsyrup;

import com.tr.softsyrup.services.IbanCheckerService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/check")
public class CheckIban {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/iban")
    public String hello() {
        return IbanCheckerService.test();
    }
}
