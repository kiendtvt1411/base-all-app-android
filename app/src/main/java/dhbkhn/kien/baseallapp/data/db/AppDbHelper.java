package dhbkhn.kien.baseallapp.data.db;

import javax.inject.Inject;
import javax.inject.Singleton;

import dhbkhn.kien.baseallapp.data.db.model.DaoMaster;
import dhbkhn.kien.baseallapp.data.db.model.DaoSession;

/**
 * Created by kiend on 6/23/2017.
 */

@Singleton
public class AppDbHelper implements DbHelper{

    private final DaoSession mDaoSession;

    @Inject
    public AppDbHelper(DbOpenHelper dbOpenHelper) {
        mDaoSession = new DaoMaster(dbOpenHelper.getWritableDb()).newSession();
    }

}
