package com.yb.part2_chapter04.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.yb.part2_chapter04.model.History

@Dao
interface HistoryDao {

    @Query("SELECT * FROM History")
    fun getAll(): List<History>

    @Insert
    fun insertHistory(history: History)

    @Query("DELETE FROM History")
    fun deleteAll()

}