package jp.cordea.fluxdemo.ui.app

import io.reactivex.Maybe
import jp.cordea.fluxdemo.api.response.Application
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppLocalDataSource @Inject constructor(
) : AppDataSource {
    private var apps: Collection<Application>? = null

    fun cacheApp(apps: Collection<Application>) {
        this.apps = apps
    }

    override fun fetchApp(): Maybe<Collection<Application>> =
        if (apps == null) Maybe.empty() else Maybe.just(apps)
}
