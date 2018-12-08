package jp.cordea.fluxdemo.event.app

import jp.cordea.fluxdemo.api.response.Application

sealed class AppResult {
    class Success(val apps: Collection<Application>) : AppResult()
    object Failure : AppResult()
}
