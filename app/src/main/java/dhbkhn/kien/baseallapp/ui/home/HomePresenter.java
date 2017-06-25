package dhbkhn.kien.baseallapp.ui.home;

import javax.inject.Inject;

import dhbkhn.kien.baseallapp.data.DataManager;
import dhbkhn.kien.baseallapp.ui.base.BasePresenter;
import dhbkhn.kien.baseallapp.utils.rx.SchedulerProvider;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by kiend on 6/24/2017.
 */

public class HomePresenter<V extends HomeMvpView> extends BasePresenter<V>
        implements HomeMvpPresenter<V>{

    private static final String TAG = "HomePresenter";

    @Inject
    public HomePresenter(DataManager mDataManager, SchedulerProvider mSchedulerProvider, CompositeDisposable mCompositeDisposable) {
        super(mDataManager, mSchedulerProvider, mCompositeDisposable);
    }
}
