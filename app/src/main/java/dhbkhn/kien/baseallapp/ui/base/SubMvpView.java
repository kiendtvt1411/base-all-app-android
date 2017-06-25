package dhbkhn.kien.baseallapp.ui.base;

/**
 * Created by kiend on 6/23/2017.
 */

public interface SubMvpView extends MvpView{

    void onCreate();

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroy();

    void attachParentMvpView(MvpView mvpView);
}
