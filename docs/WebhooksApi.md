# WebhooksApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2WebhookDynamicWebhookResourceDeleteWebhookByIdDelete**](WebhooksApi.md#comAtlassianJiraRestV2WebhookDynamicWebhookResourceDeleteWebhookByIdDelete) | **DELETE** /rest/api/3/webhook | Delete webhooks by ID
[**comAtlassianJiraRestV2WebhookDynamicWebhookResourceGetDynamicWebhooksForAppGet**](WebhooksApi.md#comAtlassianJiraRestV2WebhookDynamicWebhookResourceGetDynamicWebhooksForAppGet) | **GET** /rest/api/3/webhook | Get dynamic webhooks for app
[**comAtlassianJiraRestV2WebhookDynamicWebhookResourceRefreshWebhooksPut**](WebhooksApi.md#comAtlassianJiraRestV2WebhookDynamicWebhookResourceRefreshWebhooksPut) | **PUT** /rest/api/3/webhook/refresh | Extend webhook life
[**comAtlassianJiraRestV2WebhookDynamicWebhookResourceRegisterDynamicWebhooksPost**](WebhooksApi.md#comAtlassianJiraRestV2WebhookDynamicWebhookResourceRegisterDynamicWebhooksPost) | **POST** /rest/api/3/webhook | Register dynamic webhooks
[**comAtlassianJiraRestV2WebhookFailedWebhookResourceGetFailedWebhooksGet**](WebhooksApi.md#comAtlassianJiraRestV2WebhookFailedWebhookResourceGetFailedWebhooksGet) | **GET** /rest/api/3/webhook/failed | Get failed webhooks


<a name="comAtlassianJiraRestV2WebhookDynamicWebhookResourceDeleteWebhookByIdDelete"></a>
# **comAtlassianJiraRestV2WebhookDynamicWebhookResourceDeleteWebhookByIdDelete**
> comAtlassianJiraRestV2WebhookDynamicWebhookResourceDeleteWebhookByIdDelete(containerForWebhookIDs)

Delete webhooks by ID

Removes webhooks by ID. Only webhooks registered by the calling Connect app are removed. If webhooks created by other apps are specified, they are ignored.  **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/integrating-with-jira-cloud/#atlassian-connect) can use this operation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhooksApi()
val containerForWebhookIDs : ContainerForWebhookIDs = {"webhookIds":[10000,10001,10042]} // ContainerForWebhookIDs | 
try {
    apiInstance.comAtlassianJiraRestV2WebhookDynamicWebhookResourceDeleteWebhookByIdDelete(containerForWebhookIDs)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#comAtlassianJiraRestV2WebhookDynamicWebhookResourceDeleteWebhookByIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#comAtlassianJiraRestV2WebhookDynamicWebhookResourceDeleteWebhookByIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerForWebhookIDs** | [**ContainerForWebhookIDs**](ContainerForWebhookIDs.md)|  |

### Return type

null (empty response body)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2WebhookDynamicWebhookResourceGetDynamicWebhooksForAppGet"></a>
# **comAtlassianJiraRestV2WebhookDynamicWebhookResourceGetDynamicWebhooksForAppGet**
> PageBeanWebhook comAtlassianJiraRestV2WebhookDynamicWebhookResourceGetDynamicWebhooksForAppGet(startAt, maxResults)

Get dynamic webhooks for app

Returns the webhooks registered by the calling app.  **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/integrating-with-jira-cloud/#atlassian-connect) can use this operation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhooksApi()
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageBeanWebhook = apiInstance.comAtlassianJiraRestV2WebhookDynamicWebhookResourceGetDynamicWebhooksForAppGet(startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#comAtlassianJiraRestV2WebhookDynamicWebhookResourceGetDynamicWebhooksForAppGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#comAtlassianJiraRestV2WebhookDynamicWebhookResourceGetDynamicWebhooksForAppGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 100]

### Return type

[**PageBeanWebhook**](PageBeanWebhook.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2WebhookDynamicWebhookResourceRefreshWebhooksPut"></a>
# **comAtlassianJiraRestV2WebhookDynamicWebhookResourceRefreshWebhooksPut**
> WebhooksExpirationDate comAtlassianJiraRestV2WebhookDynamicWebhookResourceRefreshWebhooksPut(containerForWebhookIDs)

Extend webhook life

Webhooks registered through the REST API expire after 30 days. Call this resource periodically to keep them alive.  Unrecognized webhook IDs (nonexistent or belonging to other apps) are ignored.  **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/integrating-with-jira-cloud/#atlassian-connect) can use this operation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhooksApi()
val containerForWebhookIDs : ContainerForWebhookIDs = {"webhookIds":[10000,10001,10042]} // ContainerForWebhookIDs | 
try {
    val result : WebhooksExpirationDate = apiInstance.comAtlassianJiraRestV2WebhookDynamicWebhookResourceRefreshWebhooksPut(containerForWebhookIDs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#comAtlassianJiraRestV2WebhookDynamicWebhookResourceRefreshWebhooksPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#comAtlassianJiraRestV2WebhookDynamicWebhookResourceRefreshWebhooksPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerForWebhookIDs** | [**ContainerForWebhookIDs**](ContainerForWebhookIDs.md)|  |

### Return type

[**WebhooksExpirationDate**](WebhooksExpirationDate.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2WebhookDynamicWebhookResourceRegisterDynamicWebhooksPost"></a>
# **comAtlassianJiraRestV2WebhookDynamicWebhookResourceRegisterDynamicWebhooksPost**
> ContainerForRegisteredWebhooks comAtlassianJiraRestV2WebhookDynamicWebhookResourceRegisterDynamicWebhooksPost(webhookRegistrationDetails)

Register dynamic webhooks

Registers webhooks.  **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/integrating-with-jira-cloud/#atlassian-connect) can use this operation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhooksApi()
val webhookRegistrationDetails : WebhookRegistrationDetails = {"webhooks":[{"jqlFilter":"project = PROJ","events":["jira:issue_created","jira:issue_updated"]},{"jqlFilter":"project IN (PROJ, EXP) AND status = done","events":["jira:issue_deleted"]}],"url":"https://your-app.example.com/webhook-received"} // WebhookRegistrationDetails | 
try {
    val result : ContainerForRegisteredWebhooks = apiInstance.comAtlassianJiraRestV2WebhookDynamicWebhookResourceRegisterDynamicWebhooksPost(webhookRegistrationDetails)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#comAtlassianJiraRestV2WebhookDynamicWebhookResourceRegisterDynamicWebhooksPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#comAtlassianJiraRestV2WebhookDynamicWebhookResourceRegisterDynamicWebhooksPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRegistrationDetails** | [**WebhookRegistrationDetails**](WebhookRegistrationDetails.md)|  |

### Return type

[**ContainerForRegisteredWebhooks**](ContainerForRegisteredWebhooks.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2WebhookFailedWebhookResourceGetFailedWebhooksGet"></a>
# **comAtlassianJiraRestV2WebhookFailedWebhookResourceGetFailedWebhooksGet**
> FailedWebhooks comAtlassianJiraRestV2WebhookFailedWebhookResourceGetFailedWebhooksGet(maxResults, after)

Get failed webhooks

Returns webhooks that have recently failed to be delivered to the requesting app after the maximum number of retries.  After 72 hours the failure may no longer be returned by this operation.  The oldest failure is returned first.  This method uses a cursor-based pagination. To request the next page use the failure time of the last webhook on the list as the &#x60;failedAfter&#x60; value or use the URL provided in &#x60;next&#x60;.  **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/integrating-with-jira-cloud/#atlassian-connect) can use this operation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhooksApi()
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of webhooks to return per page. If obeying the maxResults directive would result in records with the same failure time being split across pages, the directive is ignored and all records with the same failure time included on the page.
val after : kotlin.Long = 789 // kotlin.Long | The time after which any webhook failure must have occurred for the record to be returned, expressed as milliseconds since the UNIX epoch.
try {
    val result : FailedWebhooks = apiInstance.comAtlassianJiraRestV2WebhookFailedWebhookResourceGetFailedWebhooksGet(maxResults, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#comAtlassianJiraRestV2WebhookFailedWebhookResourceGetFailedWebhooksGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#comAtlassianJiraRestV2WebhookFailedWebhookResourceGetFailedWebhooksGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxResults** | **kotlin.Int**| The maximum number of webhooks to return per page. If obeying the maxResults directive would result in records with the same failure time being split across pages, the directive is ignored and all records with the same failure time included on the page. | [optional]
 **after** | **kotlin.Long**| The time after which any webhook failure must have occurred for the record to be returned, expressed as milliseconds since the UNIX epoch. | [optional]

### Return type

[**FailedWebhooks**](FailedWebhooks.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

