# IssueNavigatorSettingsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2AdminSettingsResourceGetIssueNavigatorDefaultColumnsGet**](IssueNavigatorSettingsApi.md#comAtlassianJiraRestV2AdminSettingsResourceGetIssueNavigatorDefaultColumnsGet) | **GET** /rest/api/3/settings/columns | Get issue navigator default columns
[**comAtlassianJiraRestV2AdminSettingsResourceSetIssueNavigatorDefaultColumnsPut**](IssueNavigatorSettingsApi.md#comAtlassianJiraRestV2AdminSettingsResourceSetIssueNavigatorDefaultColumnsPut) | **PUT** /rest/api/3/settings/columns | Set issue navigator default columns


<a name="comAtlassianJiraRestV2AdminSettingsResourceGetIssueNavigatorDefaultColumnsGet"></a>
# **comAtlassianJiraRestV2AdminSettingsResourceGetIssueNavigatorDefaultColumnsGet**
> kotlin.Array&lt;ColumnItem&gt; comAtlassianJiraRestV2AdminSettingsResourceGetIssueNavigatorDefaultColumnsGet()

Get issue navigator default columns

Returns the default issue navigator columns.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueNavigatorSettingsApi()
try {
    val result : kotlin.Array<ColumnItem> = apiInstance.comAtlassianJiraRestV2AdminSettingsResourceGetIssueNavigatorDefaultColumnsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueNavigatorSettingsApi#comAtlassianJiraRestV2AdminSettingsResourceGetIssueNavigatorDefaultColumnsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueNavigatorSettingsApi#comAtlassianJiraRestV2AdminSettingsResourceGetIssueNavigatorDefaultColumnsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ColumnItem&gt;**](ColumnItem.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminSettingsResourceSetIssueNavigatorDefaultColumnsPut"></a>
# **comAtlassianJiraRestV2AdminSettingsResourceSetIssueNavigatorDefaultColumnsPut**
> kotlin.Any comAtlassianJiraRestV2AdminSettingsResourceSetIssueNavigatorDefaultColumnsPut(requestBody)

Set issue navigator default columns

Sets the default issue navigator columns.  The &#x60;columns&#x60; parameter accepts a navigable field value and is expressed as HTML form data. To specify multiple columns, pass multiple &#x60;columns&#x60; parameters. For example, in curl:  &#x60;curl -X PUT -d columns&#x3D;summary -d columns&#x3D;description https://your-domain.atlassian.net/rest/api/3/settings/columns&#x60;  If no column details are sent, then all default columns are removed.  A navigable field is one that can be used as a column on the issue navigator. Find details of navigable issue columns using [Get fields](#api-rest-api-3-field-get).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueNavigatorSettingsApi()
val requestBody : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | A navigable field value.
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2AdminSettingsResourceSetIssueNavigatorDefaultColumnsPut(requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueNavigatorSettingsApi#comAtlassianJiraRestV2AdminSettingsResourceSetIssueNavigatorDefaultColumnsPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueNavigatorSettingsApi#comAtlassianJiraRestV2AdminSettingsResourceSetIssueNavigatorDefaultColumnsPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| A navigable field value. | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data, 
 - **Accept**: application/json

