package com.sirketismi.uicomponents.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo(name = "first_name") val firstname: String?,
    @ColumnInfo(name = "last_name") val lastname: String?
) {
}