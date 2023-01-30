package com.example.soittilathermo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.soittilathermo.databinding.ThermoItemsBinding

class ThermoAdapter(private val thermoList: List<Thermo>)
    :RecyclerView.Adapter<ThermoAdapter.ThermoViewHolder>() {

        inner class ThermoViewHolder(private val binding: ThermoItemsBinding)
            :RecyclerView.ViewHolder(binding.root){
                fun bindItem(thermo:Thermo){
                    binding.thermoSlider.setCurrentValue(thermo.setValue)
                    binding.roomTv.setText(thermo.room)
                    binding.tempTv.setText(thermo.temperature.toString()+"°C")
                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThermoViewHolder {
        return ThermoViewHolder(
            ThermoItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ThermoViewHolder, position: Int) {
        holder.bindItem(thermoList[position])
    }

    override fun getItemCount(): Int {
       return thermoList.size
    }


}