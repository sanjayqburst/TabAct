package com.example.tabact.fragments

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tabact.adapters.RecyclerAdapter
import com.example.tabact.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {
    private lateinit var binding:FragmentSettingsBinding
    private lateinit var newLayoutManager: LinearLayoutManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentSettingsBinding.inflate(layoutInflater)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.submitBtn.setOnClickListener {
            val selectId=binding.radioGrp.checkedRadioButtonId
            val btn:Button?=view.findViewById(selectId)
            binding.textView.text=btn?.text?:"Select an option"
            var str="${btn?.text?:"Select an option"}"
            if (binding.checkbox1.isChecked){
                str="$str ${binding.checkbox1.text}"
            }
            if(binding.checkbox2.isChecked){
                str="$str ${binding.checkbox2.text}"
            }
            alertShow(str)
            Toast.makeText(requireContext(),str,Toast.LENGTH_SHORT).show()
        }
        newLayoutManager= LinearLayoutManager(requireContext())
        binding.recyclerView.layoutManager=newLayoutManager
        val adapter=RecyclerAdapter()
        binding.recyclerView.adapter=adapter
    }
    private fun alertShow(msg:String){
        val builder=AlertDialog.Builder(requireContext())
        builder.setTitle("Your Selection")
        builder.setMessage("You have selected $msg")
        builder.setPositiveButton("Yes"){ _, _ ->
        Toast.makeText(requireContext(),"clicked yes for $msg",Toast.LENGTH_LONG).show()
        }
        builder.setNegativeButton("No"){_,_->
            Toast.makeText(requireContext(),"Clicked No for $msg",Toast.LENGTH_SHORT).show()
        }
        builder.setNeutralButton("Cancel"){_,_->
            Toast.makeText(requireContext(),"Clicked cancel for $msg",Toast.LENGTH_SHORT).show()
        }
        val alertDialog=builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()
}

}