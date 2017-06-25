package dhbkhn.kien.baseallapp.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dhbkhn.kien.baseallapp.R;
import dhbkhn.kien.baseallapp.ui.base.BaseActivity;

public class HomeActivity extends BaseActivity implements HomeMvpView{

    @Inject
    HomeMvpPresenter<HomeMvpView> mPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, HomeActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(this);

        setUp();
    }

    @Override
    protected void setUp() {

    }
}
