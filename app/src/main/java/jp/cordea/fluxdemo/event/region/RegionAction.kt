package jp.cordea.fluxdemo.event.region

sealed class RegionAction {
    object Init : RegionAction()
    object Refresh : RegionAction()
}
