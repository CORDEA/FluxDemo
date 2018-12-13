package jp.cordea.fluxdemo.event.regiondetail

import jp.cordea.fluxdemo.di.ActivityScope
import jp.cordea.fluxdemo.event.BaseSink
import javax.inject.Inject

@ActivityScope
class RegionDetailActionCreator @Inject constructor(
    private val sink: BaseSink<RegionDetailAction>
) {
    fun init() = sink.dispatch(RegionDetailAction.Init)
}
