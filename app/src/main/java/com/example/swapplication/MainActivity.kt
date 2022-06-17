package com.example.swapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.swapplication.apis.boredApi
import com.example.swapplication.apis.restSwApi
import com.example.swapplication.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.searchButton.setOnClickListener {
            val personName = binding.personalNameEditText.text.toString()

            lifecycleScope.launch {
                try {
                    val person = restSwApi.getPersonById(personName)

                    binding.personNameTextView.text = person.name
                    binding.personBirthTextView.text = person.birthYear
                    binding.personColorTextView.text = person.eyeColor
                    binding.personHeightTextView.text = person.height
                    binding.personGenderTextView.text = person.gender

                } catch (e: Exception) {
                    e.printStackTrace()
                    binding.statusTextView.text = "Что-то пошло не так"
                    binding.statusImageView.setImageResource(R.drawable.ic_baseline_error_24)
                }

            }
        }

        binding.searchButton2.setOnClickListener {
            val param1 = binding.personalNameEditText2.text.toString()
            val param2 = binding.personalNameEditText3.text.toString()

            lifecycleScope.launch {
                try {
                    val activityAcces = boredApi.getActivityAccessibility(param1, param2)

                    binding.personGenderTextView3.text = activityAcces.accessibility
                    binding.personGenderTextView5.text = activityAcces.type
                    binding.personGenderTextView6.text = activityAcces.activity

                } catch (e: Exception) {
                    e.printStackTrace()
                    binding.statusTextView.text = "Что-то пошло не так"
                    binding.statusImageView.setImageResource(R.drawable.ic_baseline_error_24)
                }

            }

        }
        binding.searchButton4.setOnClickListener {

            val param3 = binding.personalNameEditText6.text.toString()
            val param4 = binding.personalNameEditText7.text.toString()

            lifecycleScope.launch {
                try {
                    val activityPartic = boredApi.getActivityParticipant(param3, param4)

                    binding.personGenderTextView7.text = activityPartic.activity
                    binding.personGenderTextView9.text = activityPartic.accessibility
                    binding.personGenderTextView8.text = activityPartic.type


                } catch (e: Exception) {
                    e.printStackTrace()
                    binding.statusTextView.text = "Что-то пошло не так"
                    binding.statusImageView.setImageResource(R.drawable.ic_baseline_error_24)
                }

            }

        }


    }

}
