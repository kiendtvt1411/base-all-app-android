package dhbkhn.kien.baseallapp.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by kiend on 6/23/2017.
 */

public interface MvpView {

    void showLoading();

    void hideLoading();

    void openActivityOnTokenExpire();

    void onError(String message);

    void onError(@StringRes int resId);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

    void hideKeyboard();

}
