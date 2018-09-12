package be.equality.weather.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

class ForecastListadapter(private val items : List<String>)  : RecyclerView.Adapter<ForecastListadapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]

    }

    override fun getItemCount(): Int {
        return items.size
    }


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}