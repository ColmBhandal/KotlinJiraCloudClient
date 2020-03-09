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

import org.openapitools.client.models.IssueTypeInfo

import com.squareup.moshi.Json
/**
 * Details of an issue type hierarchy level.
 * @param entityId The ID of the issue type hierarchy level.
 * @param level The level of the issue type hierarchy level.
 * @param name The name of the issue type hierarchy level.
 * @param issueTypes The list of issue types in the hierarchy level.
 */

data class ProjectIssueTypesHierarchyLevel (
    /* The ID of the issue type hierarchy level. */
    @Json(name = "entityId")
    val entityId: java.util.UUID? = null,
    /* The level of the issue type hierarchy level. */
    @Json(name = "level")
    val level: kotlin.Int? = null,
    /* The name of the issue type hierarchy level. */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* The list of issue types in the hierarchy level. */
    @Json(name = "issueTypes")
    val issueTypes: kotlin.Array<IssueTypeInfo>? = null
) 



