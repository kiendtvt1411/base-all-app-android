package dhbkhn.kien.baseallapp.ui.home;

import dhbkhn.kien.baseallapp.di.PerActivity;
import dhbkhn.kien.baseallapp.ui.base.MvpPresenter;

/**
 * Created by kiend on 6/24/2017.
 */

@PerActivity
public interface HomeMvpPresenter<V extends HomeMvpView> extends MvpPresenter<V> {
}
