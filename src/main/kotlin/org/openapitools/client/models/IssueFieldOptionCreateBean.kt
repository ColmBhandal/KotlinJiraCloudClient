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

import org.openapitools.client.models.IssueFieldOptionConfiguration

import com.squareup.moshi.Json
/**
 * 
 * @param value The option's name, which is displayed in Jira.
 * @param properties The properties of the option as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/) are defined in the descriptor for the issue field module.
 * @param config 
 */

data class IssueFieldOptionCreateBean (
    /* The option's name, which is displayed in Jira. */
    @Json(name = "value")
    val value: kotlin.String,
    /* The properties of the option as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/) are defined in the descriptor for the issue field module. */
    @Json(name = "properties")
    val properties: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,
    @Json(name = "config")
    val config: IssueFieldOptionConfiguration? = null
) 



