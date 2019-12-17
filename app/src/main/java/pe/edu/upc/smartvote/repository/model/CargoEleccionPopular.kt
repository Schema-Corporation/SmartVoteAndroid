package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName

data class CargoEleccionPopular(
    val cargo: String,
    val periodo: String
)