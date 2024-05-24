# TimestampApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiTimestampPlansIdentifierIssuePost**](TimestampApi.md#apiTimestampPlansIdentifierIssuePost) | **POST** /Api/TimestampPlans/{identifier}/Issue |  |
| [**apiTspIdentifierPost**](TimestampApi.md#apiTspIdentifierPost) | **POST** /api/tsp/{identifier} |  |



## apiTimestampPlansIdentifierIssuePost

> TimestampIssueResponse apiTimestampPlansIdentifierIssuePost(identifier, digestAlgorithmAndValueModel)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.TimestampApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TimestampApi apiInstance = new TimestampApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        DigestAlgorithmAndValueModel digestAlgorithmAndValueModel = new DigestAlgorithmAndValueModel(); // DigestAlgorithmAndValueModel | 
        try {
            TimestampIssueResponse result = apiInstance.apiTimestampPlansIdentifierIssuePost(identifier, digestAlgorithmAndValueModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TimestampApi#apiTimestampPlansIdentifierIssuePost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **identifier** | **String**|  | |
| **digestAlgorithmAndValueModel** | [**DigestAlgorithmAndValueModel**](DigestAlgorithmAndValueModel.md)|  | [optional] |

### Return type

[**TimestampIssueResponse**](TimestampIssueResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Syntax error, for instance when a required field is not specified |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Semantic error, for instance when a given entity ID is not found |  -  |


## apiTspIdentifierPost

> TimestampIssueResponse apiTspIdentifierPost(identifier, digestAlgorithmAndValueModel)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.TimestampApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TimestampApi apiInstance = new TimestampApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        DigestAlgorithmAndValueModel digestAlgorithmAndValueModel = new DigestAlgorithmAndValueModel(); // DigestAlgorithmAndValueModel | 
        try {
            TimestampIssueResponse result = apiInstance.apiTspIdentifierPost(identifier, digestAlgorithmAndValueModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TimestampApi#apiTspIdentifierPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **identifier** | **String**|  | |
| **digestAlgorithmAndValueModel** | [**DigestAlgorithmAndValueModel**](DigestAlgorithmAndValueModel.md)|  | [optional] |

### Return type

[**TimestampIssueResponse**](TimestampIssueResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Syntax error, for instance when a required field is not specified |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Semantic error, for instance when a given entity ID is not found |  -  |

