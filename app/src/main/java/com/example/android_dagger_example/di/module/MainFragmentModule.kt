package com.example.android_dagger_example.di.module

import androidx.databinding.DataBindingUtil
import com.example.android_dagger_example.scope.FragmentScope
import com.example.android_dagger_example.R
import com.example.android_dagger_example.databinding.FragmentMainBinding
import com.example.android_dagger_example.ui.MainActivity
import dagger.Module
import dagger.Provides

@Module
class MainFragmentModule {

    @Provides
    @FragmentScope
    fun provideMainFragmentBinding(activity: MainActivity): FragmentMainBinding {
        return DataBindingUtil.inflate(activity.layoutInflater, R.layout.fragment_main, null, false)
    }

}