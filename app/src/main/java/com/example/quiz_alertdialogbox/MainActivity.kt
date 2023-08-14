package com.example.quiz_alertdialogbox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.quiz_alertdialogbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    var ans1 = ""
    var ans2 = ""
    var ans3 = ""
    var count = 0
    var attempted = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.que1.setOnClickListener{
            val builder1 = AlertDialog.Builder(this)
            val options = arrayOf("11", "10", "9", "12")
            builder1.setTitle("121 Divided by 11 is ")
            builder1.setSingleChoiceItems(options, 5, DialogInterface.OnClickListener { dialog, which ->
                ans1 = options[which]

            })
            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, i ->
                if(ans1=="11"){
                    count+=1
                }
                attempted++
                Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show()
            })
            builder1.setNegativeButton("Decline", DialogInterface.OnClickListener {dialog, i ->

            })
            builder1.show()
        }

        binding.que2.setOnClickListener{
            val builder1 = AlertDialog.Builder(this)
            val options = arrayOf("360", "480", "540", "400")
            builder1.setTitle("60 Times of 8 Equals to ")
            builder1.setSingleChoiceItems(options, 5, DialogInterface.OnClickListener { dialog, which ->
                ans2 = options[which]

            })
            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, i ->
                if(ans2=="480"){
                    count+=1
                }
                attempted++
                Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show()
            })
            builder1.setNegativeButton("Decline", DialogInterface.OnClickListener {dialog, i ->

            })
            builder1.show()
        }

        binding.que3.setOnClickListener{
            val builder1 = AlertDialog.Builder(this)
            val options = arrayOf("1", "2", "9", "7", "21")
            val selectedItems = mutableListOf<String>()
            val answerList = arrayOf("2", "7")

            builder1.setTitle("Select the prime numbers from given numbers ")
            builder1.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, i, isChecked ->
                selectedItems.add(options[i])
            })

            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, i ->
                if((selectedItems.size==2) && ("2" in selectedItems) && ("7" in selectedItems)){
                    count+=1
                }
                attempted++
                Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show()
            })
            builder1.setNegativeButton("Decline", DialogInterface.OnClickListener {dialog, i ->

            })
            builder1.show()
        }

        binding.que4.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            val options = arrayOf("225", "124", "97", "121")
            builder1.setTitle("Multiple of 3 is equals to ")
            builder1.setSingleChoiceItems(options, 5, DialogInterface.OnClickListener { dialog, which ->
                ans2=options[which]
            })
            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                if(ans2=="225")
                    count++
                attempted++
                Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show()
            })
            builder1.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->

            })
            builder1.show()
        }

        binding.que5.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            val options = arrayOf("228", "156", "146", "166")
            builder1.setTitle("12 times 13 equals to ")
            builder1.setSingleChoiceItems(options, 5, DialogInterface.OnClickListener { dialog, which ->
                ans2=options[which]
            })
            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                if(ans2=="156")
                    count++
                attempted++
                Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show()
            })
            builder1.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->

            })
            builder1.show()
        }


        binding.btnMarks.setOnClickListener{
            Toast.makeText(this, "Your score is $count out of $attempted", Toast.LENGTH_LONG).show()
        }

        binding.btnExit.setOnClickListener {
            finish()
        }

    }
}