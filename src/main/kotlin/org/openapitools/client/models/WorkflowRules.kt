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

import org.openapitools.client.models.WorkflowTransitionRule

import com.squareup.moshi.Json
/**
 * A collection of transition rules.
 * @param conditions The workflow conditions.
 * @param validators The workflow validators.
 * @param postFunctions The workflow post functions.
 */

data class WorkflowRules (
    /* The workflow conditions. */
    @Json(name = "conditions")
    val conditions: kotlin.Array<WorkflowTransitionRule>,
    /* The workflow validators. */
    @Json(name = "validators")
    val validators: kotlin.Array<WorkflowTransitionRule>,
    /* The workflow post functions. */
    @Json(name = "postFunctions")
    val postFunctions: kotlin.Array<WorkflowTransitionRule>
) 



