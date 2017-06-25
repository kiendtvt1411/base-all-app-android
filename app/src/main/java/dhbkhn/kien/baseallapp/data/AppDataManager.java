package dhbkhn.kien.baseallapp.data;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import dhbkhn.kien.baseallapp.data.db.DbHelper;
import dhbkhn.kien.baseallapp.data.network.ApiHelper;
import dhbkhn.kien.baseallapp.data.prefs.PrefsHelper;
import dhbkhn.kien.baseallapp.di.ApplicationContext;

/**
 * Created by kiend on 6/23/2017.
 */

@Singleton
public class AppDataManager implements DataManager{

    private static final String TAG = "AppDataManager";

    private final Context mContext;
    private final DbHelper mDbHelper;
    private final PrefsHelper mPrefsHelper;
    private final ApiHelper mApiHelper;

    @Inject
    public AppDataManager(@ApplicationContext Context mContext,
                          DbHelper mDbHelper,
                          PrefsHelper mPrefsHelper,
                          ApiHelper mApiHelper) {
        this.mContext = mContext;
        this.mDbHelper = mDbHelper;
        this.mPrefsHelper = mPrefsHelper;
        this.mApiHelper = mApiHelper;
    }

    @Override
    public String getAcessToken() {
        return null;
    }

    @Override
    public void setAccessToken(String accessToken) {

    }
}
