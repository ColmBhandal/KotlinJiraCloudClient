
# AuditRecordBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Long** | The ID of the audit record. |  [optional] [readonly]
**summary** | **kotlin.String** | The summary of the audit record. |  [optional] [readonly]
**remoteAddress** | **kotlin.String** | The URL of the computer where the creation of the audit record was initiated. |  [optional] [readonly]
**authorKey** | **kotlin.String** | Deprecated, use &#x60;authorAccountId&#x60; instead. The key of the user who created the audit record. |  [optional] [readonly]
**created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time on which the audit record was created. |  [optional] [readonly]
**category** | **kotlin.String** | The category of the audit record. For a list of these categories, see the help article [Auditing in Jira applications](https://confluence.atlassian.com/x/noXKM). |  [optional] [readonly]
**eventSource** | **kotlin.String** | The event the audit record originated from. |  [optional] [readonly]
**description** | **kotlin.String** | The description of the audit record. |  [optional] [readonly]
**objectItem** | [**AssociatedItemBean**](AssociatedItemBean.md) |  |  [optional]
**changedValues** | [**kotlin.Array&lt;ChangedValueBean&gt;**](ChangedValueBean.md) | The list of values changed in the record event. |  [optional] [readonly]
**associatedItems** | [**kotlin.Array&lt;AssociatedItemBean&gt;**](AssociatedItemBean.md) | The list of items associated with the changed record. |  [optional] [readonly]



