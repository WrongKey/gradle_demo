package com.wrongkey.api;

import javax.ws.rs.*;

@Path("authentication")
@Produces("text/plain")
public class AuthenticationAPI {
    @POST
    @Path("sign_in")
    @Produces("text/html")
    public String signIn(@FormParam("username") String username,
                         @FormParam(("password")) String password) {
        if (username.equals("924468334@qq.com") && password.equals("123456")) {
            return "Congratulations, sign in successful!";
        }
        return "Sorry,sign in failed!";
    }
}
