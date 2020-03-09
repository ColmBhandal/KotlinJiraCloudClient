# IssueCustomFieldOptionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceCreateCustomFieldOptionsPost**](IssueCustomFieldOptionsApi.md#comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceCreateCustomFieldOptionsPost) | **POST** /rest/api/3/customField/{fieldId}/option | Create custom field options
[**comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceGetOptionsForFieldGet**](IssueCustomFieldOptionsApi.md#comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceGetOptionsForFieldGet) | **GET** /rest/api/3/customField/{fieldId}/option | Get options for field
[**comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceUpdateCustomFieldOptionsPut**](IssueCustomFieldOptionsApi.md#comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceUpdateCustomFieldOptionsPut) | **PUT** /rest/api/3/customField/{fieldId}/option | Update custom field options
[**comAtlassianJiraRestV2IssueCustomfieldCustomFieldOptionResourceGetCustomFieldOptionGet**](IssueCustomFieldOptionsApi.md#comAtlassianJiraRestV2IssueCustomfieldCustomFieldOptionResourceGetCustomFieldOptionGet) | **GET** /rest/api/3/customFieldOption/{id} | Get custom field option


<a name="comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceCreateCustomFieldOptionsPost"></a>
# **comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceCreateCustomFieldOptionsPost**
> kotlin.Any comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceCreateCustomFieldOptionsPost(fieldId, bulkCreateCustomFieldOptionRequest)

Create custom field options

Creates options and, where the custom select field is of the type *Select List (cascading)*, cascading options for a custom select field. The options are added to the global context of the field.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCustomFieldOptionsApi()
val fieldId : kotlin.Long = 789 // kotlin.Long | The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*.
val bulkCreateCustomFieldOptionRequest : BulkCreateCustomFieldOptionRequest = {"options":[{"cascadingOptions":[],"value":"Option value"},{"cascadingOptions":["Child option"],"value":"Other option value"},{"cascadingOptions":["Sub-option","Sub-option 2"],"value":"Third option value"}]} // BulkCreateCustomFieldOptionRequest | 
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceCreateCustomFieldOptionsPost(fieldId, bulkCreateCustomFieldOptionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCustomFieldOptionsApi#comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceCreateCustomFieldOptionsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCustomFieldOptionsApi#comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceCreateCustomFieldOptionsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **kotlin.Long**| The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*. |
 **bulkCreateCustomFieldOptionRequest** | [**BulkCreateCustomFieldOptionRequest**](BulkCreateCustomFieldOptionRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceGetOptionsForFieldGet"></a>
# **comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceGetOptionsForFieldGet**
> PageBeanCustomFieldOptionDetails comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceGetOptionsForFieldGet(fieldId, startAt, maxResults)

Get options for field

Returns the options and, where the custom select field is of the type *Select List (cascading)*, cascading options for custom select fields. Cascading options are included in the item count when determining pagination. Only options from the global context are returned.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCustomFieldOptionsApi()
val fieldId : kotlin.Long = 789 // kotlin.Long | The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*.
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageBeanCustomFieldOptionDetails = apiInstance.comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceGetOptionsForFieldGet(fieldId, startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCustomFieldOptionsApi#comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceGetOptionsForFieldGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCustomFieldOptionsApi#comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceGetOptionsForFieldGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **kotlin.Long**| The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*. |
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 1000]

### Return type

[**PageBeanCustomFieldOptionDetails**](PageBeanCustomFieldOptionDetails.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceUpdateCustomFieldOptionsPut"></a>
# **comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceUpdateCustomFieldOptionsPut**
> kotlin.Any comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceUpdateCustomFieldOptionsPut(fieldId, updateCustomFieldOption)

Update custom field options

Updates the options on a custom select field. Where an updated option is in use on an issue, the value on the issue is also updated. Options that are not found are ignored. A maximum of 1000 options, including sub-options of *Select List (cascading)* fields, can be updated per request. The options are updated on the global context of the field.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCustomFieldOptionsApi()
val fieldId : kotlin.Long = 789 // kotlin.Long | The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*.
val updateCustomFieldOption : UpdateCustomFieldOption = {"options":[{"cascadingOptions":[],"value":"Option value"},{"cascadingOptions":["Child option"],"value":"Other option value"},{"cascadingOptions":["Sub-option","Sub-option 2"],"value":"Third option value"}]} // UpdateCustomFieldOption | 
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceUpdateCustomFieldOptionsPut(fieldId, updateCustomFieldOption)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCustomFieldOptionsApi#comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceUpdateCustomFieldOptionsPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCustomFieldOptionsApi#comAtlassianJiraRestV2IssueBulkCustomFieldOptionResourceUpdateCustomFieldOptionsPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **kotlin.Long**| The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*. |
 **updateCustomFieldOption** | [**UpdateCustomFieldOption**](UpdateCustomFieldOption.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueCustomfieldCustomFieldOptionResourceGetCustomFieldOptionGet"></a>
# **comAtlassianJiraRestV2IssueCustomfieldCustomFieldOptionResourceGetCustomFieldOptionGet**
> CustomFieldOption comAtlassianJiraRestV2IssueCustomfieldCustomFieldOptionResourceGetCustomFieldOptionGet(id)

Get custom field option

Returns a custom field option. For example, an option in a select list.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCustomFieldOptionsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the custom field option.
try {
    val result : CustomFieldOption = apiInstance.comAtlassianJiraRestV2IssueCustomfieldCustomFieldOptionResourceGetCustomFieldOptionGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCustomFieldOptionsApi#comAtlassianJiraRestV2IssueCustomfieldCustomFieldOptionResourceGetCustomFieldOptionGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCustomFieldOptionsApi#comAtlassianJiraRestV2IssueCustomfieldCustomFieldOptionResourceGetCustomFieldOptionGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the custom field option. |

### Return type

[**CustomFieldOption**](CustomFieldOption.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

