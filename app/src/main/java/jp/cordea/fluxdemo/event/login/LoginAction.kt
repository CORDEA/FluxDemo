package jp.cordea.fluxdemo.event.login

sealed class LoginAction {
    class ChangedText(query: String) : LoginAction()
    object Clicked : LoginAction()
}
