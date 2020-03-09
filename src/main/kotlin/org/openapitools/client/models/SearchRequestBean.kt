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
 * @param jql A [JQL](https://confluence.atlassian.com/x/egORLQ) expression.
 * @param startAt The index of the first item to return in the page of results (page offset). The base index is `0`.
 * @param maxResults The maximum number of items to return per page.
 * @param fields A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  `*all` Returns all fields.  *  `*navigable` Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  The default is `*navigable`.  Examples:   *  `summary,comment` Returns the summary and comments fields only.  *  `-description` Returns all navigable (default) fields except description.  *  `*all,-comment` Returns all fields except comments.  Multiple `fields` parameters can be included in a request.  Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields.
 * @param validateQuery Determines how to validate the JQL query and treat the validation results. Supported values:   *  `strict` Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  `warn` Returns all errors as warnings.  *  `none` No validation is performed.  *  `true` *Deprecated* A legacy synonym for `strict`.  *  `false` *Deprecated* A legacy synonym for `warn`.  The default is `strict`.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value.
 * @param expand Use [expand](em>#expansion) to include additional information about issues in the response. Note that, unlike the majority of instances where `expand` is specified, `expand` is defined as a list of values. The expand options are:   *  `renderedFields` Returns field values rendered in HTML format.  *  `names` Returns the display name of each field.  *  `schema` Returns the schema describing a field type.  *  `transitions` Returns all possible transitions for the issue.  *  `operations` Returns all possible operations for the issue.  *  `editmeta` Returns information about how each field can be edited.  *  `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  `versionedRepresentations` Instead of `fields`, returns `versionedRepresentations` a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version.
 * @param properties A list of up to 5 issue properties to include in the results. This parameter accepts a comma-separated list.
 * @param fieldsByKeys Reference fields by their key (rather than ID). The default is `false`.
 */

data class SearchRequestBean (
    /* A [JQL](https://confluence.atlassian.com/x/egORLQ) expression. */
    @Json(name = "jql")
    val jql: kotlin.String? = null,
    /* The index of the first item to return in the page of results (page offset). The base index is `0`. */
    @Json(name = "startAt")
    val startAt: kotlin.Int? = null,
    /* The maximum number of items to return per page. */
    @Json(name = "maxResults")
    val maxResults: kotlin.Int? = null,
    /* A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  `*all` Returns all fields.  *  `*navigable` Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  The default is `*navigable`.  Examples:   *  `summary,comment` Returns the summary and comments fields only.  *  `-description` Returns all navigable (default) fields except description.  *  `*all,-comment` Returns all fields except comments.  Multiple `fields` parameters can be included in a request.  Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields. */
    @Json(name = "fields")
    val fields: kotlin.Array<kotlin.String>? = null,
    /* Determines how to validate the JQL query and treat the validation results. Supported values:   *  `strict` Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  `warn` Returns all errors as warnings.  *  `none` No validation is performed.  *  `true` *Deprecated* A legacy synonym for `strict`.  *  `false` *Deprecated* A legacy synonym for `warn`.  The default is `strict`.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value. */
    @Json(name = "validateQuery")
    val validateQuery: SearchRequestBean.ValidateQuery? = null,
    /* Use [expand](em>#expansion) to include additional information about issues in the response. Note that, unlike the majority of instances where `expand` is specified, `expand` is defined as a list of values. The expand options are:   *  `renderedFields` Returns field values rendered in HTML format.  *  `names` Returns the display name of each field.  *  `schema` Returns the schema describing a field type.  *  `transitions` Returns all possible transitions for the issue.  *  `operations` Returns all possible operations for the issue.  *  `editmeta` Returns information about how each field can be edited.  *  `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  `versionedRepresentations` Instead of `fields`, returns `versionedRepresentations` a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version. */
    @Json(name = "expand")
    val expand: kotlin.Array<kotlin.String>? = null,
    /* A list of up to 5 issue properties to include in the results. This parameter accepts a comma-separated list. */
    @Json(name = "properties")
    val properties: kotlin.Array<kotlin.String>? = null,
    /* Reference fields by their key (rather than ID). The default is `false`. */
    @Json(name = "fieldsByKeys")
    val fieldsByKeys: kotlin.Boolean? = null
) 


{
    /**
    * Determines how to validate the JQL query and treat the validation results. Supported values:   *  `strict` Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  `warn` Returns all errors as warnings.  *  `none` No validation is performed.  *  `true` *Deprecated* A legacy synonym for `strict`.  *  `false` *Deprecated* A legacy synonym for `warn`.  The default is `strict`.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value.
    * Values: strict,warn,none,`true`,`false`
    */
    
    enum class ValidateQuery(val value: kotlin.String){
        @Json(name = "strict") strict("strict"),
        @Json(name = "warn") warn("warn"),
        @Json(name = "none") none("none"),
        @Json(name = "true") `true`("true"),
        @Json(name = "false") `false`("false");
    }
}
