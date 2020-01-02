package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Estudios : Serializable {
    @SerializedName("estudios_no_universitarios")
    var estudioNoUniversitarios: List<EstudioNoUniversitario> = ArrayList()
    @SerializedName("estudios_posgrado")
    var estudioPosgrado: List<EstudioPosgrado> = ArrayList()
    @SerializedName("estudios_tecnicos")
    var estudioTecnicos: List<EstudioTecnico> = ArrayList()
    @SerializedName("estudios_universitarios")
    var estudioUniversitarios: List<EstudioUniversitario> = ArrayList()
}