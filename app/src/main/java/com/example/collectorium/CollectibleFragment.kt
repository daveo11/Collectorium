package com.example.collectorium

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.collectorium.databinding.FragmentCollectibleBinding
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.*

class CollectibleFragment : Fragment() {
    private lateinit var binding: FragmentCollectibleBinding
    private var collectible: Collectible = Collectible()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCollectibleBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.name.text = collectible.name
        binding.location.text = collectible.location
        binding.textView4.text = collectible.description
        binding.value.text = getString(R.string.value, collectible.value, 1)

        //val dateFormatter: DateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)
        binding.date.text = collectible.dateAdded.toString()
        binding.quality.text = getString(collectible.quality.resid)
    }

}
