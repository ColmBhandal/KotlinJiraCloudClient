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

import org.openapitools.client.models.RoleActor
import org.openapitools.client.models.Scope

import com.squareup.moshi.Json
/**
 * Details about the roles in a project.
 * @param self The URL the project role details.
 * @param name The name of the project role.
 * @param id The ID of the project role.
 * @param description The description of the project role.
 * @param actors The list of users who act in this role.
 * @param scope The scope of the role. Indicated for roles associated with [next-gen projects](https://confluence.atlassian.com/x/loMyO).
 * @param admin Whether this role is the admin role for the project.
 * @param default Whether this role is the default role for the project
 */

data class ProjectRole (
    /* The URL the project role details. */
    @Json(name = "self")
    val self: java.net.URI? = null,
    /* The name of the project role. */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* The ID of the project role. */
    @Json(name = "id")
    val id: kotlin.Long? = null,
    /* The description of the project role. */
    @Json(name = "description")
    val description: kotlin.String? = null,
    /* The list of users who act in this role. */
    @Json(name = "actors")
    val actors: kotlin.Array<RoleActor>? = null,
    /* The scope of the role. Indicated for roles associated with [next-gen projects](https://confluence.atlassian.com/x/loMyO). */
    @Json(name = "scope")
    val scope: Scope? = null,
    /* Whether this role is the admin role for the project. */
    @Json(name = "admin")
    val admin: kotlin.Boolean? = null,
    /* Whether this role is the default role for the project */
    @Json(name = "default")
    val default: kotlin.Boolean? = null
) 



