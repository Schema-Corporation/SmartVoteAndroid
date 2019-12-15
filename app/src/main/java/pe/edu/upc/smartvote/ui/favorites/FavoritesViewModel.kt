package pe.edu.upc.smartvote.ui.favorites

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FavoritesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Aquí van los favoritos"
    }
    val text: LiveData<String> = _text
}