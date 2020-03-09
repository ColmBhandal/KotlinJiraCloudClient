# WorkflowSchemesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemePost**](WorkflowSchemesApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemePost) | **POST** /rest/api/3/workflowscheme | Create workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDefaultWorkflowDelete**](WorkflowSchemesApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDefaultWorkflowDelete) | **DELETE** /rest/api/3/workflowscheme/{id}/default | Delete default workflow
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowMappingDelete**](WorkflowSchemesApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowMappingDelete) | **DELETE** /rest/api/3/workflowscheme/{id}/workflow | Delete issue types for workflow in workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDelete**](WorkflowSchemesApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDelete) | **DELETE** /rest/api/3/workflowscheme/{id} | Delete workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeIssueTypeDelete**](WorkflowSchemesApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeIssueTypeDelete) | **DELETE** /rest/api/3/workflowscheme/{id}/issuetype/{issueType} | Delete workflow for issue type in workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetAllWorkflowSchemesGet**](WorkflowSchemesApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetAllWorkflowSchemesGet) | **GET** /rest/api/3/workflowscheme | Get all workflow schemes
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDefaultWorkflowGet**](WorkflowSchemesApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDefaultWorkflowGet) | **GET** /rest/api/3/workflowscheme/{id}/default | Get default workflow
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowGet**](WorkflowSchemesApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowGet) | **GET** /rest/api/3/workflowscheme/{id}/workflow | Get issue types for workflows in workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeGet**](WorkflowSchemesApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeGet) | **GET** /rest/api/3/workflowscheme/{id} | Get workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeIssueTypeGet**](WorkflowSchemesApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeIssueTypeGet) | **GET** /rest/api/3/workflowscheme/{id}/issuetype/{issueType} | Get workflow for issue type in workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeIssueTypePut**](WorkflowSchemesApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeIssueTypePut) | **PUT** /rest/api/3/workflowscheme/{id}/issuetype/{issueType} | Set workflow for issue type in workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDefaultWorkflowPut**](WorkflowSchemesApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDefaultWorkflowPut) | **PUT** /rest/api/3/workflowscheme/{id}/default | Update default workflow
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowMappingPut**](WorkflowSchemesApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowMappingPut) | **PUT** /rest/api/3/workflowscheme/{id}/workflow | Set issue types for workflow in workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemePut**](WorkflowSchemesApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemePut) | **PUT** /rest/api/3/workflowscheme/{id} | Update workflow scheme


<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemePost"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemePost**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemePost(workflowScheme)

Create workflow scheme

Creates a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemesApi()
val workflowScheme : WorkflowScheme = {"defaultWorkflow":"jira","name":"Example workflow scheme","description":"The description of the example workflow scheme.","issueTypeMappings":{"10000":"scrum workflow","10001":"builds workflow"}} // WorkflowScheme | 
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemePost(workflowScheme)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowScheme** | [**WorkflowScheme**](WorkflowScheme.md)|  |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDefaultWorkflowDelete"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDefaultWorkflowDelete**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDefaultWorkflowDelete(id, updateDraftIfNeeded)

Delete default workflow

Resets the default workflow for a workflow scheme. That is, the default workflow is set to Jira&#39;s system workflow (the *jira* workflow).  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; and a draft workflow scheme is created or updated with the default workflow reset. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme.
val updateDraftIfNeeded : kotlin.Boolean = true // kotlin.Boolean | Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to `false`.
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDefaultWorkflowDelete(id, updateDraftIfNeeded)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDefaultWorkflowDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDefaultWorkflowDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme. |
 **updateDraftIfNeeded** | **kotlin.Boolean**| Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;. | [optional]

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowMappingDelete"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowMappingDelete**
> comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowMappingDelete(id, workflowName, updateDraftIfNeeded)

Delete issue types for workflow in workflow scheme

