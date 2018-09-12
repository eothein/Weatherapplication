package be.equality.weather.network

import android.util.Log
import java.net.URL

class Request(private val url: String) {

    /**
     * Creating the constants as companion objects.
     * Define TAG as class name.
     *
     * If we need some static properties, constants or functions in a class,
     * we can use a companion object. This object will be shared among all
     * instances of the class, the same as a static field or method would do in Java.
     */
    companion object {
        private val TAG = Request::class.qualifiedName
    }

    /**
     * The run function reads the result and
     * outputs the json in the Logcat. We are using the extension function
     * readText from the Kotlin standard library. This method is *not recommended* for huge responses,
     */
    fun run() {
        val foreCastUrl = URL(url).readText()
        Log.d(TAG, foreCastUrl)
    }
}