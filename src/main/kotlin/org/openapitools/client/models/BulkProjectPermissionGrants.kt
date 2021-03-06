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
 * List of project permissions and the projects and issues those permissions grant access to.
 * @param permission A project permission,
 * @param issues IDs of the issues the user has the permission for.
 * @param projects IDs of the projects the user has the permission for.
 */

data class BulkProjectPermissionGrants (
    /* A project permission, */
    @Json(name = "permission")
    val permission: kotlin.String,
    /* IDs of the issues the user has the permission for. */
    @Json(name = "issues")
    val issues: kotlin.collections.Set<kotlin.Long>,
    /* IDs of the projects the user has the permission for. */
    @Json(name = "projects")
    val projects: kotlin.collections.Set<kotlin.Long>
) 



