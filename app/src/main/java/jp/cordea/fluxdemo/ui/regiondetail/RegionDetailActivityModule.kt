package jp.cordea.fluxdemo.ui.regiondetail

import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.cordea.fluxdemo.di.ActivityScope
import jp.cordea.fluxdemo.event.BaseSink
import jp.cordea.fluxdemo.event.BaseSource
import jp.cordea.fluxdemo.event.regiondetail.RegionDetailAction
import jp.cordea.fluxdemo.event.regiondetail.RegionDetailDispatcher

@Module
interface RegionDetailActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(
        modules = [
            RegionDetailActivityBindModule::class,
            RegionDetailAdapterModule::class,
            RegionDetailFragmentModule::class
        ]
    )
    fun contributeRegionDetailActivity(): RegionDetailActivity
}

@Module
interface RegionDetailActivityBindModule {
    @Binds
    fun bindSink(dispatcher: RegionDetailDispatcher): BaseSink<RegionDetailAction>

    @Binds
    fun bindSource(dispatcher: RegionDetailDispatcher): BaseSource<RegionDetailAction>
}
