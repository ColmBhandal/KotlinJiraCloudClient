
# IssueTypesWorkflowMapping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**workflow** | **kotlin.String** | The name of the workflow. Optional if updating the workflow-issue types mapping. |  [optional]
**issueTypes** | **kotlin.Array&lt;kotlin.String&gt;** | The list of issue type IDs. |  [optional]
**defaultMapping** | **kotlin.Boolean** | Whether the workflow is the default workflow for the workflow scheme. |  [optional]
**updateDraftIfNeeded** | **kotlin.Boolean** | Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new workflow-issue types mapping. Defaults to &#x60;false&#x60;. |  [optional]



