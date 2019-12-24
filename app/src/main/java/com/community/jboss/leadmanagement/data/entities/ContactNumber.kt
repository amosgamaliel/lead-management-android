package com.community.jboss.leadmanagement.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey

@Entity(
        foreignKeys =
        [ForeignKey(entity = Contact::class, parentColumns = ["id"], childColumns = ["contactId"], onDelete = ForeignKey.CASCADE)])
data class ContactNumber @JvmOverloads constructor(
        private val id:String,
        private val contactId:String,
        private var number:String
)