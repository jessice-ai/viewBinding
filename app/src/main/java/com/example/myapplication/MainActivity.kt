package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    /**
     * viewBinding 第一步
     * 注释掉之前的 inflater ，自己重新写的结构
     */
    private lateinit var sunbinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * viewBinding 第二步
         * 注释掉之前的 inflater ，自己重新写的结构
         */
        //setContentView(R.layout.activity_main)
        sunbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(sunbinding.root)
        /**
         * viewBinding 第三步，结束
         * 注释掉之前的 inflater ，自己重新写的结构
         */
        sunbinding.text001.text = "aaa"

    }
}