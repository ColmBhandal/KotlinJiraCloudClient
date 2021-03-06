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

import org.openapitools.client.models.JsonNode

import com.squareup.moshi.Json
/**
 * Lists of issues and entity properties. See [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/) for more information.
 * @param entitiesIds A list of entity property IDs.
 * @param properties A list of entity property keys and values.
 */

data class IssueEntityProperties (
    /* A list of entity property IDs. */
    @Json(name = "entitiesIds")
    val entitiesIds: kotlin.collections.Set<kotlin.Long>? = null,
    /* A list of entity property keys and values. */
    @Json(name = "properties")
    val properties: kotlin.collections.Map<kotlin.String, JsonNode>? = null
) 



