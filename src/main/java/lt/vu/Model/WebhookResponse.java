package lt.vu.Model;

import java.util.ArrayList;
import java.util.List;

public class WebhookResponse {
    private String fulfillmentText;
    private List<String> fulfillmentMessages = new ArrayList<>();
    private String source = "java-webhook";
    private Object payload = null;
    private List<Object> outputContexts = new ArrayList<>();
    private Object followupEventInput = null;

    public WebhookResponse(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
    }

    public String getFulfillmentText() {
        return fulfillmentText;
    }

    public void setFulfillmentText(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
    }

    public List<String> getFulfillmentMessages() {
        return fulfillmentMessages;
    }

    public void setFulfillmentMessages(List<String> fulfillmentMessages) {
        this.fulfillmentMessages = fulfillmentMessages;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public List<Object> getOutputContexts() {
        return outputContexts;
    }

    public void setOutputContexts(List<Object> outputContexts) {
        this.outputContexts = outputContexts;
    }

    public Object getFollowupEventInput() {
        return followupEventInput;
    }

    public void setFollowupEventInput(Object followupEventInput) {
        this.followupEventInput = followupEventInput;
    }
}