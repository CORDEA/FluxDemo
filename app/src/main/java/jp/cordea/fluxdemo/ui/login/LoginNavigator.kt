package jp.cordea.fluxdemo.ui.login

import android.app.Activity
import android.content.Intent
import jp.cordea.fluxdemo.di.ActivityScope
import jp.cordea.fluxdemo.ui.main.MainActivity
import javax.inject.Inject

@ActivityScope
class LoginNavigator @Inject constructor(
    private val activity: Activity
) {
    fun navigateToMain() {
        activity.startActivity(Intent(activity, MainActivity::class.java))
    }
}
