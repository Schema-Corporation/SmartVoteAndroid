package pe.edu.upc.smartvote.repository.model

import java.io.Serializable

class EstudioUniversitario : Serializable {
    var grados: List<String> = ArrayList()
    var institucion: String = ""
}