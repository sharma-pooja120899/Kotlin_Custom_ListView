package com.e.kotlin_listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.e.Adapter.ListViewAdapter
import com.e.Model.User
import com.e.kotlin_listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var userArrayList:ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId= intArrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k

        )

        val nameArr=arrayOf(
            "Pooja Sharma",
            "Hemant Sharma",
            "Suman Saraswat",
            "Balaram",
            "Geeta Devi",
            "Ronak Sasrwar",
            "Justin Roy",
            "Ranveer Singh",
            "Siddhant Chaturvedi",
            "Virat Kohli",
            "Christiano"
        )
        val msgArr=arrayOf(
            "Hello",
            "Hi",
            "Bye",
            "Sorry !!!",
            "Good Night",
            "Thanks Buddy!!",
            "I miss You",
            "Dont know?",
            "Yup",
            "Hi Poo",
            "Hows the Josh"
        )
        val msgTimeArr=arrayOf(
            "7:30 AM",
            "8:31 AM",
            "9:30 AM",
            "10:30 AM",
            "11:30 AM",
            "12:30 AM",
            "1:30 PM",
            "2:30 PM",
            "7:30 PM",
            "7:31 PM",
            "8:30 PM"
        )

        val countryArr= arrayOf(
            "India",
            "China",
            "Japan",
            "Russia",
            "London",
            "Bhutan",
            "Sri Lanka",
            "India",
            "India",
            "America",
            "America"

        )

        val numberArr=arrayOf(
            "+91 9876543210",
            "+91 9876543210",
            "+91 9876543210",
            "+91 9876543210",
            "+91 9876543210",
            "+91 9876543210",
            "+91 9876543210",
            "+91 9876543210",
            "+91 9876543210",
            "+91 9876543210",
            "+91 9876543210"

        )
       userArrayList=ArrayList()

        for(i in nameArr.indices){
            val user=User(nameArr[i],msgArr[i],countryArr[i],numberArr[i],imageId[i],msgTimeArr[i])
            userArrayList.add(user)
        }
        binding.listview.isClickable=true
        binding.listview.adapter=ListViewAdapter(this,userArrayList)
       binding.listview.setOnItemClickListener { parent, view, position, id ->

           val namePass=nameArr[position]
           val countryPass=countryArr[position]
           val image=imageId[position]
           val phone=numberArr[position]

           val i= Intent(this,UserActivity::class.java)
           i.putExtra("NAME",namePass)
           i.putExtra("COUNTRY",countryPass)
           i.putExtra("IMAGE",image)
           i.putExtra("PHONE",phone)
           startActivity(i)
       }






    }
}