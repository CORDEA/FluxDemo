package jp.cordea.fluxdemo.ui.app

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.cordea.fluxdemo.di.FragmentScope

@Module
interface AppFragmentModule {
    @FragmentScope
    @ContributesAndroidInjector
    fun contributeAppFragment(): AppFragment
}
