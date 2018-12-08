package jp.cordea.fluxdemo.ui.main

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.cordea.fluxdemo.di.ActivityScope
import jp.cordea.fluxdemo.ui.app.AppFragmentModule
import jp.cordea.fluxdemo.ui.region.RegionFragmentModule

@Module
interface MainActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(
        modules = [
            RegionFragmentModule::class,
            AppFragmentModule::class
        ]
    )
    fun contributeMainActivity(): MainActivity
}
