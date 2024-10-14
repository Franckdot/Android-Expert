package com.example.horoscapp.data.providers

import com.example.horoscapp.domain.model.HoroscopeInfo
import com.example.horoscapp.domain.model.HoroscopeInfo.*

class HoroscopeProvider {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aquario,
            Aries,
            Cancer,
            Acapricornio,
            Escorpio,
            Geminis,
            Leo,
            Libra,
            Picis,
            Sagitario,
            Tauro,
            Virgo
        )
    }
}