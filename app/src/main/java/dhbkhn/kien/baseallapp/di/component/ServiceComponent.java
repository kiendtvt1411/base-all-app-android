package dhbkhn.kien.baseallapp.di.component;

import dagger.Component;
import dhbkhn.kien.baseallapp.di.PerService;
import dhbkhn.kien.baseallapp.di.module.ServiceModule;
import dhbkhn.kien.baseallapp.service.SyncService;

/**
 * Created by kiend on 6/25/2017.
 */

@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {

    void inject(SyncService service);
}
