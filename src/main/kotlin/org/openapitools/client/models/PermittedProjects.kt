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

import org.openapitools.client.models.ProjectIdentifierBean

import com.squareup.moshi.Json
/**
 * A list of projects in which a user is granted permissions.
 * @param projects A list of projects.
 */

data class PermittedProjects (
    /* A list of projects. */
    @Json(name = "projects")
    val projects: kotlin.Array<ProjectIdentifierBean>? = null
) 



