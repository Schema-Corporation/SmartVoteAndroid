package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName

data class EstudioPosgrado(
    val grados: List<String>,
    val institucion: String
)