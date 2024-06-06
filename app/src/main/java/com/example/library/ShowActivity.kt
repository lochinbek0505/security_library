package com.example.library

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.library.databinding.ActivityShowBinding
import com.example.library.models.doc_model

class ShowActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityShowBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val data = intent.getSerializableExtra("res_m") as doc_model
        binding.tvTittle.text = data.name
        /* Parameters:
 - path: File path or URI of the local PDF.
 - fromAssets: Set to true when loading from assets.
 */

        binding.viewer.initWithUrl(
            url = data.file,
            lifecycleCoroutineScope = lifecycleScope,
            lifecycle = lifecycle
        )

    }
}