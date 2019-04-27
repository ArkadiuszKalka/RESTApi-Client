package eu.infoshare.academy.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class RestResponse  implements Serializable {

    @JsonProperty("RestResponse")
    private RestResponse restResponse;

    private List<String> messages;
    private List<StateInfo> result;

    public RestResponse() {
    }

    public RestResponse getRestResponse() {
        return restResponse;
    }

    public void setRestResponse(RestResponse restResponse) {
        this.restResponse = restResponse;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public List<StateInfo> getResult() {
        return result;
    }

    public void setResult(List<StateInfo> result) {
        this.result = result;
    }
}
