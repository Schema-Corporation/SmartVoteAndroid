package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName

data class ExperienciaLaboral(
    val cargo: String,
    val periodo: String,
    val ubicacion: String
)