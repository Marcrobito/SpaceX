package com.example.spacex

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.spacex.databinding.ItemLaunchBinding
import com.example.spacex.entities.Launch
import java.time.LocalDateTime
import java.util.*

class LaunchesAdapter(private val launches: List<Launch>) :
    RecyclerView.Adapter<LaunchesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLaunchBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = with(holder.binding) {

        var since = ""
        val calendar: Calendar = Calendar.getInstance()



        when (calendar) {


        }
        Glide.with(holder.binding.missionImage).load(launches[position].links.mission_patch)
            .into(holder.binding.missionImage)
        holder.binding.missionName.text = launches[position].missionName
        val (date, time) = launches[position].launchDateLocal.substringBefore("+").split("T")
        holder.binding.dateTime.text = this.root.context.getString(R.string.date_time, date, time)
        holder.binding.rocketName.text = this.root.context.getString(
            R.string.rocket_name,
            launches[position].rocket.rocket_name,
            launches[position].rocket.rocket_type
        )
        //holder.binding.launchDate.text = this.root.context.getString(R.string.launch_date,  )
        holder.binding.sinceFor.text = this.root.context.getString(R.string.since_for)

    }

    override fun getItemCount() = launches.size

    inner class ViewHolder(val binding: ItemLaunchBinding) : RecyclerView.ViewHolder(binding.root)


}

}
