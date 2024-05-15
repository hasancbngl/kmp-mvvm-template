package presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import data.repository.AppRepository
import domain.AppEntity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: AppRepository
) : ViewModel() {

    fun addDummyData(){
        viewModelScope.launch {
            repository.addData(AppEntity(title = "data inserted from Main Screen viewmodel"))
        }
    }
}