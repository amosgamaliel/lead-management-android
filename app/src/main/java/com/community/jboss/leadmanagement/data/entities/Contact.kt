package com.community.jboss.leadmanagement.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import java.util.*

@Entity
data class Contact(
        @PrimaryKey
        val id:String = UUID.randomUUID().toString(),
    var name:String,
    var mail:String,
    var image: ByteArray,
    var query: String,
    var location:String,
    var notes:String
)