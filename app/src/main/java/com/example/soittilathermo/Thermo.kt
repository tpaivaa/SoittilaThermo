package com.example.soittilathermo

data class Thermo(
                    val room:String,
                    val temperature:Int,
                    val setValue:Int,
                    val currentOutsideTemp:Int,
                    val isHeating:Boolean
                 )
