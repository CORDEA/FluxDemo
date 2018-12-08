package jp.cordea.fluxdemo.ui.regiondetail

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.cordea.fluxdemo.di.ActivityScope

@Module
interface RegionDetailActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(
        modules = [
            RegionDetailAdapterModule::class,
            RegionDetailFragmentModule::class
        ]
    )
    fun contributeRegionDetailActivity(): RegionDetailActivity
}
