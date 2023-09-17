package com.ucne.giraffetest.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ucne.giraffetest.data.local.dao.TicketDao
import com.ucne.giraffetest.data.local.entities.Ticket

@Database(
    entities = [Ticket::class ],
    version = 3,
    exportSchema = false
)
abstract class TicketDb : RoomDatabase() {
    abstract fun ticketDao(): TicketDao
}