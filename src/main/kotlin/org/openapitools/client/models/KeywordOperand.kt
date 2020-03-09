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
 * An operand that is a JQL keyword. See [Advanced searching - keywords reference](https://confluence.atlassian.com/jiracorecloud/advanced-searching-keywords-reference-765593717.html#Advancedsearching-keywordsreference-EMPTYEMPTY) for more information about operand keywords.
 * @param keyword The keyword that is the operand value.
 */

data class KeywordOperand (
    /* The keyword that is the operand value. */
    @Json(name = "keyword")
    val keyword: KeywordOperand.Keyword
) 


{
    /**
    * The keyword that is the operand value.
    * Values: empty
    */
    
    enum class Keyword(val value: kotlin.String){
        @Json(name = "empty") empty("empty");
    }
}
