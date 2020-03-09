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

import org.openapitools.client.models.GroupName
import org.openapitools.client.models.Project
import org.openapitools.client.models.ProjectRole

import com.squareup.moshi.Json
/**
 * Details of a share permission for the filter.
 * @param type The type of share permission:   *  `group` Shared with a group. If set in a request, then specify `sharePermission.group` as well.  *  `project` Shared with a project. If set in a request, then specify `sharePermission.project` as well.  *  `projectRole` Share with a project role in a project. This value is not returned in responses. It is used in requests, where it needs to be specify with `projectId` and `projectRoleId`.  *  `global` Shared globally. If set in a request, no other `sharePermission` properties need to be specified.  *  `loggedin` Shared with all logged-in users. Note: This value is set in a request by specifying `authenticated` as the `type`.  *  `project-unknown` Shared with a project that the user does not have access to. Cannot be set in a request.
 * @param id The unique identifier of the share permission.
 * @param project The project that the filter is shared with. This is similar to the project object returned by [Get project](#api-rest-api-3-project-projectIdOrKey-get) but it contains a subset of the properties, which are: `self`, `id`, `key`, `assigneeType`, `name`, `roles`, `avatarUrls`, `projectType`, `simplified`.   For a request, specify the `id` for the project.
 * @param role The project role that the filter is shared with.   For a request, specify the `id` for the role. You must also specify the `project` object and `id` for the project that the role is in.
 * @param group The group that the filter is shared with. For a request, specify the `name` property for the group.
 */

data class SharePermission (
    /* The type of share permission:   *  `group` Shared with a group. If set in a request, then specify `sharePermission.group` as well.  *  `project` Shared with a project. If set in a request, then specify `sharePermission.project` as well.  *  `projectRole` Share with a project role in a project. This value is not returned in responses. It is used in requests, where it needs to be specify with `projectId` and `projectRoleId`.  *  `global` Shared globally. If set in a request, no other `sharePermission` properties need to be specified.  *  `loggedin` Shared with all logged-in users. Note: This value is set in a request by specifying `authenticated` as the `type`.  *  `project-unknown` Shared with a project that the user does not have access to. Cannot be set in a request. */
    @Json(name = "type")
    val type: SharePermission.Type,
    /* The unique identifier of the share permission. */
    @Json(name = "id")
    val id: kotlin.Long? = null,
    /* The project that the filter is shared with. This is similar to the project object returned by [Get project](#api-rest-api-3-project-projectIdOrKey-get) but it contains a subset of the properties, which are: `self`, `id`, `key`, `assigneeType`, `name`, `roles`, `avatarUrls`, `projectType`, `simplified`.   For a request, specify the `id` for the project. */
    @Json(name = "project")
    val project: Project? = null,
    /* The project role that the filter is shared with.   For a request, specify the `id` for the role. You must also specify the `project` object and `id` for the project that the role is in. */
    @Json(name = "role")
    val role: ProjectRole? = null,
    /* The group that the filter is shared with. For a request, specify the `name` property for the group. */
    @Json(name = "group")
    val group: GroupName? = null
) 


{
    /**
    * The type of share permission:   *  `group` Shared with a group. If set in a request, then specify `sharePermission.group` as well.  *  `project` Shared with a project. If set in a request, then specify `sharePermission.project` as well.  *  `projectRole` Share with a project role in a project. This value is not returned in responses. It is used in requests, where it needs to be specify with `projectId` and `projectRoleId`.  *  `global` Shared globally. If set in a request, no other `sharePermission` properties need to be specified.  *  `loggedin` Shared with all logged-in users. Note: This value is set in a request by specifying `authenticated` as the `type`.  *  `project-unknown` Shared with a project that the user does not have access to. Cannot be set in a request.
    * Values: group,project,projectRole,global,loggedin,authenticated,projectMinusUnknown
    */
    
    enum class Type(val value: kotlin.String){
        @Json(name = "group") group("group"),
        @Json(name = "project") project("project"),
        @Json(name = "projectRole") projectRole("projectRole"),
        @Json(name = "global") global("global"),
        @Json(name = "loggedin") loggedin("loggedin"),
        @Json(name = "authenticated") authenticated("authenticated"),
        @Json(name = "project-unknown") projectMinusUnknown("project-unknown");
    }
}
