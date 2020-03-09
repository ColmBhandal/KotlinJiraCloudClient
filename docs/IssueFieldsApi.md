# IssueFieldsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueFieldFieldSearchResourceGetFieldsPaginatedGet**](IssueFieldsApi.md#comAtlassianJiraRestV2IssueFieldFieldSearchResourceGetFieldsPaginatedGet) | **GET** /rest/api/3/field/search | Get fields paginated
[**comAtlassianJiraRestV2IssueFieldResourceCreateCustomFieldPost**](IssueFieldsApi.md#comAtlassianJiraRestV2IssueFieldResourceCreateCustomFieldPost) | **POST** /rest/api/3/field | Create custom field
[**comAtlassianJiraRestV2IssueFieldResourceGetContextsForFieldGet**](IssueFieldsApi.md#comAtlassianJiraRestV2IssueFieldResourceGetContextsForFieldGet) | **GET** /rest/api/3/field/{fieldId}/contexts | Get contexts for a field
[**comAtlassianJiraRestV2IssueFieldResourceGetFieldsGet**](IssueFieldsApi.md#comAtlassianJiraRestV2IssueFieldResourceGetFieldsGet) | **GET** /rest/api/3/field | Get fields


<a name="comAtlassianJiraRestV2IssueFieldFieldSearchResourceGetFieldsPaginatedGet"></a>
# **comAtlassianJiraRestV2IssueFieldFieldSearchResourceGetFieldsPaginatedGet**
> PageBeanField comAtlassianJiraRestV2IssueFieldFieldSearchResourceGetFieldsPaginatedGet(startAt, maxResults, type, id, query, orderBy, expand)

Get fields paginated

Returns a [paginated](#pagination) list of fields for Classic Jira projects. The list can include:   *  all fields.  *  specific fields, by defining &#x60;id&#x60;.  *  fields that contain a string in the field name or description, by defining &#x60;query&#x60;.  *  specific fields that contain a string in the field name or description, by defining &#x60;id&#x60; and &#x60;query&#x60;.  Only custom fields can be queried, &#x60;type&#x60; must be set to &#x60;custom&#x60;.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueFieldsApi()
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val type : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | The type of fields to search.
val id : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | The IDs of the custom fields to return or, where`query is specified, filter. IDs should be provided in the format customfield_XXXXX.`
val query : kotlin.String = query_example // kotlin.String | String used to perform a case-insensitive partial match with field names or descriptions.
val orderBy : kotlin.String = orderBy_example // kotlin.String | [Order](#ordering) the results by a field:   *  `contextsCount` Sorts by the number of contexts related to a field.  *  `lastUsed` Sorts by the date when the value of the field last changed.  *  `name` Sorts by the field name.  *  `screensCount` Sorts by the number of screens related to a field.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `key` Returns the key for each field.  *  `lastUsed` Returns the date when the value of the field last changed.  *  `screensCount` Returns the number of screens related to a field.  *  `contextsCount` Returns the number of contexts related to a field.  *  `isLocked` Returns information about whether the field is [locked](https://confluence.atlassian.com/x/ZSN7Og).
try {
    val result : PageBeanField = apiInstance.comAtlassianJiraRestV2IssueFieldFieldSearchResourceGetFieldsPaginatedGet(startAt, maxResults, type, id, query, orderBy, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueFieldsApi#comAtlassianJiraRestV2IssueFieldFieldSearchResourceGetFieldsPaginatedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueFieldsApi#comAtlassianJiraRestV2IssueFieldFieldSearchResourceGetFieldsPaginatedGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]
 **type** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| The type of fields to search. | [optional] [enum: custom, system]
 **id** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| The IDs of the custom fields to return or, where&#x60;query is specified, filter. IDs should be provided in the format customfield_XXXXX.&#x60; | [optional]
 **query** | **kotlin.String**| String used to perform a case-insensitive partial match with field names or descriptions. | [optional]
 **orderBy** | **kotlin.String**| [Order](#ordering) the results by a field:   *  &#x60;contextsCount&#x60; Sorts by the number of contexts related to a field.  *  &#x60;lastUsed&#x60; Sorts by the date when the value of the field last changed.  *  &#x60;name&#x60; Sorts by the field name.  *  &#x60;screensCount&#x60; Sorts by the number of screens related to a field. | [optional] [enum: contextsCount, -contextsCount, +contextsCount, lastUsed, -lastUsed, +lastUsed, name, -name, +name, screensCount, -screensCount, +screensCount]
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;key&#x60; Returns the key for each field.  *  &#x60;lastUsed&#x60; Returns the date when the value of the field last changed.  *  &#x60;screensCount&#x60; Returns the number of screens related to a field.  *  &#x60;contextsCount&#x60; Returns the number of contexts related to a field.  *  &#x60;isLocked&#x60; Returns information about whether the field is [locked](https://confluence.atlassian.com/x/ZSN7Og). | [optional]

### Return type

[**PageBeanField**](PageBeanField.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueFieldResourceCreateCustomFieldPost"></a>
# **comAtlassianJiraRestV2IssueFieldResourceCreateCustomFieldPost**
> FieldDetails comAtlassianJiraRestV2IssueFieldResourceCreateCustomFieldPost(customFieldDefinitionJsonBean)

Create custom field

Creates a custom field.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueFieldsApi()
val customFieldDefinitionJsonBean : CustomFieldDefinitionJsonBean = {"searcherKey":"com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher","name":"New custom field","description":"Custom field for picking groups","type":"com.atlassian.jira.plugin.system.customfieldtypes:grouppicker"} // CustomFieldDefinitionJsonBean | Definition of the custom field to be created
try {
    val result : FieldDetails = apiInstance.comAtlassianJiraRestV2IssueFieldResourceCreateCustomFieldPost(customFieldDefinitionJsonBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueFieldsApi#comAtlassianJiraRestV2IssueFieldResourceCreateCustomFieldPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueFieldsApi#comAtlassianJiraRestV2IssueFieldResourceCreateCustomFieldPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customFieldDefinitionJsonBean** | [**CustomFieldDefinitionJsonBean**](CustomFieldDefinitionJsonBean.md)| Definition of the custom field to be created |

### Return type

[**FieldDetails**](FieldDetails.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueFieldResourceGetContextsForFieldGet"></a>
# **comAtlassianJiraRestV2IssueFieldResourceGetContextsForFieldGet**
> PageBeanContext comAtlassianJiraRestV2IssueFieldResourceGetContextsForFieldGet(fieldId, startAt, maxResults)

Get contexts for a field

Returns a [paginated](#pagination) list of the contexts a field is used in.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueFieldsApi()
val fieldId : kotlin.String = fieldId_example // kotlin.String | The ID of the field to return contexts for.
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageBeanContext = apiInstance.comAtlassianJiraRestV2IssueFieldResourceGetContextsForFieldGet(fieldId, startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueFieldsApi#comAtlassianJiraRestV2IssueFieldResourceGetContextsForFieldGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueFieldsApi#comAtlassianJiraRestV2IssueFieldResourceGetContextsForFieldGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **kotlin.String**| The ID of the field to return contexts for. |
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 20]

### Return type

[**PageBeanContext**](PageBeanContext.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueFieldResourceGetFieldsGet"></a>
# **comAtlassianJiraRestV2IssueFieldResourceGetFieldsGet**
> kotlin.Array&lt;FieldDetails&gt; comAtlassianJiraRestV2IssueFieldResourceGetFieldsGet()

Get fields

Returns system and custom issue fields according to the following rules:   *  Fields that cannot be added to the issue navigator are always returned.  *  Fields that cannot be placed on an issue screen are always returned.  *  Fields that depend on global Jira settings are only returned if the setting is enabled. That is, timetracking fields, subtasks, votes, and watches.  *  For all other fields, this operation only returns the fields that the user has permission to view (that is, the field is used in at least one project that the user has *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.)  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueFieldsApi()
try {
    val result : kotlin.Array<FieldDetails> = apiInstance.comAtlassianJiraRestV2IssueFieldResourceGetFieldsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueFieldsApi#comAtlassianJiraRestV2IssueFieldResourceGetFieldsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueFieldsApi#comAtlassianJiraRestV2IssueFieldResourceGetFieldsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;FieldDetails&gt;**](FieldDetails.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

