package jp.cordea.fluxdemo.ui.app

import dagger.Binds
import dagger.Module
import jp.cordea.fluxdemo.event.BaseSink
import jp.cordea.fluxdemo.event.BaseSource
import jp.cordea.fluxdemo.event.app.AppAction
import jp.cordea.fluxdemo.event.app.AppDispatcher

@Module
interface AppFragmentBindsModule {
    @Binds
    fun bindSink(dispatcher: AppDispatcher): BaseSink<AppAction>

    @Binds
    fun bindSource(dispatcher: AppDispatcher): BaseSource<AppAction>
}
