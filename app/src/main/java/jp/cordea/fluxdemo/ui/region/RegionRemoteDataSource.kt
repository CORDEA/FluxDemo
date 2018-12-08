package jp.cordea.fluxdemo.ui.region

import io.reactivex.Maybe
import jp.cordea.fluxdemo.api.VultrApiClient
import jp.cordea.fluxdemo.api.response.Region
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RegionRemoteDataSource @Inject constructor(
    private val apiClient: VultrApiClient
) : RegionDataSource {
    override fun fetchRegion(): Maybe<Collection<Region>> = apiClient.getRegions().map { it.values }
}
