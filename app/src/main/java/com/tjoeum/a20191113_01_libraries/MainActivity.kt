package com.tjoeum.a20191113_01_libraries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {

        Glide.with(this).load("http://image.kyobobook.co.kr/newimages/giftshop_new/goods/400/1539/S1458632370750.jpg").into(profileImg)

    }

}
