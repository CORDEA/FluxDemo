package jp.cordea.fluxdemo.event.app

sealed class AppAction {
    object Init : AppAction()
    object Refresh : AppAction()
}
