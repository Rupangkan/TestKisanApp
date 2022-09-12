package com.example.testkisanapp.di

import android.app.Application
import androidx.room.Room
import com.example.testkisanapp.common.Constants.DATABASE_NAME
import com.example.testkisanapp.models.database.RDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRoomDatabase(app: Application): RDatabase {
        return Room.databaseBuilder(
            app,
            RDatabase::class.java,
            DATABASE_NAME
        ).build()

    }

}