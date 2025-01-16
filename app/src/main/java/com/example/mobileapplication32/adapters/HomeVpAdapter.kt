package com.example.mobileapplication32.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class HomeVpAdapter(fa: Fragment, val list: List<Fragment>) : FragmentStateAdapter(fa) {

    override fun getItemCount() = list.size

    override fun createFragment(position: Int): Fragment {
        return list[position]
    }
}