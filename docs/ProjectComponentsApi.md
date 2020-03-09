# ProjectComponentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueComponentResourceCreateComponentPost**](ProjectComponentsApi.md#comAtlassianJiraRestV2IssueComponentResourceCreateComponentPost) | **POST** /rest/api/3/component | Create component
[**comAtlassianJiraRestV2IssueComponentResourceDeleteComponentDelete**](ProjectComponentsApi.md#comAtlassianJiraRestV2IssueComponentResourceDeleteComponentDelete) | **DELETE** /rest/api/3/component/{id} | Delete component
[**comAtlassianJiraRestV2IssueComponentResourceGetComponentGet**](ProjectComponentsApi.md#comAtlassianJiraRestV2IssueComponentResourceGetComponentGet) | **GET** /rest/api/3/component/{id} | Get component
[**comAtlassianJiraRestV2IssueComponentResourceGetComponentRelatedIssuesGet**](ProjectComponentsApi.md#comAtlassianJiraRestV2IssueComponentResourceGetComponentRelatedIssuesGet) | **GET** /rest/api/3/component/{id}/relatedIssueCounts | Get component issues count
[**comAtlassianJiraRestV2IssueComponentResourceUpdateComponentPut**](ProjectComponentsApi.md#comAtlassianJiraRestV2IssueComponentResourceUpdateComponentPut) | **PUT** /rest/api/3/component/{id} | Update component
[**comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsGet**](ProjectComponentsApi.md#comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsGet) | **GET** /rest/api/3/project/{projectIdOrKey}/components | Get project components
[**comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsPaginatedGet**](ProjectComponentsApi.md#comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsPaginatedGet) | **GET** /rest/api/3/project/{projectIdOrKey}/component | Get project components paginated


<a name="comAtlassianJiraRestV2IssueComponentResourceCreateComponentPost"></a>
# **comAtlassianJiraRestV2IssueComponentResourceCreateComponentPost**
> Component comAtlassianJiraRestV2IssueComponentResourceCreateComponentPost(component)

Create component

Creates a component. Use components to provide containers for issues within a project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the component is created or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectComponentsApi()
val component : Component = {"isAssigneeTypeValid":false,"name":"Component 1","description":"This is a Jira component","project":"HSP","assigneeType":"PROJECT_LEAD","leadAccountId":"5b10a2844c20165700ede21g"} // Component | 
try {
    val result : Component = apiInstance.comAtlassianJiraRestV2IssueComponentResourceCreateComponentPost(component)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectComponentsApi#comAtlassianJiraRestV2IssueComponentResourceCreateComponentPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectComponentsApi#comAtlassianJiraRestV2IssueComponentResourceCreateComponentPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **component** | [**Component**](Component.md)|  |

### Return type

[**Component**](Component.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueComponentResourceDeleteComponentDelete"></a>
# **comAtlassianJiraRestV2IssueComponentResourceDeleteComponentDelete**
> comAtlassianJiraRestV2IssueComponentResourceDeleteComponentDelete(id, moveIssuesTo)

Delete component

Deletes a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectComponentsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the component.
val moveIssuesTo : kotlin.String = moveIssuesTo_example // kotlin.String | The ID of the component to replace the deleted component. If this value is null no replacement is made.
try {
    apiInstance.comAtlassianJiraRestV2IssueComponentResourceDeleteComponentDelete(id, moveIssuesTo)
} catch (e: ClientException) {
    println("4xx response calling ProjectComponentsApi#comAtlassianJiraRestV2IssueComponentResourceDeleteComponentDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectComponentsApi#comAtlassianJiraRestV2IssueComponentResourceDeleteComponentDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the component. |
 **moveIssuesTo** | **kotlin.String**| The ID of the component to replace the deleted component. If this value is null no replacement is made. | [optional]

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

<a name="comAtlassianJiraRestV2IssueComponentResourceGetComponentGet"></a>
# **comAtlassianJiraRestV2IssueComponentResourceGetComponentGet**
> Component comAtlassianJiraRestV2IssueComponentResourceGetComponentGet(id)

Get component

Returns a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for project containing the component.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectComponentsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the component.
try {
    val result : Component = apiInstance.comAtlassianJiraRestV2IssueComponentResourceGetComponentGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectComponentsApi#comAtlassianJiraRestV2IssueComponentResourceGetComponentGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectComponentsApi#comAtlassianJiraRestV2IssueComponentResourceGetComponentGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the component. |

### Return type

[**Component**](Component.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueComponentResourceGetComponentRelatedIssuesGet"></a>
# **comAtlassianJiraRestV2IssueComponentResourceGetComponentRelatedIssuesGet**
> ComponentIssuesCount comAtlassianJiraRestV2IssueComponentResourceGetComponentRelatedIssuesGet(id)

Get component issues count

Returns the counts of issues assigned to the component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectComponentsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the component.
try {
    val result : ComponentIssuesCount = apiInstance.comAtlassianJiraRestV2IssueComponentResourceGetComponentRelatedIssuesGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectComponentsApi#comAtlassianJiraRestV2IssueComponentResourceGetComponentRelatedIssuesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectComponentsApi#comAtlassianJiraRestV2IssueComponentResourceGetComponentRelatedIssuesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the component. |

### Return type

[**ComponentIssuesCount**](ComponentIssuesCount.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueComponentResourceUpdateComponentPut"></a>
# **comAtlassianJiraRestV2IssueComponentResourceUpdateComponentPut**
> Component comAtlassianJiraRestV2IssueComponentResourceUpdateComponentPut(id, component)

Update component

Updates a component. Any fields included in the request are overwritten. If &#x60;leadAccountId&#x60; is an empty string (\&quot;\&quot;) the component lead is removed.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectComponentsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the component.
val component : Component = {"isAssigneeTypeValid":false,"name":"Component 1","description":"This is a Jira component","assigneeType":"PROJECT_LEAD","leadAccountId":"5b10a2844c20165700ede21g"} // Component | 
try {
    val result : Component = apiInstance.comAtlassianJiraRestV2IssueComponentResourceUpdateComponentPut(id, component)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectComponentsApi#comAtlassianJiraRestV2IssueComponentResourceUpdateComponentPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectComponentsApi#comAtlassianJiraRestV2IssueComponentResourceUpdateComponentPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the component. |
 **component** | [**Component**](Component.md)|  |

### Return type

[**Component**](Component.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsGet"></a>
# **comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsGet**
> kotlin.Array&lt;Component&gt; comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsGet(projectIdOrKey)

Get project components

Returns all components in a project. See the [Get project components paginated](#api-rest-api-3-project-projectIdOrKey-component-get) resource if you want to get a full list of components with pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectComponentsApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
try {
    val result : kotlin.Array<Component> = apiInstance.comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsGet(projectIdOrKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectComponentsApi#comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectComponentsApi#comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |

### Return type

[**kotlin.Array&lt;Component&gt;**](Component.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsPaginatedGet"></a>
# **comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsPaginatedGet**
> PageBeanComponentWithIssueCount comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsPaginatedGet(projectIdOrKey, startAt, maxResults, orderBy, query)

Get project components paginated

Returns a [paginated](#pagination) representation of all components in a project. See the [Get project components](#api-rest-api-3-project-projectIdOrKey-components-get) resource if you want to get a full list of versions without pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectComponentsApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val orderBy : kotlin.String = orderBy_example // kotlin.String | [Order](#ordering) the results by a field:   *  `description` Sorts by the component description.  *  `issueCount` Sorts by the count of issues associated with the component.  *  `lead` Sorts by the user key of the component's project lead.  *  `name` Sorts by component name.
val query : kotlin.String = query_example // kotlin.String | Filter the results using a literal string. Components with a matching `name` or `description` are returned (case insensitive).
try {
    val result : PageBeanComponentWithIssueCount = apiInstance.comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsPaginatedGet(projectIdOrKey, startAt, maxResults, orderBy, query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectComponentsApi#comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsPaginatedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectComponentsApi#comAtlassianJiraRestV2IssueProjectResourceGetProjectComponentsPaginatedGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]
 **orderBy** | **kotlin.String**| [Order](#ordering) the results by a field:   *  &#x60;description&#x60; Sorts by the component description.  *  &#x60;issueCount&#x60; Sorts by the count of issues associated with the component.  *  &#x60;lead&#x60; Sorts by the user key of the component&#39;s project lead.  *  &#x60;name&#x60; Sorts by component name. | [optional] [enum: description, -description, +description, issueCount, -issueCount, +issueCount, lead, -lead, +lead, name, -name, +name]
 **query** | **kotlin.String**| Filter the results using a literal string. Components with a matching &#x60;name&#x60; or &#x60;description&#x60; are returned (case insensitive). | [optional]

### Return type

[**PageBeanComponentWithIssueCount**](PageBeanComponentWithIssueCount.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

