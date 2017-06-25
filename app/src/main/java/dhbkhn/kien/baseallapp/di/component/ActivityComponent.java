package dhbkhn.kien.baseallapp.di.component;

import dagger.Component;
import dhbkhn.kien.baseallapp.di.PerActivity;
import dhbkhn.kien.baseallapp.di.module.ActivityModule;
import dhbkhn.kien.baseallapp.ui.home.HomeActivity;

/**
 * Created by kiend on 6/25/2017.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(HomeActivity activity);
}
