package jp.cordea.fluxdemo.event.login

sealed class LoginAction {
    class ChangedText(val query: String) : LoginAction()
    object Clicked : LoginAction()
}
