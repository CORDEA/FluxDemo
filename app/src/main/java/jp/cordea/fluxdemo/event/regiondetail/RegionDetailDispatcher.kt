package jp.cordea.fluxdemo.event.regiondetail

import io.reactivex.Flowable
import io.reactivex.processors.PublishProcessor
import jp.cordea.fluxdemo.di.ActivityScope
import jp.cordea.fluxdemo.event.BaseDispatcher
import javax.inject.Inject

@ActivityScope
class RegionDetailDispatcher @Inject constructor() : BaseDispatcher<RegionDetailAction> {
    private val _reader = PublishProcessor.create<RegionDetailAction>().toSerialized()
    override val reader: Flowable<RegionDetailAction> = _reader

    override fun dispatch(action: RegionDetailAction) = _reader.onNext(action)
}
