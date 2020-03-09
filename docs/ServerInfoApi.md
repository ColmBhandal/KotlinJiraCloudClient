# ServerInfoApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2ServerInfoResourceGetServerInfoGet**](ServerInfoApi.md#comAtlassianJiraRestV2ServerInfoResourceGetServerInfoGet) | **GET** /rest/api/3/serverInfo | Get Jira instance info


<a name="comAtlassianJiraRestV2ServerInfoResourceGetServerInfoGet"></a>
# **comAtlassianJiraRestV2ServerInfoResourceGetServerInfoGet**
> ServerInformation comAtlassianJiraRestV2ServerInfoResourceGetServerInfoGet()

Get Jira instance info

Returns information about the Jira instance.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServerInfoApi()
try {
    val result : ServerInformation = apiInstance.comAtlassianJiraRestV2ServerInfoResourceGetServerInfoGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServerInfoApi#comAtlassianJiraRestV2ServerInfoResourceGetServerInfoGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServerInfoApi#comAtlassianJiraRestV2ServerInfoResourceGetServerInfoGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServerInformation**](ServerInformation.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

