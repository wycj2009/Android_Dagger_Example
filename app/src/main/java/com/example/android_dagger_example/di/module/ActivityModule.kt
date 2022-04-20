package com.example.android_dagger_example.di.module

import com.example.android_dagger_example.scope.ActivityScope
import com.example.android_dagger_example.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun getMainActivity(): MainActivity

}