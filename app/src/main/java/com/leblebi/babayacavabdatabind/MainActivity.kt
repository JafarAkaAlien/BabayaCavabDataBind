package com.leblebi.babayacavabdatabind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.leblebi.babayacavabdatabind.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),ClickButton {
        lateinit var yazi:String
        private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.mainButton.setOnClickListener {buttonClick() }
        binding.mainText.text = binding.yazi
        invalidateMenu()
    }
    
     override fun buttonClick(){
         binding.yazi = binding.editText.text.toString()

         binding.invalidateAll()
         Toast.makeText(this, "Buttona basdin ay ogrash", Toast.LENGTH_SHORT).show()
    }
}
interface ClickButton{
    fun buttonClick()
}
