package jp.cordea.fluxdemo.event.login

sealed class LoginResult {
    object Success : LoginResult()
    object Failure : LoginResult()
}
