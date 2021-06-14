package com.example.spacex.entities

import com.google.gson.annotations.SerializedName

data class Company (
    @SerializedName("name")val name:String,
    @SerializedName("founder")val founder: String,
    @SerializedName("founded") val founded:Int,
    @SerializedName("employees") val employees:Int,
    @SerializedName("vehicles") val vehicles:Int,
    @SerializedName("launch_sites") val launchSites:Int,
    @SerializedName("test_sites") val testSites:Int,
    @SerializedName("ceo") val ceo:String,
    @SerializedName("cto") val cto:String,
    @SerializedName("coo") val coo:String,
    @SerializedName("cto_propulsion") val ctoPropulsion:String,
    @SerializedName("valuation") val valuation:Long,
    @SerializedName("headquarters")val headquarters:Headquarters,
    @SerializedName("links")val links:Links,
    @SerializedName("summary")val summary:String
        ){

    data class Headquarters(
        @SerializedName("address") val address:String,
        @SerializedName("city") val city:String,
        @SerializedName("state") val state:String
    )
    data class Links(
        @SerializedName("website")val website:String,
        @SerializedName("flickr")val flickr:String,
        @SerializedName("twitter")val twitter:String,
        @SerializedName("elon_twitter") val elonTwitter:String
    )
}