package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName

data class Candidato(
    @SerializedName("cargos_eleccion_popular")
    val cargosEleccionPopular: List<CargosEleccionPopular>,
    @SerializedName("cargos_partidiarios")
    val cargosPartidiarios: List<CargosPartidiario>,
    val dni: String,
    val estudios: Estudios,
    @SerializedName("experiencias_laborales")
    val experienciasLaborales: List<ExperienciasLaborale>,
    val nombre: String,
    val partido: String,
    @SerializedName("procesos_legales")
    val procesosLegales: List<ProcesosLegale>,
    val region: String,
    val sanciones: List<Sancione>,
    @SerializedName("sentencias_delitos_culposos")
    val sentenciasDelitosCulposos: List<SentenciasDelitosCulposo>,
    @SerializedName("sentencias_incumplimiento_obligaciones")
    val sentenciasIncumplimientoObligaciones: List<SentenciasIncumplimientoObligacione>,
    @SerializedName("url_photo")
    val urlPhoto: String,
    @SerializedName("url_photo_partido")
    val urlPhotoPartido: String
)