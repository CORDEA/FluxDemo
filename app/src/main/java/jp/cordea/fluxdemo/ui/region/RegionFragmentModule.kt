package jp.cordea.fluxdemo.ui.region

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.cordea.fluxdemo.di.FragmentScope

@Module
interface RegionFragmentModule {
    @FragmentScope
    @ContributesAndroidInjector(
        modules = [
            RegionFragmentBindsModule::class
        ]
    )
    fun contributeRegionFragment(): RegionFragment
}
