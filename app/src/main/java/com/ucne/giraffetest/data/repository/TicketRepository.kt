package com.ucne.giraffetest.data.repository

import com.ucne.giraffetest.data.local.TicketDb
import com.ucne.giraffetest.data.local.entities.Ticket
import javax.inject.Inject

class TicketRepository @Inject constructor(
    private val ticketDb: TicketDb
) {
    suspend fun  guardarTicket(ticket: Ticket) = ticketDb.ticketDao().save(ticket)
    fun getAll() = ticketDb.ticketDao().getAll()
}

