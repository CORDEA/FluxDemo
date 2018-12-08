package jp.cordea.fluxdemo.ui.app

import io.reactivex.Maybe
import jp.cordea.fluxdemo.api.response.Application

interface AppDataSource {
    fun fetchApp(): Maybe<Collection<Application>>
}
