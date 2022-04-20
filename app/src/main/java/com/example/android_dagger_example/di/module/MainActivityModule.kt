package com.example.android_dagger_example.di.module

import androidx.databinding.DataBindingUtil
import com.example.android_dagger_example.scope.FragmentScope
import com.example.android_dagger_example.R
import com.example.android_dagger_example.databinding.ActivityMainBinding
import com.example.android_dagger_example.ui.MainActivity
import com.example.android_dagger_example.ui.MainFragment
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {

    companion object {
        @Provides
        fun provideMainActivityBinding(activity: MainActivity): ActivityMainBinding {
            return DataBindingUtil.setContentView(activity, R.layout.activity_main)
        }
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun getMainFragment(): MainFragment

}