package jp.cordea.fluxdemo.event.region

import jp.cordea.fluxdemo.api.response.Region

sealed class RegionResult {
    class Success(val regions: Collection<Region>) : RegionResult()
    object Failure : RegionResult()
}
