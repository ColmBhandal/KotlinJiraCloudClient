# IssueWorklogsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueIssueWorklogsResourceAddWorklogPost**](IssueWorklogsApi.md#comAtlassianJiraRestV2IssueIssueWorklogsResourceAddWorklogPost) | **POST** /rest/api/3/issue/{issueIdOrKey}/worklog | Add worklog
[**comAtlassianJiraRestV2IssueIssueWorklogsResourceDeleteWorklogDelete**](IssueWorklogsApi.md#comAtlassianJiraRestV2IssueIssueWorklogsResourceDeleteWorklogDelete) | **DELETE** /rest/api/3/issue/{issueIdOrKey}/worklog/{id} | Delete worklog
[**comAtlassianJiraRestV2IssueIssueWorklogsResourceGetIssueWorklogGet**](IssueWorklogsApi.md#comAtlassianJiraRestV2IssueIssueWorklogsResourceGetIssueWorklogGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/worklog | Get issue worklogs
[**comAtlassianJiraRestV2IssueIssueWorklogsResourceGetWorklogGet**](IssueWorklogsApi.md#comAtlassianJiraRestV2IssueIssueWorklogsResourceGetWorklogGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/worklog/{id} | Get worklog
[**comAtlassianJiraRestV2IssueIssueWorklogsResourceUpdateWorklogPut**](IssueWorklogsApi.md#comAtlassianJiraRestV2IssueIssueWorklogsResourceUpdateWorklogPut) | **PUT** /rest/api/3/issue/{issueIdOrKey}/worklog/{id} | Update worklog
[**comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsDeletedSinceGet**](IssueWorklogsApi.md#comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsDeletedSinceGet) | **GET** /rest/api/3/worklog/deleted | Get IDs of deleted worklogs
[**comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsModifiedSinceGet**](IssueWorklogsApi.md#comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsModifiedSinceGet) | **GET** /rest/api/3/worklog/updated | Get IDs of updated worklogs
[**comAtlassianJiraRestV2IssueWorklogWorklogResourceGetWorklogsForIdsPost**](IssueWorklogsApi.md#comAtlassianJiraRestV2IssueWorklogWorklogResourceGetWorklogsForIdsPost) | **POST** /rest/api/3/worklog/list | Get worklogs


<a name="comAtlassianJiraRestV2IssueIssueWorklogsResourceAddWorklogPost"></a>
# **comAtlassianJiraRestV2IssueIssueWorklogsResourceAddWorklogPost**
> Worklog comAtlassianJiraRestV2IssueIssueWorklogsResourceAddWorklogPost(issueIdOrKey, requestBody, notifyUsers, adjustEstimate, newEstimate, reduceBy, expand, overrideEditableFlag)

Add worklog

Adds a worklog to an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Work on issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueWorklogsApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key the issue.
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"timeSpentSeconds":12000,"visibility":{"type":"group","value":"jira-developers"},"comment":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"I did some work here.","type":"text"}]}]},"started":"2020-03-06T06:05:24.483+0000"} // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
val notifyUsers : kotlin.Boolean = true // kotlin.Boolean | Whether users watching the issue are notified by email.
val adjustEstimate : kotlin.String = adjustEstimate_example // kotlin.String | Defines how to update the issue's time estimate, the options are:   *  `new` Sets the estimate to a specific value, defined in `newEstimate`.  *  `leave` Leaves the estimate unchanged.  *  `manual` Reduces the estimate by amount specified in `reduceBy`.  *  `auto` Reduces the estimate by the value of `timeSpent` in the worklog.
val newEstimate : kotlin.String = newEstimate_example // kotlin.String | The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when `adjustEstimate` is `new`.
val reduceBy : kotlin.String = reduceBy_example // kotlin.String | The amount to reduce the issue's remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m). For example, *2d*. Required when `adjustEstimate` is `manual`.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts `properties`, which returns worklog properties.
val overrideEditableFlag : kotlin.Boolean = true // kotlin.Boolean | Whether the worklog entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Only connect app users with admin scope permission can use this flag.
try {
    val result : Worklog = apiInstance.comAtlassianJiraRestV2IssueIssueWorklogsResourceAddWorklogPost(issueIdOrKey, requestBody, notifyUsers, adjustEstimate, newEstimate, reduceBy, expand, overrideEditableFlag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueIssueWorklogsResourceAddWorklogPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueIssueWorklogsResourceAddWorklogPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key the issue. |
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  |
 **notifyUsers** | **kotlin.Boolean**| Whether users watching the issue are notified by email. | [optional] [default to true]
 **adjustEstimate** | **kotlin.String**| Defines how to update the issue&#39;s time estimate, the options are:   *  &#x60;new&#x60; Sets the estimate to a specific value, defined in &#x60;newEstimate&#x60;.  *  &#x60;leave&#x60; Leaves the estimate unchanged.  *  &#x60;manual&#x60; Reduces the estimate by amount specified in &#x60;reduceBy&#x60;.  *  &#x60;auto&#x60; Reduces the estimate by the value of &#x60;timeSpent&#x60; in the worklog. | [optional] [default to &#39;auto&#39;] [enum: new, leave, manual, auto]
 **newEstimate** | **kotlin.String**| The value to set as the issue&#39;s remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;new&#x60;. | [optional]
 **reduceBy** | **kotlin.String**| The amount to reduce the issue&#39;s remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;manual&#x60;. | [optional]
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts &#x60;properties&#x60;, which returns worklog properties. | [optional] [default to &#39;&#39;]
 **overrideEditableFlag** | **kotlin.Boolean**| Whether the worklog entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Only connect app users with admin scope permission can use this flag. | [optional] [default to false]

### Return type

[**Worklog**](Worklog.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueWorklogsResourceDeleteWorklogDelete"></a>
# **comAtlassianJiraRestV2IssueIssueWorklogsResourceDeleteWorklogDelete**
> comAtlassianJiraRestV2IssueIssueWorklogsResourceDeleteWorklogDelete(issueIdOrKey, id, notifyUsers, adjustEstimate, newEstimate, increaseBy, overrideEditableFlag)

Delete worklog

Deletes a worklog from an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Delete all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to delete any worklog or *Delete own worklogs* to delete worklogs created by the user,  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueWorklogsApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val id : kotlin.String = id_example // kotlin.String | The ID of the worklog.
val notifyUsers : kotlin.Boolean = true // kotlin.Boolean | Whether users watching the issue are notified by email.
val adjustEstimate : kotlin.String = adjustEstimate_example // kotlin.String | Defines how to update the issue's time estimate, the options are:   *  `new` Sets the estimate to a specific value, defined in `newEstimate`.  *  `leave` Leaves the estimate unchanged.  *  `manual` Increases the estimate by amount specified in `increaseBy`.  *  `auto` Reduces the estimate by the value of `timeSpent` in the worklog.
val newEstimate : kotlin.String = newEstimate_example // kotlin.String | The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when `adjustEstimate` is `new`.
val increaseBy : kotlin.String = increaseBy_example // kotlin.String | The amount to increase the issue's remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when `adjustEstimate` is `manual`.
val overrideEditableFlag : kotlin.Boolean = true // kotlin.Boolean | Whether the work log entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Only connect app users with admin permissions can use this flag.
try {
    apiInstance.comAtlassianJiraRestV2IssueIssueWorklogsResourceDeleteWorklogDelete(issueIdOrKey, id, notifyUsers, adjustEstimate, newEstimate, increaseBy, overrideEditableFlag)
} catch (e: ClientException) {
    println("4xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueIssueWorklogsResourceDeleteWorklogDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueIssueWorklogsResourceDeleteWorklogDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **id** | **kotlin.String**| The ID of the worklog. |
 **notifyUsers** | **kotlin.Boolean**| Whether users watching the issue are notified by email. | [optional] [default to true]
 **adjustEstimate** | **kotlin.String**| Defines how to update the issue&#39;s time estimate, the options are:   *  &#x60;new&#x60; Sets the estimate to a specific value, defined in &#x60;newEstimate&#x60;.  *  &#x60;leave&#x60; Leaves the estimate unchanged.  *  &#x60;manual&#x60; Increases the estimate by amount specified in &#x60;increaseBy&#x60;.  *  &#x60;auto&#x60; Reduces the estimate by the value of &#x60;timeSpent&#x60; in the worklog. | [optional] [default to &#39;auto&#39;] [enum: new, leave, manual, auto]
 **newEstimate** | **kotlin.String**| The value to set as the issue&#39;s remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;new&#x60;. | [optional]
 **increaseBy** | **kotlin.String**| The amount to increase the issue&#39;s remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;manual&#x60;. | [optional]
 **overrideEditableFlag** | **kotlin.Boolean**| Whether the work log entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Only connect app users with admin permissions can use this flag. | [optional] [default to false]

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

<a name="comAtlassianJiraRestV2IssueIssueWorklogsResourceGetIssueWorklogGet"></a>
# **comAtlassianJiraRestV2IssueIssueWorklogsResourceGetIssueWorklogGet**
> PageOfWorklogs comAtlassianJiraRestV2IssueIssueWorklogsResourceGetIssueWorklogGet(issueIdOrKey, startAt, maxResults, startedAfter, expand)

Get issue worklogs

Returns worklogs for an issue, starting from the oldest worklog or from the worklog started on or after a date and time.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Workloads are only returned where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueWorklogsApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val startedAfter : kotlin.Long = 789 // kotlin.Long | The worklog start date and time, in UNIX timestamp format, after which worklogs are returned.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts`properties`, which returns worklog properties.
try {
    val result : PageOfWorklogs = apiInstance.comAtlassianJiraRestV2IssueIssueWorklogsResourceGetIssueWorklogGet(issueIdOrKey, startAt, maxResults, startedAfter, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueIssueWorklogsResourceGetIssueWorklogGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueIssueWorklogsResourceGetIssueWorklogGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 1048576]
 **startedAfter** | **kotlin.Long**| The worklog start date and time, in UNIX timestamp format, after which worklogs are returned. | [optional]
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts&#x60;properties&#x60;, which returns worklog properties. | [optional] [default to &#39;&#39;]

### Return type

[**PageOfWorklogs**](PageOfWorklogs.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueWorklogsResourceGetWorklogGet"></a>
# **comAtlassianJiraRestV2IssueIssueWorklogsResourceGetWorklogGet**
> Worklog comAtlassianJiraRestV2IssueIssueWorklogsResourceGetWorklogGet(issueIdOrKey, id, expand)

Get worklog

Returns a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueWorklogsApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val id : kotlin.String = id_example // kotlin.String | The ID of the worklog.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts  `properties`, which returns worklog properties.
try {
    val result : Worklog = apiInstance.comAtlassianJiraRestV2IssueIssueWorklogsResourceGetWorklogGet(issueIdOrKey, id, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueIssueWorklogsResourceGetWorklogGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueIssueWorklogsResourceGetWorklogGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **id** | **kotlin.String**| The ID of the worklog. |
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts  &#x60;properties&#x60;, which returns worklog properties. | [optional] [default to &#39;&#39;]

### Return type

[**Worklog**](Worklog.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueWorklogsResourceUpdateWorklogPut"></a>
# **comAtlassianJiraRestV2IssueIssueWorklogsResourceUpdateWorklogPut**
> Worklog comAtlassianJiraRestV2IssueIssueWorklogsResourceUpdateWorklogPut(issueIdOrKey, id, requestBody, notifyUsers, adjustEstimate, newEstimate, expand, overrideEditableFlag)

Update worklog

Updates a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any worklog or *Edit own worklogs* to update worklogs created by the user.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueWorklogsApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key the issue.
val id : kotlin.String = id_example // kotlin.String | The ID of the worklog.
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"timeSpentSeconds":12000,"visibility":{"type":"group","value":"jira-developers"},"comment":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"I did some work here.","type":"text"}]}]},"started":"2020-03-06T06:05:24.483+0000"} // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
val notifyUsers : kotlin.Boolean = true // kotlin.Boolean | Whether users watching the issue are notified by email.
val adjustEstimate : kotlin.String = adjustEstimate_example // kotlin.String | Defines how to update the issue's time estimate, the options are:   *  `new` Sets the estimate to a specific value, defined in `newEstimate`.  *  `leave` Leaves the estimate unchanged.  *  `auto` Updates the estimate by the difference between the original and updated value of `timeSpent` or `timeSpentSeconds`.
val newEstimate : kotlin.String = newEstimate_example // kotlin.String | The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when `adjustEstimate` is `new`.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts `properties`, which returns worklog properties.
val overrideEditableFlag : kotlin.Boolean = true // kotlin.Boolean | Whether the worklog should be added to the issue even if the issue is not editable. For example, because the issue is closed. Only connect app users with admin permissions can use this flag.
try {
    val result : Worklog = apiInstance.comAtlassianJiraRestV2IssueIssueWorklogsResourceUpdateWorklogPut(issueIdOrKey, id, requestBody, notifyUsers, adjustEstimate, newEstimate, expand, overrideEditableFlag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueIssueWorklogsResourceUpdateWorklogPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueIssueWorklogsResourceUpdateWorklogPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key the issue. |
 **id** | **kotlin.String**| The ID of the worklog. |
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  |
 **notifyUsers** | **kotlin.Boolean**| Whether users watching the issue are notified by email. | [optional] [default to true]
 **adjustEstimate** | **kotlin.String**| Defines how to update the issue&#39;s time estimate, the options are:   *  &#x60;new&#x60; Sets the estimate to a specific value, defined in &#x60;newEstimate&#x60;.  *  &#x60;leave&#x60; Leaves the estimate unchanged.  *  &#x60;auto&#x60; Updates the estimate by the difference between the original and updated value of &#x60;timeSpent&#x60; or &#x60;timeSpentSeconds&#x60;. | [optional] [default to &#39;auto&#39;] [enum: new, leave, manual, auto]
 **newEstimate** | **kotlin.String**| The value to set as the issue&#39;s remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;new&#x60;. | [optional]
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts &#x60;properties&#x60;, which returns worklog properties. | [optional] [default to &#39;&#39;]
 **overrideEditableFlag** | **kotlin.Boolean**| Whether the worklog should be added to the issue even if the issue is not editable. For example, because the issue is closed. Only connect app users with admin permissions can use this flag. | [optional] [default to false]

### Return type

[**Worklog**](Worklog.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsDeletedSinceGet"></a>
# **comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsDeletedSinceGet**
> ChangedWorklogs comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsDeletedSinceGet(since)

Get IDs of deleted worklogs

Returns a list of IDs and delete timestamps for worklogs deleted after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, &#x60;until&#x60; indicates the timestamp of the youngest item on the page. Also, &#x60;nextPage&#x60; provides the URL for the next page of worklogs. The &#x60;lastPage&#x60; parameter is set to true on the last page of worklogs.  This resource does not return worklogs deleted during the minute preceding the request.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueWorklogsApi()
val since : kotlin.Long = 789 // kotlin.Long | The date and time, in UNIX timestamp format, after which deleted worklogs are returned.
try {
    val result : ChangedWorklogs = apiInstance.comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsDeletedSinceGet(since)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsDeletedSinceGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsDeletedSinceGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **kotlin.Long**| The date and time, in UNIX timestamp format, after which deleted worklogs are returned. | [optional] [default to 0]

### Return type

[**ChangedWorklogs**](ChangedWorklogs.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsModifiedSinceGet"></a>
# **comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsModifiedSinceGet**
> ChangedWorklogs comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsModifiedSinceGet(since, expand)

Get IDs of updated worklogs

Returns a list of IDs and update timestamps for worklogs updated after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, &#x60;until&#x60; indicates the timestamp of the youngest item on the page. Also, &#x60;nextPage&#x60; provides the URL for the next page of worklogs. The &#x60;lastPage&#x60; parameter is set to true on the last page of worklogs.  This resource does not return worklogs updated during the minute preceding the request.  **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueWorklogsApi()
val since : kotlin.Long = 789 // kotlin.Long | The date and time, in UNIX timestamp format, after which updated worklogs are returned.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts `properties` that returns the properties of each worklog.
try {
    val result : ChangedWorklogs = apiInstance.comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsModifiedSinceGet(since, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsModifiedSinceGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsModifiedSinceGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **kotlin.Long**| The date and time, in UNIX timestamp format, after which updated worklogs are returned. | [optional] [default to 0]
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts &#x60;properties&#x60; that returns the properties of each worklog. | [optional] [default to &#39;&#39;]

### Return type

[**ChangedWorklogs**](ChangedWorklogs.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueWorklogWorklogResourceGetWorklogsForIdsPost"></a>
# **comAtlassianJiraRestV2IssueWorklogWorklogResourceGetWorklogsForIdsPost**
> kotlin.Array&lt;Worklog&gt; comAtlassianJiraRestV2IssueWorklogWorklogResourceGetWorklogsForIdsPost(worklogIdsRequestBean, expand)

Get worklogs

Returns worklog details for a list of worklog IDs.  The returned list of worklogs is limited to 1000 items.  **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueWorklogsApi()
val worklogIdsRequestBean : WorklogIdsRequestBean = {"ids":[1,2,5,10]} // WorklogIdsRequestBean | A JSON object containing a list of worklog IDs.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts `properties` that returns the properties of each worklog.
try {
    val result : kotlin.Array<Worklog> = apiInstance.comAtlassianJiraRestV2IssueWorklogWorklogResourceGetWorklogsForIdsPost(worklogIdsRequestBean, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueWorklogWorklogResourceGetWorklogsForIdsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueWorklogsApi#comAtlassianJiraRestV2IssueWorklogWorklogResourceGetWorklogsForIdsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **worklogIdsRequestBean** | [**WorklogIdsRequestBean**](WorklogIdsRequestBean.md)| A JSON object containing a list of worklog IDs. |
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts &#x60;properties&#x60; that returns the properties of each worklog. | [optional] [default to &#39;&#39;]

### Return type

[**kotlin.Array&lt;Worklog&gt;**](Worklog.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

