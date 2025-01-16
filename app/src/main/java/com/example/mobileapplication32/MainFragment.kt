package com.example.mobileapplication32

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.mobileapplication32.adapters.HomeVpAdapter
import com.example.mobileapplication32.databinding.FragmentMainBinding
import com.example.mobileapplication32.home.homeFragments.HomeMainFragment
import com.example.mobileapplication32.profile.ProfileFragment
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater,container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager : ViewPager2 = view.findViewById(R.id.viewPager)

        val fragmentList = listOf(HomeMainFragment(), ProfileFragment())
        val adapter = HomeVpAdapter(this@MainFragment, fragmentList)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.setIcon(R.drawable.ic_home)
                1 -> tab.setIcon(R.drawable.ic_profile)
            }
        }.attach()

    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}