package jp.cordea.fluxdemo.ui.regiondetail

import androidx.fragment.app.FragmentManager
import dagger.Module
import dagger.Provides
import jp.cordea.fluxdemo.di.ActivityScope

@Module
class RegionDetailAdapterModule {
    @Provides
    @ActivityScope
    fun provideFragmentManager(activity: RegionDetailActivity): FragmentManager = activity.supportFragmentManager
}
