# IssuePrioritiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssuePriorityResourceGetPrioritiesGet**](IssuePrioritiesApi.md#comAtlassianJiraRestV2IssuePriorityResourceGetPrioritiesGet) | **GET** /rest/api/3/priority | Get priorities
[**comAtlassianJiraRestV2IssuePriorityResourceGetPriorityGet**](IssuePrioritiesApi.md#comAtlassianJiraRestV2IssuePriorityResourceGetPriorityGet) | **GET** /rest/api/3/priority/{id} | Get priority


<a name="comAtlassianJiraRestV2IssuePriorityResourceGetPrioritiesGet"></a>
# **comAtlassianJiraRestV2IssuePriorityResourceGetPrioritiesGet**
> kotlin.Array&lt;Priority&gt; comAtlassianJiraRestV2IssuePriorityResourceGetPrioritiesGet()

Get priorities

Returns the list of all issue priorities.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuePrioritiesApi()
try {
    val result : kotlin.Array<Priority> = apiInstance.comAtlassianJiraRestV2IssuePriorityResourceGetPrioritiesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuePrioritiesApi#comAtlassianJiraRestV2IssuePriorityResourceGetPrioritiesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuePrioritiesApi#comAtlassianJiraRestV2IssuePriorityResourceGetPrioritiesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Priority&gt;**](Priority.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssuePriorityResourceGetPriorityGet"></a>
# **comAtlassianJiraRestV2IssuePriorityResourceGetPriorityGet**
> Priority comAtlassianJiraRestV2IssuePriorityResourceGetPriorityGet(id)

Get priority

Returns an issue priority.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuePrioritiesApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the issue priority.
try {
    val result : Priority = apiInstance.comAtlassianJiraRestV2IssuePriorityResourceGetPriorityGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuePrioritiesApi#comAtlassianJiraRestV2IssuePriorityResourceGetPriorityGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuePrioritiesApi#comAtlassianJiraRestV2IssuePriorityResourceGetPriorityGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the issue priority. |

### Return type

[**Priority**](Priority.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

