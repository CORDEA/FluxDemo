package jp.cordea.fluxdemo.event.login

import jp.cordea.fluxdemo.di.ActivityScope
import jp.cordea.fluxdemo.event.BaseSink
import javax.inject.Inject

@ActivityScope
class LoginActionCreator @Inject constructor(
    private val sink: BaseSink<LoginAction>
) {
    fun changedText(query: String) = sink.dispatch(LoginAction.ChangedText(query))

    fun clicked() = sink.dispatch(LoginAction.Clicked)
}
