package com.community.jboss.leadmanagement.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.support.annotation.NonNull

@Entity(primaryKeys = ["contactId", "tagId"], foreignKeys = [ForeignKey(entity = Contact::class, parentColumns = ["id"], childColumns = ["contactId"]), ForeignKey(entity = Tag::class, parentColumns = ["id"], childColumns = ["tagId"])])
data class ContactTagJoin(
        @NonNull
        private val contactId:String,
        @NonNull
        private val tagId:String
)