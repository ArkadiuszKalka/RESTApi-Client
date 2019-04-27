package eu.infoshare.academy.model;

import eu.infoshare.academy.model.User;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Credentials {

    @Test
    public void addUserTest(){


        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:81/rest/addUser");


        User user = new User();
        user.setName("ISA 123");
        user.setSurname("ISA 456");

                Response response = target.request()
                        .post(Entity.entity(user, MediaType.APPLICATION_JSON));


        response.getEntity();

    }
}