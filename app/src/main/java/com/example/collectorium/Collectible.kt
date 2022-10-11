package com.example.collectorium

import java.util.Date

    data class Collectible(
        val name: String = "Item",
        val quality: Quality = Quality.EXCELLENT,
        val value: Double = 1.0,
        val location: String = "",
        val description: String = "",
        //val picture
        val dateAdded: Date = Date()
)

    enum class Quality(val resid: Int) {
        MINT(R.string.mint),
        NEAR_MINT(R.string.near_mint),
        EXCELLENT(R.string.excellent),
        VERY_GOOD(R.string.very_good),
        GOOD(R.string.good),
        FAIR(R.string.fair),
        POOR(R.string.poor)
}