package com.example.exercise2_pam

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class FormViewModel : ViewModel() {
    var nama: String by mutableStateOf("") //revised
        private set
    var nim: String by mutableStateOf("")
        private set
}