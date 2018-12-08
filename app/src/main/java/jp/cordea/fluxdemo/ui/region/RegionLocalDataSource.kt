package jp.cordea.fluxdemo.ui.region

import io.reactivex.Maybe
import jp.cordea.fluxdemo.api.response.Region
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RegionLocalDataSource @Inject constructor(
) : RegionDataSource {
    private var regions: Collection<Region>? = null

    fun cacheRegion(regions: Collection<Region>) {
        this.regions = regions
    }

    fun getRegion(id: Int) = regions!!.first { it.id == id }

    override fun fetchRegion(): Maybe<Collection<Region>> =
        if (regions == null) Maybe.empty() else Maybe.just(regions)
}
