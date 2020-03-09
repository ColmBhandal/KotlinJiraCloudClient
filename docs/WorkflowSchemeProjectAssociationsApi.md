# WorkflowSchemeProjectAssociationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2AdminWorkflowschemeProjectWorkflowSchemeProjectResourceGetWorkflowSchemeProjectAssociationsGet**](WorkflowSchemeProjectAssociationsApi.md#comAtlassianJiraRestV2AdminWorkflowschemeProjectWorkflowSchemeProjectResourceGetWorkflowSchemeProjectAssociationsGet) | **GET** /rest/api/3/workflowscheme/project | Get workflow scheme project associations


<a name="comAtlassianJiraRestV2AdminWorkflowschemeProjectWorkflowSchemeProjectResourceGetWorkflowSchemeProjectAssociationsGet"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeProjectWorkflowSchemeProjectResourceGetWorkflowSchemeProjectAssociationsGet**
> ContainerOfWorkflowSchemeAssociations comAtlassianJiraRestV2AdminWorkflowschemeProjectWorkflowSchemeProjectResourceGetWorkflowSchemeProjectAssociationsGet(projectId)

Get workflow scheme project associations

Returns a list of the workflow schemes associated with a list of projects. Each returned workflow scheme includes a list of the requested projects associated with it. Any next-gen or non-existent projects in the request are ignored and no errors are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemeProjectAssociationsApi()
val projectId : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | The ID of a project to return the workflow schemes for. To include multiple projects, provide an ampersand-Jim: oneseparated list. For example, `projectId=10000&projectId=10001`.
try {
    val result : ContainerOfWorkflowSchemeAssociations = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeProjectWorkflowSchemeProjectResourceGetWorkflowSchemeProjectAssociationsGet(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemeProjectAssociationsApi#comAtlassianJiraRestV2AdminWorkflowschemeProjectWorkflowSchemeProjectResourceGetWorkflowSchemeProjectAssociationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemeProjectAssociationsApi#comAtlassianJiraRestV2AdminWorkflowschemeProjectWorkflowSchemeProjectResourceGetWorkflowSchemeProjectAssociationsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**kotlin.collections.Set&lt;kotlin.Long&gt;**](kotlin.Long.md)| The ID of a project to return the workflow schemes for. To include multiple projects, provide an ampersand-Jim: oneseparated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. |

### Return type

[**ContainerOfWorkflowSchemeAssociations**](ContainerOfWorkflowSchemeAssociations.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

