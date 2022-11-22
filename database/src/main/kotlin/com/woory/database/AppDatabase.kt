package com.woory.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.woory.database.entity.GameTimeInfoEntity

@Database(entities = [GameTimeInfoEntity::class], version = 1)
@TypeConverters(OffsetDateTimeConverters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun promiseDao(): PromiseDao
}