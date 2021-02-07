package com.example.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.DataSource
import com.example.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val myDataSet = DataSource().loadAffirmations()
        val recyclerView = binding.recyclerView

        val layoutManager = GridLayoutManager(
            applicationContext, 2
        )

        recyclerView.adapter = ItemAdapter(this, myDataSet)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
    }
}