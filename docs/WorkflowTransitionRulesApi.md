# WorkflowTransitionRulesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceGetWorkflowTransitionRuleConfigurationsGet**](WorkflowTransitionRulesApi.md#comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceGetWorkflowTransitionRuleConfigurationsGet) | **GET** /rest/api/3/workflow/rule/config | Get workflow transition rule configurations
[**comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceUpdateWorkflowTransitionRuleConfigurationsPut**](WorkflowTransitionRulesApi.md#comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceUpdateWorkflowTransitionRuleConfigurationsPut) | **PUT** /rest/api/3/workflow/rule/config | Update workflow transition rule configurations


<a name="comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceGetWorkflowTransitionRuleConfigurationsGet"></a>
# **comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceGetWorkflowTransitionRuleConfigurationsGet**
> PageBeanWorkflowTransitionRules comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceGetWorkflowTransitionRuleConfigurationsGet(types, startAt, maxResults, keys, expand)

Get workflow transition rule configurations

Returns a paginated list of workflows with transition rules. The workflows can be filtered to return only those containing workflow transition rules:   *  of one or more transition rule types, such as [workflow post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/).  *  matching one or more transition rule keys.  Only workflows containing transition rules created by the calling Connect app are returned. However, if a workflow is returned all transition rules that match the filters are returned for that workflow.  Due to server-side optimizations, workflows with an empty list of rules may be returned; these workflows can be ignored.  **[Permissions](#permissions) required:** Only Connect apps can use this operation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowTransitionRulesApi()
val types : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | The types of the transition rules to return.
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val keys : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | The transition rule class keys, as defined in the Connect app descriptor, of the transition rules to return.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information in the response. This parameter accepts `transition`, which, for each rule, returns information about the transition the rule is assigned to.
try {
    val result : PageBeanWorkflowTransitionRules = apiInstance.comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceGetWorkflowTransitionRuleConfigurationsGet(types, startAt, maxResults, keys, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowTransitionRulesApi#comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceGetWorkflowTransitionRuleConfigurationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowTransitionRulesApi#comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceGetWorkflowTransitionRuleConfigurationsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **types** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| The types of the transition rules to return. | [enum: postfunction, condition, validator]
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 10]
 **keys** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| The transition rule class keys, as defined in the Connect app descriptor, of the transition rules to return. | [optional]
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts &#x60;transition&#x60;, which, for each rule, returns information about the transition the rule is assigned to. | [optional]

### Return type

[**PageBeanWorkflowTransitionRules**](PageBeanWorkflowTransitionRules.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceUpdateWorkflowTransitionRuleConfigurationsPut"></a>
# **comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceUpdateWorkflowTransitionRuleConfigurationsPut**
> WorkflowTransitionRulesUpdateErrors comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceUpdateWorkflowTransitionRuleConfigurationsPut(workflowTransitionRulesUpdate)

Update workflow transition rule configurations

Updates configuration of workflow transition rules. The following rule types are supported:   *  [post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/)  *  [conditions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/)  *  [validators](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/)  Only rules created by the calling Connect app can be updated.  **[Permissions](#permissions) required:** Only Connect apps can use this operation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowTransitionRulesApi()
val workflowTransitionRulesUpdate : WorkflowTransitionRulesUpdate = {"workflows":[{"postFunctions":[{"configuration":{"value":"{ \"color\": \"red\" }"},"id":"b4d6cbdc-59f5-11e9-8647-d663bd873d93"}],"validators":[{"configuration":{"value":"{ \"shape\": \"square\" }"},"id":"11e9-59f5-b4d6cbdc-8647-d663bd873d93"}],"conditions":[{"configuration":{"value":"{ \"size\": \"medium\" }"},"id":"d663bd873d93-59f5-11e9-8647-b4d6cbdc"}],"workflowId":{"draft":false,"name":"My Workflow name"}}]} // WorkflowTransitionRulesUpdate | 
try {
    val result : WorkflowTransitionRulesUpdateErrors = apiInstance.comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceUpdateWorkflowTransitionRuleConfigurationsPut(workflowTransitionRulesUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowTransitionRulesApi#comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceUpdateWorkflowTransitionRuleConfigurationsPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowTransitionRulesApi#comAtlassianJiraRestV2AdminWorkflowWorkflowRuleConfigResourceUpdateWorkflowTransitionRuleConfigurationsPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowTransitionRulesUpdate** | [**WorkflowTransitionRulesUpdate**](WorkflowTransitionRulesUpdate.md)|  |

### Return type

[**WorkflowTransitionRulesUpdateErrors**](WorkflowTransitionRulesUpdateErrors.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

