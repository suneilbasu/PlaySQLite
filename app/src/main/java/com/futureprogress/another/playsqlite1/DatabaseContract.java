package com.futureprogress.another.playsqlite1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public final class DatabaseContract {
    public static final int DATABASE_VERSION        = 1;
    public static final String DATABSE_NAME         = "studentsDB.db";
    private static final String TEXT_TYPE           = " TEXT";
    private static final String COMMA_SEP           = ",";

    private DatabaseContract() {}

    public static abstract class Table1 implements BaseColumns {
        public static final String TABLE_NAME                   = "tblMarks";
        public static final String COLUMN_STUDENTNAME      = "studentname";
//        public static final String COLUMN_NAME_STUDENTGRADE     = "studentGrade";

        public static final String CREATE_TABLE = "CREATE TABLE " +
                TABLE_NAME + " (" +
                _ID + " INTEGER PRIMARY KEY," +
                COLUMN_STUDENTNAME + TEXT_TYPE +  " )";

        public static final String DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;



    }

    }
}
