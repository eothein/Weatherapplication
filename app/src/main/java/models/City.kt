package models

/**
 * Data class representing a City. It uses [Coordinates] to show its location.
 */
data class City (val id: Long, val name: String, val coord: Coordinates,
                 val country: String, val population: Int)