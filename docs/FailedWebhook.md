
# FailedWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The webhook ID, as sent in the &#x60;X-Atlassian-Webhook-Identifier&#x60; header with the webhook. | 
**url** | **kotlin.String** | The original webhook destination. | 
**failureTime** | **kotlin.Long** | The time the webhook was added to the list of failed webhooks (that is, the time of the last failed retry). | 
**body** | **kotlin.String** | The webhook body. |  [optional]



