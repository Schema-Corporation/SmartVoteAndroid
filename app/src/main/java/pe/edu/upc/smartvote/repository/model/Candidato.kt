package pe.edu.upc.smartvote.repository.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Candidato : Serializable {
    @SerializedName("cargos_eleccion_popular")
    var cargoEleccionPopular: List<CargoEleccionPopular> = ArrayList()
    @SerializedName("cargos_partidiarios")
    var cargoPartidarios: List<CargoPartidario> = ArrayList()
    var dni: String = ""
    var estudios: Estudios = Estudios()
    @SerializedName("experiencias_laborales")
    var experienciaLaborals: List<ExperienciaLaboral> = ArrayList()
    var nombre: String = ""
    var partido: String = ""
    @SerializedName("procesos_legales")
    var procesoLegals: List<ProcesoLegal> = ArrayList()
    var region: String = ""
    var sanciones: List<Sancion> = ArrayList()
    @SerializedName("sentencias_delitos_culposos")
    var sentenciaDelitosCulposos: List<SentenciaDelitosCulposos> = ArrayList()
    @SerializedName("sentencias_incumplimiento_obligaciones")
    var sentenciaIncumplimientoObligaciones: List<SentenciaIncumplimientoObligaciones> = ArrayList()
    @SerializedName("url_photo")
    var urlPhoto: String = ""
    @SerializedName("url_photo_partido")
    var urlPhotoPartido: String = ""
}