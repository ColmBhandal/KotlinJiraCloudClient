# IssueRemoteLinksApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueIssueResourceCreateOrUpdateRemoteIssueLinkPost**](IssueRemoteLinksApi.md#comAtlassianJiraRestV2IssueIssueResourceCreateOrUpdateRemoteIssueLinkPost) | **POST** /rest/api/3/issue/{issueIdOrKey}/remotelink | Create or update remote issue link
[**comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByGlobalIdDelete**](IssueRemoteLinksApi.md#comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByGlobalIdDelete) | **DELETE** /rest/api/3/issue/{issueIdOrKey}/remotelink | Delete remote issue link by global ID
[**comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByIdDelete**](IssueRemoteLinksApi.md#comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByIdDelete) | **DELETE** /rest/api/3/issue/{issueIdOrKey}/remotelink/{linkId} | Delete remote issue link by ID
[**comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinkByIdGet**](IssueRemoteLinksApi.md#comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinkByIdGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/remotelink/{linkId} | Get remote issue link by ID
[**comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinksGet**](IssueRemoteLinksApi.md#comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinksGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/remotelink | Get remote issue links
[**comAtlassianJiraRestV2IssueIssueResourceUpdateRemoteIssueLinkPut**](IssueRemoteLinksApi.md#comAtlassianJiraRestV2IssueIssueResourceUpdateRemoteIssueLinkPut) | **PUT** /rest/api/3/issue/{issueIdOrKey}/remotelink/{linkId} | Update remote issue link by ID


<a name="comAtlassianJiraRestV2IssueIssueResourceCreateOrUpdateRemoteIssueLinkPost"></a>
# **comAtlassianJiraRestV2IssueIssueResourceCreateOrUpdateRemoteIssueLinkPost**
> RemoteIssueLinkIdentifies comAtlassianJiraRestV2IssueIssueResourceCreateOrUpdateRemoteIssueLinkPost(issueIdOrKey, requestBody)

Create or update remote issue link

Creates or updates a remote issue link for an issue.  If a &#x60;globalId&#x60; is provided and a remote issue link with that global ID is found it is updated. Any fields without values in the request are set to null. Otherwise, the remote issue link is created.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueRemoteLinksApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"application":{"name":"My Acme Tracker","type":"com.acme.tracker"},"globalId":"system=http://www.mycompany.com/support&id=1","relationship":"causes","object":{"summary":"Customer support issue","icon":{"url16x16":"http://www.mycompany.com/support/ticket.png","title":"Support Ticket"},"title":"TSTSUP-111","url":"http://www.mycompany.com/support?id=1","status":{"icon":{"url16x16":"http://www.mycompany.com/support/resolved.png","link":"http://www.mycompany.com/support?id=1&details=closed","title":"Case Closed"},"resolved":true}}} // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
try {
    val result : RemoteIssueLinkIdentifies = apiInstance.comAtlassianJiraRestV2IssueIssueResourceCreateOrUpdateRemoteIssueLinkPost(issueIdOrKey, requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueRemoteLinksApi#comAtlassianJiraRestV2IssueIssueResourceCreateOrUpdateRemoteIssueLinkPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueRemoteLinksApi#comAtlassianJiraRestV2IssueIssueResourceCreateOrUpdateRemoteIssueLinkPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  |

### Return type

[**RemoteIssueLinkIdentifies**](RemoteIssueLinkIdentifies.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByGlobalIdDelete"></a>
# **comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByGlobalIdDelete**
> comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByGlobalIdDelete(issueIdOrKey, globalId)

Delete remote issue link by global ID

Deletes the remote issue link from the issue using the link&#39;s global ID. Where the global ID includes reserved URL characters these must be escaped in the request. For example, pass &#x60;system&#x3D;http://www.mycompany.com/support&amp;id&#x3D;1&#x60; as &#x60;system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1&#x60;.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is implemented, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueRemoteLinksApi()
val issueIdOrKey : kotlin.String = 10000 // kotlin.String | The ID or key of the issue.
val globalId : kotlin.String = system=http://www.mycompany.com/support&id=1 // kotlin.String | The global ID of a remote issue link.
try {
    apiInstance.comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByGlobalIdDelete(issueIdOrKey, globalId)
} catch (e: ClientException) {
    println("4xx response calling IssueRemoteLinksApi#comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByGlobalIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueRemoteLinksApi#comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByGlobalIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **globalId** | **kotlin.String**| The global ID of a remote issue link. |

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

<a name="comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByIdDelete"></a>
# **comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByIdDelete**
> comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByIdDelete(issueIdOrKey, linkId)

Delete remote issue link by ID

Deletes a remote issue link from an issue.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects*, *Edit issues*, and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueRemoteLinksApi()
val issueIdOrKey : kotlin.String = 10000 // kotlin.String | The ID or key of the issue.
val linkId : kotlin.String = 10000 // kotlin.String | The ID of a remote issue link.
try {
    apiInstance.comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByIdDelete(issueIdOrKey, linkId)
} catch (e: ClientException) {
    println("4xx response calling IssueRemoteLinksApi#comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueRemoteLinksApi#comAtlassianJiraRestV2IssueIssueResourceDeleteRemoteIssueLinkByIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **linkId** | **kotlin.String**| The ID of a remote issue link. |

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

<a name="comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinkByIdGet"></a>
# **comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinkByIdGet**
> RemoteIssueLink comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinkByIdGet(issueIdOrKey, linkId)

Get remote issue link by ID

Returns a remote issue link for an issue.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueRemoteLinksApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val linkId : kotlin.String = linkId_example // kotlin.String | The ID of the remote issue link.
try {
    val result : RemoteIssueLink = apiInstance.comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinkByIdGet(issueIdOrKey, linkId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueRemoteLinksApi#comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinkByIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueRemoteLinksApi#comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinkByIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **linkId** | **kotlin.String**| The ID of the remote issue link. |

### Return type

[**RemoteIssueLink**](RemoteIssueLink.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinksGet"></a>
# **comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinksGet**
> RemoteIssueLink comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinksGet(issueIdOrKey, globalId)

Get remote issue links

Returns the remote issue links for an issue. When a remote issue link global ID is provided the record with that global ID is returned, otherwise all remote issue links are returned. Where a global ID includes reserved URL characters these must be escaped in the request. For example, pass &#x60;system&#x3D;http://www.mycompany.com/support&amp;id&#x3D;1&#x60; as &#x60;system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1&#x60;.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueRemoteLinksApi()
val issueIdOrKey : kotlin.String = 10000 // kotlin.String | The ID or key of the issue.
val globalId : kotlin.String = globalId_example // kotlin.String | The global ID of the remote issue link.
try {
    val result : RemoteIssueLink = apiInstance.comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinksGet(issueIdOrKey, globalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueRemoteLinksApi#comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinksGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueRemoteLinksApi#comAtlassianJiraRestV2IssueIssueResourceGetRemoteIssueLinksGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **globalId** | **kotlin.String**| The global ID of the remote issue link. | [optional]

### Return type

[**RemoteIssueLink**](RemoteIssueLink.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueResourceUpdateRemoteIssueLinkPut"></a>
# **comAtlassianJiraRestV2IssueIssueResourceUpdateRemoteIssueLinkPut**
> kotlin.Any comAtlassianJiraRestV2IssueIssueResourceUpdateRemoteIssueLinkPut(issueIdOrKey, linkId, requestBody)

Update remote issue link by ID

Updates a remote issue link for an issue.  Note: Fields without values in the request are set to null.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueRemoteLinksApi()
val issueIdOrKey : kotlin.String = 10000 // kotlin.String | The ID or key of the issue.
val linkId : kotlin.String = 10000 // kotlin.String | The ID of the remote issue link.
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"application":{"name":"My Acme Tracker","type":"com.acme.tracker"},"globalId":"system=http://www.mycompany.com/support&id=1","relationship":"causes","object":{"summary":"Customer support issue","icon":{"url16x16":"http://www.mycompany.com/support/ticket.png","title":"Support Ticket"},"title":"TSTSUP-111","url":"http://www.mycompany.com/support?id=1","status":{"icon":{"url16x16":"http://www.mycompany.com/support/resolved.png","link":"http://www.mycompany.com/support?id=1&details=closed","title":"Case Closed"},"resolved":true}}} // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueIssueResourceUpdateRemoteIssueLinkPut(issueIdOrKey, linkId, requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueRemoteLinksApi#comAtlassianJiraRestV2IssueIssueResourceUpdateRemoteIssueLinkPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueRemoteLinksApi#comAtlassianJiraRestV2IssueIssueResourceUpdateRemoteIssueLinkPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **linkId** | **kotlin.String**| The ID of the remote issue link. |
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  |

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

