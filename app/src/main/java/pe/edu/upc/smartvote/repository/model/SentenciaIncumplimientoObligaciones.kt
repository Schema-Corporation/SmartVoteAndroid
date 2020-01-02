package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

class SentenciaIncumplimientoObligaciones : Serializable {
    var delito: String = ""
    var expediente: String = ""
    @SerializedName("organo_judicial")
    var organoJudicial: String = ""
    var pena: String = ""
}