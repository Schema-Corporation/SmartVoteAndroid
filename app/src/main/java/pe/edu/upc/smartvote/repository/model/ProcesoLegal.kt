package pe.edu.upc.smartvote.repository.model


import java.io.Serializable

class ProcesoLegal : Serializable {
    val delitos: List<String> = ArrayList()
    val expediente: String = ""
}