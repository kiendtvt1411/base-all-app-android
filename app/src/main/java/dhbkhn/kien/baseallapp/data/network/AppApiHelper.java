package dhbkhn.kien.baseallapp.data.network;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by kiend on 6/23/2017.
 */

@Singleton
public class AppApiHelper implements ApiHelper{

    private ApiHeader mApiHeader;

    @Inject
    public AppApiHelper(ApiHeader apiHeader) {
        mApiHeader = apiHeader;
    }
}
