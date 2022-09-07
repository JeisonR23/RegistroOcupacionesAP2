package edu.ucne.resgistroocupacionesap2.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import edu.ucne.resgistroocupacionesap2.Domain.repository.OcupacionRepository
import edu.ucne.resgistroocupacionesap2.data.DataOcupacion
import edu.ucne.resgistroocupacionesap2.data.repository.OcupationRepositoryImpl
import edu.ucne.resgistroocupacionesap2.util.DataBaseName
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object APPOcupacion {
    @Provides
    @Singleton
    fun providesregistroOcupacion(app: Application) = Room.databaseBuilder(
        app, DataOcupacion::class.java, DataBaseName
    ).build()
    @Provides
    @Singleton
    fun provideRepository(db: DataOcupacion): OcupacionRepository{
        return OcupationRepositoryImpl(db.ocupacionDao)
    }
}