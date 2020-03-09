# WorkflowTransitionPropertiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2AdminWorkflowTransitionResourceCreateWorkflowTransitionPropertyPost**](WorkflowTransitionPropertiesApi.md#comAtlassianJiraRestV2AdminWorkflowTransitionResourceCreateWorkflowTransitionPropertyPost) | **POST** /rest/api/3/workflow/transitions/{transitionId}/properties | Create workflow transition property
[**comAtlassianJiraRestV2AdminWorkflowTransitionResourceDeleteWorkflowTransitionPropertyDelete**](WorkflowTransitionPropertiesApi.md#comAtlassianJiraRestV2AdminWorkflowTransitionResourceDeleteWorkflowTransitionPropertyDelete) | **DELETE** /rest/api/3/workflow/transitions/{transitionId}/properties | Delete workflow transition property
[**comAtlassianJiraRestV2AdminWorkflowTransitionResourceGetWorkflowTransitionPropertiesGet**](WorkflowTransitionPropertiesApi.md#comAtlassianJiraRestV2AdminWorkflowTransitionResourceGetWorkflowTransitionPropertiesGet) | **GET** /rest/api/3/workflow/transitions/{transitionId}/properties | Get workflow transition properties
[**comAtlassianJiraRestV2AdminWorkflowTransitionResourceUpdateWorkflowTransitionPropertyPut**](WorkflowTransitionPropertiesApi.md#comAtlassianJiraRestV2AdminWorkflowTransitionResourceUpdateWorkflowTransitionPropertyPut) | **PUT** /rest/api/3/workflow/transitions/{transitionId}/properties | Update workflow transition property


<a name="comAtlassianJiraRestV2AdminWorkflowTransitionResourceCreateWorkflowTransitionPropertyPost"></a>
# **comAtlassianJiraRestV2AdminWorkflowTransitionResourceCreateWorkflowTransitionPropertyPost**
> WorkflowTransitionProperty comAtlassianJiraRestV2AdminWorkflowTransitionResourceCreateWorkflowTransitionPropertyPost(transitionId, key, workflowName, requestBody, workflowMode)

Create workflow transition property

Adds a property to a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowTransitionPropertiesApi()
val transitionId : kotlin.Long = 789 // kotlin.Long | The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
val key : kotlin.String = key_example // kotlin.String | The key of the property being added, also known as the name of the property. Set this to the same value as the `key` defined in the request body.
val workflowName : kotlin.String = workflowName_example // kotlin.String | The name of the workflow that the transition belongs to.
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"value":"createissue"} // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
val workflowMode : kotlin.String = workflowMode_example // kotlin.String | The workflow status. Set to *live* for inactive workflows or *draft* for draft workflows. Active workflows cannot be edited.
try {
    val result : WorkflowTransitionProperty = apiInstance.comAtlassianJiraRestV2AdminWorkflowTransitionResourceCreateWorkflowTransitionPropertyPost(transitionId, key, workflowName, requestBody, workflowMode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowTransitionPropertiesApi#comAtlassianJiraRestV2AdminWorkflowTransitionResourceCreateWorkflowTransitionPropertyPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowTransitionPropertiesApi#comAtlassianJiraRestV2AdminWorkflowTransitionResourceCreateWorkflowTransitionPropertyPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transitionId** | **kotlin.Long**| The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition. |
 **key** | **kotlin.String**| The key of the property being added, also known as the name of the property. Set this to the same value as the &#x60;key&#x60; defined in the request body. |
 **workflowName** | **kotlin.String**| The name of the workflow that the transition belongs to. |
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  |
 **workflowMode** | **kotlin.String**| The workflow status. Set to *live* for inactive workflows or *draft* for draft workflows. Active workflows cannot be edited. | [optional] [default to &#39;live&#39;] [enum: live, draft]

### Return type

[**WorkflowTransitionProperty**](WorkflowTransitionProperty.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowTransitionResourceDeleteWorkflowTransitionPropertyDelete"></a>
# **comAtlassianJiraRestV2AdminWorkflowTransitionResourceDeleteWorkflowTransitionPropertyDelete**
> comAtlassianJiraRestV2AdminWorkflowTransitionResourceDeleteWorkflowTransitionPropertyDelete(transitionId, key, workflowName, workflowMode)

Delete workflow transition property

Deletes a property from a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowTransitionPropertiesApi()
val transitionId : kotlin.Long = 789 // kotlin.Long | The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
val key : kotlin.String = key_example // kotlin.String | The name of the transition property to delete, also known as the name of the property.
val workflowName : kotlin.String = workflowName_example // kotlin.String | The name of the workflow that the transition belongs to.
val workflowMode : kotlin.String = workflowMode_example // kotlin.String | The workflow status. Set to `live` for inactive workflows or `draft` for draft workflows. Active workflows cannot be edited.
try {
    apiInstance.comAtlassianJiraRestV2AdminWorkflowTransitionResourceDeleteWorkflowTransitionPropertyDelete(transitionId, key, workflowName, workflowMode)
} catch (e: ClientException) {
    println("4xx response calling WorkflowTransitionPropertiesApi#comAtlassianJiraRestV2AdminWorkflowTransitionResourceDeleteWorkflowTransitionPropertyDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowTransitionPropertiesApi#comAtlassianJiraRestV2AdminWorkflowTransitionResourceDeleteWorkflowTransitionPropertyDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transitionId** | **kotlin.Long**| The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition. |
 **key** | **kotlin.String**| The name of the transition property to delete, also known as the name of the property. |
 **workflowName** | **kotlin.String**| The name of the workflow that the transition belongs to. |
 **workflowMode** | **kotlin.String**| The workflow status. Set to &#x60;live&#x60; for inactive workflows or &#x60;draft&#x60; for draft workflows. Active workflows cannot be edited. | [optional] [enum: live, draft]

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2AdminWorkflowTransitionResourceGetWorkflowTransitionPropertiesGet"></a>
# **comAtlassianJiraRestV2AdminWorkflowTransitionResourceGetWorkflowTransitionPropertiesGet**
> WorkflowTransitionProperty comAtlassianJiraRestV2AdminWorkflowTransitionResourceGetWorkflowTransitionPropertiesGet(transitionId, workflowName, includeReservedKeys, key, workflowMode)

Get workflow transition properties

Returns the properties on a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowTransitionPropertiesApi()
val transitionId : kotlin.Long = 789 // kotlin.Long | The ID of the transition. To get the ID, view the workflow in text mode in the Jira administration console. The ID is shown next to the transition.
val workflowName : kotlin.String = workflowName_example // kotlin.String | The name of the workflow that the transition belongs to.
val includeReservedKeys : kotlin.Boolean = true // kotlin.Boolean | Some properties with keys that have the *jira.* prefix are reserved, which means they are not editable. To include these properties in the results, set this parameter to *true*.
val key : kotlin.String = key_example // kotlin.String | The key of the property being returned, also known as the name of the property. If this parameter is not specified, all properties on the transition are returned.
val workflowMode : kotlin.String = workflowMode_example // kotlin.String | The workflow status. Set to *live* for active and inactive workflows, or *draft* for draft workflows.
try {
    val result : WorkflowTransitionProperty = apiInstance.comAtlassianJiraRestV2AdminWorkflowTransitionResourceGetWorkflowTransitionPropertiesGet(transitionId, workflowName, includeReservedKeys, key, workflowMode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowTransitionPropertiesApi#comAtlassianJiraRestV2AdminWorkflowTransitionResourceGetWorkflowTransitionPropertiesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowTransitionPropertiesApi#comAtlassianJiraRestV2AdminWorkflowTransitionResourceGetWorkflowTransitionPropertiesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transitionId** | **kotlin.Long**| The ID of the transition. To get the ID, view the workflow in text mode in the Jira administration console. The ID is shown next to the transition. |
 **workflowName** | **kotlin.String**| The name of the workflow that the transition belongs to. |
 **includeReservedKeys** | **kotlin.Boolean**| Some properties with keys that have the *jira.* prefix are reserved, which means they are not editable. To include these properties in the results, set this parameter to *true*. | [optional] [default to false]
 **key** | **kotlin.String**| The key of the property being returned, also known as the name of the property. If this parameter is not specified, all properties on the transition are returned. | [optional]
 **workflowMode** | **kotlin.String**| The workflow status. Set to *live* for active and inactive workflows, or *draft* for draft workflows. | [optional] [default to &#39;live&#39;] [enum: live, draft]

### Return type

[**WorkflowTransitionProperty**](WorkflowTransitionProperty.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowTransitionResourceUpdateWorkflowTransitionPropertyPut"></a>
# **comAtlassianJiraRestV2AdminWorkflowTransitionResourceUpdateWorkflowTransitionPropertyPut**
> WorkflowTransitionProperty comAtlassianJiraRestV2AdminWorkflowTransitionResourceUpdateWorkflowTransitionPropertyPut(transitionId, key, workflowName, requestBody, workflowMode)

Update workflow transition property

Updates a workflow transition by changing the property value. Trying to update a property that does not exist results in a new property being added to the transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowTransitionPropertiesApi()
val transitionId : kotlin.Long = 789 // kotlin.Long | The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
val key : kotlin.String = key_example // kotlin.String | The key of the property being updated, also known as the name of the property. Set this to the same value as the `key` defined in the request body.
val workflowName : kotlin.String = workflowName_example // kotlin.String | The name of the workflow that the transition belongs to.
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"value":"createissue"} // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
val workflowMode : kotlin.String = workflowMode_example // kotlin.String | The workflow status. Set to `live` for inactive workflows or `draft` for draft workflows. Active workflows cannot be edited.
try {
    val result : WorkflowTransitionProperty = apiInstance.comAtlassianJiraRestV2AdminWorkflowTransitionResourceUpdateWorkflowTransitionPropertyPut(transitionId, key, workflowName, requestBody, workflowMode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowTransitionPropertiesApi#comAtlassianJiraRestV2AdminWorkflowTransitionResourceUpdateWorkflowTransitionPropertyPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowTransitionPropertiesApi#comAtlassianJiraRestV2AdminWorkflowTransitionResourceUpdateWorkflowTransitionPropertyPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transitionId** | **kotlin.Long**| The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition. |
 **key** | **kotlin.String**| The key of the property being updated, also known as the name of the property. Set this to the same value as the &#x60;key&#x60; defined in the request body. |
 **workflowName** | **kotlin.String**| The name of the workflow that the transition belongs to. |
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  |
 **workflowMode** | **kotlin.String**| The workflow status. Set to &#x60;live&#x60; for inactive workflows or &#x60;draft&#x60; for draft workflows. Active workflows cannot be edited. | [optional] [enum: live, draft]

### Return type

[**WorkflowTransitionProperty**](WorkflowTransitionProperty.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

