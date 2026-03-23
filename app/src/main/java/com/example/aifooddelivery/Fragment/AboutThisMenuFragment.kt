package com.example.aifooddelivery.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.aifooddelivery.databinding.FragmentAboutThisMenuBinding

class AboutThisMenuFragment : Fragment() {

    private var _binding: FragmentAboutThisMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAboutThisMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val image = arguments?.getInt("image")
        val title = arguments?.getString("title")
        val rate = arguments?.getString("rate")
        val loc = arguments?.getString("loc")
        val price = arguments?.getString("price")

        image?.let { binding.imageView4.setImageResource(it) }
        binding.titleTv1.text = title
        binding.priceTv1.text = price

        // optional (agar ishlatmoqchi bo‘lsang)
        binding.textView26.text = rate

        // 🔙 BACK
        binding.iconBackIV.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}