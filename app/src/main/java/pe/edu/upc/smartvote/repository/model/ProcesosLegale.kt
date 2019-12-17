package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName

data class ProcesosLegale(
    val delitos: List<String>,
    val expediente: String
)