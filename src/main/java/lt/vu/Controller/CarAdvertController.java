package lt.vu.Controller;

import lt.vu.Model.Request;
import lt.vu.Model.WebhookResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;


@RestController
@RequestMapping("/webhook")
public class CarAdvertController {

    @PostMapping
    public WebhookResponse webhook(@RequestBody Request resp) {
        if (resp == null && resp.getQueryResult() == null) {
            return new WebhookResponse("Sorry, I don't get you...");
        }
        if (resp.getQueryResult().getAction() == null) {
            return new WebhookResponse(resp.getQueryResult().getFulfillmentText());
        }

        switch (resp.getQueryResult().getAction()) {
            case "search":
                return new WebhookResponse("Searching for " +
                        extractContextParams(resp.getQueryResult().getOutputContexts().get(0).get("parameters")));
            case "fill-params":
                return new WebhookResponse("Filling params... Would you like to add some more information?");
            case "cancel":
                return new WebhookResponse("Canceling...");
            default:
                return new WebhookResponse(resp.getQueryResult().getFulfillmentText());
        }
    }

    private String extractContextParams(Object params) {
        if (!(params instanceof LinkedHashMap)) {
            return "";
        }
        LinkedHashMap<String, String> paramsMap = (LinkedHashMap<String, String>) params;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : paramsMap.entrySet()) {
            if (!entry.getKey().contains("original")) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(entry.getKey() + ": " + entry.getValue());
            }
        }
        return sb.toString();
    }
}
