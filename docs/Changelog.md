
# Changelog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The ID of the changelog. |  [optional] [readonly]
**author** | [**UserDetails**](UserDetails.md) | The user who made the change. |  [optional] [readonly]
**created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date on which the change took place. |  [optional] [readonly]
**items** | [**kotlin.Array&lt;ChangeDetails&gt;**](ChangeDetails.md) | The list of items changed. |  [optional] [readonly]
**historyMetadata** | [**HistoryMetadata**](HistoryMetadata.md) | The history metadata associated with the changed. |  [optional] [readonly]



