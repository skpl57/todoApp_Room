package com.example.todoapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Folder")
public class Folder {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nazwa;


}
