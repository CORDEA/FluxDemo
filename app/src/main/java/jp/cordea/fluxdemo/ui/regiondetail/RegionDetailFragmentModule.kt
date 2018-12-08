package jp.cordea.fluxdemo.ui.regiondetail

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.cordea.fluxdemo.di.FragmentScope

@Module
interface RegionDetailFragmentModule {
    @FragmentScope
    @ContributesAndroidInjector
    fun contributeRegionDetailFragment(): RegionDetailFragment
}
