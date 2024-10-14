package com.example.horoscapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.example.horoscapp.domain.model.HoroscopeInfo
import com.example.horoscapp.domain.model.HoroscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor() : ViewModel() {
    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList()) //esta es una lista que se puede llamar pero no puede modificar
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horoscope //esto es para no modificar la de arriba

    init {
        _horoscope.value = listOf(
            Aries, Tauro, Geminis,
            Aries, Tauro, Geminis,
            Aries, Tauro, Geminis,
            Aries, Tauro, Geminis,
            Aries, Tauro, Geminis,
            Aries, Tauro, Geminis,
        )
    }
}