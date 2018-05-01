package lt.vu.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;


public class QueryResult implements Serializable {
    private String queryText;
    private String action;
    private LinkedHashMap<String, String> parameters;
    private boolean allRequiredParamsPresent;
    private String fulfillmentText;
    private Intent displayName;
    private String intentDetectionConfidence;
    private ArrayList<LinkedHashMap<String, Object>> outputContexts;

    public String getQueryText() {
        return queryText;
    }

    public ArrayList<LinkedHashMap<String, Object>> getOutputContexts() {
        return outputContexts;
    }

    public void setOutputContext(ArrayList<LinkedHashMap<String, Object>> outputContexts) {
        this.outputContexts = outputContexts;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LinkedHashMap<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(LinkedHashMap<String, String> parameters) {
        this.parameters = parameters;
    }

    public boolean isAllRequiredParamsPresent() {
        return allRequiredParamsPresent;
    }

    public void setAllRequiredParamsPresent(boolean allRequiredParamsPresent) {
        this.allRequiredParamsPresent = allRequiredParamsPresent;
    }

    public String getFulfillmentText() {
        return fulfillmentText;
    }

    public void setFulfillmentText(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
    }

    public Intent getDisplayName() {
        return displayName;
    }

    public void setDisplayName(Intent displayName) {
        this.displayName = displayName;
    }

    public String getIntentDetectionConfidence() {
        return intentDetectionConfidence;
    }

    public void setIntentDetectionConfidence(String intentDetectionConfidence) {
        this.intentDetectionConfidence = intentDetectionConfidence;
    }
}
