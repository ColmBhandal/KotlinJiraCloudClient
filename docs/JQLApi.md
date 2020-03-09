# JQLApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2JqlJqlParserResourceParseJqlQueriesPost**](JQLApi.md#comAtlassianJiraRestV2JqlJqlParserResourceParseJqlQueriesPost) | **POST** /rest/api/3/jql/parse | Parse JQL query
[**comAtlassianJiraRestV2SearchJQLPersonalDataMigrationResourceMigrateQueriesPost**](JQLApi.md#comAtlassianJiraRestV2SearchJQLPersonalDataMigrationResourceMigrateQueriesPost) | **POST** /rest/api/3/jql/pdcleaner | Convert user identifiers to account IDs in JQL queries
[**comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetAutoCompleteGet**](JQLApi.md#comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetAutoCompleteGet) | **GET** /rest/api/3/jql/autocompletedata | Get field reference data
[**comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetFieldAutoCompleteForQueryStringGet**](JQLApi.md#comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetFieldAutoCompleteForQueryStringGet) | **GET** /rest/api/3/jql/autocompletedata/suggestions | Get field auto complete suggestions


<a name="comAtlassianJiraRestV2JqlJqlParserResourceParseJqlQueriesPost"></a>
# **comAtlassianJiraRestV2JqlJqlParserResourceParseJqlQueriesPost**
> ParsedJqlQueries comAtlassianJiraRestV2JqlJqlParserResourceParseJqlQueriesPost(jqlQueriesToParse)

Parse JQL query

Parses and validates JQL queries.  Validation is performed in context of the current user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JQLApi()
val jqlQueriesToParse : JqlQueriesToParse = {"queries":["summary ~ test AND (labels in (urgent, blocker) OR lastCommentedBy = currentUser()) AND status CHANGED AFTER startOfMonth(-1M) ORDER BY updated DESC","invalid query","summary = test","summary in test","project = INVALID","universe = 42"]} // JqlQueriesToParse | 
try {
    val result : ParsedJqlQueries = apiInstance.comAtlassianJiraRestV2JqlJqlParserResourceParseJqlQueriesPost(jqlQueriesToParse)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JQLApi#comAtlassianJiraRestV2JqlJqlParserResourceParseJqlQueriesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JQLApi#comAtlassianJiraRestV2JqlJqlParserResourceParseJqlQueriesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jqlQueriesToParse** | [**JqlQueriesToParse**](JqlQueriesToParse.md)|  |

### Return type

[**ParsedJqlQueries**](ParsedJqlQueries.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2SearchJQLPersonalDataMigrationResourceMigrateQueriesPost"></a>
# **comAtlassianJiraRestV2SearchJQLPersonalDataMigrationResourceMigrateQueriesPost**
> ConvertedJQLQueries comAtlassianJiraRestV2SearchJQLPersonalDataMigrationResourceMigrateQueriesPost(jqLPersonalDataMigrationRequest)

Convert user identifiers to account IDs in JQL queries

Converts one or more JQL queries with user identifiers (username or user key) to equivalent JQL queries with account IDs.  You may wish to use this operation if your system stores JQL queries and you want to make them GDPR-compliant. For more information about GDPR-related changes, see the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/).  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JQLApi()
val jqLPersonalDataMigrationRequest : JQLPersonalDataMigrationRequest = {"queryStrings":["assignee = mia","issuetype = Bug AND assignee in (mia) AND reporter in (alana) order by lastViewed DESC"]} // JQLPersonalDataMigrationRequest | 
try {
    val result : ConvertedJQLQueries = apiInstance.comAtlassianJiraRestV2SearchJQLPersonalDataMigrationResourceMigrateQueriesPost(jqLPersonalDataMigrationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JQLApi#comAtlassianJiraRestV2SearchJQLPersonalDataMigrationResourceMigrateQueriesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JQLApi#comAtlassianJiraRestV2SearchJQLPersonalDataMigrationResourceMigrateQueriesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jqLPersonalDataMigrationRequest** | [**JQLPersonalDataMigrationRequest**](JQLPersonalDataMigrationRequest.md)|  |

### Return type

[**ConvertedJQLQueries**](ConvertedJQLQueries.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetAutoCompleteGet"></a>
# **comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetAutoCompleteGet**
> JQLReferenceData comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetAutoCompleteGet()

Get field reference data

Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JQLApi()
try {
    val result : JQLReferenceData = apiInstance.comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetAutoCompleteGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JQLApi#comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetAutoCompleteGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JQLApi#comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetAutoCompleteGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JQLReferenceData**](JQLReferenceData.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetFieldAutoCompleteForQueryStringGet"></a>
# **comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetFieldAutoCompleteForQueryStringGet**
> AutoCompleteSuggestions comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetFieldAutoCompleteForQueryStringGet(fieldName, fieldValue, predicateName, predicateValue)

Get field auto complete suggestions

Returns the JQL search auto complete suggestions for a field.  Suggestions can be obtained by providing:   *  &#x60;fieldName&#x60; to get a list of all values for the field.  *  &#x60;fieldName&#x60; and &#x60;fieldValue&#x60; to get a list of values containing the text in &#x60;fieldValue&#x60;.  *  &#x60;fieldName&#x60; and &#x60;predicateName&#x60; to get a list of all predicate values for the field.  *  &#x60;fieldName&#x60;, &#x60;predicateName&#x60;, and &#x60;predicateValue&#x60; to get a list of predicate values containing the text in &#x60;predicateValue&#x60;.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JQLApi()
val fieldName : kotlin.String = reporter // kotlin.String | The name of the field.
val fieldValue : kotlin.String = fieldValue_example // kotlin.String | The partial field item name entered by the user.
val predicateName : kotlin.String = predicateName_example // kotlin.String | The name of the [ CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*.
val predicateValue : kotlin.String = predicateValue_example // kotlin.String | The partial predicate item name entered by the user.
try {
    val result : AutoCompleteSuggestions = apiInstance.comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetFieldAutoCompleteForQueryStringGet(fieldName, fieldValue, predicateName, predicateValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JQLApi#comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetFieldAutoCompleteForQueryStringGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JQLApi#comAtlassianJiraRestV2SearchSearchAutoCompleteResourceGetFieldAutoCompleteForQueryStringGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldName** | **kotlin.String**| The name of the field. | [optional]
 **fieldValue** | **kotlin.String**| The partial field item name entered by the user. | [optional]
 **predicateName** | **kotlin.String**| The name of the [ CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*. | [optional]
 **predicateValue** | **kotlin.String**| The partial predicate item name entered by the user. | [optional]

### Return type

[**AutoCompleteSuggestions**](AutoCompleteSuggestions.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

