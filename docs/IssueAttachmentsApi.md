# IssueAttachmentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForHumansGet**](IssueAttachmentsApi.md#comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForHumansGet) | **GET** /rest/api/3/attachment/{id}/expand/human | Get all metadata for an expanded attachment
[**comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForMachinesGet**](IssueAttachmentsApi.md#comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForMachinesGet) | **GET** /rest/api/3/attachment/{id}/expand/raw | Get contents metadata for an expanded attachment
[**comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentGet**](IssueAttachmentsApi.md#comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentGet) | **GET** /rest/api/3/attachment/{id} | Get attachment metadata
[**comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentMetaGet**](IssueAttachmentsApi.md#comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentMetaGet) | **GET** /rest/api/3/attachment/meta | Get Jira attachment settings
[**comAtlassianJiraRestV2IssueAttachmentAttachmentResourceRemoveAttachmentDelete**](IssueAttachmentsApi.md#comAtlassianJiraRestV2IssueAttachmentAttachmentResourceRemoveAttachmentDelete) | **DELETE** /rest/api/3/attachment/{id} | Delete attachment
[**comAtlassianJiraRestV2IssueIssueAttachmentsResourceAddAttachmentPost**](IssueAttachmentsApi.md#comAtlassianJiraRestV2IssueIssueAttachmentsResourceAddAttachmentPost) | **POST** /rest/api/3/issue/{issueIdOrKey}/attachments | Add attachment


<a name="comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForHumansGet"></a>
# **comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForHumansGet**
> AttachmentArchiveMetadataReadable comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForHumansGet(id)

Get all metadata for an expanded attachment

Returns the metadata for the contents of an attachment, if it is an archive, and metadata for the attachment itself. For example, if the attachment is a ZIP archive, then information about the files in the archive is returned and metadata for the ZIP archive. Currently, only the ZIP archive format is supported.  Use this operation to retrieve data that is presented to the user, as this operation returns the metadata for the attachment itself, such as the attachment&#39;s ID and name. Otherwise, use [ Get contents metadata for an expanded attachment](#api-rest-api-3-attachment-id-expand-raw-get), which only returns the metadata for the attachment&#39;s contents.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the issue containing the attachment:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueAttachmentsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the attachment.
try {
    val result : AttachmentArchiveMetadataReadable = apiInstance.comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForHumansGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueAttachmentsApi#comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForHumansGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueAttachmentsApi#comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForHumansGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the attachment. |

### Return type

[**AttachmentArchiveMetadataReadable**](AttachmentArchiveMetadataReadable.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForMachinesGet"></a>
# **comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForMachinesGet**
> AttachmentArchiveImpl comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForMachinesGet(id)

Get contents metadata for an expanded attachment

Returns the metadata for the contents of an attachment, if it is an archive. For example, if the attachment is a ZIP archive, then information about the files in the archive is returned. Currently, only the ZIP archive format is supported.  Use this operation if you are processing the data without presenting it to the user, as this operation only returns the metadata for the contents of the attachment. Otherwise, to retrieve data to present to the user, use [ Get all metadata for an expanded attachment](#api-rest-api-3-attachment-id-expand-human-get) which also returns the metadata for the attachment itself, such as the attachment&#39;s ID and name.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the issue containing the attachment:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueAttachmentsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the attachment.
try {
    val result : AttachmentArchiveImpl = apiInstance.comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForMachinesGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueAttachmentsApi#comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForMachinesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueAttachmentsApi#comAtlassianJiraRestV2IssueAttachmentAttachmentResourceExpandAttachmentForMachinesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the attachment. |

### Return type

[**AttachmentArchiveImpl**](AttachmentArchiveImpl.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentGet"></a>
# **comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentGet**
> AttachmentMetadata comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentGet(id)

Get attachment metadata

Returns the metadata for an attachment. Note that the attachment itself is not returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueAttachmentsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the attachment.
try {
    val result : AttachmentMetadata = apiInstance.comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueAttachmentsApi#comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueAttachmentsApi#comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the attachment. |

### Return type

[**AttachmentMetadata**](AttachmentMetadata.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentMetaGet"></a>
# **comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentMetaGet**
> AttachmentSettings comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentMetaGet()

Get Jira attachment settings

Returns the attachment settings, that is, whether attachments are enabled and the maximum attachment size allowed.  Note that there are also [project permissions](https://confluence.atlassian.com/x/yodKLg) that restrict whether users can create and delete attachments.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueAttachmentsApi()
try {
    val result : AttachmentSettings = apiInstance.comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentMetaGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueAttachmentsApi#comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentMetaGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueAttachmentsApi#comAtlassianJiraRestV2IssueAttachmentAttachmentResourceGetAttachmentMetaGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AttachmentSettings**](AttachmentSettings.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueAttachmentAttachmentResourceRemoveAttachmentDelete"></a>
# **comAtlassianJiraRestV2IssueAttachmentAttachmentResourceRemoveAttachmentDelete**
> comAtlassianJiraRestV2IssueAttachmentAttachmentResourceRemoveAttachmentDelete(id)

Delete attachment

Deletes an attachment from an issue.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** For the project holding the issue containing the attachment:   *  *Delete own attachments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete an attachment created by the calling user.  *  *Delete all attachments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete an attachment created by any user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueAttachmentsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the attachment.
try {
    apiInstance.comAtlassianJiraRestV2IssueAttachmentAttachmentResourceRemoveAttachmentDelete(id)
} catch (e: ClientException) {
    println("4xx response calling IssueAttachmentsApi#comAtlassianJiraRestV2IssueAttachmentAttachmentResourceRemoveAttachmentDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueAttachmentsApi#comAtlassianJiraRestV2IssueAttachmentAttachmentResourceRemoveAttachmentDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the attachment. |

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

<a name="comAtlassianJiraRestV2IssueIssueAttachmentsResourceAddAttachmentPost"></a>
# **comAtlassianJiraRestV2IssueIssueAttachmentsResourceAddAttachmentPost**
> kotlin.Array&lt;Attachment&gt; comAtlassianJiraRestV2IssueIssueAttachmentsResourceAddAttachmentPost(issueIdOrKey)

Add attachment

Adds one or more attachments to an issue. Attachments are posted as multipart/form-data ([RFC 1867](https://www.ietf.org/rfc/rfc1867.txt)).  Note that:   *  The request must have a &#x60;X-Atlassian-Token: no-check&#x60; header, if not it is blocked. See [Special headers](#special-request-headers) for more information.  *  The name of the multipart/form-data parameter that contains the attachments must be &#x60;file&#x60;.  The following example uploads a file called *myfile.txt* to the issue *TEST-123*:  &#x60;curl -D- -u admin:admin -X POST -H \&quot;X-Atlassian-Token: no-check\&quot; -F \&quot;file&#x3D;@myfile.txt\&quot; https://your-domain.atlassian.net/rest/api/3/issue/TEST-123/attachments&#x60;  Tip: Use a client library. Many client libraries have classes for handling multipart POST operations. For example, in Java, the Apache HTTP Components library provides a [MultiPartEntity](http://hc.apache.org/httpcomponents-client-ga/httpmime/apidocs/org/apache/http/entity/mime/MultipartEntity.html) class for multipart POST operations.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**    *  *Browse Projects* and *Create attachments* [ project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueAttachmentsApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue that attachments are added to.
try {
    val result : kotlin.Array<Attachment> = apiInstance.comAtlassianJiraRestV2IssueIssueAttachmentsResourceAddAttachmentPost(issueIdOrKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueAttachmentsApi#comAtlassianJiraRestV2IssueIssueAttachmentsResourceAddAttachmentPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueAttachmentsApi#comAtlassianJiraRestV2IssueIssueAttachmentsResourceAddAttachmentPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue that attachments are added to. |

### Return type

[**kotlin.Array&lt;Attachment&gt;**](Attachment.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

