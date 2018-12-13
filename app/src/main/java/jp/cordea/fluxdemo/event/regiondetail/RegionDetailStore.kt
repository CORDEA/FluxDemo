package jp.cordea.fluxdemo.event.regiondetail

import io.reactivex.Single
import io.reactivex.rxkotlin.ofType
import jp.cordea.fluxdemo.di.ActivityScope
import jp.cordea.fluxdemo.event.BaseSource
import jp.cordea.fluxdemo.ui.region.RegionRepository
import javax.inject.Inject

@ActivityScope
class RegionDetailStore @Inject constructor(
    private val repository: RegionRepository,
    source: BaseSource<RegionDetailAction>
) {
    private val fetch =
        source.reader.ofType<RegionDetailAction>()
            .flatMapSingle {
                repository.fetchRegion(false)
                    .map<RegionDetailResult> { RegionDetailResult.Success(it) }
                    .switchIfEmpty(Single.just(RegionDetailResult.Failure))
            }
            .share()

    fun onReady() = fetch.ofType<RegionDetailResult.Success>().map { it.regions }
    fun onError() = fetch.ofType<RegionDetailResult.Failure>().map { Unit }
}
