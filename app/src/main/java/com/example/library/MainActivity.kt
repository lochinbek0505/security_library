package com.example.library

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.library.adapter.MainAdapter
import com.example.library.databinding.ActivityMainBinding
import com.example.library.models.main_model

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var list = arrayListOf<main_model>()

        list.add(main_model(R.drawable.ic_data_report, "Ma'ruzalar", 1))
        list.add(main_model(R.drawable.ic_pencil, "Amaliyotlar", 2))
        list.add(main_model(R.drawable.ic_presentation, "Taqdimotlar", 3))
        list.add(main_model(R.drawable.ic_documents, "Hujjatlar", 4))
        list.add(main_model(R.drawable.ic_course, "Videolar", 5))
        list.add(main_model(R.drawable.ic_test, "Testlar", 6))
        val adapter = MainAdapter(list, object : MainAdapter.ItemSetOnClickListener {
            override fun onClick(data: main_model) {
                val intent=Intent(this@MainActivity, RecyclerActivity::class.java)
                intent.putExtra("main",data)
                startActivity(intent)
            }


        })
        binding.rvHome.adapter = adapter

    }


}