
# Webhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Long** | The ID of the webhook. | 
**jqlFilter** | **kotlin.String** | The JQL filter that specifies which issues the webhook is sent for. | 
**expirationDate** | **kotlin.Long** |  |  [readonly]
**events** | [**inline**](#kotlin.Array&lt;EventsEnum&gt;) | The Jira events that trigger the webhook. |  [optional]


<a name="kotlin.Array<EventsEnum>"></a>
## Enum: events
Name | Value
---- | -----
events | jira:issue_created, jira:issue_updated, jira:issue_deleted, comment_created, comment_updated, comment_deleted, issue_property_set, issue_property_deleted



