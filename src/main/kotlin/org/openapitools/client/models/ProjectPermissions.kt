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
 * Permissions which a user has on a project.
 * @param canEdit Whether the logged user can edit the project.
 */

data class ProjectPermissions (
    /* Whether the logged user can edit the project. */
    @Json(name = "canEdit")
    val canEdit: kotlin.Boolean? = null
) 


