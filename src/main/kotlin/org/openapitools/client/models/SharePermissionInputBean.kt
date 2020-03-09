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
 * 
 * @param type The type of the share permission.Specify the type as follows:   *  `group` Share with a group. Specify `groupname` as well.  *  `project` Share with a project. Specify `projectId` as well.  *  `projectRole` Share with a project role in a project. Specify `projectId` and `projectRoleId` as well.  *  `global` Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  `authenticated` Share with all logged-in users. This shows as `loggedin` in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
 * @param projectId The ID of the project to share the filter with. Set `type` to `project`.
 * @param groupname The name of the group to share the filter with. Set `type` to `group`.
 * @param projectRoleId The ID of the project role to share the filter with. Set `type` to `projectRole` and the `projectId` for the project that the role is in.
 */

data class SharePermissionInputBean (
    /* The type of the share permission.Specify the type as follows:   *  `group` Share with a group. Specify `groupname` as well.  *  `project` Share with a project. Specify `projectId` as well.  *  `projectRole` Share with a project role in a project. Specify `projectId` and `projectRoleId` as well.  *  `global` Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  `authenticated` Share with all logged-in users. This shows as `loggedin` in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set. */
    @Json(name = "type")
    val type: SharePermissionInputBean.Type,
    /* The ID of the project to share the filter with. Set `type` to `project`. */
    @Json(name = "projectId")
    val projectId: kotlin.String? = null,
    /* The name of the group to share the filter with. Set `type` to `group`. */
    @Json(name = "groupname")
    val groupname: kotlin.String? = null,
    /* The ID of the project role to share the filter with. Set `type` to `projectRole` and the `projectId` for the project that the role is in. */
    @Json(name = "projectRoleId")
    val projectRoleId: kotlin.String? = null
) 


{
    /**
    * The type of the share permission.Specify the type as follows:   *  `group` Share with a group. Specify `groupname` as well.  *  `project` Share with a project. Specify `projectId` as well.  *  `projectRole` Share with a project role in a project. Specify `projectId` and `projectRoleId` as well.  *  `global` Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  `authenticated` Share with all logged-in users. This shows as `loggedin` in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
    * Values: project,group,projectRole,global,authenticated
    */
    
    enum class Type(val value: kotlin.String){
        @Json(name = "project") project("project"),
        @Json(name = "group") group("group"),
        @Json(name = "projectRole") projectRole("projectRole"),
        @Json(name = "global") global("global"),
        @Json(name = "authenticated") authenticated("authenticated");
    }
}
