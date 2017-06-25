package dhbkhn.kien.baseallapp.di.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import dhbkhn.kien.baseallapp.BaseApp;
import dhbkhn.kien.baseallapp.data.DataManager;
import dhbkhn.kien.baseallapp.di.ApplicationContext;
import dhbkhn.kien.baseallapp.di.module.ApplicationModule;
import dhbkhn.kien.baseallapp.service.SyncService;

/**
 * Created by kiend on 6/25/2017.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(BaseApp app);

    void inject(SyncService service);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}
