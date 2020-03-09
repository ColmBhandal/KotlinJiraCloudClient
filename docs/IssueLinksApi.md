# IssueLinksApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueLinkIssueResourceDeleteIssueLinkDelete**](IssueLinksApi.md#comAtlassianJiraRestV2IssueLinkIssueResourceDeleteIssueLinkDelete) | **DELETE** /rest/api/3/issueLink/{linkId} | Delete issue link
[**comAtlassianJiraRestV2IssueLinkIssueResourceGetIssueLinkGet**](IssueLinksApi.md#comAtlassianJiraRestV2IssueLinkIssueResourceGetIssueLinkGet) | **GET** /rest/api/3/issueLink/{linkId} | Get issue link
[**comAtlassianJiraRestV2IssueLinkIssueResourceLinkIssuesPost**](IssueLinksApi.md#comAtlassianJiraRestV2IssueLinkIssueResourceLinkIssuesPost) | **POST** /rest/api/3/issueLink | Create issue link


<a name="comAtlassianJiraRestV2IssueLinkIssueResourceDeleteIssueLinkDelete"></a>
# **comAtlassianJiraRestV2IssueLinkIssueResourceDeleteIssueLinkDelete**
> comAtlassianJiraRestV2IssueLinkIssueResourceDeleteIssueLinkDelete(linkId)

Delete issue link

Deletes an issue link.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  Browse project [project permission](https://confluence.atlassian.com/x/yodKLg) for all the projects containing the issues in the link.  *  *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one of the projects containing issues in the link.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, permission to view both of the issues.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueLinksApi()
val linkId : kotlin.String = linkId_example // kotlin.String | The ID of the issue link.
try {
    apiInstance.comAtlassianJiraRestV2IssueLinkIssueResourceDeleteIssueLinkDelete(linkId)
} catch (e: ClientException) {
    println("4xx response calling IssueLinksApi#comAtlassianJiraRestV2IssueLinkIssueResourceDeleteIssueLinkDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueLinksApi#comAtlassianJiraRestV2IssueLinkIssueResourceDeleteIssueLinkDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkId** | **kotlin.String**| The ID of the issue link. |

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

<a name="comAtlassianJiraRestV2IssueLinkIssueResourceGetIssueLinkGet"></a>
# **comAtlassianJiraRestV2IssueLinkIssueResourceGetIssueLinkGet**
> IssueLink comAtlassianJiraRestV2IssueLinkIssueResourceGetIssueLinkGet(linkId)

Get issue link

Returns an issue link.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse project* [project permission](https://confluence.atlassian.com/x/yodKLg) for all the projects containing the linked issues.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, permission to view both of the issues.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueLinksApi()
val linkId : kotlin.String = linkId_example // kotlin.String | The ID of the issue link.
try {
    val result : IssueLink = apiInstance.comAtlassianJiraRestV2IssueLinkIssueResourceGetIssueLinkGet(linkId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueLinksApi#comAtlassianJiraRestV2IssueLinkIssueResourceGetIssueLinkGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueLinksApi#comAtlassianJiraRestV2IssueLinkIssueResourceGetIssueLinkGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkId** | **kotlin.String**| The ID of the issue link. |

### Return type

[**IssueLink**](IssueLink.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueLinkIssueResourceLinkIssuesPost"></a>
# **comAtlassianJiraRestV2IssueLinkIssueResourceLinkIssuesPost**
> kotlin.Any comAtlassianJiraRestV2IssueLinkIssueResourceLinkIssuesPost(linkIssueRequestJsonBean)

Create issue link

Creates a link between two issues. Use this operation to indicate a relationship between two issues and optionally add a comment to the from (outward) issue. To use this resource the site must have [Issue Linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This resource returns nothing on the creation of an issue link. To obtain the ID of the issue link, use &#x60;https://your-domain.atlassian.net/rest/api/3/issue/[linked issue key]?fields&#x3D;issuelinks&#x60;.  If the link request duplicates a link, the response indicates that the issue link was created. If the request included a comment, the comment is added.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse project* [project permission](https://confluence.atlassian.com/x/yodKLg) for all the projects containing the issues to be linked,  *  *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) on the project containing the from (outward) issue,  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueLinksApi()
val linkIssueRequestJsonBean : LinkIssueRequestJsonBean = {"outwardIssue":{"key":"MKY-1"},"comment":{"visibility":{"type":"group","value":"jira-software-users"},"body":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"Linked related issue!","type":"text"}]}]}},"inwardIssue":{"key":"HSP-1"},"type":{"name":"Duplicate"}} // LinkIssueRequestJsonBean | The issue link request.
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueLinkIssueResourceLinkIssuesPost(linkIssueRequestJsonBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueLinksApi#comAtlassianJiraRestV2IssueLinkIssueResourceLinkIssuesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueLinksApi#comAtlassianJiraRestV2IssueLinkIssueResourceLinkIssuesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkIssueRequestJsonBean** | [**LinkIssueRequestJsonBean**](LinkIssueRequestJsonBean.md)| The issue link request. |

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

