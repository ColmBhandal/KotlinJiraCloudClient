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
package org.openapitools.client.apis

import org.openapitools.client.models.FoundUsersAndGroups

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class GroupAndUserPickerApi(basePath: kotlin.String = "http://localhost") : ApiClient(basePath) {

    /**
    * Find users and groups
    * Returns a list of users and groups matching a string. The string is used:   *  for users, to find a case-insensitive match with display name and e-mail address. Note that if a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required.  *  for groups, to find a case-sensitive match with group name.  For example, if the string *tin* is used, records with the display name *Tina*, email address *sarah@tinplatetraining.com*, and the group *accounting* would be returned.  Optionally, the search can be refined to:   *  the projects and issue types associated with a custom field, such as a user picker. The search can then be further refined to return only users and groups that have permission to view specific:           *  projects.      *  issue types.          If multiple projects or issue types are specified, they must be a subset of those enabled for the custom field or no results are returned. For example, if a field is enabled for projects A, B, and C then the search could be limited to projects B and C. However, if the search is limited to projects B and D, nothing is returned.  *  not return Connect app users and groups.  *  return groups that have a case-insensitive match with the query.  The primary use case for this resource is to populate a picker field suggestion list with users or groups. To this end, the returned object includes an &#x60;html&#x60; field for each list. This field highlights the matched query term in the item name with the HTML strong tag. Also, each list is wrapped in a response object that contains a header for use in a picker, specifically *Showing X of Y matching groups*.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/yodKLg).
    * @param query The search string. 
    * @param maxResults The maximum number of items to return in each list. (optional, default to 50)
    * @param showAvatar Whether the user avatar should be returned. If an invalid value is provided, the default value is used. (optional, default to false)
    * @param fieldId The custom field ID of the field this request is for. (optional)
    * @param projectId The ID of a project that returned users and groups must have permission to view. To include multiple projects, provide an ampersand-separated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. This parameter is only used when &#x60;fieldId&#x60; is present. (optional)
    * @param issueTypeId The ID of an issue type that returned users and groups must have permission to view. To include multiple issue types, provide an ampersand-separated list. For example, &#x60;issueTypeId&#x3D;10000&amp;issueTypeId&#x3D;10001&#x60;. Special values, such as &#x60;-1&#x60; (all standard issue types) and &#x60;-2&#x60; (all subtask issue types), are supported. This parameter is only used when &#x60;fieldId&#x60; is present. (optional)
    * @param avatarSize The size of the avatar to return. If an invalid value is provided, the default value is used. (optional, default to 'xsmall')
    * @param caseInsensitive Whether the search for groups should be case insensitive. (optional, default to false)
    * @param excludeConnectAddons Whether Connect app users and groups should be excluded from the search results. If an invalid value is provided, the default value is used. (optional, default to false)
    * @return FoundUsersAndGroups
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun comAtlassianJiraRestV2IssueGroupAndUserPickerResourceFindUsersAndGroupsGet(query: kotlin.String, maxResults: kotlin.Int?, showAvatar: kotlin.Boolean?, fieldId: kotlin.String?, projectId: kotlin.Array<kotlin.String>?, issueTypeId: kotlin.Array<kotlin.String>?, avatarSize: kotlin.String?, caseInsensitive: kotlin.Boolean?, excludeConnectAddons: kotlin.Boolean?) : FoundUsersAndGroups {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("query", listOf(query.toString()))
                if (maxResults != null) {
                    put("maxResults", listOf(maxResults.toString()))
                }
                if (showAvatar != null) {
                    put("showAvatar", listOf(showAvatar.toString()))
                }
                if (fieldId != null) {
                    put("fieldId", listOf(fieldId.toString()))
                }
                if (projectId != null) {
                    put("projectId", toMultiValue(projectId.toList(), "multi"))
                }
                if (issueTypeId != null) {
                    put("issueTypeId", toMultiValue(issueTypeId.toList(), "multi"))
                }
                if (avatarSize != null) {
                    put("avatarSize", listOf(avatarSize.toString()))
                }
                if (caseInsensitive != null) {
                    put("caseInsensitive", listOf(caseInsensitive.toString()))
                }
                if (excludeConnectAddons != null) {
                    put("excludeConnectAddons", listOf(excludeConnectAddons.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/rest/api/3/groupuserpicker",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<FoundUsersAndGroups>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as FoundUsersAndGroups
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException(localVarError.body as? String ?: "Client error", localVarError.statusCode)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException(localVarError.message ?: "Server error", localVarError.statusCode)
            }
        }
    }

}
