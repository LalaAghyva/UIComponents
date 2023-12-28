package com.sirketismi.uicomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import com.sirketismi.uicomponents.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {
    lateinit var binding : FragmentMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    fun openProductPage() {
        //val action = MenuFragmentDirections.actionMenuToProducts("393123920")
        setFragmentResultListener(ProductDetailFragment.resultKey){requestKey, bundle ->
            print(bundle)
        }
        val action = MenuFragmentDirections.actionMenuToProductDetail()
        findNavController().navigate(action)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(inflater)

        binding.productButton.setOnClickListener {
            openProductPage()
        }
        return binding.root
    }
}