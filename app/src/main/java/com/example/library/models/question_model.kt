package com.example.library.models

import java.io.Serializable

data class question_model(

    val question:String,
    val correct:String,
    val a:String,
    val b:String,
    val c:String,
    val d:String

):Serializable
