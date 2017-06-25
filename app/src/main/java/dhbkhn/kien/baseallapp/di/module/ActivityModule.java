package dhbkhn.kien.baseallapp.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import dagger.Module;
import dagger.Provides;
import dhbkhn.kien.baseallapp.di.ActivityContext;
import dhbkhn.kien.baseallapp.di.PerActivity;
import dhbkhn.kien.baseallapp.ui.home.HomeMvpPresenter;
import dhbkhn.kien.baseallapp.ui.home.HomeMvpView;
import dhbkhn.kien.baseallapp.ui.home.HomePresenter;
import dhbkhn.kien.baseallapp.utils.rx.AppSchedulerProvider;
import dhbkhn.kien.baseallapp.utils.rx.SchedulerProvider;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by kiend on 6/24/2017.
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity mActivity) {
        this.mActivity = mActivity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity(){
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable(){
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider(){
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    HomeMvpPresenter<HomeMvpView> provideHomePresenter(HomePresenter<HomeMvpView> presenter){
        return presenter;
    }

}
