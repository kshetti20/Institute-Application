package myapp.kshetti.instituteapplication.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class UserProfileViewModel(val stateHandle: SavedStateHandle) : ViewModel() {
    val userId: MutableLiveData<String> by lazy {
        MutableLiveData<String>().also {
            it.value = "Faculty"
            }
        }
    }
