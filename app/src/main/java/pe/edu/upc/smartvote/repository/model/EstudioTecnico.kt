package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName

data class EstudioTecnico(
    val grados: List<String>,
    val institucion: String
)