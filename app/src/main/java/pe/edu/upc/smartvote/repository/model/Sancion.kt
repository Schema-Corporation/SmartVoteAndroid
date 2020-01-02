package pe.edu.upc.smartvote.repository.model

import java.io.Serializable


class Sancion : Serializable {
    var cargo: String = ""
    var descripcion: String = ""
    var estado: String = ""
    var motivo: String = ""
    var periodo: String = ""
    var sancion: String = ""
}