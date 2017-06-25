package dhbkhn.kien.baseallapp.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import dhbkhn.kien.baseallapp.R;

/**
 * Created by kiend on 6/23/2017.
 */

public final class AppUtils {

    private AppUtils(){

    }

    public static void openPlayStoreForApp(Context context) {
        final String appPackageName = context.getPackageName();
        try {
            context.startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse(context
                            .getResources()
                            .getString(R.string.app_market_link) + appPackageName)));
        } catch (android.content.ActivityNotFoundException e) {
            context.startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse(context
                            .getResources()
                            .getString(R.string.app_google_play_store_link) + appPackageName)));
        }
    }
}
