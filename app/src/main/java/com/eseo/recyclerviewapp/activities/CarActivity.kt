package com.eseo.recyclerviewapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.eseo.recyclerviewapp.R
import com.eseo.recyclerviewapp.adapter.CarAdapter
import com.eseo.recyclerviewapp.databinding.ActivityCarBinding
import com.eseo.recyclerviewapp.model.Car

class CarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCarBinding
    private lateinit var cars : List<Car>
    private lateinit var carAdapter: CarAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_car
        )

        carAdapter = CarAdapter()

        binding.carRecycler.adapter = carAdapter
        binding.carRecycler.layoutManager =
            GridLayoutManager(this, 2)
        loadNewCars()
        carAdapter.loadCar(cars)

    }

    private fun loadNewCars(){
        cars = listOf(
            Car(
                "Ford Kuga",
                "https://www.ford.fr/content/dam/guxeu/rhd/central/cars/2023-kuga/dse/billboard/ford-kuga-eu-More_Muscular-16x9-1440x810-Desktop.jpg"
            ),Car(
                "Peugeot 2008",
                "https://cdn.drivek.com/configurator-imgs/cars/fr/Original/PEUGEOT/2008/42691_CROSSOVER-5-DOORS/peugeot-2008-front-view.jpg"
            ),Car(
                "Mercedes Classe A",
                "https://cdn.drivek.com/configurator-imgs/cars/fr/Original/MERCEDES/A-CLASS/41348_HATCHBACK-5-DOORS/mercedes-benz-classe-a-hb-front-view.jpg"
            ),Car(
                "Toyota Rav4",
                "https://scene7.toyota.eu/is/image/toyotaeurope/RAV4-pr-exterior-3-4front_Trail_Marchepieds_09-2022?wid=1280&fit=fit,1&ts=0&resMode=sharp2&op_usm=1.75,0.3,2,0"
            ),Car(
                "Honda Civic",
                "https://cdn.motor1.com/images/mgl/Xxp09/s3/2022-honda-civic-hatchback-passenger-side-front-corner.jpg"
            ),Car(
                "VolksWagen Golf",
                "https://images.caradisiac.com/images/2/8/4/2/182842/S0-guide-d-achat-les-dix-incontournables-du-deconfinement-628839.jpg"
            ),Car(
                "Hyundai tucson",
                "https://cdn.automobile-propre.com/uploads/2023/11/Hyundai-Tucson-2024.jpg"
            ),Car(
                "Citroen C3",
                "https://cdn.motor1.com/images/mgl/vj3bv/s3/2016-citroen-c3.jpg"
            )
        )
    }

}