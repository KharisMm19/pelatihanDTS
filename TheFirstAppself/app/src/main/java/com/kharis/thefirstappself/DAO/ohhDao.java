package com.kharis.thefirstappself.DAO;

import androidx.room.Insert;

import com.kharis.thefirstappself.Entity.EntityDb;

import java.util.List;

public abstract class ohhDao {
    @Insert
    abstract void InsertEntitiyDb(EntityDb entityDb);
}
