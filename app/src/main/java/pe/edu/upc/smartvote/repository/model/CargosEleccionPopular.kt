package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName

data class CargosEleccionPopular(
    val cargo: String,
    val periodo: String
)