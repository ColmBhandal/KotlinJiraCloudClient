# ScreensApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueFieldResourceGetScreensForFieldGet**](ScreensApi.md#comAtlassianJiraRestV2IssueFieldResourceGetScreensForFieldGet) | **GET** /rest/api/3/field/{fieldId}/screens | Get screens for a field
[**comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeMappingsGet**](ScreensApi.md#comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeMappingsGet) | **GET** /rest/api/3/issuetypescreenscheme/mapping | Get issue type screen scheme items
[**comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeProjectAssociationsGet**](ScreensApi.md#comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeProjectAssociationsGet) | **GET** /rest/api/3/issuetypescreenscheme/project | Get issue type screen schemes for projects
[**comAtlassianJiraRestV2IssueScreensResourceAddFieldToDefaultScreenPost**](ScreensApi.md#comAtlassianJiraRestV2IssueScreensResourceAddFieldToDefaultScreenPost) | **POST** /rest/api/3/screens/addToDefault/{fieldId} | Add field to default screen
[**comAtlassianJiraRestV2IssueScreensResourceAddScreenTabFieldPost**](ScreensApi.md#comAtlassianJiraRestV2IssueScreensResourceAddScreenTabFieldPost) | **POST** /rest/api/3/screens/{screenId}/tabs/{tabId}/fields | Add screen tab field
[**comAtlassianJiraRestV2IssueScreensResourceAddScreenTabPost**](ScreensApi.md#comAtlassianJiraRestV2IssueScreensResourceAddScreenTabPost) | **POST** /rest/api/3/screens/{screenId}/tabs | Create screen tab
[**comAtlassianJiraRestV2IssueScreensResourceDeleteScreenTabDelete**](ScreensApi.md#comAtlassianJiraRestV2IssueScreensResourceDeleteScreenTabDelete) | **DELETE** /rest/api/3/screens/{screenId}/tabs/{tabId} | Delete screen tab
[**comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabFieldsGet**](ScreensApi.md#comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabFieldsGet) | **GET** /rest/api/3/screens/{screenId}/tabs/{tabId}/fields | Get all screen tab fields
[**comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabsGet**](ScreensApi.md#comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabsGet) | **GET** /rest/api/3/screens/{screenId}/tabs | Get all screen tabs
[**comAtlassianJiraRestV2IssueScreensResourceGetAllScreensGet**](ScreensApi.md#comAtlassianJiraRestV2IssueScreensResourceGetAllScreensGet) | **GET** /rest/api/3/screens | Get all screens
[**comAtlassianJiraRestV2IssueScreensResourceGetAvailableScreenFieldsGet**](ScreensApi.md#comAtlassianJiraRestV2IssueScreensResourceGetAvailableScreenFieldsGet) | **GET** /rest/api/3/screens/{screenId}/availableFields | Get available screen fields
[**comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabFieldPost**](ScreensApi.md#comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabFieldPost) | **POST** /rest/api/3/screens/{screenId}/tabs/{tabId}/fields/{id}/move | Move screen tab field
[**comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabPost**](ScreensApi.md#comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabPost) | **POST** /rest/api/3/screens/{screenId}/tabs/{tabId}/move/{pos} | Move screen tab
[**comAtlassianJiraRestV2IssueScreensResourceRemoveScreenTabFieldDelete**](ScreensApi.md#comAtlassianJiraRestV2IssueScreensResourceRemoveScreenTabFieldDelete) | **DELETE** /rest/api/3/screens/{screenId}/tabs/{tabId}/fields/{id} | Remove screen tab field
[**comAtlassianJiraRestV2IssueScreensResourceRenameScreenTabPut**](ScreensApi.md#comAtlassianJiraRestV2IssueScreensResourceRenameScreenTabPut) | **PUT** /rest/api/3/screens/{screenId}/tabs/{tabId} | Update screen tab
[**comAtlassianJiraRestV2IssueScreenschemeScreenSchemeResourceGetAllScreenSchemesGet**](ScreensApi.md#comAtlassianJiraRestV2IssueScreenschemeScreenSchemeResourceGetAllScreenSchemesGet) | **GET** /rest/api/3/screenscheme | Get all screen schemes


<a name="comAtlassianJiraRestV2IssueFieldResourceGetScreensForFieldGet"></a>
# **comAtlassianJiraRestV2IssueFieldResourceGetScreensForFieldGet**
> PageBeanScreen comAtlassianJiraRestV2IssueFieldResourceGetScreensForFieldGet(fieldId, startAt, maxResults)

Get screens for a field

Returns a [paginated](#pagination) list of the screens a field is used in.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val fieldId : kotlin.String = fieldId_example // kotlin.String | The ID of the field to return screens for.
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageBeanScreen = apiInstance.comAtlassianJiraRestV2IssueFieldResourceGetScreensForFieldGet(fieldId, startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueFieldResourceGetScreensForFieldGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueFieldResourceGetScreensForFieldGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **kotlin.String**| The ID of the field to return screens for. |
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 100]

### Return type

[**PageBeanScreen**](PageBeanScreen.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeMappingsGet"></a>
# **comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeMappingsGet**
> PageBeanIssueTypeScreenSchemeItem comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeMappingsGet(startAt, maxResults, issueTypeScreenSchemeId)

Get issue type screen scheme items

Returns a list of issue type screen scheme items.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val issueTypeScreenSchemeId : kotlin.Array<kotlin.Long> =  // kotlin.Array<kotlin.Long> | The list of issue type screen scheme IDs. To include multiple issue type screen schemes, separate IDs with ampersand: `issueTypeScreenSchemeId=10000&issueTypeScreenSchemeId=10001`.
try {
    val result : PageBeanIssueTypeScreenSchemeItem = apiInstance.comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeMappingsGet(startAt, maxResults, issueTypeScreenSchemeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeMappingsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeMappingsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]
 **issueTypeScreenSchemeId** | [**kotlin.Array&lt;kotlin.Long&gt;**](kotlin.Long.md)| The list of issue type screen scheme IDs. To include multiple issue type screen schemes, separate IDs with ampersand: &#x60;issueTypeScreenSchemeId&#x3D;10000&amp;issueTypeScreenSchemeId&#x3D;10001&#x60;. | [optional]

### Return type

[**PageBeanIssueTypeScreenSchemeItem**](PageBeanIssueTypeScreenSchemeItem.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeProjectAssociationsGet"></a>
# **comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeProjectAssociationsGet**
> PageBeanIssueTypeScreenSchemesProjects comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeProjectAssociationsGet(startAt, maxResults, projectId)

Get issue type screen schemes for projects

Returns a list of issue type screen schemes and, for each issue type screen scheme, a list of the projects that use it.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val projectId : kotlin.Array<kotlin.Long> =  // kotlin.Array<kotlin.Long> | The list of project IDs. To include multiple projects, separate IDs with ampersand: `projectId=10000&projectId=10001`.
try {
    val result : PageBeanIssueTypeScreenSchemesProjects = apiInstance.comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeProjectAssociationsGet(startAt, maxResults, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeProjectAssociationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueIssuetypescreenschemeIssueTypeScreenSchemeResourceGetIssueTypeScreenSchemeProjectAssociationsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]
 **projectId** | [**kotlin.Array&lt;kotlin.Long&gt;**](kotlin.Long.md)| The list of project IDs. To include multiple projects, separate IDs with ampersand: &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. | [optional]

### Return type

[**PageBeanIssueTypeScreenSchemesProjects**](PageBeanIssueTypeScreenSchemesProjects.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueScreensResourceAddFieldToDefaultScreenPost"></a>
# **comAtlassianJiraRestV2IssueScreensResourceAddFieldToDefaultScreenPost**
> kotlin.Any comAtlassianJiraRestV2IssueScreensResourceAddFieldToDefaultScreenPost(fieldId)

Add field to default screen

Adds a field to the default tab of the default screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val fieldId : kotlin.String = fieldId_example // kotlin.String | The ID of the field.
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueScreensResourceAddFieldToDefaultScreenPost(fieldId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceAddFieldToDefaultScreenPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceAddFieldToDefaultScreenPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **kotlin.String**| The ID of the field. |

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

<a name="comAtlassianJiraRestV2IssueScreensResourceAddScreenTabFieldPost"></a>
# **comAtlassianJiraRestV2IssueScreensResourceAddScreenTabFieldPost**
> ScreenableField comAtlassianJiraRestV2IssueScreensResourceAddScreenTabFieldPost(screenId, tabId, addFieldBean)

Add screen tab field

Adds a field to a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val screenId : kotlin.Long = 789 // kotlin.Long | The ID of the screen.
val tabId : kotlin.Long = 789 // kotlin.Long | The ID of the screen tab.
val addFieldBean : AddFieldBean = {"fieldId":"summary"} // AddFieldBean | 
try {
    val result : ScreenableField = apiInstance.comAtlassianJiraRestV2IssueScreensResourceAddScreenTabFieldPost(screenId, tabId, addFieldBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceAddScreenTabFieldPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceAddScreenTabFieldPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenId** | **kotlin.Long**| The ID of the screen. |
 **tabId** | **kotlin.Long**| The ID of the screen tab. |
 **addFieldBean** | [**AddFieldBean**](AddFieldBean.md)|  |

### Return type

[**ScreenableField**](ScreenableField.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueScreensResourceAddScreenTabPost"></a>
# **comAtlassianJiraRestV2IssueScreensResourceAddScreenTabPost**
> ScreenableTab comAtlassianJiraRestV2IssueScreensResourceAddScreenTabPost(screenId, screenableTab)

Create screen tab

Creates a tab for a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val screenId : kotlin.Long = 789 // kotlin.Long | The ID of the screen.
val screenableTab : ScreenableTab = {"name":"Fields Tab"} // ScreenableTab | 
try {
    val result : ScreenableTab = apiInstance.comAtlassianJiraRestV2IssueScreensResourceAddScreenTabPost(screenId, screenableTab)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceAddScreenTabPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceAddScreenTabPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenId** | **kotlin.Long**| The ID of the screen. |
 **screenableTab** | [**ScreenableTab**](ScreenableTab.md)|  |

### Return type

[**ScreenableTab**](ScreenableTab.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueScreensResourceDeleteScreenTabDelete"></a>
# **comAtlassianJiraRestV2IssueScreensResourceDeleteScreenTabDelete**
> comAtlassianJiraRestV2IssueScreensResourceDeleteScreenTabDelete(screenId, tabId)

Delete screen tab

Deletes a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val screenId : kotlin.Long = 789 // kotlin.Long | The ID of the screen.
val tabId : kotlin.Long = 789 // kotlin.Long | The ID of the screen tab.
try {
    apiInstance.comAtlassianJiraRestV2IssueScreensResourceDeleteScreenTabDelete(screenId, tabId)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceDeleteScreenTabDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceDeleteScreenTabDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenId** | **kotlin.Long**| The ID of the screen. |
 **tabId** | **kotlin.Long**| The ID of the screen tab. |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabFieldsGet"></a>
# **comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabFieldsGet**
> kotlin.Array&lt;ScreenableField&gt; comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabFieldsGet(screenId, tabId, projectKey)

Get all screen tab fields

Returns all fields for a screen tab.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val screenId : kotlin.Long = 789 // kotlin.Long | The ID of the screen.
val tabId : kotlin.Long = 789 // kotlin.Long | The ID of the screen tab.
val projectKey : kotlin.String = projectKey_example // kotlin.String | The key of the project.
try {
    val result : kotlin.Array<ScreenableField> = apiInstance.comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabFieldsGet(screenId, tabId, projectKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabFieldsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabFieldsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenId** | **kotlin.Long**| The ID of the screen. |
 **tabId** | **kotlin.Long**| The ID of the screen tab. |
 **projectKey** | **kotlin.String**| The key of the project. | [optional]

### Return type

[**kotlin.Array&lt;ScreenableField&gt;**](ScreenableField.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabsGet"></a>
# **comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabsGet**
> kotlin.Array&lt;ScreenableTab&gt; comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabsGet(screenId, projectKey)

Get all screen tabs

Returns the list of tabs for a screen.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val screenId : kotlin.Long = 789 // kotlin.Long | The ID of the screen.
val projectKey : kotlin.String = projectKey_example // kotlin.String | The key of the project.
try {
    val result : kotlin.Array<ScreenableTab> = apiInstance.comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabsGet(screenId, projectKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceGetAllScreenTabsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenId** | **kotlin.Long**| The ID of the screen. |
 **projectKey** | **kotlin.String**| The key of the project. | [optional]

### Return type

[**kotlin.Array&lt;ScreenableTab&gt;**](ScreenableTab.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueScreensResourceGetAllScreensGet"></a>
# **comAtlassianJiraRestV2IssueScreensResourceGetAllScreensGet**
> PageBeanScreen comAtlassianJiraRestV2IssueScreensResourceGetAllScreensGet(startAt, maxResults)

Get all screens

Returns all screens.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageBeanScreen = apiInstance.comAtlassianJiraRestV2IssueScreensResourceGetAllScreensGet(startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceGetAllScreensGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceGetAllScreensGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 100]

### Return type

[**PageBeanScreen**](PageBeanScreen.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueScreensResourceGetAvailableScreenFieldsGet"></a>
# **comAtlassianJiraRestV2IssueScreensResourceGetAvailableScreenFieldsGet**
> kotlin.Array&lt;ScreenableField&gt; comAtlassianJiraRestV2IssueScreensResourceGetAvailableScreenFieldsGet(screenId)

Get available screen fields

Returns the fields that can be added to a tab on a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val screenId : kotlin.Long = 789 // kotlin.Long | The ID of the screen.
try {
    val result : kotlin.Array<ScreenableField> = apiInstance.comAtlassianJiraRestV2IssueScreensResourceGetAvailableScreenFieldsGet(screenId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceGetAvailableScreenFieldsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceGetAvailableScreenFieldsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenId** | **kotlin.Long**| The ID of the screen. |

### Return type

[**kotlin.Array&lt;ScreenableField&gt;**](ScreenableField.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabFieldPost"></a>
# **comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabFieldPost**
> kotlin.Any comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabFieldPost(screenId, tabId, id, moveFieldBean)

Move screen tab field

Moves a screen tab field.  If &#x60;after&#x60; and &#x60;position&#x60; are provided in the request, &#x60;position&#x60; is ignored.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val screenId : kotlin.Long = 789 // kotlin.Long | The ID of the screen.
val tabId : kotlin.Long = 789 // kotlin.Long | The ID of the screen tab.
val id : kotlin.String = id_example // kotlin.String | The ID of the field.
val moveFieldBean : MoveFieldBean =  // MoveFieldBean | 
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabFieldPost(screenId, tabId, id, moveFieldBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabFieldPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabFieldPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenId** | **kotlin.Long**| The ID of the screen. |
 **tabId** | **kotlin.Long**| The ID of the screen tab. |
 **id** | **kotlin.String**| The ID of the field. |
 **moveFieldBean** | [**MoveFieldBean**](MoveFieldBean.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabPost"></a>
# **comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabPost**
> kotlin.Any comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabPost(screenId, tabId, pos)

Move screen tab

Moves a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val screenId : kotlin.Long = 789 // kotlin.Long | The ID of the screen.
val tabId : kotlin.Long = 789 // kotlin.Long | The ID of the screen tab.
val pos : kotlin.Int = 56 // kotlin.Int | The position of tab. The base index is 0.
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabPost(screenId, tabId, pos)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceMoveScreenTabPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenId** | **kotlin.Long**| The ID of the screen. |
 **tabId** | **kotlin.Long**| The ID of the screen tab. |
 **pos** | **kotlin.Int**| The position of tab. The base index is 0. |

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

<a name="comAtlassianJiraRestV2IssueScreensResourceRemoveScreenTabFieldDelete"></a>
# **comAtlassianJiraRestV2IssueScreensResourceRemoveScreenTabFieldDelete**
> comAtlassianJiraRestV2IssueScreensResourceRemoveScreenTabFieldDelete(screenId, tabId, id)

Remove screen tab field

Removes a field from a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val screenId : kotlin.Long = 789 // kotlin.Long | The ID of the screen.
val tabId : kotlin.Long = 789 // kotlin.Long | The ID of the screen tab.
val id : kotlin.String = id_example // kotlin.String | The ID of the field.
try {
    apiInstance.comAtlassianJiraRestV2IssueScreensResourceRemoveScreenTabFieldDelete(screenId, tabId, id)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceRemoveScreenTabFieldDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceRemoveScreenTabFieldDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenId** | **kotlin.Long**| The ID of the screen. |
 **tabId** | **kotlin.Long**| The ID of the screen tab. |
 **id** | **kotlin.String**| The ID of the field. |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2IssueScreensResourceRenameScreenTabPut"></a>
# **comAtlassianJiraRestV2IssueScreensResourceRenameScreenTabPut**
> ScreenableTab comAtlassianJiraRestV2IssueScreensResourceRenameScreenTabPut(screenId, tabId, screenableTab)

Update screen tab

Updates the name of a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val screenId : kotlin.Long = 789 // kotlin.Long | The ID of the screen.
val tabId : kotlin.Long = 789 // kotlin.Long | The ID of the screen tab.
val screenableTab : ScreenableTab =  // ScreenableTab | 
try {
    val result : ScreenableTab = apiInstance.comAtlassianJiraRestV2IssueScreensResourceRenameScreenTabPut(screenId, tabId, screenableTab)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceRenameScreenTabPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreensResourceRenameScreenTabPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screenId** | **kotlin.Long**| The ID of the screen. |
 **tabId** | **kotlin.Long**| The ID of the screen tab. |
 **screenableTab** | [**ScreenableTab**](ScreenableTab.md)|  |

### Return type

[**ScreenableTab**](ScreenableTab.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueScreenschemeScreenSchemeResourceGetAllScreenSchemesGet"></a>
# **comAtlassianJiraRestV2IssueScreenschemeScreenSchemeResourceGetAllScreenSchemesGet**
> PageBeanScreenScheme comAtlassianJiraRestV2IssueScreenschemeScreenSchemeResourceGetAllScreenSchemesGet(startAt, maxResults)

Get all screen schemes

Returns all screen schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ScreensApi()
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageBeanScreenScheme = apiInstance.comAtlassianJiraRestV2IssueScreenschemeScreenSchemeResourceGetAllScreenSchemesGet(startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreenschemeScreenSchemeResourceGetAllScreenSchemesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScreensApi#comAtlassianJiraRestV2IssueScreenschemeScreenSchemeResourceGetAllScreenSchemesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 25]

### Return type

[**PageBeanScreenScheme**](PageBeanScreenScheme.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

