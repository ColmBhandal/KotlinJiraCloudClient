# IssueTypeSchemesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueIssuetypeschemeIssueTypeSchemeResourceGetIssueTypeSchemeForProjectsGet**](IssueTypeSchemesApi.md#comAtlassianJiraRestV2IssueIssuetypeschemeIssueTypeSchemeResourceGetIssueTypeSchemeForProjectsGet) | **GET** /rest/api/3/issuetypescheme/project | Get issue type schemes for projects


<a name="comAtlassianJiraRestV2IssueIssuetypeschemeIssueTypeSchemeResourceGetIssueTypeSchemeForProjectsGet"></a>
# **comAtlassianJiraRestV2IssueIssuetypeschemeIssueTypeSchemeResourceGetIssueTypeSchemeForProjectsGet**
> PageBeanIssueTypeSchemeProjects comAtlassianJiraRestV2IssueIssuetypeschemeIssueTypeSchemeResourceGetIssueTypeSchemeForProjectsGet(startAt, maxResults, projectId)

Get issue type schemes for projects

Returns a list of issue type schemes and, for each issue type scheme, a list of the projects that use it.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueTypeSchemesApi()
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val projectId : kotlin.Array<kotlin.Long> =  // kotlin.Array<kotlin.Long> | The list of project IDs. To include multiple projects, separate IDs with ampersand: `projectId=10000&projectId=10001`.
try {
    val result : PageBeanIssueTypeSchemeProjects = apiInstance.comAtlassianJiraRestV2IssueIssuetypeschemeIssueTypeSchemeResourceGetIssueTypeSchemeForProjectsGet(startAt, maxResults, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueTypeSchemesApi#comAtlassianJiraRestV2IssueIssuetypeschemeIssueTypeSchemeResourceGetIssueTypeSchemeForProjectsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueTypeSchemesApi#comAtlassianJiraRestV2IssueIssuetypeschemeIssueTypeSchemeResourceGetIssueTypeSchemeForProjectsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]
 **projectId** | [**kotlin.Array&lt;kotlin.Long&gt;**](kotlin.Long.md)| The list of project IDs. To include multiple projects, separate IDs with ampersand: &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. | [optional]

### Return type

[**PageBeanIssueTypeSchemeProjects**](PageBeanIssueTypeSchemeProjects.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

