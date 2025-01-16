package com.example.mobileapplication32.profile.postsFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.mobileapplication32.R
import com.example.mobileapplication32.databinding.FragmentHomeMainBinding

class PostsFragment : Fragment() {
    private lateinit var binding : FragmentHomeMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_posts, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = PostsFragment()
    }

    private fun initVP() = with(binding) {
//        vpAdapter = MainVpAdapter(activity as FragmentActivity)
//        vp.adapter = vpAdapter


    }
}