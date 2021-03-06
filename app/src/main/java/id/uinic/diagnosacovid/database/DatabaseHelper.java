package id.uinic.diagnosacovid.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static id.uinic.diagnosacovid.util.Const.DATABASE_NAME;
import static id.uinic.diagnosacovid.util.Const.DATABASE_VERSION;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE diagnosa(nodiagnosa integer PRIMARY KEY AUTOINCREMENT, tanggal_diagnosa datetime, jawabanYa integer, result integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
