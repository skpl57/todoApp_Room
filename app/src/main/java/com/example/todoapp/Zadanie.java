package com.example.todoapp;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.time.LocalDate;

@Entity(tableName = "Zadanie")
public class Zadanie {
        @PrimaryKey(autoGenerate = true)
        public int id;
        public int idFolderu;
        public String nazwa;
        public boolean czyWykonano;
        public LocalDate kategoria;

    public Zadanie(int id, int idFolderu, String nazwa, boolean czyWykonano, LocalDate kategoria) {
        this.id = id;
        this.idFolderu = idFolderu;
        this.nazwa = nazwa;
        this.czyWykonano = czyWykonano;
        this.kategoria = kategoria;
    }
}
