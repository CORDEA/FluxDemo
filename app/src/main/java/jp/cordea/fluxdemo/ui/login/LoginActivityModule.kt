package jp.cordea.fluxdemo.ui.login

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.cordea.fluxdemo.di.ActivityScope

@Module
interface LoginActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(
        modules = [
            LoginActivityBindsModule::class
        ]
    )
    fun contributeLoginActivity(): LoginActivity
}
