package com.example.library

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.library.databinding.ActivityTestBinding
import com.example.library.models.question_model
import com.example.library.models.test_model

class TestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTestBinding
    var response = ""
    var res_list = ArrayList<String>()
    private lateinit var dialog: AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTestBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val data = intent.getSerializableExtra("res_t") as test_model
        var index = 0
        val tittle = data.title
        val tests = data.list
        binding.tvTittle.text = tittle
        giveQuestion(tests, 0)

        binding.btnSubmit.setOnClickListener {

            if (response != "") {
                if (tests.size - 1 > index) {
                    index++
                    res_list.add(response)
                    response = ""
                    giveQuestion(tests, index)
                    println("Javob : $response")
                } else {

                    res_list.add(response)
                    response = ""

                    check(tests, res_list, tittle)
                    println("Finished")
                }
            } else {


                Toast.makeText(this, "Iltimos birorta javobni tanlang", Toast.LENGTH_LONG).show()

            }
        }
        binding.cvA.setOnClickListener {
            response = "a"
            binding.cvA.setBackgroundResource(R.drawable.selected_bg)
            binding.cvB.setBackgroundResource(R.drawable.defould_bg)
            binding.cvC.setBackgroundResource(R.drawable.defould_bg)
            binding.cvD.setBackgroundResource(R.drawable.defould_bg)

        }
        binding.cvB.setOnClickListener {
            response = "b"

            binding.cvA.setBackgroundResource(R.drawable.defould_bg)
            binding.cvB.setBackgroundResource(R.drawable.selected_bg)
            binding.cvC.setBackgroundResource(R.drawable.defould_bg)
            binding.cvD.setBackgroundResource(R.drawable.defould_bg)

        }
        binding.cvC.setOnClickListener {
            response = "c"

            binding.cvA.setBackgroundResource(R.drawable.defould_bg)
            binding.cvB.setBackgroundResource(R.drawable.defould_bg)
            binding.cvC.setBackgroundResource(R.drawable.selected_bg)
            binding.cvD.setBackgroundResource(R.drawable.defould_bg)

        }
        binding.cvD.setOnClickListener {
            response = "d"

            binding.cvA.setBackgroundResource(R.drawable.defould_bg)
            binding.cvB.setBackgroundResource(R.drawable.defould_bg)
            binding.cvC.setBackgroundResource(R.drawable.defould_bg)
            binding.cvD.setBackgroundResource(R.drawable.selected_bg)

        }
    }

    fun giveQuestion(list: ArrayList<question_model>, intex: Int) {

        binding.cvA.setBackgroundResource(R.drawable.defould_bg)
        binding.cvB.setBackgroundResource(R.drawable.defould_bg)
        binding.cvC.setBackgroundResource(R.drawable.defould_bg)
        binding.cvD.setBackgroundResource(R.drawable.defould_bg)
        val data = list.get(intex)
        binding.tvQuestion.text = data.question
        binding.tvA.text = data.a
        binding.tvB.text = data.b
        binding.tvC.text = data.c
        binding.tvD.text = data.d

    }

    fun check(question: ArrayList<question_model>, response: ArrayList<String>, title: String) {

        var ball = 0

        var index = 0
        for (questionModel in question) {

            if (questionModel.correct == response.get(index)) {

                ball++

            }
            index++
        }


        val builder = AlertDialog.Builder(this)
        val inflater = LayoutInflater.from(this)
        val dialogView = inflater.inflate(R.layout.custom_dialog_layout, null)

        builder.setView(dialogView)
        dialog = builder.create()
        dialog.setCancelable(false)
        dialog.show()

        var buttonClose = dialog.findViewById<Button>(R.id.buttonClose)
        dialog.findViewById<TextView>(R.id.textView2)?.text = "To'g'ri javoblar : $ball"
        dialog.findViewById<TextView>(R.id.textView3)?.text = "Noto'g'ri javoblar : ${5 - ball}"
        dialog.findViewById<TextView>(R.id.textView1)?.text = title

        buttonClose.setOnClickListener {
            dialog.dismiss()
            finish()
        }


    }


}