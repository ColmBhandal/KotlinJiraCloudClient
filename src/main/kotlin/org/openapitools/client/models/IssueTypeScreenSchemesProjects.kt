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

import org.openapitools.client.models.IssueTypeScreenScheme

import com.squareup.moshi.Json
/**
 * List of issue type screen schemes, each with a list of the projects that use it.
 * @param projectIds The IDs of the projects using the issue type screen scheme.
 * @param issueTypeScreenScheme Details of an issue type screen scheme.
 */

data class IssueTypeScreenSchemesProjects (
    /* The IDs of the projects using the issue type screen scheme. */
    @Json(name = "projectIds")
    val projectIds: kotlin.Array<kotlin.String>,
    /* Details of an issue type screen scheme. */
    @Json(name = "issueTypeScreenScheme")
    val issueTypeScreenScheme: IssueTypeScreenScheme? = null
) 



