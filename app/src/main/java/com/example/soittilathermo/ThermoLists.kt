package com.example.soittilathermo

object ThermoLists {
    var roomThermos = listOf<Thermo>(
        Thermo("Olohuone",  20,  22,2, true ),
        Thermo("Makuuhuone",  22,  22,2, false ),
        Thermo("Veranta",  15,  20, 2, false ),
    )
}