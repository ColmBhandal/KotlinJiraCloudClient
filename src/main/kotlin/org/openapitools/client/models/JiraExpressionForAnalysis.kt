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
 * Details of Jira expressions for analysis.
 * @param expressions The list of Jira expressions to analyse.
 */

data class JiraExpressionForAnalysis (
    /* The list of Jira expressions to analyse. */
    @Json(name = "expressions")
    val expressions: kotlin.Array<kotlin.String>
) 



