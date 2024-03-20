package com.eseo.recyclerviewapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.eseo.recyclerviewapp.R
import com.eseo.recyclerviewapp.databinding.CarItemBinding
import com.eseo.recyclerviewapp.model.Car
import com.eseo.recyclerviewapp.viewholder.CarViewHolder

class CarAdapter : RecyclerView.Adapter<CarViewHolder>() {

    private var cars : List<Car> = emptyList()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): CarViewHolder {
        val binding : CarItemBinding =
            DataBindingUtil.inflate(
               LayoutInflater.from(parent.context),
                R.layout.car_item,
                parent,
                false
            )
        return CarViewHolder(binding)
    }


    override fun onBindViewHolder(
        holder: CarViewHolder,
        position: Int,
    ) {
        val car = cars[position]
        holder.bindCar(car)
    }

    override fun getItemCount() : Int{
        return cars.size
    }

    fun loadCar(carList : List<Car>){
        cars = carList
        notifyDataSetChanged()
    }

}