package jp.cordea.fluxdemo.di

import dagger.Binds
import dagger.Module
import jp.cordea.fluxdemo.ui.app.AppDataSource
import jp.cordea.fluxdemo.ui.app.AppRemoteDataSource
import jp.cordea.fluxdemo.ui.region.RegionDataSource
import jp.cordea.fluxdemo.ui.region.RegionRemoteDataSource

@Module
interface DataSourceModule {
    @Binds
    fun bindRegionDataSource(remoteDataSource: RegionRemoteDataSource): RegionDataSource

    @Binds
    fun bindAppDataSource(remoteDataSource: AppRemoteDataSource): AppDataSource
}
