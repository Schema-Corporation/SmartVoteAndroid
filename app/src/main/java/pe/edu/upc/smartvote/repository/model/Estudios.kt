package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName

data class Estudios(
    @SerializedName("estudios_no_universitarios")
    val estudiosNoUniversitarios: List<EstudiosNoUniversitario>,
    @SerializedName("estudios_posgrado")
    val estudiosPosgrado: List<EstudiosPosgrado>,
    @SerializedName("estudios_tecnicos")
    val estudiosTecnicos: List<EstudiosTecnico>,
    @SerializedName("estudios_universitarios")
    val estudiosUniversitarios: List<EstudiosUniversitario>
)