# WorkflowsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2AdminWorkflowWorkflowSearchResourceGetWorkflowsPaginatedGet**](WorkflowsApi.md#comAtlassianJiraRestV2AdminWorkflowWorkflowSearchResourceGetWorkflowsPaginatedGet) | **GET** /rest/api/3/workflow/search | Get workflows paginated
[**comAtlassianJiraRestV2AdminWorkflowsResourceGetAllWorkflowsGet**](WorkflowsApi.md#comAtlassianJiraRestV2AdminWorkflowsResourceGetAllWorkflowsGet) | **GET** /rest/api/3/workflow | Get all workflows


<a name="comAtlassianJiraRestV2AdminWorkflowWorkflowSearchResourceGetWorkflowsPaginatedGet"></a>
# **comAtlassianJiraRestV2AdminWorkflowWorkflowSearchResourceGetWorkflowsPaginatedGet**
> PageBeanWorkflow comAtlassianJiraRestV2AdminWorkflowWorkflowSearchResourceGetWorkflowsPaginatedGet(startAt, maxResults, workflowName, expand)

Get workflows paginated

Returns a [paginated](#pagination) list of published classic workflows. When workflow names are specified, details of those workflows are returned. Otherwise, all published classic workflows are returned.  This operation does not return next-gen workflows.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowsApi()
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val workflowName : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | The name of a workflow to return.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `transitions` For each workflow, returns information about the transitions inside the workflow.  *  `transitions.rules` For each workflow transition, returns information about its rules. Transitions are included automatically if this expand is requested.  *  `statuses` For each workflow, returns information about the statuses inside the workflow.  *  `statuses.properties` For each workflow status, returns information about its properties. Statuses are included automatically if this expand is requested.
try {
    val result : PageBeanWorkflow = apiInstance.comAtlassianJiraRestV2AdminWorkflowWorkflowSearchResourceGetWorkflowsPaginatedGet(startAt, maxResults, workflowName, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#comAtlassianJiraRestV2AdminWorkflowWorkflowSearchResourceGetWorkflowsPaginatedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#comAtlassianJiraRestV2AdminWorkflowWorkflowSearchResourceGetWorkflowsPaginatedGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]
 **workflowName** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| The name of a workflow to return. | [optional]
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;transitions&#x60; For each workflow, returns information about the transitions inside the workflow.  *  &#x60;transitions.rules&#x60; For each workflow transition, returns information about its rules. Transitions are included automatically if this expand is requested.  *  &#x60;statuses&#x60; For each workflow, returns information about the statuses inside the workflow.  *  &#x60;statuses.properties&#x60; For each workflow status, returns information about its properties. Statuses are included automatically if this expand is requested. | [optional]

### Return type

[**PageBeanWorkflow**](PageBeanWorkflow.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowsResourceGetAllWorkflowsGet"></a>
# **comAtlassianJiraRestV2AdminWorkflowsResourceGetAllWorkflowsGet**
> kotlin.Array&lt;DeprecatedWorkflow&gt; comAtlassianJiraRestV2AdminWorkflowsResourceGetAllWorkflowsGet(workflowName)

Get all workflows

Returns all workflows in Jira or a workflow. Deprecated, use [Get workflows paginated](#api-rest-api-3-workflow-search-get).  If the &#x60;workflowName&#x60; parameter is specified, the workflow is returned as an object (not in an array). Otherwise, an array of workflow objects is returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowsApi()
val workflowName : kotlin.String = workflowName_example // kotlin.String | The name of the workflow to be returned. Only one workflow can be specified.
try {
    val result : kotlin.Array<DeprecatedWorkflow> = apiInstance.comAtlassianJiraRestV2AdminWorkflowsResourceGetAllWorkflowsGet(workflowName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#comAtlassianJiraRestV2AdminWorkflowsResourceGetAllWorkflowsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#comAtlassianJiraRestV2AdminWorkflowsResourceGetAllWorkflowsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowName** | **kotlin.String**| The name of the workflow to be returned. Only one workflow can be specified. | [optional]

### Return type

[**kotlin.Array&lt;DeprecatedWorkflow&gt;**](DeprecatedWorkflow.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

