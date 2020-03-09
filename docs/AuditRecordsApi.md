# AuditRecordsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2AdminAuditingAuditingResourceGetAuditRecordsGet**](AuditRecordsApi.md#comAtlassianJiraRestV2AdminAuditingAuditingResourceGetAuditRecordsGet) | **GET** /rest/api/3/auditing/record | Get audit records


<a name="comAtlassianJiraRestV2AdminAuditingAuditingResourceGetAuditRecordsGet"></a>
# **comAtlassianJiraRestV2AdminAuditingAuditingResourceGetAuditRecordsGet**
> AuditRecords comAtlassianJiraRestV2AdminAuditingAuditingResourceGetAuditRecordsGet(offset, limit, filter, from, to)

Get audit records

Returns a list of audit records. The list can be filtered to include items:   *  containing a string in at least one field. For example, providing *up* will return all audit records where one or more fields contains words such as *update*.  *  created on or after a date and time.  *  created or or before a date and time.  *  created during a time period.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuditRecordsApi()
val offset : kotlin.Int = 56 // kotlin.Int | The number of records to skip before returning the first result.
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of results to return.
val filter : kotlin.String = filter_example // kotlin.String | The query string.
val from : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | The date and time on or after which returned audit records must have been created. If `to` is provided `from` must be before `to` or no audit records are returned.
val to : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | The date and time on or before which returned audit results must have been created. If `from` is provided `to` must be after `from` or no audit records are returned.
try {
    val result : AuditRecords = apiInstance.comAtlassianJiraRestV2AdminAuditingAuditingResourceGetAuditRecordsGet(offset, limit, filter, from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuditRecordsApi#comAtlassianJiraRestV2AdminAuditingAuditingResourceGetAuditRecordsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuditRecordsApi#comAtlassianJiraRestV2AdminAuditingAuditingResourceGetAuditRecordsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **kotlin.Int**| The number of records to skip before returning the first result. | [optional] [default to 0]
 **limit** | **kotlin.Int**| The maximum number of results to return. | [optional] [default to 1000]
 **filter** | **kotlin.String**| The query string. | [optional]
 **from** | **java.time.OffsetDateTime**| The date and time on or after which returned audit records must have been created. If &#x60;to&#x60; is provided &#x60;from&#x60; must be before &#x60;to&#x60; or no audit records are returned. | [optional]
 **to** | **java.time.OffsetDateTime**| The date and time on or before which returned audit results must have been created. If &#x60;from&#x60; is provided &#x60;to&#x60; must be after &#x60;from&#x60; or no audit records are returned. | [optional]

### Return type

[**AuditRecords**](AuditRecords.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

