package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName

data class Estudios(
    @SerializedName("estudios_no_universitarios")
    val estudioNoUniversitarios: List<EstudioNoUniversitario>,
    @SerializedName("estudios_posgrado")
    val estudioPosgrado: List<EstudioPosgrado>,
    @SerializedName("estudios_tecnicos")
    val estudioTecnicos: List<EstudioTecnico>,
    @SerializedName("estudios_universitarios")
    val estudioUniversitarios: List<EstudioUniversitario>
)