package com.example.android_dagger_example.di.component

import com.example.android_dagger_example.App
import com.example.android_dagger_example.di.module.ActivityModule
import com.example.android_dagger_example.di.module.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            ActivityModule::class,
            AppModule::class
        ]
)
interface AppComponent : AndroidInjector<App> {
    @Component.Factory
    abstract class Builder : AndroidInjector.Factory<App>
}