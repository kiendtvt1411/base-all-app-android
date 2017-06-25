package dhbkhn.kien.baseallapp.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dhbkhn.kien.baseallapp.R;
import dhbkhn.kien.baseallapp.data.AppDataManager;
import dhbkhn.kien.baseallapp.data.DataManager;
import dhbkhn.kien.baseallapp.data.db.AppDbHelper;
import dhbkhn.kien.baseallapp.data.db.DbHelper;
import dhbkhn.kien.baseallapp.data.network.ApiHeader;
import dhbkhn.kien.baseallapp.data.network.ApiHelper;
import dhbkhn.kien.baseallapp.data.network.AppApiHelper;
import dhbkhn.kien.baseallapp.data.prefs.AppPrefsHelper;
import dhbkhn.kien.baseallapp.data.prefs.PrefsHelper;
import dhbkhn.kien.baseallapp.di.ApiInfo;
import dhbkhn.kien.baseallapp.di.ApplicationContext;
import dhbkhn.kien.baseallapp.di.DatabaseInfo;
import dhbkhn.kien.baseallapp.di.PreferenceInfo;
import dhbkhn.kien.baseallapp.utils.AppConstants;
import dhbkhn.kien.baseallapp.utils.ConfigUtils;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by kiend on 6/24/2017.
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext(){
        return mApplication;
    }

    @Provides
    Application provideApplication(){
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName(){
        return AppConstants.DB_NAME;
    }

    @Provides
    @ApiInfo
    String provideApiKey(){
        return ConfigUtils.API_KEY;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName(){
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager){
        return appDataManager;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    PrefsHelper providePrefsHelper(AppPrefsHelper appPrefsHelper) {
        return appPrefsHelper;
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @Singleton
    ApiHeader.ProtectedApiHeader provideProtectedApiHeader(@ApiInfo String apiKey,
                                                           PrefsHelper prefsHelper) {
        return new ApiHeader.ProtectedApiHeader(
                apiKey,
                null, // prefsHelper.getCurrentUserId()
                prefsHelper.getAcessToken()
        );
    }

    @Provides
    @Singleton
    CalligraphyConfig provideCalligraphyDefaultConfig(){
        return new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/source-sans-pro/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build();
    }
}
