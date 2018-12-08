package jp.cordea.fluxdemo.ui.region

import io.reactivex.Maybe
import jp.cordea.fluxdemo.api.response.Region

interface RegionDataSource {
    fun fetchRegion(): Maybe<Collection<Region>>
}
