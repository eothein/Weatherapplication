package be.equality.weather.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import be.equality.weather.R
import be.equality.weather.adapters.ForecastListadapter
import be.equality.weather.network.Request
import com.mooveit.library.Fakeit
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        Fakeit.init()
        val list:  MutableList<String> = mutableListOf();
        for (i in 1..10){
            list.add("${Fakeit.name().firstName()} - ${Fakeit.gameOfThrones().dragon()} ")
        }


        setContentView(R.layout.activity_main)


        val url = "http://api.openweathermap.org/data/2.5/forecast/daily?" +
                "APPID=15646a06818f61f7b8d7823ca833e1ce&q=94043&mode=json&units=metric&cnt=7"


        //IWe use the doAsync function that will execute its code
        //in another thread, with the option to return to the main thread by calling uiThread.
        doAsync {
            Request(url).run()
            uiThread { longToast("Request performed") }
        }


        //as is the casting operator
        val forecastList : RecyclerView = find(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListadapter(list)

    }

}
