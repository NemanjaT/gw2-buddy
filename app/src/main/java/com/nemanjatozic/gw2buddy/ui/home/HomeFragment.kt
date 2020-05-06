package com.nemanjatozic.gw2buddy.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.nemanjatozic.gw2buddy.App
import com.nemanjatozic.gw2buddy.R
import com.nemanjatozic.gw2buddy.db.AppDatabase
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

open class HomeFragment : Fragment() {
    @Inject protected lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        (requireActivity().application as App).appComponent.inject(this)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            text_home.text = it
        })
        return root
    }
}
