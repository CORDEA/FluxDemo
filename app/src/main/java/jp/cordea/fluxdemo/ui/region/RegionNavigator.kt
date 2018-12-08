package jp.cordea.fluxdemo.ui.region

import androidx.fragment.app.Fragment
import jp.cordea.fluxdemo.di.FragmentScope
import jp.cordea.fluxdemo.ui.regiondetail.RegionDetailActivity
import javax.inject.Inject

@FragmentScope
class RegionNavigator @Inject constructor(
    private val fragment: Fragment
) {
    fun navigateToDetail(position: Int) {
        val context = fragment.context ?: return
        fragment.startActivity(
            RegionDetailActivity.createIntent(context, position)
        )
    }
}
