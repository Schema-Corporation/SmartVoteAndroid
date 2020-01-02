package pe.edu.upc.smartvote.networking.cache

import android.app.Application
import pe.edu.upc.smartvote.repository.model.PoliticalParty

class CacheList : Application() {
    var objects: ArrayList<PoliticalParty> = ArrayList()
}