package com.dicoding.belajarfragmentdicoding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class HomeFragment : Fragment(), View.OnClickListener {
//method onCreateView() guna untuk mentraformasikan
    // layout xml ke objek view dengan mthode inflate ()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate method berguna untuk mngubah layout xml ke
        //bentuk objek grup/widget
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
//setelah method oncreateView terdapat method onViewCreated
    //di method ini dapat inisialisasi view dan mengatur action nya(Set listener)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnCategory:Button = view.findViewById(R.id.btn_category)
        btnCategory.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.btn_category) {
            val categoryFragment = CategoryFragment()
            val fragmentManager = parentFragmentManager
            fragmentManager
                .beginTransaction()
                .apply {
                    replace(
                        R.id.frame_container,
                        categoryFragment,
                        CategoryFragment::class.java.simpleName
                    )
                    addToBackStack(null)
                    commit()
                }
        }
    }
}
