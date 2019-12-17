package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName

data class Candidato(
    @SerializedName("cargos_eleccion_popular")
    val cargoEleccionPopular: List<CargoEleccionPopular>,
    @SerializedName("cargos_partidiarios")
    val cargoPartidarios: List<CargoPartidario>,
    val dni: String,
    val estudios: Estudios,
    @SerializedName("experiencias_laborales")
    val experienciaLaborals: List<ExperienciaLaboral>,
    val nombre: String,
    val partido: String,
    @SerializedName("procesos_legales")
    val procesoLegals: List<ProcesoLegal>,
    val region: String,
    val sanciones: List<Sancion>,
    @SerializedName("sentencias_delitos_culposos")
    val sentenciaDelitosCulposos: List<SentenciaDelitosCulposos>,
    @SerializedName("sentencias_incumplimiento_obligaciones")
    val sentenciaIncumplimientoObligaciones: List<SentenciaIncumplimientoObligaciones>,
    @SerializedName("url_photo")
    val urlPhoto: String,
    @SerializedName("url_photo_partido")
    val urlPhotoPartido: String
)