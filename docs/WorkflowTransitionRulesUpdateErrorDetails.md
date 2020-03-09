
# WorkflowTransitionRulesUpdateErrorDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleUpdateErrors** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.Set&lt;kotlin.String&gt;&gt;** | A list of transition rule update errors, indexed by the transition rule ID. Any transition rule that appears here wasn&#39;t updated. | 
**workflowId** | [**WorkflowId**](WorkflowId.md) |  |  [optional]
**updateErrors** | **kotlin.collections.Set&lt;kotlin.String&gt;** | The list of errors that specify why the workflow update failed. The workflow was not updated if the list contains any entries. |  [optional]



