package com.community.jboss.leadmanagement.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import java.util.*

@Entity(
        foreignKeys =
        [ForeignKey(entity = Contact::class, parentColumns = ["id"], childColumns = ["contactId"], onDelete = ForeignKey.CASCADE)])
data class ContactNumber @JvmOverloads constructor(
        @PrimaryKey @NonNull
        private val id:String = UUID.randomUUID().toString(),
        @NonNull
        private val contactId:String,
        @NonNull
        private var number:String
)