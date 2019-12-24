package com.community.jboss.leadmanagement.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull

@Entity
data class Tag(
        @PrimaryKey @NonNull
        private val id:String,
        @NonNull
        private val tag:String
)