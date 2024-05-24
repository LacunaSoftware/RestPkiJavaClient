package com.lacunasoftware.client;

import org.springframework.web.client.RestClientResponseException;
import com.lacunasoftware.client.api.*;
import com.lacunasoftware.client.model.*;

public class RestPkiClient extends ApiClient {

    public RestPkiClient(String baseUrl, String apiKey) {
        super();
        this.setApiKey(apiKey);
        this.setBasePath(baseUrl);
    }

    // From here on we will focus our attention on implementing readable names for
    // the most used routes of the API
    
    // /api/signature
    PrepareSignatureResponse startSignature(PrepareSignatureRequest request) {
        SignatureApi signApi = new SignatureApi(this);
        return signApi.apiSignaturePost(request);
    }
    
    DocumentModel completeSignature(CompleteSignatureRequestV2 request) {
        SignatureApi signApi = new SignatureApi(this);
        return signApi.apiSignatureCompletionPost(request);
    }
}
