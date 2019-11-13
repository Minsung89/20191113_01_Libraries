package com.tjoeum.a20191113_01_libraries

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){

    abstract fun setupEvents()

    abstract fun setValues()

}