# IssueSecuritySchemesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemeGet**](IssueSecuritySchemesApi.md#comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemeGet) | **GET** /rest/api/3/issuesecurityschemes/{id} | Get issue security scheme
[**comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemesGet**](IssueSecuritySchemesApi.md#comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemesGet) | **GET** /rest/api/3/issuesecurityschemes | Get issue security schemes


<a name="comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemeGet"></a>
# **comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemeGet**
> SecurityScheme comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemeGet(id)

Get issue security scheme

Returns an issue security scheme along with its security levels.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project that uses the requested issue security scheme.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueSecuritySchemesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) operation to get a list of issue security scheme IDs.
try {
    val result : SecurityScheme = apiInstance.comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemeGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueSecuritySchemesApi#comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueSecuritySchemesApi#comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) operation to get a list of issue security scheme IDs. |

### Return type

[**SecurityScheme**](SecurityScheme.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemesGet"></a>
# **comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemesGet**
> SecuritySchemes comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemesGet()

Get issue security schemes

Returns all [issue security schemes](https://confluence.atlassian.com/x/J4lKLg).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueSecuritySchemesApi()
try {
    val result : SecuritySchemes = apiInstance.comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueSecuritySchemesApi#comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueSecuritySchemesApi#comAtlassianJiraRestV2IssueIssueSecuritySchemeResourceGetIssueSecuritySchemesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SecuritySchemes**](SecuritySchemes.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

