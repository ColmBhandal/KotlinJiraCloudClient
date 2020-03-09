# IssuesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueIssueChangelogResourceGetChangeLogsGet**](IssuesApi.md#comAtlassianJiraRestV2IssueIssueChangelogResourceGetChangeLogsGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/changelog | Get change logs
[**comAtlassianJiraRestV2IssueIssueResourceAssignIssuePut**](IssuesApi.md#comAtlassianJiraRestV2IssueIssueResourceAssignIssuePut) | **PUT** /rest/api/3/issue/{issueIdOrKey}/assignee | Assign issue
[**comAtlassianJiraRestV2IssueIssueResourceCreateIssuePost**](IssuesApi.md#comAtlassianJiraRestV2IssueIssueResourceCreateIssuePost) | **POST** /rest/api/3/issue | Create issue
[**comAtlassianJiraRestV2IssueIssueResourceCreateIssuesPost**](IssuesApi.md#comAtlassianJiraRestV2IssueIssueResourceCreateIssuesPost) | **POST** /rest/api/3/issue/bulk | Bulk create issue
[**comAtlassianJiraRestV2IssueIssueResourceDeleteIssueDelete**](IssuesApi.md#comAtlassianJiraRestV2IssueIssueResourceDeleteIssueDelete) | **DELETE** /rest/api/3/issue/{issueIdOrKey} | Delete issue
[**comAtlassianJiraRestV2IssueIssueResourceDoTransitionPost**](IssuesApi.md#comAtlassianJiraRestV2IssueIssueResourceDoTransitionPost) | **POST** /rest/api/3/issue/{issueIdOrKey}/transitions | Transition issue
[**comAtlassianJiraRestV2IssueIssueResourceEditIssuePut**](IssuesApi.md#comAtlassianJiraRestV2IssueIssueResourceEditIssuePut) | **PUT** /rest/api/3/issue/{issueIdOrKey} | Edit issue
[**comAtlassianJiraRestV2IssueIssueResourceGetCreateIssueMetaGet**](IssuesApi.md#comAtlassianJiraRestV2IssueIssueResourceGetCreateIssueMetaGet) | **GET** /rest/api/3/issue/createmeta | Get create issue metadata
[**comAtlassianJiraRestV2IssueIssueResourceGetEditIssueMetaGet**](IssuesApi.md#comAtlassianJiraRestV2IssueIssueResourceGetEditIssueMetaGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/editmeta | Get edit issue metadata
[**comAtlassianJiraRestV2IssueIssueResourceGetIssueGet**](IssuesApi.md#comAtlassianJiraRestV2IssueIssueResourceGetIssueGet) | **GET** /rest/api/3/issue/{issueIdOrKey} | Get issue
[**comAtlassianJiraRestV2IssueIssueResourceGetTransitionsGet**](IssuesApi.md#comAtlassianJiraRestV2IssueIssueResourceGetTransitionsGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/transitions | Get transitions
[**comAtlassianJiraRestV2IssueIssueResourceNotifyPost**](IssuesApi.md#comAtlassianJiraRestV2IssueIssueResourceNotifyPost) | **POST** /rest/api/3/issue/{issueIdOrKey}/notify | Send notification for issue


<a name="comAtlassianJiraRestV2IssueIssueChangelogResourceGetChangeLogsGet"></a>
# **comAtlassianJiraRestV2IssueIssueChangelogResourceGetChangeLogsGet**
> PageBeanChangelog comAtlassianJiraRestV2IssueIssueChangelogResourceGetChangeLogsGet(issueIdOrKey, startAt, maxResults)

Get change logs

Returns all changelogs for an issue sorted by date, starting from the oldest.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val startAt : kotlin.Int = 56 // kotlin.Int | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageBeanChangelog = apiInstance.comAtlassianJiraRestV2IssueIssueChangelogResourceGetChangeLogsGet(issueIdOrKey, startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueChangelogResourceGetChangeLogsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueChangelogResourceGetChangeLogsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **startAt** | **kotlin.Int**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 100]

### Return type

[**PageBeanChangelog**](PageBeanChangelog.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueResourceAssignIssuePut"></a>
# **comAtlassianJiraRestV2IssueIssueResourceAssignIssuePut**
> kotlin.Any comAtlassianJiraRestV2IssueIssueResourceAssignIssuePut(issueIdOrKey, user)

Assign issue

Assigns an issue to a user. Use this operation when the calling user does not have the *Edit Issues* permission but has the *Assign issue* permission for the project that the issue is in.  If &#x60;name&#x60; or &#x60;accountId&#x60; is set to:   *  &#x60;\&quot;-1\&quot;&#x60;, the issue is assigned to the default assignee for the project.  *  &#x60;null&#x60;, the issue is set to unassigned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse Projects* and *Assign Issues* [ project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue to be assigned.
val user : User = {"accountId":"5b10ac8d82e05b22cc7d4ef5"} // User | The request object with the user that the issue is assigned to.
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueIssueResourceAssignIssuePut(issueIdOrKey, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceAssignIssuePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceAssignIssuePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue to be assigned. |
 **user** | [**User**](User.md)| The request object with the user that the issue is assigned to. |

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

<a name="comAtlassianJiraRestV2IssueIssueResourceCreateIssuePost"></a>
# **comAtlassianJiraRestV2IssueIssueResourceCreateIssuePost**
> CreatedIssue comAtlassianJiraRestV2IssueIssueResourceCreateIssuePost(requestBody, updateHistory)

Create issue

Creates an issue or, where the option to create subtasks is enabled in Jira, a subtask. A transition may be applied, to move the issue or subtask to a workflow step other than the default start step, and issue properties set.  The content of the issue or subtask is defined using &#x60;update&#x60; and &#x60;fields&#x60;. The fields that can be set in the issue or subtask are determined using the [ Get create issue metadata](#api-rest-api-3-issue-createmeta-get). These are the same fields that appear on the issue&#39;s create screen. Note that the &#x60;description&#x60;, &#x60;environment&#x60;, and any &#x60;textarea&#x60; type custom fields (multi-line text fields) take Atlassian Document Format content. Single line custom fields (&#x60;textfield&#x60;) accept a string and don&#39;t handle Atlassian Document Format content.  Creating a subtask differs from creating an issue as follows:   *  &#x60;issueType&#x60; must be set to a subtask issue type (use [ Get create issue metadata](#api-rest-api-3-issue-createmeta-get) to find subtask issue types).  *  &#x60;parent&#x60; must contain the ID or key of the parent issue.  In a next-gen project any issue may be made a child providing that the parent and child are members of the same project. In a classic project the parent field is only valid for subtasks.  **[Permissions](#permissions) required:** *Browse projects* and *Create issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project in which the issue or subtask is created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"update":{},"fields":{"summary":"Main order flow broken","parent":{"key":"PROJ-123"},"issuetype":{"id":"10000"},"components":[{"id":"10000"}],"customfield_20000":"06/Jul/19 3:25 PM","customfield_40000":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"Occurs on all orders","type":"text"}]}]},"customfield_70000":["jira-administrators","jira-software-users"],"project":{"id":"10000"},"description":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"Order entry fails when selecting supplier.","type":"text"}]}]},"reporter":{"id":"5b10a2844c20165700ede21g"},"fixVersions":[{"id":"10001"}],"customfield_10000":"09/Jun/19","priority":{"id":"20000"},"labels":["bugfix","blitz_test"],"timetracking":{"remainingEstimate":"5","originalEstimate":"10"},"customfield_30000":["10000","10002"],"customfield_80000":{"value":"red"},"security":{"id":"10000"},"environment":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"UAT","type":"text"}]}]},"versions":[{"id":"10000"}],"duedate":"2019-05-11T00:00:00.000Z","customfield_60000":"jira-software-users","customfield_50000":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"Could impact day-to-day work.","type":"text"}]}]},"assignee":{"id":"5b109f2e9729b51b54dc274d"}}} // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
val updateHistory : kotlin.Boolean = true // kotlin.Boolean | Whether the project in which the issue is created is added to the user's **Recently viewed** project list, as shown under **Projects** in Jira.
try {
    val result : CreatedIssue = apiInstance.comAtlassianJiraRestV2IssueIssueResourceCreateIssuePost(requestBody, updateHistory)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceCreateIssuePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceCreateIssuePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  |
 **updateHistory** | **kotlin.Boolean**| Whether the project in which the issue is created is added to the user&#39;s **Recently viewed** project list, as shown under **Projects** in Jira. | [optional] [default to false]

### Return type

[**CreatedIssue**](CreatedIssue.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueResourceCreateIssuesPost"></a>
# **comAtlassianJiraRestV2IssueIssueResourceCreateIssuesPost**
> CreatedIssues comAtlassianJiraRestV2IssueIssueResourceCreateIssuesPost(requestBody)

Bulk create issue

Creates issues and, where the option to create subtasks is enabled in Jira, subtasks. Transitions may be applied, to move the issues or subtasks to a workflow step other than the default start step, and issue properties set.  The content of each issue or subtask is defined using &#x60;update&#x60; and &#x60;fields&#x60;. The fields that can be set in the issue or subtask are determined using the [ Get create issue metadata](#api-rest-api-3-issue-createmeta-get). These are the same fields that appear on the issues&#39; create screens. Note that the &#x60;description&#x60;, &#x60;environment&#x60;, and any &#x60;textarea&#x60; type custom fields (multi-line text fields) take Atlassian Document Format content. Single line custom fields (&#x60;textfield&#x60;) accept a string and don&#39;t handle Atlassian Document Format content.  Creating a subtask differs from creating an issue as follows:   *  &#x60;issueType&#x60; must be set to a subtask issue type (use [ Get create issue metadata](#api-rest-api-3-issue-createmeta-get) to find subtask issue types).  *  &#x60;parent&#x60; the must contain the ID or key of the parent issue.  **[Permissions](#permissions) required:** *Browse projects* and *Create issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project in which each issue or subtask is created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"issueUpdates":[{"update":{"worklog":[{"add":{"timeSpent":"60m","started":"2019-07-05T11:05:00.000+0000"}}]},"fields":{"summary":"Main order flow broken","issuetype":{"id":"10000"},"components":[{"id":"10000"}],"customfield_20000":"06/Jul/19 3:25 PM","customfield_40000":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"Occurs on all orders","type":"text"}]}]},"customfield_70000":["jira-administrators","jira-software-users"],"project":{"id":"10000"},"description":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"Order entry fails when selecting supplier.","type":"text"}]}]},"reporter":{"id":"5b10a2844c20165700ede21g"},"fixVersions":[{"id":"10001"}],"customfield_10000":"09/Jun/19","priority":{"id":"20000"},"labels":["bugfix","blitz_test"],"timetracking":{"remainingEstimate":"5","originalEstimate":"10"},"customfield_30000":["10000","10002"],"customfield_80000":{"value":"red"},"security":{"id":"10000"},"environment":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"UAT","type":"text"}]}]},"versions":[{"id":"10000"}],"duedate":"2011-03-11T00:00:00.000Z","customfield_60000":"jira-software-users","customfield_50000":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"Could impact day-to-day work.","type":"text"}]}]},"assignee":{"id":"5b109f2e9729b51b54dc274d"}}},{"update":{},"fields":{"summary":"Order stuck in pending","issuetype":{"id":"10000"},"components":[{"id":"10000"}],"customfield_20000":"06/Jul/19 3:25 PM","customfield_40000":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"Occurs on all orders","type":"text"}]}]},"customfield_70000":["jira-administrators","jira-software-users"],"project":{"id":"1000"},"description":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"Order remains pending after approved.","type":"text"}]}]},"reporter":{"id":"5b10a2844c20165700ede21g"},"fixVersions":[{"id":"10001"}],"customfield_10000":"09/Jun/19","priority":{"id":"20000"},"labels":["new_release"],"timetracking":{"remainingEstimate":"5","originalEstimate":"15"},"customfield_30000":["10000","10002"],"customfield_80000":{"value":"red"},"security":{"id":"10000"},"environment":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"UAT","type":"text"}]}]},"versions":[{"id":"10000"}],"duedate":"2019-04-16T00:00:00.000Z","customfield_60000":"jira-software-users","customfield_50000":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"Could impact day-to-day work.","type":"text"}]}]},"assignee":{"id":"5b109f2e9729b51b54dc274d"}}}]} // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
try {
    val result : CreatedIssues = apiInstance.comAtlassianJiraRestV2IssueIssueResourceCreateIssuesPost(requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceCreateIssuesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceCreateIssuesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  |

### Return type

[**CreatedIssues**](CreatedIssues.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueResourceDeleteIssueDelete"></a>
# **comAtlassianJiraRestV2IssueIssueResourceDeleteIssueDelete**
> comAtlassianJiraRestV2IssueIssueResourceDeleteIssueDelete(issueIdOrKey, deleteSubtasks)

Delete issue

Deletes an issue.  An issue cannot be deleted if it has one or more subtasks. To delete an issue with subtasks, set &#x60;deleteSubtasks&#x60;. This causes the issue&#39;s subtasks to be deleted with the issue.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Delete issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val deleteSubtasks : kotlin.String = deleteSubtasks_example // kotlin.String | Whether the issue's subtasks are deleted when the issue is deleted.
try {
    apiInstance.comAtlassianJiraRestV2IssueIssueResourceDeleteIssueDelete(issueIdOrKey, deleteSubtasks)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceDeleteIssueDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceDeleteIssueDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **deleteSubtasks** | **kotlin.String**| Whether the issue&#39;s subtasks are deleted when the issue is deleted. | [optional] [default to &#39;false&#39;] [enum: true, false]

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

<a name="comAtlassianJiraRestV2IssueIssueResourceDoTransitionPost"></a>
# **comAtlassianJiraRestV2IssueIssueResourceDoTransitionPost**
> kotlin.Any comAtlassianJiraRestV2IssueIssueResourceDoTransitionPost(issueIdOrKey, requestBody)

Transition issue

Performs an issue transition and, if the transition has a screen, updates the fields from the transition screen.  To update the fields on the transition screen, specify the fields in the &#x60;fields&#x60; or &#x60;update&#x60; parameters in the request body. Get details about the fields using [ Get transitions](#api-rest-api-3-issue-issueIdOrKey-transitions-get) with the &#x60;transitions.fields&#x60; expand.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Transition issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"historyMetadata":{"actor":{"avatarUrl":"http://mysystem/avatar/tony.jpg","displayName":"Tony","id":"tony","type":"mysystem-user","url":"http://mysystem/users/tony"},"extraData":{"Iteration":"10a","Step":"4"},"description":"From the order testing process","generator":{"id":"mysystem-1","type":"mysystem-application"},"cause":{"id":"myevent","type":"mysystem-event"},"activityDescription":"Complete order processing","type":"myplugin:type"},"update":{"comment":[{"add":{"body":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"Bug has been fixed","type":"text"}]}]}}}]},"fields":{"assignee":{"name":"bob"},"resolution":{"name":"Fixed"}},"transition":{"id":"5"}} // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueIssueResourceDoTransitionPost(issueIdOrKey, requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceDoTransitionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceDoTransitionPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
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

<a name="comAtlassianJiraRestV2IssueIssueResourceEditIssuePut"></a>
# **comAtlassianJiraRestV2IssueIssueResourceEditIssuePut**
> kotlin.Any comAtlassianJiraRestV2IssueIssueResourceEditIssuePut(issueIdOrKey, requestBody, notifyUsers, overrideScreenSecurity, overrideEditableFlag)

Edit issue

Edits an issue. A transition may be applied and issue properties updated as part of the edit.  The edits to the issue&#39;s fields are defined using &#x60;update&#x60; and &#x60;fields&#x60;. The fields that can be edited are determined using [ Get edit issue metadata](#api-rest-api-3-issue-issueIdOrKey-editmeta-get).  The parent field may be set by key or ID. For standard issue types, the parent may be removed by setting &#x60;update.parent.set.none&#x60; to *true*. Note that the &#x60;description&#x60;, &#x60;environment&#x60;, and any &#x60;textarea&#x60; type custom fields (multi-line text fields) take Atlassian Document Format content. Single line custom fields (&#x60;textfield&#x60;) accept a string and don&#39;t handle Atlassian Document Format content.  Connect app users with admin permissions (from user permissions and app scopes) can override the screen security configuration using &#x60;overrideScreenSecurity&#x60; and &#x60;overrideEditableFlag&#x60;.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"historyMetadata":{"actor":{"avatarUrl":"http://mysystem/avatar/tony.jpg","displayName":"Tony","id":"tony","type":"mysystem-user","url":"http://mysystem/users/tony"},"extraData":{"Iteration":"10a","Step":"4"},"description":"From the order testing process","generator":{"id":"mysystem-1","type":"mysystem-application"},"cause":{"id":"myevent","type":"mysystem-event"},"activityDescription":"Complete order processing","type":"myplugin:type"},"update":{"summary":[{"set":"Bug in business logic"}],"parent":[{"set":{"none":true}}],"components":[{"set":""}],"timetracking":[{"edit":{"remainingEstimate":"4d","originalEstimate":"1w 1d"}}],"labels":[{"add":"triaged"},{"remove":"blocker"}]},"fields":{"summary":"Completed orders still displaying in pending","customfield_10010":1,"customfield_10000":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"Investigation underway","type":"text"}]}]}},"properties":[{"value":"Order number 10784","key":"key1"},{"value":"Order number 10923","key":"key2"}]} // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
val notifyUsers : kotlin.Boolean = true // kotlin.Boolean | Whether a notification email about the issue update is sent to all watchers. To disable the notification, administer Jira or administer project permissions are required. If the user doesn't have the necessary permission the request is ignored.
val overrideScreenSecurity : kotlin.Boolean = true // kotlin.Boolean | Whether screen security should be overridden to enable hidden fields to be edited. Available to Connect app users with admin permissions.
val overrideEditableFlag : kotlin.Boolean = true // kotlin.Boolean | Whether screen security should be overridden to enable uneditable fields to be edited. Available to Connect app users with admin permissions.
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueIssueResourceEditIssuePut(issueIdOrKey, requestBody, notifyUsers, overrideScreenSecurity, overrideEditableFlag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceEditIssuePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceEditIssuePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  |
 **notifyUsers** | **kotlin.Boolean**| Whether a notification email about the issue update is sent to all watchers. To disable the notification, administer Jira or administer project permissions are required. If the user doesn&#39;t have the necessary permission the request is ignored. | [optional] [default to true]
 **overrideScreenSecurity** | **kotlin.Boolean**| Whether screen security should be overridden to enable hidden fields to be edited. Available to Connect app users with admin permissions. | [optional] [default to false]
 **overrideEditableFlag** | **kotlin.Boolean**| Whether screen security should be overridden to enable uneditable fields to be edited. Available to Connect app users with admin permissions. | [optional] [default to false]

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

<a name="comAtlassianJiraRestV2IssueIssueResourceGetCreateIssueMetaGet"></a>
# **comAtlassianJiraRestV2IssueIssueResourceGetCreateIssueMetaGet**
> IssueCreateMetadata comAtlassianJiraRestV2IssueIssueResourceGetCreateIssueMetaGet(projectIds, projectKeys, issuetypeIds, issuetypeNames, expand)

Get create issue metadata

Returns details of projects, issue types within projects, and, when requested, the create screen fields for each issue type for the user. Use the information to populate the requests in [ Create issue](#api-rest-api-3-issue-post) and [Create issues](#api-rest-api-3-issue-bulk-post).  The request can be restricted to specific projects or issue types using the query parameters. The response will contain information for the valid projects, issue types, or project and issue type combinations requested. Note that invalid project, issue type, or project and issue type combinations do not generate errors.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Create issues* [project permission](https://confluence.atlassian.com/x/yodKLg) in the requested projects.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val projectIds : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | List of project IDs. This parameter accepts a comma-separated list. Multiple project IDs can also be provided using an ampersand-separated list. For example, `projectIds=10000,10001&projectIds=10020,10021`. This parameter may be provided with `projectKeys`.
val projectKeys : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | List of project keys. This parameter accepts a comma-separated list. Multiple project keys can also be provided using an ampersand-separated list. For example, `projectKeys=proj1,proj2&projectKeys=proj3`. This parameter may be provided with `projectIds`.
val issuetypeIds : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | List of issue type IDs. This parameter accepts a comma-separated list. Multiple issue type IDs can also be provided using an ampersand-separated list. For example, `issuetypeIds=10000,10001&issuetypeIds=10020,10021`. This parameter may be provided with `issuetypeNames`.
val issuetypeNames : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | List of issue type names. This parameter accepts a comma-separated list. Multiple issue type names can also be provided using an ampersand-separated list. For example, `issuetypeNames=name1,name2&issuetypeNames=name3`. This parameter may be provided with `issuetypeIds`.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about issue metadata in the response. This parameter accepts `projects.issuetypes.fields`, which returns information about the fields in the issue creation screen for each issue type. Fields hidden from the screen are not returned. Use the information to populate the `fields` and `update` fields in [Create issue](#api-rest-api-3-issue-post) and [Create issues](#api-rest-api-3-issue-bulk-post).
try {
    val result : IssueCreateMetadata = apiInstance.comAtlassianJiraRestV2IssueIssueResourceGetCreateIssueMetaGet(projectIds, projectKeys, issuetypeIds, issuetypeNames, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceGetCreateIssueMetaGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceGetCreateIssueMetaGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIds** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| List of project IDs. This parameter accepts a comma-separated list. Multiple project IDs can also be provided using an ampersand-separated list. For example, &#x60;projectIds&#x3D;10000,10001&amp;projectIds&#x3D;10020,10021&#x60;. This parameter may be provided with &#x60;projectKeys&#x60;. | [optional]
 **projectKeys** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| List of project keys. This parameter accepts a comma-separated list. Multiple project keys can also be provided using an ampersand-separated list. For example, &#x60;projectKeys&#x3D;proj1,proj2&amp;projectKeys&#x3D;proj3&#x60;. This parameter may be provided with &#x60;projectIds&#x60;. | [optional]
 **issuetypeIds** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| List of issue type IDs. This parameter accepts a comma-separated list. Multiple issue type IDs can also be provided using an ampersand-separated list. For example, &#x60;issuetypeIds&#x3D;10000,10001&amp;issuetypeIds&#x3D;10020,10021&#x60;. This parameter may be provided with &#x60;issuetypeNames&#x60;. | [optional]
 **issuetypeNames** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| List of issue type names. This parameter accepts a comma-separated list. Multiple issue type names can also be provided using an ampersand-separated list. For example, &#x60;issuetypeNames&#x3D;name1,name2&amp;issuetypeNames&#x3D;name3&#x60;. This parameter may be provided with &#x60;issuetypeIds&#x60;. | [optional]
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about issue metadata in the response. This parameter accepts &#x60;projects.issuetypes.fields&#x60;, which returns information about the fields in the issue creation screen for each issue type. Fields hidden from the screen are not returned. Use the information to populate the &#x60;fields&#x60; and &#x60;update&#x60; fields in [Create issue](#api-rest-api-3-issue-post) and [Create issues](#api-rest-api-3-issue-bulk-post). | [optional]

### Return type

[**IssueCreateMetadata**](IssueCreateMetadata.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueResourceGetEditIssueMetaGet"></a>
# **comAtlassianJiraRestV2IssueIssueResourceGetEditIssueMetaGet**
> IssueUpdateMetadata comAtlassianJiraRestV2IssueIssueResourceGetEditIssueMetaGet(issueIdOrKey, overrideScreenSecurity, overrideEditableFlag)

Get edit issue metadata

Returns the edit screen fields for an issue that are visible to and editable by the user. Use the information to populate the requests in [Edit issue](#api-rest-api-3-issue-issueIdOrKey-put).  Connect app users with admin permissions (from user permissions and app scopes) can return additional details using:   *  &#x60;overrideScreenSecurity&#x60; Returns hidden fields.  *  &#x60;overrideEditableFlag&#x60; Returns uneditable fields. For example, where an issue has a workflow status of closed none of its fields are editable.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  Note: For any fields to be editable the user must have the *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val overrideScreenSecurity : kotlin.Boolean = true // kotlin.Boolean | Whether hidden fields should be returned. Available to connect app users with admin permissions.
val overrideEditableFlag : kotlin.Boolean = true // kotlin.Boolean | Whether non-editable fields should be returned. Available to connect app users with admin permissions.
try {
    val result : IssueUpdateMetadata = apiInstance.comAtlassianJiraRestV2IssueIssueResourceGetEditIssueMetaGet(issueIdOrKey, overrideScreenSecurity, overrideEditableFlag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceGetEditIssueMetaGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceGetEditIssueMetaGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **overrideScreenSecurity** | **kotlin.Boolean**| Whether hidden fields should be returned. Available to connect app users with admin permissions. | [optional] [default to false]
 **overrideEditableFlag** | **kotlin.Boolean**| Whether non-editable fields should be returned. Available to connect app users with admin permissions. | [optional] [default to false]

### Return type

[**IssueUpdateMetadata**](IssueUpdateMetadata.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueResourceGetIssueGet"></a>
# **comAtlassianJiraRestV2IssueIssueResourceGetIssueGet**
> IssueBean comAtlassianJiraRestV2IssueIssueResourceGetIssueGet(issueIdOrKey, fields, fieldsByKeys, expand, properties, updateHistory)

Get issue

Returns the details for an issue.  The issue is identified by its ID or key, however, if the identifier doesn&#39;t match an issue, a case-insensitive search and check for moved issues is performed. If a matching issue is found its details are returned, a 302 or other redirect is **not** returned. The issue key returned in the response is the key of the issue found.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val fields : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | A list of fields to return for the issue. This parameter accepts a comma-separated list. Use it to retrieve a subset of fields. Allowed values:   *  `*all` Returns all fields.  *  `*navigable` Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  `summary,comment` Returns only the summary and comments fields.  *  `-description` Returns all (default) fields except description.  *  `*navigable,-comment` Returns all navigable fields except comment.  This parameter may be specified multiple times. For example, `fields=field1,field2& fields=field3`.  Note: All fields are returned by default. This differs from [Search for issues using JQL (GET)](#api-rest-api-3-search-get) and [Search for issues using JQL (POST)](#api-rest-api-3-search-post) where the default is all navigable fields.
val fieldsByKeys : kotlin.Boolean = true // kotlin.Boolean | Whether fields in `fields` are referenced by keys rather than IDs. This parameter is useful where fields have been added by a connect app and a field's key may differ from its ID.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about the issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  `renderedFields` Returns field values rendered in HTML format.  *  `names` Returns the display name of each field.  *  `schema` Returns the schema describing a field type.  *  `transitions` Returns all possible transitions for the issue.  *  `editmeta` Returns information about how each field can be edited.  *  `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  `versionedRepresentations` Returns a JSON array for each version of a field's value, with the highest number representing the most recent version. Note: When included in the request, the `fields` parameter is ignored.
val properties : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | A list of issue properties to return for the issue. This parameter accepts a comma-separated list. Allowed values:   *  `*all` Returns all issue properties.  *  Any issue property key, prefixed with a minus to exclude.  Examples:   *  `*all` Returns all properties.  *  `*all,-prop1` Returns all properties except `prop1`.  *  `prop1,prop2` Returns `prop1` and `prop2` properties.  This parameter may be specified multiple times. For example, `properties=prop1,prop2& properties=prop3`.
val updateHistory : kotlin.Boolean = true // kotlin.Boolean | Whether the project in which the issue is created is added to the user's **Recently viewed** project list, as shown under **Projects** in Jira. This also populates the [JQL issues search](#api-rest-api-3-search-get) `lastViewed` field.
try {
    val result : IssueBean = apiInstance.comAtlassianJiraRestV2IssueIssueResourceGetIssueGet(issueIdOrKey, fields, fieldsByKeys, expand, properties, updateHistory)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceGetIssueGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceGetIssueGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **fields** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| A list of fields to return for the issue. This parameter accepts a comma-separated list. Use it to retrieve a subset of fields. Allowed values:   *  &#x60;*all&#x60; Returns all fields.  *  &#x60;*navigable&#x60; Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  &#x60;summary,comment&#x60; Returns only the summary and comments fields.  *  &#x60;-description&#x60; Returns all (default) fields except description.  *  &#x60;*navigable,-comment&#x60; Returns all navigable fields except comment.  This parameter may be specified multiple times. For example, &#x60;fields&#x3D;field1,field2&amp; fields&#x3D;field3&#x60;.  Note: All fields are returned by default. This differs from [Search for issues using JQL (GET)](#api-rest-api-3-search-get) and [Search for issues using JQL (POST)](#api-rest-api-3-search-post) where the default is all navigable fields. | [optional]
 **fieldsByKeys** | **kotlin.Boolean**| Whether fields in &#x60;fields&#x60; are referenced by keys rather than IDs. This parameter is useful where fields have been added by a connect app and a field&#39;s key may differ from its ID. | [optional] [default to false]
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about the issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;renderedFields&#x60; Returns field values rendered in HTML format.  *  &#x60;names&#x60; Returns the display name of each field.  *  &#x60;schema&#x60; Returns the schema describing a field type.  *  &#x60;transitions&#x60; Returns all possible transitions for the issue.  *  &#x60;editmeta&#x60; Returns information about how each field can be edited.  *  &#x60;changelog&#x60; Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  &#x60;versionedRepresentations&#x60; Returns a JSON array for each version of a field&#39;s value, with the highest number representing the most recent version. Note: When included in the request, the &#x60;fields&#x60; parameter is ignored. | [optional]
 **properties** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| A list of issue properties to return for the issue. This parameter accepts a comma-separated list. Allowed values:   *  &#x60;*all&#x60; Returns all issue properties.  *  Any issue property key, prefixed with a minus to exclude.  Examples:   *  &#x60;*all&#x60; Returns all properties.  *  &#x60;*all,-prop1&#x60; Returns all properties except &#x60;prop1&#x60;.  *  &#x60;prop1,prop2&#x60; Returns &#x60;prop1&#x60; and &#x60;prop2&#x60; properties.  This parameter may be specified multiple times. For example, &#x60;properties&#x3D;prop1,prop2&amp; properties&#x3D;prop3&#x60;. | [optional]
 **updateHistory** | **kotlin.Boolean**| Whether the project in which the issue is created is added to the user&#39;s **Recently viewed** project list, as shown under **Projects** in Jira. This also populates the [JQL issues search](#api-rest-api-3-search-get) &#x60;lastViewed&#x60; field. | [optional] [default to false]

### Return type

[**IssueBean**](IssueBean.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueResourceGetTransitionsGet"></a>
# **comAtlassianJiraRestV2IssueIssueResourceGetTransitionsGet**
> Transitions comAtlassianJiraRestV2IssueIssueResourceGetTransitionsGet(issueIdOrKey, expand, transitionId, skipRemoteOnlyCondition, includeUnavailableTransitions)

Get transitions

Returns either all transitions or a transition that can be performed by the user on an issue, based on the issue&#39;s status.  Note, if a request is made for a transition that does not exist or cannot be performed on the issue, given its status, the response will return any empty transitions list.  This operation can be accessed anonymously.  **[Permissions](#permissions) required: A list or transition is returned only when the user has:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  However, if the user does not have the *Transition issues* [ project permission](https://confluence.atlassian.com/x/yodKLg) the response will not list any transitions.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about transitions in the response. This parameter accepts `transitions.fields`, which returns information about the fields in the transition screen for each transition. Fields hidden from the screen are not returned. Use this information to populate the `fields` and `update` fields in [Transition issue](#api-rest-api-3-issue-issueIdOrKey-transitions-post).
val transitionId : kotlin.String = transitionId_example // kotlin.String | The ID of the transition.
val skipRemoteOnlyCondition : kotlin.Boolean = true // kotlin.Boolean | Whether transitions with the condition *Hide From User Condition* are included in the response.
val includeUnavailableTransitions : kotlin.Boolean = true // kotlin.Boolean | Whether details of transitions that fail a condition are included in the response
try {
    val result : Transitions = apiInstance.comAtlassianJiraRestV2IssueIssueResourceGetTransitionsGet(issueIdOrKey, expand, transitionId, skipRemoteOnlyCondition, includeUnavailableTransitions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceGetTransitionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceGetTransitionsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about transitions in the response. This parameter accepts &#x60;transitions.fields&#x60;, which returns information about the fields in the transition screen for each transition. Fields hidden from the screen are not returned. Use this information to populate the &#x60;fields&#x60; and &#x60;update&#x60; fields in [Transition issue](#api-rest-api-3-issue-issueIdOrKey-transitions-post). | [optional]
 **transitionId** | **kotlin.String**| The ID of the transition. | [optional]
 **skipRemoteOnlyCondition** | **kotlin.Boolean**| Whether transitions with the condition *Hide From User Condition* are included in the response. | [optional] [default to false]
 **includeUnavailableTransitions** | **kotlin.Boolean**| Whether details of transitions that fail a condition are included in the response | [optional] [default to false]

### Return type

[**Transitions**](Transitions.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueResourceNotifyPost"></a>
# **comAtlassianJiraRestV2IssueIssueResourceNotifyPost**
> kotlin.Any comAtlassianJiraRestV2IssueIssueResourceNotifyPost(issueIdOrKey, requestBody)

Send notification for issue

Creates an email notification for an issue and adds it to the mail queue.  **[Permissions](#permissions) required:**   *  *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | ID or key of the issue that the notification is sent for.
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"htmlBody":"The <strong>latest</strong> test results for this ticket are now available.","subject":"Latest test results","textBody":"The latest test results for this ticket are now available.","to":{"voters":true,"watchers":true,"groups":[{"name":"notification-group"}],"reporter":false,"assignee":false,"users":[{"accountId":"5b10a2844c20165700ede21g","active":false}]},"restrict":{"permissions":[{"key":"BROWSE"}],"groups":[{"name":"notification-group"}]}} // kotlin.collections.Map<kotlin.String, kotlin.Any> | The request object for the notification and recipients.
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueIssueResourceNotifyPost(issueIdOrKey, requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceNotifyPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#comAtlassianJiraRestV2IssueIssueResourceNotifyPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| ID or key of the issue that the notification is sent for. |
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)| The request object for the notification and recipients. |

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

