# IssueSearchApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueIssueResourceGetIssuePickerResourceGet**](IssueSearchApi.md#comAtlassianJiraRestV2IssueIssueResourceGetIssuePickerResourceGet) | **GET** /rest/api/3/issue/picker | Get issue picker suggestions
[**comAtlassianJiraRestV2MatchIssueMatchResourceMatchIssuesPost**](IssueSearchApi.md#comAtlassianJiraRestV2MatchIssueMatchResourceMatchIssuesPost) | **POST** /rest/api/3/jql/match | Check issues against JQL
[**comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlGet**](IssueSearchApi.md#comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlGet) | **GET** /rest/api/3/search | Search for issues using JQL (GET)
[**comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlPost**](IssueSearchApi.md#comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlPost) | **POST** /rest/api/3/search | Search for issues using JQL (POST)


<a name="comAtlassianJiraRestV2IssueIssueResourceGetIssuePickerResourceGet"></a>
# **comAtlassianJiraRestV2IssueIssueResourceGetIssuePickerResourceGet**
> IssuePickerSuggestions comAtlassianJiraRestV2IssueIssueResourceGetIssuePickerResourceGet(query, currentJQL, currentIssueKey, currentProjectId, showSubTasks, showSubTaskParent)

Get issue picker suggestions

Returns lists of issues matching a query string. Use this resource to provide auto-completion suggestions when the user is looking for an issue using a word or string.  This operation returns two lists:   *  &#x60;History Search&#x60; which includes issues from the user&#39;s history of created, edited, or viewed issues that contain the string in the &#x60;query&#x60; parameter.  *  &#x60;Current Search&#x60; which includes issues that match the JQL expression in &#x60;currentJQL&#x60; and contain the string in the &#x60;query&#x60; parameter.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueSearchApi()
val query : kotlin.String = query // kotlin.String | A string to match against text fields in the issue such as title, description, or comments.
val currentJQL : kotlin.String = currentJQL_example // kotlin.String | A JQL query defining a list of issues to search for the query term. Note that `username` and `userkey` cannot be used as search terms for this parameter, due to privacy reasons. Use `accountId` instead.
val currentIssueKey : kotlin.String = currentIssueKey_example // kotlin.String | The key of an issue to exclude from search results. For example, the issue the user is viewing when they perform this query.
val currentProjectId : kotlin.String = currentProjectId_example // kotlin.String | The ID of a project that suggested issues must belong to.
val showSubTasks : kotlin.Boolean = true // kotlin.Boolean | Indicate whether to include subtasks in the suggestions list.
val showSubTaskParent : kotlin.Boolean = true // kotlin.Boolean | When `currentIssueKey` is a subtask, whether to include the parent issue in the suggestions if it matches the query.
try {
    val result : IssuePickerSuggestions = apiInstance.comAtlassianJiraRestV2IssueIssueResourceGetIssuePickerResourceGet(query, currentJQL, currentIssueKey, currentProjectId, showSubTasks, showSubTaskParent)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueSearchApi#comAtlassianJiraRestV2IssueIssueResourceGetIssuePickerResourceGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueSearchApi#comAtlassianJiraRestV2IssueIssueResourceGetIssuePickerResourceGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **kotlin.String**| A string to match against text fields in the issue such as title, description, or comments. | [optional]
 **currentJQL** | **kotlin.String**| A JQL query defining a list of issues to search for the query term. Note that &#x60;username&#x60; and &#x60;userkey&#x60; cannot be used as search terms for this parameter, due to privacy reasons. Use &#x60;accountId&#x60; instead. | [optional]
 **currentIssueKey** | **kotlin.String**| The key of an issue to exclude from search results. For example, the issue the user is viewing when they perform this query. | [optional]
 **currentProjectId** | **kotlin.String**| The ID of a project that suggested issues must belong to. | [optional]
 **showSubTasks** | **kotlin.Boolean**| Indicate whether to include subtasks in the suggestions list. | [optional]
 **showSubTaskParent** | **kotlin.Boolean**| When &#x60;currentIssueKey&#x60; is a subtask, whether to include the parent issue in the suggestions if it matches the query. | [optional]

### Return type

[**IssuePickerSuggestions**](IssuePickerSuggestions.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2MatchIssueMatchResourceMatchIssuesPost"></a>
# **comAtlassianJiraRestV2MatchIssueMatchResourceMatchIssuesPost**
> IssueMatches comAtlassianJiraRestV2MatchIssueMatchResourceMatchIssuesPost(issuesAndJQLQueries)

Check issues against JQL

Checks whether one or more issues would be returned by one or more JQL queries.  **[Permissions](#permissions) required:** None, however, issues are only matched against JQL queries where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueSearchApi()
val issuesAndJQLQueries : IssuesAndJQLQueries = {"issueIds":[10001,1000,10042],"jqls":["project = FOO","issuetype = Bug","summary ~ \"some text\" AND project in (FOO, BAR)"]} // IssuesAndJQLQueries | 
try {
    val result : IssueMatches = apiInstance.comAtlassianJiraRestV2MatchIssueMatchResourceMatchIssuesPost(issuesAndJQLQueries)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueSearchApi#comAtlassianJiraRestV2MatchIssueMatchResourceMatchIssuesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueSearchApi#comAtlassianJiraRestV2MatchIssueMatchResourceMatchIssuesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issuesAndJQLQueries** | [**IssuesAndJQLQueries**](IssuesAndJQLQueries.md)|  |

### Return type

[**IssueMatches**](IssueMatches.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlGet"></a>
# **comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlGet**
> SearchResults comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlGet(jql, startAt, maxResults, validateQuery, fields, expand, properties, fieldsByKeys)

Search for issues using JQL (GET)

Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ).  If the JQL query expression is too large to be encoded as a query parameter, use the [POST](#api-rest-api-3-search-post) version of this resource.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Issues are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueSearchApi()
val jql : kotlin.String = project = HSP // kotlin.String | The [JQL](https://confluence.atlassian.com/x/egORLQ) that defines the search. Note:   *  If no JQL expression is provided, all issues are returned.  *  `username` and `userkey` cannot be used as search terms due to privacy reasons. Use `accountId` instead.  *  If a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required.
val startAt : kotlin.Int = 56 // kotlin.Int | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page. To manage page size, Jira may return fewer items per page where a large number of fields are requested. The greatest number of items returned per page is achieved when requesting `id` or `key` only.
val validateQuery : kotlin.String = validateQuery_example // kotlin.String | Determines how to validate the JQL query and treat the validation results. Supported values are:   *  `strict` Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  `warn` Returns all errors as warnings.  *  `none` No validation is performed.  *  `true` *Deprecated* A legacy synonym for `strict`.  *  `false` *Deprecated* A legacy synonym for `warn`.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value.
val fields : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  `*all` Returns all fields.  *  `*navigable` Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  `summary,comment` Returns only the summary and comments fields.  *  `-description` Returns all navigable (default) fields except description.  *  `*all,-comment` Returns all fields except comments.  This parameter may be specified multiple times. For example, `fields=field1,field2&fields=field3`.  Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  `renderedFields` Returns field values rendered in HTML format.  *  `names` Returns the display name of each field.  *  `schema` Returns the schema describing a field type.  *  `transitions` Returns all possible transitions for the issue.  *  `operations` Returns all possible operations for the issue.  *  `editmeta` Returns information about how each field can be edited.  *  `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  `versionedRepresentations` Instead of `fields`, returns `versionedRepresentations` a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version.
val properties : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | A list of issue property keys for issue properties to include in the results. This parameter accepts a comma-separated list. Multiple properties can also be provided using an ampersand separated list. For example, `properties=prop1,prop2&properties=prop3`. A maximum of 5 issue property keys can be specified.
val fieldsByKeys : kotlin.Boolean = true // kotlin.Boolean | Reference fields by their key (rather than ID).
try {
    val result : SearchResults = apiInstance.comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlGet(jql, startAt, maxResults, validateQuery, fields, expand, properties, fieldsByKeys)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueSearchApi#comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueSearchApi#comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jql** | **kotlin.String**| The [JQL](https://confluence.atlassian.com/x/egORLQ) that defines the search. Note:   *  If no JQL expression is provided, all issues are returned.  *  &#x60;username&#x60; and &#x60;userkey&#x60; cannot be used as search terms due to privacy reasons. Use &#x60;accountId&#x60; instead.  *  If a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required. | [optional]
 **startAt** | **kotlin.Int**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. To manage page size, Jira may return fewer items per page where a large number of fields are requested. The greatest number of items returned per page is achieved when requesting &#x60;id&#x60; or &#x60;key&#x60; only. | [optional] [default to 50]
 **validateQuery** | **kotlin.String**| Determines how to validate the JQL query and treat the validation results. Supported values are:   *  &#x60;strict&#x60; Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  &#x60;warn&#x60; Returns all errors as warnings.  *  &#x60;none&#x60; No validation is performed.  *  &#x60;true&#x60; *Deprecated* A legacy synonym for &#x60;strict&#x60;.  *  &#x60;false&#x60; *Deprecated* A legacy synonym for &#x60;warn&#x60;.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the &#x60;validateQuery&#x60; value. | [optional] [default to &#39;strict&#39;] [enum: strict, warn, none, true, false]
 **fields** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;*all&#x60; Returns all fields.  *  &#x60;*navigable&#x60; Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  &#x60;summary,comment&#x60; Returns only the summary and comments fields.  *  &#x60;-description&#x60; Returns all navigable (default) fields except description.  *  &#x60;*all,-comment&#x60; Returns all fields except comments.  This parameter may be specified multiple times. For example, &#x60;fields&#x3D;field1,field2&amp;fields&#x3D;field3&#x60;.  Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields. | [optional]
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;renderedFields&#x60; Returns field values rendered in HTML format.  *  &#x60;names&#x60; Returns the display name of each field.  *  &#x60;schema&#x60; Returns the schema describing a field type.  *  &#x60;transitions&#x60; Returns all possible transitions for the issue.  *  &#x60;operations&#x60; Returns all possible operations for the issue.  *  &#x60;editmeta&#x60; Returns information about how each field can be edited.  *  &#x60;changelog&#x60; Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  &#x60;versionedRepresentations&#x60; Instead of &#x60;fields&#x60;, returns &#x60;versionedRepresentations&#x60; a JSON array containing each version of a field&#39;s value, with the highest numbered item representing the most recent version. | [optional]
 **properties** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| A list of issue property keys for issue properties to include in the results. This parameter accepts a comma-separated list. Multiple properties can also be provided using an ampersand separated list. For example, &#x60;properties&#x3D;prop1,prop2&amp;properties&#x3D;prop3&#x60;. A maximum of 5 issue property keys can be specified. | [optional]
 **fieldsByKeys** | **kotlin.Boolean**| Reference fields by their key (rather than ID). | [optional] [default to false]

### Return type

[**SearchResults**](SearchResults.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlPost"></a>
# **comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlPost**
> SearchResults comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlPost(searchRequestBean)

Search for issues using JQL (POST)

Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ).  There is a [GET](#api-rest-api-3-search-get) version of this resource that can be used for smaller JQL query expressions.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Issues are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueSearchApi()
val searchRequestBean : SearchRequestBean = {"expand":["names","schema","operations"],"jql":"project = HSP","maxResults":15,"fieldsByKeys":false,"fields":["summary","status","assignee"],"startAt":0} // SearchRequestBean | A JSON object containing the search request.
try {
    val result : SearchResults = apiInstance.comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlPost(searchRequestBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueSearchApi#comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueSearchApi#comAtlassianJiraRestV2SearchSearchResourceSearchForIssuesUsingJqlPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchRequestBean** | [**SearchRequestBean**](SearchRequestBean.md)| A JSON object containing the search request. |

### Return type

[**SearchResults**](SearchResults.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

