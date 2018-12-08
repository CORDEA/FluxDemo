package jp.cordea.fluxdemo.event.region

import io.reactivex.Flowable
import io.reactivex.processors.PublishProcessor
import jp.cordea.fluxdemo.di.FragmentScope
import jp.cordea.fluxdemo.event.BaseDispatcher
import javax.inject.Inject

@FragmentScope
class RegionDispatcher @Inject constructor() : BaseDispatcher<RegionAction> {
    private val _reader = PublishProcessor.create<RegionAction>().toSerialized()
    override val reader: Flowable<RegionAction> = _reader

    override fun dispatch(action: RegionAction) = _reader.onNext(action)
}
