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

import org.openapitools.client.models.IssueTypeDetails
import org.openapitools.client.models.Priority
import org.openapitools.client.models.StatusDetails
import org.openapitools.client.models.UserDetails

import com.squareup.moshi.Json
/**
 * Key fields from the linked issue.
 * @param summary The summary description of the linked issue.
 * @param status The status of the linked issue.
 * @param priority The priority of the linked issue.
 * @param assignee The assignee of the linked issue.
 * @param issuetype 
 * @param issueType The type of the linked issue.
 */

data class Fields (
    /* The summary description of the linked issue. */
    @Json(name = "summary")
    val summary: kotlin.String? = null,
    /* The status of the linked issue. */
    @Json(name = "status")
    val status: StatusDetails? = null,
    /* The priority of the linked issue. */
    @Json(name = "priority")
    val priority: Priority? = null,
    /* The assignee of the linked issue. */
    @Json(name = "assignee")
    val assignee: UserDetails? = null,
    @Json(name = "issuetype")
    val issuetype: IssueTypeDetails? = null,
    /* The type of the linked issue. */
    @Json(name = "issueType")
    val issueType: IssueTypeDetails? = null
) 



