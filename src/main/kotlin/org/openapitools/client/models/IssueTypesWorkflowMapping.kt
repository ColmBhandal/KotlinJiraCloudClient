/**
* The Jira Cloud platform REST API
* Jira Cloud platform REST API documentation
*
* The version of the OpenAPI document: 1001.0.0-SNAPSHOT
* Contact: ecosystem@atlassian.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json
/**
 * Details about the mapping between issue types and a workflow.
 * @param workflow The name of the workflow. Optional if updating the workflow-issue types mapping.
 * @param issueTypes The list of issue type IDs.
 * @param defaultMapping Whether the workflow is the default workflow for the workflow scheme.
 * @param updateDraftIfNeeded Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new workflow-issue types mapping. Defaults to `false`.
 */

data class IssueTypesWorkflowMapping (
    /* The name of the workflow. Optional if updating the workflow-issue types mapping. */
    @Json(name = "workflow")
    val workflow: kotlin.String? = null,
    /* The list of issue type IDs. */
    @Json(name = "issueTypes")
    val issueTypes: kotlin.Array<kotlin.String>? = null,
    /* Whether the workflow is the default workflow for the workflow scheme. */
    @Json(name = "defaultMapping")
    val defaultMapping: kotlin.Boolean? = null,
    /* Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new workflow-issue types mapping. Defaults to `false`. */
    @Json(name = "updateDraftIfNeeded")
    val updateDraftIfNeeded: kotlin.Boolean? = null
) 



