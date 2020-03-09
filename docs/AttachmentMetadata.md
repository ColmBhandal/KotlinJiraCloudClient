
# AttachmentMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Long** | The ID of the attachment. |  [optional] [readonly]
**self** | [**java.net.URI**](java.net.URI.md) | The URL of the attachment metadata details. |  [optional] [readonly]
**filename** | **kotlin.String** | The name of the attachment file. |  [optional] [readonly]
**author** | [**User**](User.md) | Details of the user who attached the file. |  [optional] [readonly]
**created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The datetime the attachment was created. |  [optional] [readonly]
**size** | **kotlin.Long** | The size of the attachment. |  [optional] [readonly]
**mimeType** | **kotlin.String** | The MIME type of the attachment. |  [optional] [readonly]
**properties** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Additional properties of the attachment. |  [optional] [readonly]
**content** | **kotlin.String** | The URL of the attachment. |  [optional] [readonly]
**thumbnail** | **kotlin.String** | The URL of a thumbnail representing the attachment. |  [optional] [readonly]



