# IssueTypesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypeAvatarPost**](IssueTypesApi.md#comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypeAvatarPost) | **POST** /rest/api/3/issuetype/{id}/avatar2 | Load issue type avatar
[**comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypePost**](IssueTypesApi.md#comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypePost) | **POST** /rest/api/3/issuetype | Create issue type
[**comAtlassianJiraRestV2IssueIssueTypeResourceDeleteIssueTypeDelete**](IssueTypesApi.md#comAtlassianJiraRestV2IssueIssueTypeResourceDeleteIssueTypeDelete) | **DELETE** /rest/api/3/issuetype/{id} | Delete issue type
[**comAtlassianJiraRestV2IssueIssueTypeResourceGetAlternativeIssueTypesGet**](IssueTypesApi.md#comAtlassianJiraRestV2IssueIssueTypeResourceGetAlternativeIssueTypesGet) | **GET** /rest/api/3/issuetype/{id}/alternatives | Get alternative issue types
[**comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueAllTypesGet**](IssueTypesApi.md#comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueAllTypesGet) | **GET** /rest/api/3/issuetype | Get all issue types for user
[**comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueTypeGet**](IssueTypesApi.md#comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueTypeGet) | **GET** /rest/api/3/issuetype/{id} | Get issue type
[**comAtlassianJiraRestV2IssueIssueTypeResourceUpdateIssueTypePut**](IssueTypesApi.md#comAtlassianJiraRestV2IssueIssueTypeResourceUpdateIssueTypePut) | **PUT** /rest/api/3/issuetype/{id} | Update issue type


<a name="comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypeAvatarPost"></a>
# **comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypeAvatarPost**
> Avatar comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypeAvatarPost(id, size, body, x, y)

Load issue type avatar

Loads an avatar for the issue type.  Specify the avatar&#39;s local file location in the body of the request. Also, include the following headers:   *  &#x60;X-Atlassian-Token: no-check&#x60; To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).  *  &#x60;Content-Type: image/image type&#x60; Valid image types are JPEG, GIF, or PNG.  For example:   &#x60;curl --request POST \\ --user email@example.com:&lt;api_token&gt; \\ --header &#39;X-Atlassian-Token: no-check&#39; \\ --header &#39;Content-Type: image/&lt; image_type&gt;&#39; \\ --data-binary \&quot;&lt;@/path/to/file/with/your/avatar&gt;\&quot; \\ --url &#39;https://your-domain.atlassian.net/rest/api/3/issuetype/{issueTypeId}&#39;This&#x60;  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square&#39;s sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar, use [ Update issue type](#api-rest-api-3-issuetype-id-put) to set it as the issue type&#39;s displayed avatar.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueTypesApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the issue type.
val size : kotlin.Int = 56 // kotlin.Int | The length of each side of the crop region.
val body : kotlin.Any =  // kotlin.Any | 
val x : kotlin.Int = 56 // kotlin.Int | The X coordinate of the top-left corner of the crop region.
val y : kotlin.Int = 56 // kotlin.Int | The Y coordinate of the top-left corner of the crop region.
try {
    val result : Avatar = apiInstance.comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypeAvatarPost(id, size, body, x, y)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueTypesApi#comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypeAvatarPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueTypesApi#comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypeAvatarPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the issue type. |
 **size** | **kotlin.Int**| The length of each side of the crop region. |
 **body** | **kotlin.Any**|  |
 **x** | **kotlin.Int**| The X coordinate of the top-left corner of the crop region. | [optional] [default to 0]
 **y** | **kotlin.Int**| The Y coordinate of the top-left corner of the crop region. | [optional] [default to 0]

### Return type

[**Avatar**](Avatar.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypePost"></a>
# **comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypePost**
> IssueTypeDetails comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypePost(issueTypeCreateBean)

Create issue type

Creates an issue type and adds it to the default issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueTypesApi()
val issueTypeCreateBean : IssueTypeCreateBean = {"name":"name","description":"description","type":"standard"} // IssueTypeCreateBean | 
try {
    val result : IssueTypeDetails = apiInstance.comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypePost(issueTypeCreateBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueTypesApi#comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueTypesApi#comAtlassianJiraRestV2IssueIssueTypeResourceCreateIssueTypePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueTypeCreateBean** | [**IssueTypeCreateBean**](IssueTypeCreateBean.md)|  |

### Return type

[**IssueTypeDetails**](IssueTypeDetails.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueTypeResourceDeleteIssueTypeDelete"></a>
# **comAtlassianJiraRestV2IssueIssueTypeResourceDeleteIssueTypeDelete**
> comAtlassianJiraRestV2IssueIssueTypeResourceDeleteIssueTypeDelete(id, alternativeIssueTypeId)

Delete issue type

Deletes the issue type. If the issue type is in use, all uses are updated with the alternative issue type (&#x60;alternativeIssueTypeId&#x60;). A list of alternative issue types are obtained from the [Get alternative issue types](#api-rest-api-3-issuetype-id-alternatives-get) resource.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueTypesApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the issue type.
val alternativeIssueTypeId : kotlin.String = alternativeIssueTypeId_example // kotlin.String | The ID of the replacement issue type.
try {
    apiInstance.comAtlassianJiraRestV2IssueIssueTypeResourceDeleteIssueTypeDelete(id, alternativeIssueTypeId)
} catch (e: ClientException) {
    println("4xx response calling IssueTypesApi#comAtlassianJiraRestV2IssueIssueTypeResourceDeleteIssueTypeDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueTypesApi#comAtlassianJiraRestV2IssueIssueTypeResourceDeleteIssueTypeDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the issue type. |
 **alternativeIssueTypeId** | **kotlin.String**| The ID of the replacement issue type. | [optional]

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

<a name="comAtlassianJiraRestV2IssueIssueTypeResourceGetAlternativeIssueTypesGet"></a>
# **comAtlassianJiraRestV2IssueIssueTypeResourceGetAlternativeIssueTypesGet**
> kotlin.Array&lt;IssueTypeDetails&gt; comAtlassianJiraRestV2IssueIssueTypeResourceGetAlternativeIssueTypesGet(id)

Get alternative issue types

Returns a list of issue types that can be used to replace the issue type. The alternative issue types are those assigned to the same workflow scheme, field configuration scheme, and screen scheme.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueTypesApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the issue type.
try {
    val result : kotlin.Array<IssueTypeDetails> = apiInstance.comAtlassianJiraRestV2IssueIssueTypeResourceGetAlternativeIssueTypesGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueTypesApi#comAtlassianJiraRestV2IssueIssueTypeResourceGetAlternativeIssueTypesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueTypesApi#comAtlassianJiraRestV2IssueIssueTypeResourceGetAlternativeIssueTypesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the issue type. |

### Return type

[**kotlin.Array&lt;IssueTypeDetails&gt;**](IssueTypeDetails.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueAllTypesGet"></a>
# **comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueAllTypesGet**
> kotlin.Array&lt;IssueTypeDetails&gt; comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueAllTypesGet()

Get all issue types for user

Returns all issue types.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Issue types are only returned as follows:   *  if the user has the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), all issue types are returned.  *  if the user has the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, the issue types associated with the projects the user has permission to browse are returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueTypesApi()
try {
    val result : kotlin.Array<IssueTypeDetails> = apiInstance.comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueAllTypesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueTypesApi#comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueAllTypesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueTypesApi#comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueAllTypesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;IssueTypeDetails&gt;**](IssueTypeDetails.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueTypeGet"></a>
# **comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueTypeGet**
> IssueTypeDetails comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueTypeGet(id)

Get issue type

Returns an issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) in a project the issue type is associated with or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueTypesApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the issue type.
try {
    val result : IssueTypeDetails = apiInstance.comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueTypeGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueTypesApi#comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueTypeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueTypesApi#comAtlassianJiraRestV2IssueIssueTypeResourceGetIssueTypeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the issue type. |

### Return type

[**IssueTypeDetails**](IssueTypeDetails.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueTypeResourceUpdateIssueTypePut"></a>
# **comAtlassianJiraRestV2IssueIssueTypeResourceUpdateIssueTypePut**
> IssueTypeDetails comAtlassianJiraRestV2IssueIssueTypeResourceUpdateIssueTypePut(id, issueTypeUpdateBean)

Update issue type

Updates the issue type.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueTypesApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the issue type.
val issueTypeUpdateBean : IssueTypeUpdateBean = {"avatarId":1,"name":"name","description":"description"} // IssueTypeUpdateBean | 
try {
    val result : IssueTypeDetails = apiInstance.comAtlassianJiraRestV2IssueIssueTypeResourceUpdateIssueTypePut(id, issueTypeUpdateBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueTypesApi#comAtlassianJiraRestV2IssueIssueTypeResourceUpdateIssueTypePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueTypesApi#comAtlassianJiraRestV2IssueIssueTypeResourceUpdateIssueTypePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the issue type. |
 **issueTypeUpdateBean** | [**IssueTypeUpdateBean**](IssueTypeUpdateBean.md)|  |

### Return type

[**IssueTypeDetails**](IssueTypeDetails.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

