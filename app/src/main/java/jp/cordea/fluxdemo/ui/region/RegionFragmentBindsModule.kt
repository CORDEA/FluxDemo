package jp.cordea.fluxdemo.ui.region

import androidx.fragment.app.Fragment
import dagger.Binds
import dagger.Module

@Module
interface RegionFragmentBindsModule {
    @Binds
    fun bindFragment(fragment: RegionFragment): Fragment
}
