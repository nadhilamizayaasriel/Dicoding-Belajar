package com.dicoding.belajarfragmentdicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val fragmentManager = supportFragmentManager
//        val homeFragment = HomeFragment()
//        val fragment = fragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)
//
//        if(fragment !is HomeFragment){
//            Log.d("MyFlexibleFragment", "Fragment Name : "+ HomeFragment::class.java.simpleName)
//           //fragment Manger guna mengorganisisr objek fragment di activity
//            fragmentManager
//                //beginTrasaction method u/ memulai proses perubahan
//                .beginTransaction()
//                //mthod add menambahkan objek fragment ke container
//                .add(R.id.frame_container, homeFragment, HomeFragment::class.java.simpleName)
//                //commit guna untuk mengeksekusi untuk melakukan pemasanag objek
//                //secara asychoronous u/ tampil di UI
//                .commit()
//        }
//    }
    }
}