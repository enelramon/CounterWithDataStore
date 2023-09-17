package com.ucne.giraffetest.di

import android.content.Context
import androidx.room.Room
import com.ucne.giraffetest.data.local.TicketDb
import com.ucne.giraffetest.data.repository.CounterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn ( SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providesTicketDatabase(@ApplicationContext appContext: Context): TicketDb =
        Room.databaseBuilder(
            appContext,
            TicketDb::class.java,
            "Ticket.db")
            .fallbackToDestructiveMigration()
            .build()

    @Singleton
    @Provides
    fun providePreferences(@ApplicationContext context: Context) = CounterRepository(context)
}