package models

/**
 * Data class with a list of [Forecast] objects for a certiain [City].
 */
data class ForecastResult (val city: City, val list: List<Forecast>)

