# IssueSecurityLevelApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueIssueSecurityLevelResourceGetIssueSecurityLevelGet**](IssueSecurityLevelApi.md#comAtlassianJiraRestV2IssueIssueSecurityLevelResourceGetIssueSecurityLevelGet) | **GET** /rest/api/3/securitylevel/{id} | Get issue security level


<a name="comAtlassianJiraRestV2IssueIssueSecurityLevelResourceGetIssueSecurityLevelGet"></a>
# **comAtlassianJiraRestV2IssueIssueSecurityLevelResourceGetIssueSecurityLevelGet**
> SecurityLevel comAtlassianJiraRestV2IssueIssueSecurityLevelResourceGetIssueSecurityLevelGet(id)

Get issue security level

Returns details of an issue security level.  Use [Get issue security scheme](#api-rest-api-3-issuesecurityschemes-id-get) to obtain the IDs of issue security levels associated with the issue security scheme.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueSecurityLevelApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the issue security level.
try {
    val result : SecurityLevel = apiInstance.comAtlassianJiraRestV2IssueIssueSecurityLevelResourceGetIssueSecurityLevelGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueSecurityLevelApi#comAtlassianJiraRestV2IssueIssueSecurityLevelResourceGetIssueSecurityLevelGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueSecurityLevelApi#comAtlassianJiraRestV2IssueIssueSecurityLevelResourceGetIssueSecurityLevelGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the issue security level. |

### Return type

[**SecurityLevel**](SecurityLevel.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

