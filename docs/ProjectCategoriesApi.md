# ProjectCategoriesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueProjectCategoryResourceCreateProjectCategoryPost**](ProjectCategoriesApi.md#comAtlassianJiraRestV2IssueProjectCategoryResourceCreateProjectCategoryPost) | **POST** /rest/api/3/projectCategory | Create project category
[**comAtlassianJiraRestV2IssueProjectCategoryResourceGetAllProjectCategoriesGet**](ProjectCategoriesApi.md#comAtlassianJiraRestV2IssueProjectCategoryResourceGetAllProjectCategoriesGet) | **GET** /rest/api/3/projectCategory | Get all project categories
[**comAtlassianJiraRestV2IssueProjectCategoryResourceGetProjectCategoryByIdGet**](ProjectCategoriesApi.md#comAtlassianJiraRestV2IssueProjectCategoryResourceGetProjectCategoryByIdGet) | **GET** /rest/api/3/projectCategory/{id} | Get project category by id
[**comAtlassianJiraRestV2IssueProjectCategoryResourceRemoveProjectCategoryDelete**](ProjectCategoriesApi.md#comAtlassianJiraRestV2IssueProjectCategoryResourceRemoveProjectCategoryDelete) | **DELETE** /rest/api/3/projectCategory/{id} | Delete project category
[**comAtlassianJiraRestV2IssueProjectCategoryResourceUpdateProjectCategoryPut**](ProjectCategoriesApi.md#comAtlassianJiraRestV2IssueProjectCategoryResourceUpdateProjectCategoryPut) | **PUT** /rest/api/3/projectCategory/{id} | Update project category


<a name="comAtlassianJiraRestV2IssueProjectCategoryResourceCreateProjectCategoryPost"></a>
# **comAtlassianJiraRestV2IssueProjectCategoryResourceCreateProjectCategoryPost**
> ProjectCategory comAtlassianJiraRestV2IssueProjectCategoryResourceCreateProjectCategoryPost(projectCategory)

Create project category

Creates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectCategoriesApi()
val projectCategory : ProjectCategory = {"name":"CREATED","description":"Created Project Category"} // ProjectCategory | 
try {
    val result : ProjectCategory = apiInstance.comAtlassianJiraRestV2IssueProjectCategoryResourceCreateProjectCategoryPost(projectCategory)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectCategoriesApi#comAtlassianJiraRestV2IssueProjectCategoryResourceCreateProjectCategoryPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectCategoriesApi#comAtlassianJiraRestV2IssueProjectCategoryResourceCreateProjectCategoryPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectCategory** | [**ProjectCategory**](ProjectCategory.md)|  |

### Return type

[**ProjectCategory**](ProjectCategory.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectCategoryResourceGetAllProjectCategoriesGet"></a>
# **comAtlassianJiraRestV2IssueProjectCategoryResourceGetAllProjectCategoriesGet**
> kotlin.Array&lt;ProjectCategory&gt; comAtlassianJiraRestV2IssueProjectCategoryResourceGetAllProjectCategoriesGet()

Get all project categories

Returns all project categories.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectCategoriesApi()
try {
    val result : kotlin.Array<ProjectCategory> = apiInstance.comAtlassianJiraRestV2IssueProjectCategoryResourceGetAllProjectCategoriesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectCategoriesApi#comAtlassianJiraRestV2IssueProjectCategoryResourceGetAllProjectCategoriesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectCategoriesApi#comAtlassianJiraRestV2IssueProjectCategoryResourceGetAllProjectCategoriesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ProjectCategory&gt;**](ProjectCategory.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectCategoryResourceGetProjectCategoryByIdGet"></a>
# **comAtlassianJiraRestV2IssueProjectCategoryResourceGetProjectCategoryByIdGet**
> ProjectCategory comAtlassianJiraRestV2IssueProjectCategoryResourceGetProjectCategoryByIdGet(id)

Get project category by id

Returns a project category.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectCategoriesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the project category.
try {
    val result : ProjectCategory = apiInstance.comAtlassianJiraRestV2IssueProjectCategoryResourceGetProjectCategoryByIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectCategoriesApi#comAtlassianJiraRestV2IssueProjectCategoryResourceGetProjectCategoryByIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectCategoriesApi#comAtlassianJiraRestV2IssueProjectCategoryResourceGetProjectCategoryByIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the project category. |

### Return type

[**ProjectCategory**](ProjectCategory.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectCategoryResourceRemoveProjectCategoryDelete"></a>
# **comAtlassianJiraRestV2IssueProjectCategoryResourceRemoveProjectCategoryDelete**
> comAtlassianJiraRestV2IssueProjectCategoryResourceRemoveProjectCategoryDelete(id)

Delete project category

Deletes a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectCategoriesApi()
val id : kotlin.Long = 789 // kotlin.Long | ID of the project category to delete.
try {
    apiInstance.comAtlassianJiraRestV2IssueProjectCategoryResourceRemoveProjectCategoryDelete(id)
} catch (e: ClientException) {
    println("4xx response calling ProjectCategoriesApi#comAtlassianJiraRestV2IssueProjectCategoryResourceRemoveProjectCategoryDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectCategoriesApi#comAtlassianJiraRestV2IssueProjectCategoryResourceRemoveProjectCategoryDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| ID of the project category to delete. |

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

<a name="comAtlassianJiraRestV2IssueProjectCategoryResourceUpdateProjectCategoryPut"></a>
# **comAtlassianJiraRestV2IssueProjectCategoryResourceUpdateProjectCategoryPut**
> UpdatedProjectCategory comAtlassianJiraRestV2IssueProjectCategoryResourceUpdateProjectCategoryPut(id, projectCategory)

Update project category

Updates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectCategoriesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
val projectCategory : ProjectCategory = {"name":"UPDATED","description":"Updated Project Category"} // ProjectCategory | 
try {
    val result : UpdatedProjectCategory = apiInstance.comAtlassianJiraRestV2IssueProjectCategoryResourceUpdateProjectCategoryPut(id, projectCategory)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectCategoriesApi#comAtlassianJiraRestV2IssueProjectCategoryResourceUpdateProjectCategoryPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectCategoriesApi#comAtlassianJiraRestV2IssueProjectCategoryResourceUpdateProjectCategoryPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **projectCategory** | [**ProjectCategory**](ProjectCategory.md)|  |

### Return type

[**UpdatedProjectCategory**](UpdatedProjectCategory.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

