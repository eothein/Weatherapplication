package be.equality.weather.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import be.equality.weather.R
import be.equality.weather.adapters.ForecastListadapter
import com.mooveit.library.Fakeit

class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        Fakeit.init()
        val list:  MutableList<String> = mutableListOf();
        for (i in 1..10){
            list.add("${Fakeit.name().firstName()} - ${Fakeit.gameOfThrones().dragon()} ")
        }


        setContentView(R.layout.activity_main)

        //as is the casting operator
        val forecastList = findViewById(R.id.forecast_list) as RecyclerView
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListadapter(list)

    }

}
