package jp.cordea.fluxdemo.event.regiondetail

import jp.cordea.fluxdemo.api.response.Region

sealed class RegionDetailResult {
    class Success(val regions: Collection<Region>) : RegionDetailResult()
    object Failure : RegionDetailResult()
}
