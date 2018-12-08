package jp.cordea.fluxdemo.event.app

import jp.cordea.fluxdemo.di.FragmentScope
import jp.cordea.fluxdemo.event.BaseSink
import javax.inject.Inject

@FragmentScope
class AppActionCreator @Inject constructor(
    private val sink: BaseSink<AppAction>
) {
    fun init() = sink.dispatch(AppAction.Init)
    fun refresh() = sink.dispatch(AppAction.Refresh)
}
