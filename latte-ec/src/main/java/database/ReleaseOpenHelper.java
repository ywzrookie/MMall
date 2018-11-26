package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ywz on 18-11-26.
 * Describe:
 */
public class ReleaseOpenHelper extends DaoMaster.OpenHelper {
    public ReleaseOpenHelper(Context context, String name) {
        super(context, name);
    }

    public ReleaseOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }
}
