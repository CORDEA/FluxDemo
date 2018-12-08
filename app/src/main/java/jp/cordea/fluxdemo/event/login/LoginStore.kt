package jp.cordea.fluxdemo.event.login

import io.reactivex.rxkotlin.ofType
import io.reactivex.rxkotlin.withLatestFrom
import io.reactivex.schedulers.Schedulers
import jp.cordea.fluxdemo.KeyManager
import jp.cordea.fluxdemo.di.ActivityScope
import jp.cordea.fluxdemo.event.BaseSource
import javax.inject.Inject

@ActivityScope
class LoginStore @Inject constructor(
    private val keyManager: KeyManager,
    source: BaseSource<LoginAction>
) {
    private val onSubmit =
        source.reader.ofType<LoginAction.Clicked>()
            .withLatestFrom(source.reader.ofType<LoginAction.ChangedText>()) { _, query -> query.query }
            .doOnNext { keyManager.set(it) }
            .map { if (it.isBlank()) LoginResult.Failure else LoginResult.Success }
            .subscribeOn(Schedulers.io())

    fun onReady() = onSubmit.ofType<LoginResult.Success>()
    fun onError() = onSubmit.ofType<LoginResult.Failure>()
}
