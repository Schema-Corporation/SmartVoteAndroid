package pe.edu.upc.smartvote.ui.politicalParties

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PartiesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {

        value = "No hay partidos políticos registrados"
    }

    val text: LiveData<String> = _text
}