package com.e.kotlin_listview
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.e.kotlin_listview.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username=intent?.extras?.getString("NAME")
        val userNum=intent?.extras?.getString("PHONE")
        val userCountry=intent?.extras?.getString("COUNTRY")
        val id=intent?.extras?.getInt("IMAGE")

        binding.UserName.text=username
        binding.countryUser.text=userCountry
        binding.contactUser.text=userNum
        if (id != null) {
            binding.profileUser.setImageResource(id)
        }
        else binding.profileUser.setImageResource(R.drawable.a)




    }
}