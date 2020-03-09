# WorkflowStatusesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueStatusResourceGetStatusGet**](WorkflowStatusesApi.md#comAtlassianJiraRestV2IssueStatusResourceGetStatusGet) | **GET** /rest/api/3/status/{idOrName} | Get status
[**comAtlassianJiraRestV2IssueStatusResourceGetStatusesGet**](WorkflowStatusesApi.md#comAtlassianJiraRestV2IssueStatusResourceGetStatusesGet) | **GET** /rest/api/3/status | Get all statuses


<a name="comAtlassianJiraRestV2IssueStatusResourceGetStatusGet"></a>
# **comAtlassianJiraRestV2IssueStatusResourceGetStatusGet**
> StatusDetails comAtlassianJiraRestV2IssueStatusResourceGetStatusGet(idOrName)

Get status

Returns a status. The status must be associated with a workflow to be returned.  If a name is used on more than one status, only the status found first is returned. Therefore, identifying the status by its ID may be preferable.  This operation can be accessed anonymously.  [Permissions](#permissions) required: None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowStatusesApi()
val idOrName : kotlin.String = idOrName_example // kotlin.String | The ID or name of the status.
try {
    val result : StatusDetails = apiInstance.comAtlassianJiraRestV2IssueStatusResourceGetStatusGet(idOrName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowStatusesApi#comAtlassianJiraRestV2IssueStatusResourceGetStatusGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowStatusesApi#comAtlassianJiraRestV2IssueStatusResourceGetStatusGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrName** | **kotlin.String**| The ID or name of the status. |

### Return type

[**StatusDetails**](StatusDetails.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueStatusResourceGetStatusesGet"></a>
# **comAtlassianJiraRestV2IssueStatusResourceGetStatusesGet**
> kotlin.Array&lt;StatusDetails&gt; comAtlassianJiraRestV2IssueStatusResourceGetStatusesGet()

Get all statuses

Returns a list of all statuses associated with workflows.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowStatusesApi()
try {
    val result : kotlin.Array<StatusDetails> = apiInstance.comAtlassianJiraRestV2IssueStatusResourceGetStatusesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowStatusesApi#comAtlassianJiraRestV2IssueStatusResourceGetStatusesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowStatusesApi#comAtlassianJiraRestV2IssueStatusResourceGetStatusesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;StatusDetails&gt;**](StatusDetails.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

