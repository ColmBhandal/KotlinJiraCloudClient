# IssueFieldConfigurationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetAllFieldConfigurationsGet**](IssueFieldConfigurationsApi.md#comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetAllFieldConfigurationsGet) | **GET** /rest/api/3/fieldconfiguration | Get all field configurations
[**comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetFieldConfigurationItemsGet**](IssueFieldConfigurationsApi.md#comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetFieldConfigurationItemsGet) | **GET** /rest/api/3/fieldconfiguration/{id}/fields | Get field configuration items
[**comAtlassianJiraRestV2IssueFieldFieldConfigurationSchemeResourceGetFieldConfigurationSchemeMappingsGet**](IssueFieldConfigurationsApi.md#comAtlassianJiraRestV2IssueFieldFieldConfigurationSchemeResourceGetFieldConfigurationSchemeMappingsGet) | **GET** /rest/api/3/fieldconfigurationscheme/mapping | Get field configuration issue type items


<a name="comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetAllFieldConfigurationsGet"></a>
# **comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetAllFieldConfigurationsGet**
> PageBeanFieldConfiguration comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetAllFieldConfigurationsGet(startAt, maxResults, isDefault)

Get all field configurations

Returns a paginated list of all field configurations.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueFieldConfigurationsApi()
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val isDefault : kotlin.Boolean = true // kotlin.Boolean | If *true* returns the default field configuration only.
try {
    val result : PageBeanFieldConfiguration = apiInstance.comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetAllFieldConfigurationsGet(startAt, maxResults, isDefault)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueFieldConfigurationsApi#comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetAllFieldConfigurationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueFieldConfigurationsApi#comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetAllFieldConfigurationsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]
 **isDefault** | **kotlin.Boolean**| If *true* returns the default field configuration only. | [optional] [default to false]

### Return type

[**PageBeanFieldConfiguration**](PageBeanFieldConfiguration.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetFieldConfigurationItemsGet"></a>
# **comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetFieldConfigurationItemsGet**
> PageBeanFieldConfigurationItem comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetFieldConfigurationItemsGet(id, startAt, maxResults)

Get field configuration items

Returns a paginated list of all fields for a configuration.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueFieldConfigurationsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the field configuration.
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageBeanFieldConfigurationItem = apiInstance.comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetFieldConfigurationItemsGet(id, startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueFieldConfigurationsApi#comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetFieldConfigurationItemsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueFieldConfigurationsApi#comAtlassianJiraRestV2IssueFieldFieldConfigurationResourceGetFieldConfigurationItemsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the field configuration. |
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**PageBeanFieldConfigurationItem**](PageBeanFieldConfigurationItem.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueFieldFieldConfigurationSchemeResourceGetFieldConfigurationSchemeMappingsGet"></a>
# **comAtlassianJiraRestV2IssueFieldFieldConfigurationSchemeResourceGetFieldConfigurationSchemeMappingsGet**
> PageBeanFieldConfigurationIssueTypeItem comAtlassianJiraRestV2IssueFieldFieldConfigurationSchemeResourceGetFieldConfigurationSchemeMappingsGet(fieldConfigurationSchemeId, startAt, maxResults)

Get field configuration issue type items

Returns a paginated list of field configuration issue type items.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueFieldConfigurationsApi()
val fieldConfigurationSchemeId : kotlin.Array<kotlin.Long> =  // kotlin.Array<kotlin.Long> | The list of field configuration scheme IDs. To include multiple field configuration schemes separate IDs with ampersand: `fieldConfigurationSchemeId=10000&fieldConfigurationSchemeId=10001`.
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageBeanFieldConfigurationIssueTypeItem = apiInstance.comAtlassianJiraRestV2IssueFieldFieldConfigurationSchemeResourceGetFieldConfigurationSchemeMappingsGet(fieldConfigurationSchemeId, startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueFieldConfigurationsApi#comAtlassianJiraRestV2IssueFieldFieldConfigurationSchemeResourceGetFieldConfigurationSchemeMappingsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueFieldConfigurationsApi#comAtlassianJiraRestV2IssueFieldFieldConfigurationSchemeResourceGetFieldConfigurationSchemeMappingsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldConfigurationSchemeId** | [**kotlin.Array&lt;kotlin.Long&gt;**](kotlin.Long.md)| The list of field configuration scheme IDs. To include multiple field configuration schemes separate IDs with ampersand: &#x60;fieldConfigurationSchemeId&#x3D;10000&amp;fieldConfigurationSchemeId&#x3D;10001&#x60;. |
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**PageBeanFieldConfigurationIssueTypeItem**](PageBeanFieldConfigurationIssueTypeItem.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

