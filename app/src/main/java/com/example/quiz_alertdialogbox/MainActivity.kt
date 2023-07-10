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
                Toast.makeText(this, "You selected ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, i ->
                if(ans1=="11"){
                    count+=1
                }
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
                Toast.makeText(this, "You selected ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, i ->
                if(ans2=="480"){
                    count+=1
                }
                Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show()
            })
            builder1.setNegativeButton("Decline", DialogInterface.OnClickListener {dialog, i ->

            })
            builder1.show()
        }

        binding.que3.setOnClickListener{
            val builder1 = AlertDialog.Builder(this)
            val options = arrayOf("1", "2", "9", "7", "21")
            builder1.setTitle("Select the prime numbers from given numbers ")
            builder1.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, i, isChecked ->
                ans3=options[i]
            })
            builder1.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, i ->
                if(ans3=="2" || ans3=="7"){
                    count+=1
                }
                Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show()
            })
            builder1.setNegativeButton("Decline", DialogInterface.OnClickListener {dialog, i ->

            })
            builder1.show()
        }

        binding.btnExit.setOnClickListener{
            Toast.makeText(this, "Your score is $count out of 3", Toast.LENGTH_LONG).show()
        }

    }
}