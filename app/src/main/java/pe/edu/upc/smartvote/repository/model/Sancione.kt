package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName

data class Sancione(
    val cargo: String,
    val descripcion: String,
    val estado: String,
    val motivo: String,
    val periodo: String,
    val sancion: String
)