package com.eseo.recyclerviewapp.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.eseo.recyclerviewapp.databinding.CarItemBinding
import com.eseo.recyclerviewapp.model.Car

class CarViewHolder(
    private val binding: CarItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindCar(car: Car){
        binding.carNameText.text = car.name
        Glide
            .with(binding.root.context)
            .load(car.imageUrl)
            .into(binding.carImage)
    }

}