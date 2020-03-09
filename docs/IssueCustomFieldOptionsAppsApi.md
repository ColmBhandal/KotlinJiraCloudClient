# IssueCustomFieldOptionsAppsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceCreateIssueFieldOptionPost**](IssueCustomFieldOptionsAppsApi.md#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceCreateIssueFieldOptionPost) | **POST** /rest/api/3/field/{fieldKey}/option | Create issue field option
[**comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceDeleteIssueFieldOptionDelete**](IssueCustomFieldOptionsAppsApi.md#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceDeleteIssueFieldOptionDelete) | **DELETE** /rest/api/3/field/{fieldKey}/option/{optionId} | Delete issue field option
[**comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetAllIssueFieldOptionsGet**](IssueCustomFieldOptionsAppsApi.md#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetAllIssueFieldOptionsGet) | **GET** /rest/api/3/field/{fieldKey}/option | Get all issue field options
[**comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetIssueFieldOptionGet**](IssueCustomFieldOptionsAppsApi.md#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetIssueFieldOptionGet) | **GET** /rest/api/3/field/{fieldKey}/option/{optionId} | Get issue field option
[**comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetSelectableIssueFieldOptionsGet**](IssueCustomFieldOptionsAppsApi.md#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetSelectableIssueFieldOptionsGet) | **GET** /rest/api/3/field/{fieldKey}/option/suggestions/edit | Get selectable issue field options
[**comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetVisibleIssueFieldOptionsGet**](IssueCustomFieldOptionsAppsApi.md#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetVisibleIssueFieldOptionsGet) | **GET** /rest/api/3/field/{fieldKey}/option/suggestions/search | Get visible issue field options
[**comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceReplaceIssueFieldOptionDelete**](IssueCustomFieldOptionsAppsApi.md#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceReplaceIssueFieldOptionDelete) | **DELETE** /rest/api/3/field/{fieldKey}/option/{optionId}/issue | Replace issue field option
[**comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceUpdateIssueFieldOptionPut**](IssueCustomFieldOptionsAppsApi.md#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceUpdateIssueFieldOptionPut) | **PUT** /rest/api/3/field/{fieldKey}/option/{optionId} | Update issue field option


<a name="comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceCreateIssueFieldOptionPost"></a>
# **comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceCreateIssueFieldOptionPost**
> IssueFieldOption comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceCreateIssueFieldOptionPost(fieldKey, requestBody)

Create issue field option

Creates an option for a select list issue field.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCustomFieldOptionsAppsApi()
val fieldKey : kotlin.String = fieldKey_example // kotlin.String | The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the `fieldKey` value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the `jiraIssueFields` module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in `key`. For example, `\"key\": \"teams-add-on__team-issue-field\"`
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"value":"Team 1","config":{"scope":{"projects2":[{"attributes":["notSelectable"],"id":1001},{"attributes":["notSelectable"],"id":1002}],"projects":[],"global":{}},"attributes":[]},"properties":{"leader":{"name":"Leader Name","email":"lname@example.com"},"members":42,"founded":"2016-06-06T00:00:00.000Z","description":"The team's description"}} // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
try {
    val result : IssueFieldOption = apiInstance.comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceCreateIssueFieldOptionPost(fieldKey, requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceCreateIssueFieldOptionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceCreateIssueFieldOptionPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldKey** | **kotlin.String**| The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; |
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  |

### Return type

[**IssueFieldOption**](IssueFieldOption.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceDeleteIssueFieldOptionDelete"></a>
# **comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceDeleteIssueFieldOptionDelete**
> kotlin.Any comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceDeleteIssueFieldOptionDelete(fieldKey, optionId)

Delete issue field option

Deletes an option from a select list issue field.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCustomFieldOptionsAppsApi()
val fieldKey : kotlin.String = fieldKey_example // kotlin.String | The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the `fieldKey` value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the `jiraIssueFields` module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in `key`. For example, `\"key\": \"teams-add-on__team-issue-field\"`
val optionId : kotlin.Long = 789 // kotlin.Long | The ID of the option to be deleted.
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceDeleteIssueFieldOptionDelete(fieldKey, optionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceDeleteIssueFieldOptionDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceDeleteIssueFieldOptionDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldKey** | **kotlin.String**| The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; |
 **optionId** | **kotlin.Long**| The ID of the option to be deleted. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetAllIssueFieldOptionsGet"></a>
# **comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetAllIssueFieldOptionsGet**
> PageBeanIssueFieldOption comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetAllIssueFieldOptionsGet(fieldKey, startAt, maxResults)

Get all issue field options

Returns all the options of a select list issue field. A select list issue field is a type of [issue field](https://developer.atlassian.com/cloud/jira/platform/modules/issue-field/) that enables a user to select a value from a list of options.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCustomFieldOptionsAppsApi()
val fieldKey : kotlin.String = fieldKey_example // kotlin.String | The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the `fieldKey` value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the `jiraIssueFields` module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in `key`. For example, `\"key\": \"teams-add-on__team-issue-field\"`
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageBeanIssueFieldOption = apiInstance.comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetAllIssueFieldOptionsGet(fieldKey, startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetAllIssueFieldOptionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetAllIssueFieldOptionsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldKey** | **kotlin.String**| The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; |
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**PageBeanIssueFieldOption**](PageBeanIssueFieldOption.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetIssueFieldOptionGet"></a>
# **comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetIssueFieldOptionGet**
> IssueFieldOption comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetIssueFieldOptionGet(fieldKey, optionId)

Get issue field option

Returns an option from a select list issue field.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCustomFieldOptionsAppsApi()
val fieldKey : kotlin.String = fieldKey_example // kotlin.String | The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the `fieldKey` value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the `jiraIssueFields` module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in `key`. For example, `\"key\": \"teams-add-on__team-issue-field\"`
val optionId : kotlin.Long = 789 // kotlin.Long | The ID of the option to be returned.
try {
    val result : IssueFieldOption = apiInstance.comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetIssueFieldOptionGet(fieldKey, optionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetIssueFieldOptionGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetIssueFieldOptionGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldKey** | **kotlin.String**| The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; |
 **optionId** | **kotlin.Long**| The ID of the option to be returned. |

### Return type

[**IssueFieldOption**](IssueFieldOption.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetSelectableIssueFieldOptionsGet"></a>
# **comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetSelectableIssueFieldOptionsGet**
> PageBeanIssueFieldOption comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetSelectableIssueFieldOptionsGet(fieldKey, startAt, maxResults, projectId)

Get selectable issue field options

Returns options for a select list issue field that can be viewed and selected by the user.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCustomFieldOptionsAppsApi()
val fieldKey : kotlin.String = fieldKey_example // kotlin.String | The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the `fieldKey` value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the `jiraIssueFields` module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in `key`. For example, `\"key\": \"teams-add-on__team-issue-field\"`
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val projectId : kotlin.Long = 789 // kotlin.Long | Filters the results to options that are only available in the specified project.
try {
    val result : PageBeanIssueFieldOption = apiInstance.comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetSelectableIssueFieldOptionsGet(fieldKey, startAt, maxResults, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetSelectableIssueFieldOptionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetSelectableIssueFieldOptionsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldKey** | **kotlin.String**| The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; |
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]
 **projectId** | **kotlin.Long**| Filters the results to options that are only available in the specified project. | [optional]

### Return type

[**PageBeanIssueFieldOption**](PageBeanIssueFieldOption.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetVisibleIssueFieldOptionsGet"></a>
# **comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetVisibleIssueFieldOptionsGet**
> PageBeanIssueFieldOption comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetVisibleIssueFieldOptionsGet(fieldKey, startAt, maxResults, projectId)

Get visible issue field options

Returns options for a select list issue field that can be viewed by the user.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCustomFieldOptionsAppsApi()
val fieldKey : kotlin.String = fieldKey_example // kotlin.String | The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the `fieldKey` value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the `jiraIssueFields` module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in `key`. For example, `\"key\": \"teams-add-on__team-issue-field\"`
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val projectId : kotlin.Long = 789 // kotlin.Long | Filters the results to options that are only available in the specified project.
try {
    val result : PageBeanIssueFieldOption = apiInstance.comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetVisibleIssueFieldOptionsGet(fieldKey, startAt, maxResults, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetVisibleIssueFieldOptionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceGetVisibleIssueFieldOptionsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldKey** | **kotlin.String**| The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; |
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional]
 **projectId** | **kotlin.Long**| Filters the results to options that are only available in the specified project. | [optional]

### Return type

[**PageBeanIssueFieldOption**](PageBeanIssueFieldOption.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceReplaceIssueFieldOptionDelete"></a>
# **comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceReplaceIssueFieldOptionDelete**
> comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceReplaceIssueFieldOptionDelete(fieldKey, optionId, replaceWith, jql)

Replace issue field option

Deselects an issue-field select-list option from all issues where it is selected. A different option can be selected to replace the deselected option. The update can also be limited to a smaller set of issues by using a JQL query.  This is an [asynchronous operation](#async). The response object contains a link to the long-running task.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCustomFieldOptionsAppsApi()
val fieldKey : kotlin.String = fieldKey_example // kotlin.String | The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the `fieldKey` value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the `jiraIssueFields` module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in `key`. For example, `\"key\": \"teams-add-on__team-issue-field\"`
val optionId : kotlin.Long = 789 // kotlin.Long | The ID of the option to be deselected.
val replaceWith : kotlin.Long = 789 // kotlin.Long | The ID of the option that will replace the currently selected option.
val jql : kotlin.String = jql_example // kotlin.String | A JQL query that specifies the issues to be updated. For example, *project=10000*.
try {
    apiInstance.comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceReplaceIssueFieldOptionDelete(fieldKey, optionId, replaceWith, jql)
} catch (e: ClientException) {
    println("4xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceReplaceIssueFieldOptionDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceReplaceIssueFieldOptionDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldKey** | **kotlin.String**| The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; |
 **optionId** | **kotlin.Long**| The ID of the option to be deselected. |
 **replaceWith** | **kotlin.Long**| The ID of the option that will replace the currently selected option. | [optional]
 **jql** | **kotlin.String**| A JQL query that specifies the issues to be updated. For example, *project&#x3D;10000*. | [optional]

### Return type

null (empty response body)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceUpdateIssueFieldOptionPut"></a>
# **comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceUpdateIssueFieldOptionPut**
> IssueFieldOption comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceUpdateIssueFieldOptionPut(fieldKey, optionId, issueFieldOption)

Update issue field option

Updates or creates an option for a select list issue field. This operation requires that the option ID is provided when creating an option, therefore, the option ID needs to be specified as a path and body parameter. The option ID provided in the path and body must be identical.  Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCustomFieldOptionsAppsApi()
val fieldKey : kotlin.String = fieldKey_example // kotlin.String | The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the `fieldKey` value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the `jiraIssueFields` module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in `key`. For example, `\"key\": \"teams-add-on__team-issue-field\"`
val optionId : kotlin.Long = 789 // kotlin.Long | The ID of the option to be updated.
val issueFieldOption : IssueFieldOption = {"id":1,"value":"Team 1","config":{"scope":{"projects2":[{"attributes":["notSelectable"],"id":1001},{"attributes":["notSelectable"],"id":1002}],"projects":[],"global":{}},"attributes":[]},"properties":{"leader":{"name":"Leader Name","email":"lname@example.com"},"members":42,"founded":"2016-06-06T00:00:00.000Z","description":"The team's description"}} // IssueFieldOption | 
try {
    val result : IssueFieldOption = apiInstance.comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceUpdateIssueFieldOptionPut(fieldKey, optionId, issueFieldOption)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceUpdateIssueFieldOptionPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCustomFieldOptionsAppsApi#comAtlassianJiraRestV2IssueFieldIssueFieldOptionResourceUpdateIssueFieldOptionPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldKey** | **kotlin.String**| The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the &#x60;fieldKey&#x60; value, do one of the following:   *  open the app&#39;s plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the &#x60;jiraIssueFields&#x60; module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in &#x60;key&#x60;. For example, &#x60;\&quot;key\&quot;: \&quot;teams-add-on__team-issue-field\&quot;&#x60; |
 **optionId** | **kotlin.Long**| The ID of the option to be updated. |
 **issueFieldOption** | [**IssueFieldOption**](IssueFieldOption.md)|  |

### Return type

[**IssueFieldOption**](IssueFieldOption.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

