package com.nemanjatozic.gw2buddy.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.nemanjatozic.gw2buddy.R
import kotlinx.android.synthetic.main.fragment_gallery.*

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        galleryViewModel = ViewModelProvider(this)[GalleryViewModel::class.java]
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            text_gallery.text = it
        })
        return root
    }
}
