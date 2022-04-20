package com.example.android_dagger_example.di.module

import com.example.android_dagger_example.scope.Named
import dagger.Module
import dagger.Provides

@Module
object AppModule {
    @Provides
    @Named("dagger")
    fun provideHelloWorld() = "Dagger2 Example"
}