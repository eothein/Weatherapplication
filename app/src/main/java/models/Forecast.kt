package models


/**
 * Forecast for a weather with the corresponding parameters. It uses the [Temperature] class
 * to represent the temperature, [Weather] to indicate the weather type.
 */
class Forecast (val dt: Long, val temp: Temperature, val pressure: Float, val humidity: Int, val weather: List<Weather>,
                val speed: Float, val deg: Int, val clouds: Int, val rain: Float)