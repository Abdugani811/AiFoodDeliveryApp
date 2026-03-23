package com.example.aifooddelivery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.aifooddelivery.databinding.ActivityOnboardingBinding
import me.relex.circleindicator.CircleIndicator3

class OnboardingActivity : AppCompatActivity(), OnboardingAdapter.OnItemClick {

    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: OnboardingAdapter
    private lateinit var list: List<OnboardingItem>
    private lateinit var indicator: CircleIndicator3

    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPager = findViewById(R.id.viewPager)
        indicator = findViewById(R.id.indicator)

        list = listOf(
            OnboardingItem(
                R.drawable.burger4,
                "We serve incomparable delicacies",
                "All the best restaurants with their top menu waiting for you, they cant’t wait for your order!!"
            ),
            OnboardingItem(
                R.drawable.burger2,
                "We serve incomparable delicacies",
                "All the best restaurants with their top menu waiting for you, they cant’t wait for your order!!"
            ),
            OnboardingItem(
                R.drawable.burger3,
                "We serve incomparable delicacies",
                "All the best restaurants with their top menu waiting for you, they cant’t wait for your order!!"
            )
        )

        adapter = OnboardingAdapter(list, this)
        viewPager.adapter = adapter
        indicator.setViewPager(viewPager)
        adapter.registerAdapterDataObserver(
            indicator.adapterDataObserver
        )
    }

    override fun onNextClick(position: Int) {
        if (position < list.size - 1) {
            viewPager.currentItem = position + 1
        } else {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    override fun onSkipClick() {
        startActivity(Intent(this, LoginActivity::class.java))
    }
}