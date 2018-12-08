package jp.cordea.fluxdemo.ui.region

import androidx.fragment.app.Fragment
import dagger.Binds
import dagger.Module
import jp.cordea.fluxdemo.event.BaseSink
import jp.cordea.fluxdemo.event.BaseSource
import jp.cordea.fluxdemo.event.region.RegionAction
import jp.cordea.fluxdemo.event.region.RegionDispatcher

@Module
interface RegionFragmentBindsModule {
    @Binds
    fun bindFragment(fragment: RegionFragment): Fragment

    @Binds
    fun bindSink(dispatcher: RegionDispatcher): BaseSink<RegionAction>

    @Binds
    fun bindSource(dispatcher: RegionDispatcher): BaseSource<RegionAction>
}