Deletes the workflow-issue type mapping for a workflow in a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; and a draft workflow scheme is created or updated with the workflow-issue type mapping deleted. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme.
val workflowName : kotlin.String = workflowName_example // kotlin.String | The name of the workflow.
val updateDraftIfNeeded : kotlin.Boolean = true // kotlin.Boolean | Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to `false`.
try {
    apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowMappingDelete(id, workflowName, updateDraftIfNeeded)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowMappingDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowMappingDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme. |
 **workflowName** | **kotlin.String**| The name of the workflow. |
 **updateDraftIfNeeded** | **kotlin.Boolean**| Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;. | [optional]

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDelete"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDelete**
> comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDelete(id)

Delete workflow scheme

Deletes a workflow scheme. Note that a workflow scheme cannot be deleted if it is active (that is, being used by at least one project).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as `schemeId`. For example, *schemeId=10301*.
try {
    apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDelete(id)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as &#x60;schemeId&#x60;. For example, *schemeId&#x3D;10301*. |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeIssueTypeDelete"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeIssueTypeDelete**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeIssueTypeDelete(id, issueType, updateDraftIfNeeded)

Delete workflow for issue type in workflow scheme

Deletes the issue type-workflow mapping for an issue type in a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; and a draft workflow scheme is created or updated with the issue type-workflow mapping deleted. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme.
val issueType : kotlin.String = issueType_example // kotlin.String | The ID of the issue type.
val updateDraftIfNeeded : kotlin.Boolean = true // kotlin.Boolean | Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to `false`.
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeIssueTypeDelete(id, issueType, updateDraftIfNeeded)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeIssueTypeDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeIssueTypeDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme. |
 **issueType** | **kotlin.String**| The ID of the issue type. |
 **updateDraftIfNeeded** | **kotlin.Boolean**| Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;. | [optional]

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetAllWorkflowSchemesGet"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetAllWorkflowSchemesGet**
> PageBeanWorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetAllWorkflowSchemesGet(startAt, maxResults)

Get all workflow schemes

Returns a paginated list of all workflow schemes, not including draft workflow schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemesApi()
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageBeanWorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetAllWorkflowSchemesGet(startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetAllWorkflowSchemesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetAllWorkflowSchemesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**PageBeanWorkflowScheme**](PageBeanWorkflowScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDefaultWorkflowGet"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDefaultWorkflowGet**
> DefaultWorkflow comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDefaultWorkflowGet(id, returnDraftIfExists)

Get default workflow

Returns the default workflow for a workflow scheme. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme.
val returnDraftIfExists : kotlin.Boolean = true // kotlin.Boolean | Set to `true` to return the default workflow for the workflow scheme's draft rather than scheme itself. If the workflow scheme does not have a draft, then the default workflow for the workflow scheme is returned.
try {
    val result : DefaultWorkflow = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDefaultWorkflowGet(id, returnDraftIfExists)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDefaultWorkflowGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDefaultWorkflowGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme. |
 **returnDraftIfExists** | **kotlin.Boolean**| Set to &#x60;true&#x60; to return the default workflow for the workflow scheme&#39;s draft rather than scheme itself. If the workflow scheme does not have a draft, then the default workflow for the workflow scheme is returned. | [optional] [default to false]

### Return type

[**DefaultWorkflow**](DefaultWorkflow.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowGet"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowGet**
> IssueTypesWorkflowMapping comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowGet(id, workflowName, returnDraftIfExists)

Get issue types for workflows in workflow scheme

Returns the workflow-issue type mappings for a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme.
val workflowName : kotlin.String = workflowName_example // kotlin.String | The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow.
val returnDraftIfExists : kotlin.Boolean = true // kotlin.Boolean | Returns the mapping from the workflow scheme's draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned.
try {
    val result : IssueTypesWorkflowMapping = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowGet(id, workflowName, returnDraftIfExists)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme. |
 **workflowName** | **kotlin.String**| The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow. | [optional]
 **returnDraftIfExists** | **kotlin.Boolean**| Returns the mapping from the workflow scheme&#39;s draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned. | [optional] [default to false]

### Return type

[**IssueTypesWorkflowMapping**](IssueTypesWorkflowMapping.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeGet"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeGet**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeGet(id, returnDraftIfExists)

Get workflow scheme

Returns a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as `schemeId`. For example, *schemeId=10301*.
val returnDraftIfExists : kotlin.Boolean = true // kotlin.Boolean | Returns the workflow scheme's draft rather than scheme itself, if set to true. If the workflow scheme does not have a draft, then the workflow scheme is returned.
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeGet(id, returnDraftIfExists)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as &#x60;schemeId&#x60;. For example, *schemeId&#x3D;10301*. |
 **returnDraftIfExists** | **kotlin.Boolean**| Returns the workflow scheme&#39;s draft rather than scheme itself, if set to true. If the workflow scheme does not have a draft, then the workflow scheme is returned. | [optional] [default to false]

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeIssueTypeGet"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeIssueTypeGet**
> IssueTypeWorkflowMapping comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeIssueTypeGet(id, issueType, returnDraftIfExists)

Get workflow for issue type in workflow scheme

Returns the issue type-workflow mapping for an issue type in a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme.
val issueType : kotlin.String = issueType_example // kotlin.String | The ID of the issue type.
val returnDraftIfExists : kotlin.Boolean = true // kotlin.Boolean | Returns the mapping from the workflow scheme's draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned.
try {
    val result : IssueTypeWorkflowMapping = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeIssueTypeGet(id, issueType, returnDraftIfExists)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeIssueTypeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeIssueTypeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme. |
 **issueType** | **kotlin.String**| The ID of the issue type. |
 **returnDraftIfExists** | **kotlin.Boolean**| Returns the mapping from the workflow scheme&#39;s draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned. | [optional] [default to false]

### Return type

[**IssueTypeWorkflowMapping**](IssueTypeWorkflowMapping.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeIssueTypePut"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeIssueTypePut**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeIssueTypePut(id, issueType, issueTypeWorkflowMapping)

Set workflow for issue type in workflow scheme

Sets the workflow for an issue type in a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; in the request body and a draft workflow scheme is created or updated with the new issue type-workflow mapping. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme.
val issueType : kotlin.String = issueType_example // kotlin.String | The ID of the issue type.
val issueTypeWorkflowMapping : IssueTypeWorkflowMapping = {"issueType":"10000","workflow":"jira","updateDraftIfNeeded":false} // IssueTypeWorkflowMapping | The issue type-project mapping.
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeIssueTypePut(id, issueType, issueTypeWorkflowMapping)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeIssueTypePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeIssueTypePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme. |
 **issueType** | **kotlin.String**| The ID of the issue type. |
 **issueTypeWorkflowMapping** | [**IssueTypeWorkflowMapping**](IssueTypeWorkflowMapping.md)| The issue type-project mapping. |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDefaultWorkflowPut"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDefaultWorkflowPut**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDefaultWorkflowPut(id, defaultWorkflow)

Update default workflow

Sets the default workflow for a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; in the request object and a draft workflow scheme is created or updated with the new default workflow. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme.
val defaultWorkflow : DefaultWorkflow = {"workflow":"jira","updateDraftIfNeeded":false} // DefaultWorkflow | The new default workflow.
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDefaultWorkflowPut(id, defaultWorkflow)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDefaultWorkflowPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDefaultWorkflowPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme. |
 **defaultWorkflow** | [**DefaultWorkflow**](DefaultWorkflow.md)| The new default workflow. |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowMappingPut"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowMappingPut**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowMappingPut(id, workflowName, issueTypesWorkflowMapping)

Set issue types for workflow in workflow scheme

Sets the issue types for a workflow in a workflow scheme. The workflow can also be set as the default workflow for the workflow scheme. Unmapped issues types are mapped to the default workflow.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; in the request body and a draft workflow scheme is created or updated with the new workflow-issue types mappings. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme.
val workflowName : kotlin.String = workflowName_example // kotlin.String | The name of the workflow.
val issueTypesWorkflowMapping : IssueTypesWorkflowMapping = {"workflow":"jira","updateDraftIfNeeded":true,"issueTypes":["10000"]} // IssueTypesWorkflowMapping | 
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowMappingPut(id, workflowName, issueTypesWorkflowMapping)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowMappingPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowMappingPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme. |
 **workflowName** | **kotlin.String**| The name of the workflow. |
 **issueTypesWorkflowMapping** | [**IssueTypesWorkflowMapping**](IssueTypesWorkflowMapping.md)|  |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemePut"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemePut**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemePut(id, workflowScheme)

Update workflow scheme

Updates a workflow scheme, including the name, default workflow, issue type to project mappings, and more. If the workflow scheme is active (that is, being used by at least one project), then a draft workflow scheme is created or updated instead, provided that &#x60;updateDraftIfNeeded&#x60; is set to &#x60;true&#x60;.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as `schemeId`. For example, *schemeId=10301*.
val workflowScheme : WorkflowScheme = {"defaultWorkflow":"jira","updateDraftIfNeeded":false,"name":"Example workflow scheme","description":"The description of the example workflow scheme.","issueTypeMappings":{"10000":"scrum workflow"}} // WorkflowScheme | 
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemePut(id, workflowScheme)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemesApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as &#x60;schemeId&#x60;. For example, *schemeId&#x3D;10301*. |
 **workflowScheme** | [**WorkflowScheme**](WorkflowScheme.md)|  |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

