package jp.cordea.fluxdemo.ui.login

import android.app.Activity
import dagger.Binds
import dagger.Module

@Module
interface LoginActivityBindsModule {
    @Binds
    fun bindActivity(activity: LoginActivity): Activity
}
