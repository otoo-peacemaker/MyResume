package com.peacecodetech.myresume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.peacecodetech.myresume.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var expanded by mutableStateOf(false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            //handling social media links
            twitter.setOnClickListener {
                goToUrl(twitterLink)
            }
            github.setOnClickListener {
                goToUrl(githubLink)
            }
            linkedIn.setOnClickListener {
                goToUrl(linkendInLink)
            }


            //view my capabilities
            dropArrow.setOnClickListener {
                expanded = !expanded
                if (expanded){
                    capabilityId.visibility = View.VISIBLE
                    dropArrow.setImageResource(R.drawable.arrow_drop_up_24)
                }else {
                        capabilityId.visibility = View.GONE
                        dropArrow.setImageResource(R.drawable.arrow_drop_down_24)
                }
            }

        }

    }
}