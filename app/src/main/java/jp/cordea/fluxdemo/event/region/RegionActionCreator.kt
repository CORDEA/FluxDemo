package jp.cordea.fluxdemo.event.region

import jp.cordea.fluxdemo.di.FragmentScope
import jp.cordea.fluxdemo.event.BaseSink
import javax.inject.Inject

@FragmentScope
class RegionActionCreator @Inject constructor(
    private val sink: BaseSink<RegionAction>
) {
    fun init() = sink.dispatch(RegionAction.Init)
    fun refresh() = sink.dispatch(RegionAction.Refresh)
    fun clickedItem(id: Int) = sink.dispatch(RegionAction.ClickedItem(id))
}
