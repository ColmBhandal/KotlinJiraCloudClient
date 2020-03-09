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

import org.openapitools.client.models.JqlQueryUnitaryOperand

import com.squareup.moshi.Json
/**
 * An operand that is a list of values.
 * @param values The list of operand values.
 */

data class ListOperand (
    /* The list of operand values. */
    @Json(name = "values")
    val values: kotlin.Array<JqlQueryUnitaryOperand>? = null
) 



