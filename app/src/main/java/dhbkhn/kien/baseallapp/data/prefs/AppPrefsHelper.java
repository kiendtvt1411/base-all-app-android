package dhbkhn.kien.baseallapp.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

import dhbkhn.kien.baseallapp.di.ApplicationContext;
import dhbkhn.kien.baseallapp.di.PreferenceInfo;

/**
 * Created by kiend on 6/23/2017.
 */

public class AppPrefsHelper implements PrefsHelper{

    private final SharedPreferences mPrefs;

    @Inject
    public AppPrefsHelper(@ApplicationContext Context context,
                          @PreferenceInfo String prefFilename) {
        mPrefs = context.getSharedPreferences(prefFilename, Context.MODE_PRIVATE);
    }

    @Override
    public String getAcessToken() {
        return null;
    }

    @Override
    public void setAccessToken(String accessToken) {

    }
}
