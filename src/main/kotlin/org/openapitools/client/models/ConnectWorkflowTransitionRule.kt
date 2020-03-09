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

import org.openapitools.client.models.RuleConfiguration
import org.openapitools.client.models.WorkflowTransition

import com.squareup.moshi.Json
/**
 * A workflow transition rule.
 * @param id The ID of the transition rule.
 * @param key The key of the rule, as defined in the Connect app descriptor.
 * @param configuration 
 * @param transition 
 */

data class ConnectWorkflowTransitionRule (
    /* The ID of the transition rule. */
    @Json(name = "id")
    val id: kotlin.String,
    /* The key of the rule, as defined in the Connect app descriptor. */
    @Json(name = "key")
    val key: kotlin.String,
    @Json(name = "configuration")
    val configuration: RuleConfiguration? = null,
    @Json(name = "transition")
    val transition: WorkflowTransition? = null
) 



