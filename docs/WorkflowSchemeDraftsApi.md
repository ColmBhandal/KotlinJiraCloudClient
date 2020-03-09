# WorkflowSchemeDraftsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemeDraftFromParentPost**](WorkflowSchemeDraftsApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemeDraftFromParentPost) | **POST** /rest/api/3/workflowscheme/{id}/createdraft | Create draft workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftDefaultWorkflowDelete**](WorkflowSchemeDraftsApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftDefaultWorkflowDelete) | **DELETE** /rest/api/3/workflowscheme/{id}/draft/default | Delete draft default workflow
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftWorkflowMappingDelete**](WorkflowSchemeDraftsApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftWorkflowMappingDelete) | **DELETE** /rest/api/3/workflowscheme/{id}/draft/workflow | Delete issue types for workflow in draft workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftDelete**](WorkflowSchemeDraftsApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftDelete) | **DELETE** /rest/api/3/workflowscheme/{id}/draft | Delete draft workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftIssueTypeDelete**](WorkflowSchemeDraftsApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftIssueTypeDelete) | **DELETE** /rest/api/3/workflowscheme/{id}/draft/issuetype/{issueType} | Delete workflow for issue type in draft workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftDefaultWorkflowGet**](WorkflowSchemeDraftsApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftDefaultWorkflowGet) | **GET** /rest/api/3/workflowscheme/{id}/draft/default | Get draft default workflow
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftWorkflowGet**](WorkflowSchemeDraftsApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftWorkflowGet) | **GET** /rest/api/3/workflowscheme/{id}/draft/workflow | Get issue types for workflows in draft workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftGet**](WorkflowSchemeDraftsApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftGet) | **GET** /rest/api/3/workflowscheme/{id}/draft | Get draft workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftIssueTypeGet**](WorkflowSchemeDraftsApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftIssueTypeGet) | **GET** /rest/api/3/workflowscheme/{id}/draft/issuetype/{issueType} | Get workflow for issue type in draft workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeDraftIssueTypePut**](WorkflowSchemeDraftsApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeDraftIssueTypePut) | **PUT** /rest/api/3/workflowscheme/{id}/draft/issuetype/{issueType} | Set workflow for issue type in draft workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftDefaultWorkflowPut**](WorkflowSchemeDraftsApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftDefaultWorkflowPut) | **PUT** /rest/api/3/workflowscheme/{id}/draft/default | Update draft default workflow
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftWorkflowMappingPut**](WorkflowSchemeDraftsApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftWorkflowMappingPut) | **PUT** /rest/api/3/workflowscheme/{id}/draft/workflow | Set issue types for workflow in workflow scheme
[**comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemeDraftPut**](WorkflowSchemeDraftsApi.md#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemeDraftPut) | **PUT** /rest/api/3/workflowscheme/{id}/draft | Update draft workflow scheme


<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemeDraftFromParentPost"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemeDraftFromParentPost**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemeDraftFromParentPost(id)

Create draft workflow scheme

Create a draft workflow scheme from an active workflow scheme, by copying the active workflow scheme. Note that an active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemeDraftsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the active workflow scheme that the draft is created from.
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemeDraftFromParentPost(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemeDraftFromParentPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceCreateWorkflowSchemeDraftFromParentPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the active workflow scheme that the draft is created from. |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftDefaultWorkflowDelete"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftDefaultWorkflowDelete**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftDefaultWorkflowDelete(id)

Delete draft default workflow

Resets the default workflow for a workflow scheme&#39;s draft. That is, the default workflow is set to Jira&#39;s system workflow (the *jira* workflow).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemeDraftsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme that the draft belongs to.
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftDefaultWorkflowDelete(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftDefaultWorkflowDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftDefaultWorkflowDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme that the draft belongs to. |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftWorkflowMappingDelete"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftWorkflowMappingDelete**
> comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftWorkflowMappingDelete(id, workflowName)

Delete issue types for workflow in draft workflow scheme

Deletes the workflow-issue type mapping for a workflow in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemeDraftsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme that the draft belongs to.
val workflowName : kotlin.String = workflowName_example // kotlin.String | The name of the workflow.
try {
    apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftWorkflowMappingDelete(id, workflowName)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftWorkflowMappingDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteDraftWorkflowMappingDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme that the draft belongs to. |
 **workflowName** | **kotlin.String**| The name of the workflow. |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftDelete"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftDelete**
> comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftDelete(id)

Delete draft workflow scheme

Deletes a draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemeDraftsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the active workflow scheme that the draft was created from.
try {
    apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftDelete(id)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the active workflow scheme that the draft was created from. |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftIssueTypeDelete"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftIssueTypeDelete**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftIssueTypeDelete(id, issueType)

Delete workflow for issue type in draft workflow scheme

Deletes the issue type-workflow mapping for an issue type in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemeDraftsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme that the draft belongs to.
val issueType : kotlin.String = issueType_example // kotlin.String | The ID of the issue type.
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftIssueTypeDelete(id, issueType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftIssueTypeDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceDeleteWorkflowSchemeDraftIssueTypeDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme that the draft belongs to. |
 **issueType** | **kotlin.String**| The ID of the issue type. |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftDefaultWorkflowGet"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftDefaultWorkflowGet**
> DefaultWorkflow comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftDefaultWorkflowGet(id)

Get draft default workflow

Returns the default workflow for a workflow scheme&#39;s draft. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemeDraftsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme that the draft belongs to.
try {
    val result : DefaultWorkflow = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftDefaultWorkflowGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftDefaultWorkflowGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftDefaultWorkflowGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme that the draft belongs to. |

### Return type

[**DefaultWorkflow**](DefaultWorkflow.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftWorkflowGet"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftWorkflowGet**
> IssueTypesWorkflowMapping comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftWorkflowGet(id, workflowName)

Get issue types for workflows in draft workflow scheme

Returns the workflow-issue type mappings for a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemeDraftsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme that the draft belongs to.
val workflowName : kotlin.String = workflowName_example // kotlin.String | The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow.
try {
    val result : IssueTypesWorkflowMapping = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftWorkflowGet(id, workflowName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftWorkflowGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetDraftWorkflowGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme that the draft belongs to. |
 **workflowName** | **kotlin.String**| The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow. | [optional]

### Return type

[**IssueTypesWorkflowMapping**](IssueTypesWorkflowMapping.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftGet"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftGet**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftGet(id)

Get draft workflow scheme

Returns the draft workflow scheme for an active workflow scheme. Draft workflow schemes allow changes to be made to the active workflow schemes: When an active workflow scheme is updated, a draft copy is created. The draft is modified, then the changes in the draft are copied back to the active workflow scheme. See [Configuring workflow schemes](https://confluence.atlassian.com/x/tohKLg) for more information.   Note that:   *  Only active workflow schemes can have draft workflow schemes.  *  An active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemeDraftsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the active workflow scheme that the draft was created from.
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the active workflow scheme that the draft was created from. |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftIssueTypeGet"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftIssueTypeGet**
> IssueTypeWorkflowMapping comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftIssueTypeGet(id, issueType)

Get workflow for issue type in draft workflow scheme

Returns the issue type-workflow mapping for an issue type in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemeDraftsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme that the draft belongs to.
val issueType : kotlin.String = issueType_example // kotlin.String | The ID of the issue type.
try {
    val result : IssueTypeWorkflowMapping = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftIssueTypeGet(id, issueType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftIssueTypeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceGetWorkflowSchemeDraftIssueTypeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme that the draft belongs to. |
 **issueType** | **kotlin.String**| The ID of the issue type. |

### Return type

[**IssueTypeWorkflowMapping**](IssueTypeWorkflowMapping.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeDraftIssueTypePut"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeDraftIssueTypePut**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeDraftIssueTypePut(id, issueType, issueTypeWorkflowMapping)

Set workflow for issue type in draft workflow scheme

Sets the workflow for an issue type in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemeDraftsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme that the draft belongs to.
val issueType : kotlin.String = issueType_example // kotlin.String | The ID of the issue type.
val issueTypeWorkflowMapping : IssueTypeWorkflowMapping = {"issueType":"10000","workflow":"jira","updateDraftIfNeeded":false} // IssueTypeWorkflowMapping | The issue type-project mapping.
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeDraftIssueTypePut(id, issueType, issueTypeWorkflowMapping)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeDraftIssueTypePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceSetWorkflowSchemeDraftIssueTypePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme that the draft belongs to. |
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

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftDefaultWorkflowPut"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftDefaultWorkflowPut**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftDefaultWorkflowPut(id, defaultWorkflow)

Update draft default workflow

Sets the default workflow for a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemeDraftsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme that the draft belongs to.
val defaultWorkflow : DefaultWorkflow = {"workflow":"jira","updateDraftIfNeeded":false} // DefaultWorkflow | The object for the new default workflow.
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftDefaultWorkflowPut(id, defaultWorkflow)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftDefaultWorkflowPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftDefaultWorkflowPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme that the draft belongs to. |
 **defaultWorkflow** | [**DefaultWorkflow**](DefaultWorkflow.md)| The object for the new default workflow. |

### Return type

[**WorkflowScheme**](WorkflowScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftWorkflowMappingPut"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftWorkflowMappingPut**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftWorkflowMappingPut(id, workflowName, issueTypesWorkflowMapping)

Set issue types for workflow in workflow scheme

Sets the issue types for a workflow in a workflow scheme&#39;s draft. The workflow can also be set as the default workflow for the draft workflow scheme. Unmapped issues types are mapped to the default workflow.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemeDraftsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the workflow scheme that the draft belongs to.
val workflowName : kotlin.String = workflowName_example // kotlin.String | The name of the workflow.
val issueTypesWorkflowMapping : IssueTypesWorkflowMapping = {"workflow":"jira","updateDraftIfNeeded":true,"issueTypes":["10000"]} // IssueTypesWorkflowMapping | 
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftWorkflowMappingPut(id, workflowName, issueTypesWorkflowMapping)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftWorkflowMappingPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateDraftWorkflowMappingPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the workflow scheme that the draft belongs to. |
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

<a name="comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemeDraftPut"></a>
# **comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemeDraftPut**
> WorkflowScheme comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemeDraftPut(id, workflowScheme)

Update draft workflow scheme

Updates a draft workflow scheme. If a draft workflow scheme does not exist for the active workflow scheme, then a draft is created. Note that an active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowSchemeDraftsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the active workflow scheme that the draft was created from.
val workflowScheme : WorkflowScheme = {"defaultWorkflow":"jira","updateDraftIfNeeded":false,"name":"Example workflow scheme","description":"The description of the example workflow scheme.","issueTypeMappings":{"10000":"scrum workflow"}} // WorkflowScheme | 
try {
    val result : WorkflowScheme = apiInstance.comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemeDraftPut(id, workflowScheme)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemeDraftPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowSchemeDraftsApi#comAtlassianJiraRestV2AdminWorkflowschemeWorkflowSchemeResourceUpdateWorkflowSchemeDraftPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the active workflow scheme that the draft was created from. |
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

