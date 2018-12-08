package jp.cordea.fluxdemo.ui.login

import android.app.Activity
import dagger.Binds
import dagger.Module
import jp.cordea.fluxdemo.event.BaseSink
import jp.cordea.fluxdemo.event.BaseSource
import jp.cordea.fluxdemo.event.login.LoginAction
import jp.cordea.fluxdemo.event.login.LoginDispatcher

@Module
interface LoginActivityBindsModule {
    @Binds
    fun bindActivity(activity: LoginActivity): Activity

    @Binds
    fun bindSink(dispatcher: LoginDispatcher): BaseSink<LoginAction>

    @Binds
    fun bindSource(dispatcher: LoginDispatcher): BaseSource<LoginAction>
}
