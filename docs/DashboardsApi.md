# DashboardsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceDeleteDashboardItemPropertyDelete**](DashboardsApi.md#comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceDeleteDashboardItemPropertyDelete) | **DELETE** /rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties/{propertyKey} | Delete dashboard item property
[**comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyGet**](DashboardsApi.md#comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyGet) | **GET** /rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties/{propertyKey} | Get dashboard item property
[**comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyKeysGet**](DashboardsApi.md#comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyKeysGet) | **GET** /rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties | Get dashboard item property keys
[**comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceSetDashboardItemPropertyPut**](DashboardsApi.md#comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceSetDashboardItemPropertyPut) | **PUT** /rest/api/3/dashboard/{dashboardId}/items/{itemId}/properties/{propertyKey} | Set dashboard item property
[**comAtlassianJiraRestV2DashboardDashboardResourceCopyDashboardPost**](DashboardsApi.md#comAtlassianJiraRestV2DashboardDashboardResourceCopyDashboardPost) | **POST** /rest/api/3/dashboard/{id}/copy | Copy dashboard
[**comAtlassianJiraRestV2DashboardDashboardResourceCreateDashboardPost**](DashboardsApi.md#comAtlassianJiraRestV2DashboardDashboardResourceCreateDashboardPost) | **POST** /rest/api/3/dashboard | Create dashboard
[**comAtlassianJiraRestV2DashboardDashboardResourceDeleteDashboardDelete**](DashboardsApi.md#comAtlassianJiraRestV2DashboardDashboardResourceDeleteDashboardDelete) | **DELETE** /rest/api/3/dashboard/{id} | Delete dashboard
[**comAtlassianJiraRestV2DashboardDashboardResourceGetAllDashboardsGet**](DashboardsApi.md#comAtlassianJiraRestV2DashboardDashboardResourceGetAllDashboardsGet) | **GET** /rest/api/3/dashboard | Get all dashboards
[**comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardGet**](DashboardsApi.md#comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardGet) | **GET** /rest/api/3/dashboard/{id} | Get dashboard
[**comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardsPaginatedGet**](DashboardsApi.md#comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardsPaginatedGet) | **GET** /rest/api/3/dashboard/search | Search for dashboards
[**comAtlassianJiraRestV2DashboardDashboardResourceUpdateDashboardPut**](DashboardsApi.md#comAtlassianJiraRestV2DashboardDashboardResourceUpdateDashboardPut) | **PUT** /rest/api/3/dashboard/{id} | Update dashboard


<a name="comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceDeleteDashboardItemPropertyDelete"></a>
# **comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceDeleteDashboardItemPropertyDelete**
> comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceDeleteDashboardItemPropertyDelete(dashboardId, itemId, propertyKey)

Delete dashboard item property

Deletes a dashboard item property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DashboardsApi()
val dashboardId : kotlin.String = dashboardId_example // kotlin.String | The ID of the dashboard.
val itemId : kotlin.String = itemId_example // kotlin.String | The ID of the dashboard item.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the dashboard item property.
try {
    apiInstance.comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceDeleteDashboardItemPropertyDelete(dashboardId, itemId, propertyKey)
} catch (e: ClientException) {
    println("4xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceDeleteDashboardItemPropertyDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceDeleteDashboardItemPropertyDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **kotlin.String**| The ID of the dashboard. |
 **itemId** | **kotlin.String**| The ID of the dashboard item. |
 **propertyKey** | **kotlin.String**| The key of the dashboard item property. |

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
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyGet"></a>
# **comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyGet**
> EntityProperty comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyGet(dashboardId, itemId, propertyKey)

Get dashboard item property

Returns the key and value of a dashboard item property.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item&#39;s content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard or be shared the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DashboardsApi()
val dashboardId : kotlin.String = dashboardId_example // kotlin.String | The ID of the dashboard.
val itemId : kotlin.String = itemId_example // kotlin.String | The ID of the dashboard item.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the dashboard item property.
try {
    val result : EntityProperty = apiInstance.comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyGet(dashboardId, itemId, propertyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **kotlin.String**| The ID of the dashboard. |
 **itemId** | **kotlin.String**| The ID of the dashboard item. |
 **propertyKey** | **kotlin.String**| The key of the dashboard item property. |

### Return type

[**EntityProperty**](EntityProperty.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyKeysGet"></a>
# **comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyKeysGet**
> PropertyKeys comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyKeysGet(dashboardId, itemId)

Get dashboard item property keys

Returns the keys of all properties for a dashboard item.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard or be shared the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DashboardsApi()
val dashboardId : kotlin.String = dashboardId_example // kotlin.String | The ID of the dashboard.
val itemId : kotlin.String = itemId_example // kotlin.String | The ID of the dashboard item.
try {
    val result : PropertyKeys = apiInstance.comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyKeysGet(dashboardId, itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyKeysGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceGetDashboardItemPropertyKeysGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **kotlin.String**| The ID of the dashboard. |
 **itemId** | **kotlin.String**| The ID of the dashboard item. |

### Return type

[**PropertyKeys**](PropertyKeys.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceSetDashboardItemPropertyPut"></a>
# **comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceSetDashboardItemPropertyPut**
> kotlin.Any comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceSetDashboardItemPropertyPut(dashboardId, itemId, propertyKey, body)

Set dashboard item property

Sets the value of a dashboard item property. Use this resource in apps to store custom data against a dashboard item.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item&#39;s content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DashboardsApi()
val dashboardId : kotlin.String = dashboardId_example // kotlin.String | The ID of the dashboard.
val itemId : kotlin.String = itemId_example // kotlin.String | The ID of the dashboard item.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the dashboard item property. The maximum length is 255 characters.
val body : kotlin.Any =  // kotlin.Any | 
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceSetDashboardItemPropertyPut(dashboardId, itemId, propertyKey, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceSetDashboardItemPropertyPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardItemPropertyResourceSetDashboardItemPropertyPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **kotlin.String**| The ID of the dashboard. |
 **itemId** | **kotlin.String**| The ID of the dashboard item. |
 **propertyKey** | **kotlin.String**| The key of the dashboard item property. The maximum length is 255 characters. |
 **body** | **kotlin.Any**|  |

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

<a name="comAtlassianJiraRestV2DashboardDashboardResourceCopyDashboardPost"></a>
# **comAtlassianJiraRestV2DashboardDashboardResourceCopyDashboardPost**
> Dashboard comAtlassianJiraRestV2DashboardDashboardResourceCopyDashboardPost(id, dashboardRequest)

Copy dashboard

Copies a dashboard. Any values provided in the &#x60;dashboard&#x60; parameter replace those in the copied dashboard.  **[Permissions](#permissions) required:**  The dashboard to be copied must be shared with the user or the user must own it.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DashboardsApi()
val id : kotlin.String = id_example // kotlin.String | 
val dashboardRequest : DashboardRequest = {"name":"Auditors dashboard","description":"A dashboard to help auditors identify sample of issues to check.","sharePermissions":[{"type":"global"}]} // DashboardRequest | Dashboard details.
try {
    val result : Dashboard = apiInstance.comAtlassianJiraRestV2DashboardDashboardResourceCopyDashboardPost(id, dashboardRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardResourceCopyDashboardPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardResourceCopyDashboardPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **dashboardRequest** | [**DashboardRequest**](DashboardRequest.md)| Dashboard details. |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2DashboardDashboardResourceCreateDashboardPost"></a>
# **comAtlassianJiraRestV2DashboardDashboardResourceCreateDashboardPost**
> Dashboard comAtlassianJiraRestV2DashboardDashboardResourceCreateDashboardPost(dashboardRequest)

Create dashboard

Creates a dashboard.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DashboardsApi()
val dashboardRequest : DashboardRequest = {"name":"Auditors dashboard","description":"A dashboard to help auditors identify sample of issues to check.","sharePermissions":[{"type":"global"}]} // DashboardRequest | Dashboard details.
try {
    val result : Dashboard = apiInstance.comAtlassianJiraRestV2DashboardDashboardResourceCreateDashboardPost(dashboardRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardResourceCreateDashboardPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardResourceCreateDashboardPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardRequest** | [**DashboardRequest**](DashboardRequest.md)| Dashboard details. |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2DashboardDashboardResourceDeleteDashboardDelete"></a>
# **comAtlassianJiraRestV2DashboardDashboardResourceDeleteDashboardDelete**
> comAtlassianJiraRestV2DashboardDashboardResourceDeleteDashboardDelete(id)

Delete dashboard

Deletes a dashboard.  **[Permissions](#permissions) required:**  The dashboard to be deleted must be owned by the user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DashboardsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the dashboard.
try {
    apiInstance.comAtlassianJiraRestV2DashboardDashboardResourceDeleteDashboardDelete(id)
} catch (e: ClientException) {
    println("4xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardResourceDeleteDashboardDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardResourceDeleteDashboardDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the dashboard. |

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

<a name="comAtlassianJiraRestV2DashboardDashboardResourceGetAllDashboardsGet"></a>
# **comAtlassianJiraRestV2DashboardDashboardResourceGetAllDashboardsGet**
> PageOfDashboards comAtlassianJiraRestV2DashboardDashboardResourceGetAllDashboardsGet(filter, startAt, maxResults)

Get all dashboards

Returns a list of dashboards owned by or shared with the user. The list may be filtered to include only favorite or owned dashboards.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DashboardsApi()
val filter : kotlin.String = filter_example // kotlin.String | The filter applied to the list of dashboards. Valid values are:   *  `favourite` Returns dashboards the user has marked as favorite.  *  `my` Returns dashboards owned by the user.
val startAt : kotlin.Int = 56 // kotlin.Int | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageOfDashboards = apiInstance.comAtlassianJiraRestV2DashboardDashboardResourceGetAllDashboardsGet(filter, startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardResourceGetAllDashboardsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardResourceGetAllDashboardsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **kotlin.String**| The filter applied to the list of dashboards. Valid values are:   *  &#x60;favourite&#x60; Returns dashboards the user has marked as favorite.  *  &#x60;my&#x60; Returns dashboards owned by the user. | [optional] [enum: my, favourite]
 **startAt** | **kotlin.Int**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 20]

### Return type

[**PageOfDashboards**](PageOfDashboards.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardGet"></a>
# **comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardGet**
> Dashboard comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardGet(id)

Get dashboard

Returns a dashboard.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.  However, to get a dashboard, the dashboard must be shared with the user or the user must own it. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DashboardsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the dashboard.
try {
    val result : Dashboard = apiInstance.comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the dashboard. |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardsPaginatedGet"></a>
# **comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardsPaginatedGet**
> PageBeanDashboard comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardsPaginatedGet(dashboardName, accountId, owner, groupname, projectId, orderBy, startAt, maxResults, expand)

Search for dashboards

Searches for dashboards. This operation is similar to [Get dashboards](#api-rest-api-3-dashboard-get) except that the results can be refined to include dashboards that have specific attributes. For example, dashboards with a particular name. When multiple attributes are specified only filters matching all attributes are returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The following dashboards that match the query parameters are returned:   *  Dashboards owned by the user. Not returned for anonymous users.  *  Dashboards shared with a group that the user is a member of. Not returned for anonymous users.  *  Dashboards shared with a private project that the user can browse. Not returned for anonymous users.  *  Dashboards shared with a public project.  *  Dashboards shared with the public.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DashboardsApi()
val dashboardName : kotlin.String = dashboardName_example // kotlin.String | String used to perform a case-insensitive partial match with `name`.
val accountId : kotlin.String = accountId_example // kotlin.String | User account ID used to return dashboards with the matching `owner.accountId`. This parameter cannot be used with the `owner` parameter.
val owner : kotlin.String = owner_example // kotlin.String | This parameter is deprecated because of privacy changes. Use `accountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return dashboards with the matching `owner.name`. This parameter cannot be used with the `accountId` parameter.
val groupname : kotlin.String = groupname_example // kotlin.String | Group name used to returns dashboards that are shared with a group that matches `sharePermissions.group.name`.
val projectId : kotlin.Long = 789 // kotlin.Long | Project ID used to returns dashboards that are shared with a project that matches `sharePermissions.project.id`.
val orderBy : kotlin.String = orderBy_example // kotlin.String | [Order](#ordering) the results by a field:   *  `description` Sorts by dashboard description. Note that this sort works independently of whether the expand to display the description field is in use.  *  `favourite_count` Sorts by dashboard popularity.  *  `id` Sorts by dashboard ID.  *  `is_favourite` Sorts by whether the dashboard is marked as a favorite.  *  `name` Sorts by dashboard name.  *  `owner` Sorts by dashboard owner name.
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about dashboard in the response. This parameter accepts a comma-separated list. Expand options include:   *  `description` Returns the description of the dashboard.  *  `owner` Returns the owner of the dashboard.  *  `viewUrl` Returns the URL that is used to view the dashboard.  *  `favourite` Returns `isFavourite`, an indicator of whether the user has set the dashboard as a favorite.  *  `favouritedCount` Returns `popularity`, a count of how many users have set this dashboard as a favorite.  *  `sharePermissions` Returns details of the share permissions defined for the dashboard.
try {
    val result : PageBeanDashboard = apiInstance.comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardsPaginatedGet(dashboardName, accountId, owner, groupname, projectId, orderBy, startAt, maxResults, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardsPaginatedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardResourceGetDashboardsPaginatedGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardName** | **kotlin.String**| String used to perform a case-insensitive partial match with &#x60;name&#x60;. | [optional]
 **accountId** | **kotlin.String**| User account ID used to return dashboards with the matching &#x60;owner.accountId&#x60;. This parameter cannot be used with the &#x60;owner&#x60; parameter. | [optional]
 **owner** | **kotlin.String**| This parameter is deprecated because of privacy changes. Use &#x60;accountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return dashboards with the matching &#x60;owner.name&#x60;. This parameter cannot be used with the &#x60;accountId&#x60; parameter. | [optional]
 **groupname** | **kotlin.String**| Group name used to returns dashboards that are shared with a group that matches &#x60;sharePermissions.group.name&#x60;. | [optional]
 **projectId** | **kotlin.Long**| Project ID used to returns dashboards that are shared with a project that matches &#x60;sharePermissions.project.id&#x60;. | [optional]
 **orderBy** | **kotlin.String**| [Order](#ordering) the results by a field:   *  &#x60;description&#x60; Sorts by dashboard description. Note that this sort works independently of whether the expand to display the description field is in use.  *  &#x60;favourite_count&#x60; Sorts by dashboard popularity.  *  &#x60;id&#x60; Sorts by dashboard ID.  *  &#x60;is_favourite&#x60; Sorts by whether the dashboard is marked as a favorite.  *  &#x60;name&#x60; Sorts by dashboard name.  *  &#x60;owner&#x60; Sorts by dashboard owner name. | [optional] [default to &#39;name&#39;] [enum: description, -description, +description, favorite_count, -favorite_count, +favorite_count, id, -id, +id, is_favorite, -is_favorite, +is_favorite, name, -name, +name, owner, -owner, +owner]
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about dashboard in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;description&#x60; Returns the description of the dashboard.  *  &#x60;owner&#x60; Returns the owner of the dashboard.  *  &#x60;viewUrl&#x60; Returns the URL that is used to view the dashboard.  *  &#x60;favourite&#x60; Returns &#x60;isFavourite&#x60;, an indicator of whether the user has set the dashboard as a favorite.  *  &#x60;favouritedCount&#x60; Returns &#x60;popularity&#x60;, a count of how many users have set this dashboard as a favorite.  *  &#x60;sharePermissions&#x60; Returns details of the share permissions defined for the dashboard. | [optional]

### Return type

[**PageBeanDashboard**](PageBeanDashboard.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2DashboardDashboardResourceUpdateDashboardPut"></a>
# **comAtlassianJiraRestV2DashboardDashboardResourceUpdateDashboardPut**
> Dashboard comAtlassianJiraRestV2DashboardDashboardResourceUpdateDashboardPut(id, dashboardRequest)

Update dashboard

Updates a dashboard, replacing all the dashboard details with those provided.  **[Permissions](#permissions) required:**  The dashboard to be updated must be owned by the user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DashboardsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the dashboard to update.
val dashboardRequest : DashboardRequest = {"name":"Auditors dashboard","description":"A dashboard to help auditors identify sample of issues to check.","sharePermissions":[{"type":"global"}]} // DashboardRequest | Replacement dashboard details.
try {
    val result : Dashboard = apiInstance.comAtlassianJiraRestV2DashboardDashboardResourceUpdateDashboardPut(id, dashboardRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardResourceUpdateDashboardPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DashboardsApi#comAtlassianJiraRestV2DashboardDashboardResourceUpdateDashboardPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the dashboard to update. |
 **dashboardRequest** | [**DashboardRequest**](DashboardRequest.md)| Replacement dashboard details. |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

