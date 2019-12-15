package pe.edu.upc.smartvote.ui.candidates

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CandidatesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Aquí van los candidatos"
    }
    val text: LiveData<String> = _text
}