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

import org.openapitools.client.models.User

import com.squareup.moshi.Json
/**
 * Details about a component with a count of the issues it contains.
 * @param issueCount Count of issues for the component.
 * @param description The description for the component.
 * @param self The URL for this count of the issues contained in the component.
 * @param project The key of the project to which the component is assigned.
 * @param lead The user details for the component's lead user.
 * @param assigneeType The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
 * @param projectId Not used.
 * @param assignee The details of the user associated with `assigneeType`, if any. See `realAssignee` for details of the user assigned to issues created with this component.
 * @param realAssignee The user assigned to issues created with this component, when `assigneeType` does not identify a valid assignee.
 * @param isAssigneeTypeValid Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.
 * @param realAssigneeType The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:   *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.  *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.  *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.  *  `PROJECT_DEFAULT` when none of the preceding cases are true.
 * @param name The name for the component.
 * @param id The unique identifier for the component.
 */

data class ComponentWithIssueCount (
    /* Count of issues for the component. */
    @Json(name = "issueCount")
    val issueCount: kotlin.Long? = null,
    /* The description for the component. */
    @Json(name = "description")
    val description: kotlin.String? = null,
    /* The URL for this count of the issues contained in the component. */
    @Json(name = "self")
    val self: java.net.URI? = null,
    /* The key of the project to which the component is assigned. */
    @Json(name = "project")
    val project: kotlin.String? = null,
    /* The user details for the component's lead user. */
    @Json(name = "lead")
    val lead: User? = null,
    /* The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in. */
    @Json(name = "assigneeType")
    val assigneeType: ComponentWithIssueCount.AssigneeType? = null,
    /* Not used. */
    @Json(name = "projectId")
    val projectId: kotlin.Long? = null,
    /* The details of the user associated with `assigneeType`, if any. See `realAssignee` for details of the user assigned to issues created with this component. */
    @Json(name = "assignee")
    val assignee: User? = null,
    /* The user assigned to issues created with this component, when `assigneeType` does not identify a valid assignee. */
    @Json(name = "realAssignee")
    val realAssignee: User? = null,
    /* Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned. */
    @Json(name = "isAssigneeTypeValid")
    val isAssigneeTypeValid: kotlin.Boolean? = null,
    /* The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:   *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.  *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.  *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.  *  `PROJECT_DEFAULT` when none of the preceding cases are true. */
    @Json(name = "realAssigneeType")
    val realAssigneeType: ComponentWithIssueCount.RealAssigneeType? = null,
    /* The name for the component. */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* The unique identifier for the component. */
    @Json(name = "id")
    val id: kotlin.String? = null
) 


{
    /**
    * The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
    * Values: pROJECTDEFAULT,cOMPONENTLEAD,pROJECTLEAD,uNASSIGNED
    */
    
    enum class AssigneeType(val value: kotlin.String){
        @Json(name = "PROJECT_DEFAULT") pROJECTDEFAULT("PROJECT_DEFAULT"),
        @Json(name = "COMPONENT_LEAD") cOMPONENTLEAD("COMPONENT_LEAD"),
        @Json(name = "PROJECT_LEAD") pROJECTLEAD("PROJECT_LEAD"),
        @Json(name = "UNASSIGNED") uNASSIGNED("UNASSIGNED");
    }
    /**
    * The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:   *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.  *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.  *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.  *  `PROJECT_DEFAULT` when none of the preceding cases are true.
    * Values: pROJECTDEFAULT,cOMPONENTLEAD,pROJECTLEAD,uNASSIGNED
    */
    
    enum class RealAssigneeType(val value: kotlin.String){
        @Json(name = "PROJECT_DEFAULT") pROJECTDEFAULT("PROJECT_DEFAULT"),
        @Json(name = "COMPONENT_LEAD") cOMPONENTLEAD("COMPONENT_LEAD"),
        @Json(name = "PROJECT_LEAD") pROJECTLEAD("PROJECT_LEAD"),
        @Json(name = "UNASSIGNED") uNASSIGNED("UNASSIGNED");
    }
}
