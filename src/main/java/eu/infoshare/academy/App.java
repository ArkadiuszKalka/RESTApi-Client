package eu.infoshare.academy;


import eu.infoshare.academy.model.RestResponse;
import eu.infoshare.academy.model.StateInfo;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.util.List;

public class App {

    public static List<StateInfo> data() {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://services.groupkt.com/state/get/USA/all");
        Response response = target.request().get();

        RestResponse statesResponse = response.readEntity(RestResponse.class);

        return statesResponse.getResult();
    }

}
