package jp.cordea.fluxdemo.di

import dagger.Module
import jp.cordea.fluxdemo.ui.login.LoginActivityModule
import jp.cordea.fluxdemo.ui.main.MainActivityModule
import jp.cordea.fluxdemo.ui.regiondetail.RegionDetailActivityModule

@Module(
    includes = [
        MainActivityModule::class,
        LoginActivityModule::class,
        RegionDetailActivityModule::class
    ]
)
class ActivityModule
