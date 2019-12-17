package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName

data class SentenciaDelitosCulposos(
    val delito: String,
    val expediente: String,
    @SerializedName("organo_judicial")
    val organoJudicial: String,
    val pena: String
)