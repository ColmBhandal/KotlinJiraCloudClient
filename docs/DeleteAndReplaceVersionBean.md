
# DeleteAndReplaceVersionBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**moveFixIssuesTo** | **kotlin.Long** | The ID of the version to update &#x60;fixVersion&#x60; to when the field contains the deleted version. |  [optional]
**moveAffectedIssuesTo** | **kotlin.Long** | The ID of the version to update &#x60;affectedVersion&#x60; to when the field contains the deleted version. |  [optional]
**customFieldReplacementList** | [**kotlin.Array&lt;CustomFieldReplacement&gt;**](CustomFieldReplacement.md) | An array of custom field IDs (&#x60;customFieldId&#x60;) and version IDs (&#x60;moveTo&#x60;) to update when the fields contain the deleted version. |  [optional]



