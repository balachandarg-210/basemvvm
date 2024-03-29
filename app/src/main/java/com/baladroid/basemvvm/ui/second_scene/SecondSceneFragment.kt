package com.baladroid.basemvvm.ui.second_scene

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.baladroid.basemvvm.R
import com.baladroid.basemvvm.base.BaseFragment
import com.baladroid.basemvvm.databinding.FragmentSecondSceneBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SecondSceneFragment : BaseFragment<FragmentSecondSceneBinding, SecondSceneViewModel>() {

    override val layoutId: Int = R.layout.fragment_second_scene

    override val viewModel: SecondSceneViewModel by viewModels()

    private val navArgs by navArgs<SecondSceneFragmentArgs>()

    override fun onReady(savedInstanceState: Bundle?) {
        if (navArgs.userId != null)
            binding.textViewIdTitle.text = navArgs.userId
    }

}