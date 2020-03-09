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

import org.openapitools.client.models.FieldReferenceData
import org.openapitools.client.models.FunctionReferenceData

import com.squareup.moshi.Json
/**
 * Lists of JQL reference data.
 * @param visibleFieldNames List of fields usable in JQL queries.
 * @param visibleFunctionNames List of functions usable in JQL queries.
 * @param jqlReservedWords List of JQL query reserved words.
 */

data class JQLReferenceData (
    /* List of fields usable in JQL queries. */
    @Json(name = "visibleFieldNames")
    val visibleFieldNames: kotlin.Array<FieldReferenceData>? = null,
    /* List of functions usable in JQL queries. */
    @Json(name = "visibleFunctionNames")
    val visibleFunctionNames: kotlin.Array<FunctionReferenceData>? = null,
    /* List of JQL query reserved words. */
    @Json(name = "jqlReservedWords")
    val jqlReservedWords: kotlin.Array<kotlin.String>? = null
) 


