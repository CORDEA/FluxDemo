package jp.cordea.fluxdemo.ui.app

import jp.cordea.fluxdemo.api.response.Application

data class AppItemViewModel(
    val title: String,
    val description: String
) {
    companion object {
        fun from(app: Application) = AppItemViewModel(app.name, app.surcharge.toString())
    }
}
