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

import org.openapitools.client.models.ChangedWorklogs
import org.openapitools.client.models.PageOfWorklogs
import org.openapitools.client.models.Worklog
import org.openapitools.client.models.WorklogIdsRequestBean

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

class IssueWorklogsApi(basePath: kotlin.String = "http://localhost") : ApiClient(basePath) {

    /**
    * Add worklog
    * Adds a worklog to an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Work on issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
    * @param issueIdOrKey The ID or key the issue. 
    * @param requestBody  
    * @param notifyUsers Whether users watching the issue are notified by email. (optional, default to true)
    * @param adjustEstimate Defines how to update the issue&#39;s time estimate, the options are:   *  &#x60;new&#x60; Sets the estimate to a specific value, defined in &#x60;newEstimate&#x60;.  *  &#x60;leave&#x60; Leaves the estimate unchanged.  *  &#x60;manual&#x60; Reduces the estimate by amount specified in &#x60;reduceBy&#x60;.  *  &#x60;auto&#x60; Reduces the estimate by the value of &#x60;timeSpent&#x60; in the worklog. (optional, default to 'auto')
    * @param newEstimate The value to set as the issue&#39;s remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;new&#x60;. (optional)
    * @param reduceBy The amount to reduce the issue&#39;s remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;manual&#x60;. (optional)
    * @param expand Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts &#x60;properties&#x60;, which returns worklog properties. (optional, default to '')
    * @param overrideEditableFlag Whether the worklog entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Only connect app users with admin scope permission can use this flag. (optional, default to false)
    * @return Worklog
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun comAtlassianJiraRestV2IssueIssueWorklogsResourceAddWorklogPost(issueIdOrKey: kotlin.String, requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any>, notifyUsers: kotlin.Boolean?, adjustEstimate: kotlin.String?, newEstimate: kotlin.String?, reduceBy: kotlin.String?, expand: kotlin.String?, overrideEditableFlag: kotlin.Boolean?) : Worklog {
        val localVariableBody: kotlin.Any? = requestBody
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (notifyUsers != null) {
                    put("notifyUsers", listOf(notifyUsers.toString()))
                }
                if (adjustEstimate != null) {
                    put("adjustEstimate", listOf(adjustEstimate.toString()))
                }
                if (newEstimate != null) {
                    put("newEstimate", listOf(newEstimate.toString()))
                }
                if (reduceBy != null) {
                    put("reduceBy", listOf(reduceBy.toString()))
                }
                if (expand != null) {
                    put("expand", listOf(expand.toString()))
                }
                if (overrideEditableFlag != null) {
                    put("overrideEditableFlag", listOf(overrideEditableFlag.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/rest/api/3/issue/{issueIdOrKey}/worklog".replace("{"+"issueIdOrKey"+"}", "$issueIdOrKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Worklog>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Worklog
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

    /**
    * Delete worklog
    * Deletes a worklog from an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Delete all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to delete any worklog or *Delete own worklogs* to delete worklogs created by the user,  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
    * @param issueIdOrKey The ID or key of the issue. 
    * @param id The ID of the worklog. 
    * @param notifyUsers Whether users watching the issue are notified by email. (optional, default to true)
    * @param adjustEstimate Defines how to update the issue&#39;s time estimate, the options are:   *  &#x60;new&#x60; Sets the estimate to a specific value, defined in &#x60;newEstimate&#x60;.  *  &#x60;leave&#x60; Leaves the estimate unchanged.  *  &#x60;manual&#x60; Increases the estimate by amount specified in &#x60;increaseBy&#x60;.  *  &#x60;auto&#x60; Reduces the estimate by the value of &#x60;timeSpent&#x60; in the worklog. (optional, default to 'auto')
    * @param newEstimate The value to set as the issue&#39;s remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;new&#x60;. (optional)
    * @param increaseBy The amount to increase the issue&#39;s remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;manual&#x60;. (optional)
    * @param overrideEditableFlag Whether the work log entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Only connect app users with admin permissions can use this flag. (optional, default to false)
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun comAtlassianJiraRestV2IssueIssueWorklogsResourceDeleteWorklogDelete(issueIdOrKey: kotlin.String, id: kotlin.String, notifyUsers: kotlin.Boolean?, adjustEstimate: kotlin.String?, newEstimate: kotlin.String?, increaseBy: kotlin.String?, overrideEditableFlag: kotlin.Boolean?) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (notifyUsers != null) {
                    put("notifyUsers", listOf(notifyUsers.toString()))
                }
                if (adjustEstimate != null) {
                    put("adjustEstimate", listOf(adjustEstimate.toString()))
                }
                if (newEstimate != null) {
                    put("newEstimate", listOf(newEstimate.toString()))
                }
                if (increaseBy != null) {
                    put("increaseBy", listOf(increaseBy.toString()))
                }
                if (overrideEditableFlag != null) {
                    put("overrideEditableFlag", listOf(overrideEditableFlag.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/rest/api/3/issue/{issueIdOrKey}/worklog/{id}".replace("{"+"issueIdOrKey"+"}", "$issueIdOrKey").replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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

    /**
    * Get issue worklogs
    * Returns worklogs for an issue, starting from the oldest worklog or from the worklog started on or after a date and time.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Workloads are only returned where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
    * @param issueIdOrKey The ID or key of the issue. 
    * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
    * @param maxResults The maximum number of items to return per page. (optional, default to 1048576)
    * @param startedAfter The worklog start date and time, in UNIX timestamp format, after which worklogs are returned. (optional)
    * @param expand Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts&#x60;properties&#x60;, which returns worklog properties. (optional, default to '')
    * @return PageOfWorklogs
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun comAtlassianJiraRestV2IssueIssueWorklogsResourceGetIssueWorklogGet(issueIdOrKey: kotlin.String, startAt: kotlin.Long?, maxResults: kotlin.Int?, startedAfter: kotlin.Long?, expand: kotlin.String?) : PageOfWorklogs {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (startAt != null) {
                    put("startAt", listOf(startAt.toString()))
                }
                if (maxResults != null) {
                    put("maxResults", listOf(maxResults.toString()))
                }
                if (startedAfter != null) {
                    put("startedAfter", listOf(startedAfter.toString()))
                }
                if (expand != null) {
                    put("expand", listOf(expand.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/rest/api/3/issue/{issueIdOrKey}/worklog".replace("{"+"issueIdOrKey"+"}", "$issueIdOrKey"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<PageOfWorklogs>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PageOfWorklogs
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

    /**
    * Get worklog
    * Returns a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
    * @param issueIdOrKey The ID or key of the issue. 
    * @param id The ID of the worklog. 
    * @param expand Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts  &#x60;properties&#x60;, which returns worklog properties. (optional, default to '')
    * @return Worklog
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun comAtlassianJiraRestV2IssueIssueWorklogsResourceGetWorklogGet(issueIdOrKey: kotlin.String, id: kotlin.String, expand: kotlin.String?) : Worklog {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (expand != null) {
                    put("expand", listOf(expand.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/rest/api/3/issue/{issueIdOrKey}/worklog/{id}".replace("{"+"issueIdOrKey"+"}", "$issueIdOrKey").replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Worklog>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Worklog
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

    /**
    * Update worklog
    * Updates a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any worklog or *Edit own worklogs* to update worklogs created by the user.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
    * @param issueIdOrKey The ID or key the issue. 
    * @param id The ID of the worklog. 
    * @param requestBody  
    * @param notifyUsers Whether users watching the issue are notified by email. (optional, default to true)
    * @param adjustEstimate Defines how to update the issue&#39;s time estimate, the options are:   *  &#x60;new&#x60; Sets the estimate to a specific value, defined in &#x60;newEstimate&#x60;.  *  &#x60;leave&#x60; Leaves the estimate unchanged.  *  &#x60;auto&#x60; Updates the estimate by the difference between the original and updated value of &#x60;timeSpent&#x60; or &#x60;timeSpentSeconds&#x60;. (optional, default to 'auto')
    * @param newEstimate The value to set as the issue&#39;s remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;new&#x60;. (optional)
    * @param expand Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts &#x60;properties&#x60;, which returns worklog properties. (optional, default to '')
    * @param overrideEditableFlag Whether the worklog should be added to the issue even if the issue is not editable. For example, because the issue is closed. Only connect app users with admin permissions can use this flag. (optional, default to false)
    * @return Worklog
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun comAtlassianJiraRestV2IssueIssueWorklogsResourceUpdateWorklogPut(issueIdOrKey: kotlin.String, id: kotlin.String, requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any>, notifyUsers: kotlin.Boolean?, adjustEstimate: kotlin.String?, newEstimate: kotlin.String?, expand: kotlin.String?, overrideEditableFlag: kotlin.Boolean?) : Worklog {
        val localVariableBody: kotlin.Any? = requestBody
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (notifyUsers != null) {
                    put("notifyUsers", listOf(notifyUsers.toString()))
                }
                if (adjustEstimate != null) {
                    put("adjustEstimate", listOf(adjustEstimate.toString()))
                }
                if (newEstimate != null) {
                    put("newEstimate", listOf(newEstimate.toString()))
                }
                if (expand != null) {
                    put("expand", listOf(expand.toString()))
                }
                if (overrideEditableFlag != null) {
                    put("overrideEditableFlag", listOf(overrideEditableFlag.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/rest/api/3/issue/{issueIdOrKey}/worklog/{id}".replace("{"+"issueIdOrKey"+"}", "$issueIdOrKey").replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Worklog>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Worklog
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

    /**
    * Get IDs of deleted worklogs
    * Returns a list of IDs and delete timestamps for worklogs deleted after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, &#x60;until&#x60; indicates the timestamp of the youngest item on the page. Also, &#x60;nextPage&#x60; provides the URL for the next page of worklogs. The &#x60;lastPage&#x60; parameter is set to true on the last page of worklogs.  This resource does not return worklogs deleted during the minute preceding the request.  **[Permissions](#permissions) required:** Permission to access Jira.
    * @param since The date and time, in UNIX timestamp format, after which deleted worklogs are returned. (optional, default to 0)
    * @return ChangedWorklogs
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsDeletedSinceGet(since: kotlin.Long?) : ChangedWorklogs {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (since != null) {
                    put("since", listOf(since.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/rest/api/3/worklog/deleted",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<ChangedWorklogs>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ChangedWorklogs
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

    /**
    * Get IDs of updated worklogs
    * Returns a list of IDs and update timestamps for worklogs updated after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, &#x60;until&#x60; indicates the timestamp of the youngest item on the page. Also, &#x60;nextPage&#x60; provides the URL for the next page of worklogs. The &#x60;lastPage&#x60; parameter is set to true on the last page of worklogs.  This resource does not return worklogs updated during the minute preceding the request.  **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.
    * @param since The date and time, in UNIX timestamp format, after which updated worklogs are returned. (optional, default to 0)
    * @param expand Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts &#x60;properties&#x60; that returns the properties of each worklog. (optional, default to '')
    * @return ChangedWorklogs
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun comAtlassianJiraRestV2IssueWorklogWorklogResourceGetIdsOfWorklogsModifiedSinceGet(since: kotlin.Long?, expand: kotlin.String?) : ChangedWorklogs {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (since != null) {
                    put("since", listOf(since.toString()))
                }
                if (expand != null) {
                    put("expand", listOf(expand.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/rest/api/3/worklog/updated",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<ChangedWorklogs>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ChangedWorklogs
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

    /**
    * Get worklogs
    * Returns worklog details for a list of worklog IDs.  The returned list of worklogs is limited to 1000 items.  **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.
    * @param worklogIdsRequestBean A JSON object containing a list of worklog IDs. 
    * @param expand Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts &#x60;properties&#x60; that returns the properties of each worklog. (optional, default to '')
    * @return kotlin.Array<Worklog>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun comAtlassianJiraRestV2IssueWorklogWorklogResourceGetWorklogsForIdsPost(worklogIdsRequestBean: WorklogIdsRequestBean, expand: kotlin.String?) : kotlin.Array<Worklog> {
        val localVariableBody: kotlin.Any? = worklogIdsRequestBean
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (expand != null) {
                    put("expand", listOf(expand.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/rest/api/3/worklog/list",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<Worklog>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<Worklog>
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