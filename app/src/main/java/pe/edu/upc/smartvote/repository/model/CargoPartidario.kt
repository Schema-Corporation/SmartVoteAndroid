package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName

data class CargoPartidario(
    val cargo: String,
    val nombre: String,
    val periodo: String
)