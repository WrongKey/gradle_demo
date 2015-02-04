package com.wrongkey.authentication.api;

import com.wrongkey.authentication.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("authentication")
@Produces("text/plain")
public class AuthenticationAPI {

    @Autowired
    private AuthenticationService service;

    @POST
    @Path("sign_in")
    @Produces("text/html")
    public Response signIn(@FormParam("username") String username,
                         @FormParam(("password")) String password) {
        if (username.equals("924468334@qq.com") && password.equals("123456")) {
            return Response.ok("Congratulations, sign in successful!").build();
        }
        return Response.ok("Sorry,sign in failed!").build();
    }
}
