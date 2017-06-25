package dhbkhn.kien.baseallapp;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.interceptors.HttpLoggingInterceptor;

import javax.inject.Inject;

import dhbkhn.kien.baseallapp.data.DataManager;
import dhbkhn.kien.baseallapp.di.component.ApplicationComponent;
import dhbkhn.kien.baseallapp.di.component.DaggerApplicationComponent;
import dhbkhn.kien.baseallapp.di.module.ApplicationModule;
import dhbkhn.kien.baseallapp.utils.AppLogger;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by kiend on 6/23/2017.
 */

public class BaseApp extends Application {

    @Inject
    DataManager mDataManager;

    @Inject
    CalligraphyConfig mCalligraphyConfig;

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);

        AppLogger.init();

        AndroidNetworking.initialize(getApplicationContext());
        if (BuildConfig.DEBUG) {
            AndroidNetworking.enableLogging(HttpLoggingInterceptor.Level.BODY);
        }

        CalligraphyConfig.initDefault(mCalligraphyConfig);
    }

    public ApplicationComponent getComponent(){
        return mApplicationComponent;
    }

    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}
