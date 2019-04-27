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

    private static String SERVICE = "http://localhost:81/rest/";

    @Test
    public void addUserTest() {


        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:81/rest/addUser");


        User user = new User();
        user.setName("ISA 123");
        user.setSurname("ISA 456");

        Response response = target.request()
                .post(Entity.entity(user, MediaType.APPLICATION_JSON));


        response.getEntity();

    }

    @Test
    public void updateUserTest() {


        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:81/rest/user");


        User user = new User();
        user.setId(3);
        user.setName("ISA 123  aaaa");
        user.setSurname("ISA 456  aaa");

        Response response = target.request()
                .put(Entity.entity(user, MediaType.APPLICATION_JSON));

        response.getEntity();

    }

    @Test
    public void deleteUserTest() {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:81/rest/user?id=4");


        Response response = target.request().delete();
    }

    private static <T> Entity<T> entity(T entity) {
        return Entity.entity(entity, MediaType.APPLICATION_JSON);
    }


    private WebTarget getWebTarget(String endpoint){

        Client client = ClientBuilder.newClient();

        return client.target(SERVICE + endpoint);
    }

    @Test
    public void testDelete(){


        WebTarget target = getWebTarget("user?id=2");

        target.request().delete();
    };
}
