
# HistoryMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **kotlin.String** | The type of the history record. |  [optional]
**description** | **kotlin.String** | The description of the history record. |  [optional]
**descriptionKey** | **kotlin.String** | The description key of the history record. |  [optional]
**activityDescription** | **kotlin.String** | The activity described in the history record. |  [optional]
**activityDescriptionKey** | **kotlin.String** | The key of the activity described in the history record. |  [optional]
**emailDescription** | **kotlin.String** | The description of the email address associated the history record. |  [optional]
**emailDescriptionKey** | **kotlin.String** | The description key of the email address associated the history record. |  [optional]
**actor** | [**HistoryMetadataParticipant**](HistoryMetadataParticipant.md) | Details of the user whose action created the history record. |  [optional]
**generator** | [**HistoryMetadataParticipant**](HistoryMetadataParticipant.md) | Details of the system that generated the history record. |  [optional]
**cause** | [**HistoryMetadataParticipant**](HistoryMetadataParticipant.md) | Details of the cause that triggered the creation the history record. |  [optional]
**extraData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Additional arbitrary information about the history record. |  [optional]



