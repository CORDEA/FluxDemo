package jp.cordea.fluxdemo.event.app

import io.reactivex.Flowable
import io.reactivex.processors.PublishProcessor
import jp.cordea.fluxdemo.di.FragmentScope
import jp.cordea.fluxdemo.event.BaseDispatcher
import javax.inject.Inject

@FragmentScope
class AppDispatcher @Inject constructor() : BaseDispatcher<AppAction> {
    private val _reader = PublishProcessor.create<AppAction>().toSerialized()
    override val reader: Flowable<AppAction> = _reader

    override fun dispatch(action: AppAction) = _reader.onNext(action)
}
