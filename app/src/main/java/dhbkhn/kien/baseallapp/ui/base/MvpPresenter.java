package dhbkhn.kien.baseallapp.ui.base;

import com.androidnetworking.error.ANError;

/**
 * Created by kiend on 6/23/2017.
 */

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

    void onDetach();

    void handleApiError(ANError error);

    void setUserAsLoggedOut();
}
