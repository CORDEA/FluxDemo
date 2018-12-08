package jp.cordea.fluxdemo.ui.region

import jp.cordea.fluxdemo.api.response.Region

data class RegionItemViewModel(
    val id: Int,
    val title: String,
    val description: String
) {
    companion object {
        fun from(region: Region) = RegionItemViewModel(region.id, region.name, region.continent)
    }
}
