package jp.cordea.fluxdemo.ui.regiondetail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import jp.cordea.fluxdemo.R
import jp.cordea.fluxdemo.api.response.Region
import jp.cordea.fluxdemo.databinding.ActivityRegionDetailBinding
import javax.inject.Inject

class RegionDetailActivity : AppCompatActivity(), HasSupportFragmentInjector {
    companion object {
        private const val REGION_KEY = "region"

        fun createIntent(context: Context, region: Region): Intent =
            Intent(context, RegionDetailActivity::class.java).apply {
                putExtra(REGION_KEY, region)
            }
    }

    @Inject
    lateinit var adapter: RegionDetailFragmentPagerAdapter

    @Inject
    lateinit var supportFragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityRegionDetailBinding>(
            this,
            R.layout.activity_region_detail
        )
        setSupportActionBar(binding.toolbar)

        val region = intent.getParcelableExtra<Region>(REGION_KEY)
        binding.content.viewPager.also {
            it.adapter = adapter
            it.pageMargin = resources.getDimensionPixelSize(
                R.dimen.activity_region_detail_view_pager_margin
            )
        }
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = supportFragmentInjector
}
