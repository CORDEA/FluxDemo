package jp.cordea.fluxdemo.ui.region

import io.reactivex.Maybe
import jp.cordea.fluxdemo.api.response.Region
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RegionRepository @Inject constructor(
    private val dataSource: RegionDataSource,
    private val localDataSource: RegionLocalDataSource
) {
    fun fetchRegion(forceFetch: Boolean): Maybe<Collection<Region>> =
        if (forceFetch) {
            dataSource.fetchRegion()
        } else {
            localDataSource.fetchRegion()
                .switchIfEmpty(
                    dataSource.fetchRegion()
                        .doOnSuccess { localDataSource.cacheRegion(it) }
                )
        }
}