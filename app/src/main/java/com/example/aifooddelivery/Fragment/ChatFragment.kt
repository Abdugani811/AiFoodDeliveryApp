package com.example.aifooddelivery.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aifooddelivery.R

class ChatFragment : Fragment(R.layout.fragment_chat) {

    private lateinit var recyclerViewChat: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerViewChat = view.findViewById(R.id.recyclerViewChat)

        val chatList = listOf(
            Chat(
                R.drawable.chat_image_a,
                "Geopart Etdsien",
                "Your Order Just Arrived!",
                "13.47",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_b,
                "Stevano Clirover",
                "Your Order Just Arrived!",
                "12.54",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_c,
                "Elisia Justin",
                "Your Order Just Arrived!",
                "11.26",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_a,
                "Geopart Etdsien",
                "Your Order Just Arrived!",
                "13.47",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_b,
                "Stevano Clirover",
                "Your Order Just Arrived!",
                "12.54",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_c,
                "Elisia Justin",
                "Your Order Just Arrived!",
                "11.26",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_a,
                "Geopart Etdsien",
                "Your Order Just Arrived!",
                "13.47",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_b,
                "Stevano Clirover",
                "Your Order Just Arrived!",
                "12.54",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_c,
                "Elisia Justin",
                "Your Order Just Arrived!",
                "11.26",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_a,
                "Geopart Etdsien",
                "Your Order Just Arrived!",
                "13.47",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_b,
                "Stevano Clirover",
                "Your Order Just Arrived!",
                "12.54",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_c,
                "Elisia Justin",
                "Your Order Just Arrived!",
                "11.26",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_a,
                "Geopart Etdsien",
                "Your Order Just Arrived!",
                "13.47",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_b,
                "Stevano Clirover",
                "Your Order Just Arrived!",
                "12.54",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_c,
                "Elisia Justin",
                "Your Order Just Arrived!",
                "11.26",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_a,
                "Geopart Etdsien",
                "Your Order Just Arrived!",
                "13.47",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_b,
                "Stevano Clirover",
                "Your Order Just Arrived!",
                "12.54",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_c,
                "Elisia Justin",
                "Your Order Just Arrived!",
                "11.26",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_a,
                "Geopart Etdsien",
                "Your Order Just Arrived!",
                "13.47",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_b,
                "Stevano Clirover",
                "Your Order Just Arrived!",
                "12.54",
                R.drawable.chat_double_check
            ),
            Chat(
                R.drawable.chat_image_c,
                "Elisia Justin",
                "Your Order Just Arrived!",
                "11.26",
                R.drawable.chat_double_check
            )
        )

        recyclerViewChat.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        recyclerViewChat.adapter = ChatAdapter(chatList)
    }
}