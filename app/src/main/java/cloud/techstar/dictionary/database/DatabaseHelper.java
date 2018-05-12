package cloud.techstar.dictionary.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import cloud.techstar.dictionary.AppMain;

public class DatabaseHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "dictionary.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper() {
        super(AppMain.getContext(), DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF NOT EXISTS ");
        onCreate(db);
    }
}
