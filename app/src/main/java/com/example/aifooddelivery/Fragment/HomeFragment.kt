package com.example.aifooddelivery.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aifooddelivery.R
import com.example.aifooddelivery.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var recyclerView1: RecyclerView
    private lateinit var recyclerView2: RecyclerView

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.iconSearchIV.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_searchFragment)
        }

        binding.iconNotificationIV.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_notificationFragment)
        }

        binding.recyclerView2.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_aboutThisMenuFragment)
        }

        recyclerView1 = view.findViewById(R.id.recyclerView1)
        recyclerView2 = view.findViewById(R.id.recyclerView2)

        // 🔹 Category data
        val categoryList = listOf(
            Category("Burger", R.drawable.burger1),
            Category("Taco", R.drawable.drink1),
            Category("Drink", R.drawable.pizza1),
            Category("Burger", R.drawable.burger1),
            Category("Taco", R.drawable.drink1),
            Category("Drink", R.drawable.pizza1),
            Category("Burger", R.drawable.burger1),
            Category("Taco", R.drawable.drink1),
            Category("Drink", R.drawable.pizza1),
            Category("Pizza", R.drawable.taco1)
        )

        // 🔹 Food data
        val foodList = listOf(
            Food(R.drawable.sendwich, "Ordinary Burgers", "4.5", "200m", "$ 56"),
            Food(R.drawable.burgeramerica, "Burger With Meat", "4.7", "120m", "$ 64"),
            Food(R.drawable.burgerrus, "Ordinary Burgers", "4.2", "144m", "$ 71"),
            Food(R.drawable.sendwich, "Ordinary Burgers", "4.5", "200m", "$ 56"),
            Food(R.drawable.burgeramerica, "Burger With Meat", "4.7", "120m", "$ 64"),
            Food(R.drawable.burgerrus, "Ordinary Burgers", "4.2", "144m", "$ 71"),
            Food(R.drawable.sendwich, "Ordinary Burgers", "4.5", "200m", "$ 56"),
            Food(R.drawable.burgeramerica, "Burger With Meat", "4.7", "120m", "$ 64"),
            Food(R.drawable.burgerrus, "Ordinary Burgers", "4.2", "144m", "$ 71"),
            Food(R.drawable.burgeruzb, "Burger With Meat", "4.9", "400m", "$ 36"),
        )

        // 🔹 recyclerView1
        recyclerView1.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView1.adapter = CategoryAdapter(categoryList)
        val foodAdapter = FoodAdapter(foodList)

        foodAdapter.setOnItemClickListener(object : FoodAdapter.OnItemClick {
            override fun onClick(food: Food) {

                val bundle = Bundle()
                bundle.putInt("image", food.image)
                bundle.putString("title", food.title)
                bundle.putString("rate", food.rate)
                bundle.putString("loc", food.loc)
                bundle.putString("price", food.price)

                findNavController().navigate(
                    R.id.action_homeFragment_to_aboutThisMenuFragment,
                    bundle
                )
            }
        })

        recyclerView2.layoutManager = GridLayoutManager(requireContext(), 2)
        recyclerView2.adapter = foodAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}