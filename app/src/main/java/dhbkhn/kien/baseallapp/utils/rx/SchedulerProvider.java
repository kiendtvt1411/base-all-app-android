package dhbkhn.kien.baseallapp.utils.rx;

import io.reactivex.Scheduler;

/**
 * Created by kiend on 6/23/2017.
 */

public interface SchedulerProvider {

    Scheduler ui();

    Scheduler computation();

    Scheduler io();

}
