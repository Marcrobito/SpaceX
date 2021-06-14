package com.example.spacex.entities

import com.google.gson.annotations.SerializedName

data class Launch(
    @SerializedName("flight_number") val flightNumber: Int,
    @SerializedName("mission_name") val missionName: String,
    @SerializedName("mission_id") val missionId: List<String>,
    @SerializedName("upcoming") val upcoming: Boolean,
    @SerializedName("launch_year") val launchYear: String,
    @SerializedName("launch_date_unix") val launchDateUnix: Long,
    @SerializedName("launch_date_utc") val launchDateUtc: String,
    @SerializedName("launch_date_local") val launchDateLocal: String,
    @SerializedName("is_tentative") val isTentative: Boolean,
    @SerializedName("tentative_max_precision") val tentativeMaxPrecision: String,
    @SerializedName("tbd") val tbd: Boolean,
    @SerializedName("launch_window") val launch_window: String,
    @SerializedName("rocket") val rocket: Rocket,
    @SerializedName("ships") val ships: List<String>,
    @SerializedName("telemetry") val telemetry: Telemetry,
    @SerializedName("launch_site") val launchSite: LaunchSite,
    @SerializedName("launch_success") val launchSuccess: Boolean,
    @SerializedName("launch_failure_details") val launchFailureDetails: LaunchFailureDetails,
    @SerializedName("links") val links: Links,
    @SerializedName("details") val details: String,
    @SerializedName("static_fire_date_utc") val staticFireDateUtc: String,
    @SerializedName("static_fire_date_unix") val staticFireDateUnix: Long,
    @SerializedName("timeline") val timeline: Timeline,
    @SerializedName("") val crew: Any
) {
    data class Rocket(
        @SerializedName("rocket_id") val rocket_id: Any,
        @SerializedName("rocket_name") val rocket_name: Any,
        @SerializedName("rocket_type") val rocket_type: Any,
        @SerializedName("first_stage") val first_stage: Any,
        @SerializedName("second_stage") val second_stage: Any,
        @SerializedName("fairings") val fairings: Fairings,

        )

    data class Fairings(
        @SerializedName("reused") val reused: Any,
        @SerializedName("recovery_attempt") val recovery_attempt: Any,
        @SerializedName("recovered") val recovered: Any,
        @SerializedName("ship") val ship: Any
    )

    data class Telemetry(
        @SerializedName("flight_club") val flight_club: Any
    )

    data class LaunchFailureDetails(
        @SerializedName("time") val time: Any,
        @SerializedName("altitude") val altitude: Any,
        @SerializedName("reason") val reason: Any
    )

    data class Links(
        @SerializedName("mission_patch") val mission_patch: Any,
        @SerializedName("mission_patch_small") val mission_patch_small: Any,
        @SerializedName("reddit_campaign") val reddit_campaign: Any,
        @SerializedName("reddit_launch") val reddit_launch: Any,
        @SerializedName("reddit_recovery") val reddit_recovery: Any,
        @SerializedName("reddit_media") val reddit_media: Any,
        @SerializedName("presskit") val presskit: Any,
        @SerializedName("article_link") val article_link: Any,
        @SerializedName("wikipedia") val wikipedia: Any,
        @SerializedName("video_link") val video_link: Any,
        @SerializedName("youtube_id") val youtube_id: Any,
        @SerializedName("flickr_images") val flickr_images: Any
    )

    data class LaunchSite(
        @SerializedName("site_id") val site_id: Any,
        @SerializedName("site_name") val site_name: Any,
        @SerializedName("site_name_long") val site_name_long: Any
    )
    data class Timeline(
        @SerializedName("webcast_liftoff")val webcast_liftoff:Any
    )
}
