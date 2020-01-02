package pe.edu.upc.smartvote.repository.model

import java.io.Serializable


class EstudioTecnico : Serializable {
    var grados: List<String> = ArrayList()
    var institucion: String = ""
}