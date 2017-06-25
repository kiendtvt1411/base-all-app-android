package dhbkhn.kien.baseallapp.data.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import javax.inject.Inject;
import javax.inject.Singleton;

import dhbkhn.kien.baseallapp.data.db.model.DaoMaster;
import dhbkhn.kien.baseallapp.di.ApplicationContext;
import dhbkhn.kien.baseallapp.di.DatabaseInfo;

/**
 * Created by kiend on 6/23/2017.
 */

@Singleton
public class DbOpenHelper extends DaoMaster.OpenHelper{

    @Inject
    public DbOpenHelper(@ApplicationContext Context context, @DatabaseInfo String name) {
        super(context, name);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
        switch (oldVersion) {
            case 1:
            case 2:
                //db.execSQL("ALTER TABLE " + UserDao.TABLENAME + " ADD COLUMN "
                // + UserDao.Properties.Name.columnName + " TEXT DEFAULT 'DEFAULT_VAL'");
        }
    }
}
