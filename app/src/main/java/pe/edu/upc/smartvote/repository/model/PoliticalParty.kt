package pe.edu.upc.smartvote.repository.model

import java.io.Serializable

class PoliticalParty : Serializable {
    var candidatos: List<Candidato> = ArrayList()
    var nombre: String = ""
    var url_photo: String = ""
}