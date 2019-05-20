package apssdc.in.roomdatabase.room_database_classes;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;


@Dao
public interface WordDao {

    @Insert
    void insert(Word word);

    @Query("Delete from word_table")
    void deleteAll();


    @Query("Select * From word_table ORDER BY word Asc")
    LiveData<List<Word>> getAllWords();

    /*
    We will follow the following method declaration
    if we want to delete only one entry from Database
    @Delete
    void deleteOneEntry(Word word);*/
}
