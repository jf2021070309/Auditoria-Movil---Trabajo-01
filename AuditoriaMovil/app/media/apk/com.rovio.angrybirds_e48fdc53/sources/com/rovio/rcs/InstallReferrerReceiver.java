package com.rovio.rcs;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.rovio.fusion.Globals;
/* loaded from: classes4.dex */
public class InstallReferrerReceiver extends BroadcastReceiver {
    private static final String REFERRER_KEY = "saved_referrer";
    private static final String REFERRER_TAG = ".REFERRER_TAG";
    private static final String TAG = "InstallReferrerReceiver";
    private static boolean m_canUseAnalytics = false;

    private static native void sendReferrer(String str);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive() for " + intent.getAction());
        try {
            Object newInstanceIfAvailable = Globals.newInstanceIfAvailable("com.adjust.sdk.AdjustReferrerReceiver");
            if (newInstanceIfAvailable != null) {
                newInstanceIfAvailable.getClass().getDeclaredMethod("onReceive", Context.class, Intent.class).invoke(newInstanceIfAvailable, context, intent);
            }
        } catch (Exception e) {
            Log.e(TAG, "Failed to call INSTALL_REFERRER receiver: " + e.toString());
        }
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action) && action.equals("com.android.vending.INSTALL_REFERRER")) {
            String stringExtra = intent.getStringExtra("referrer");
            synchronized (InstallReferrerReceiver.class) {
                if (!TextUtils.isEmpty(stringExtra)) {
                    Log.d(TAG, "Google Play referrer: " + stringExtra);
                    if (m_canUseAnalytics) {
                        sendReferrer(stringExtra);
                    } else {
                        storeReferrer(context, stringExtra);
                    }
                } else {
                    Log.d(TAG, "Warning: Empty Google Play referrer");
                }
            }
        }
    }

    public static synchronized void sendReferrerIfAvailable() {
        synchronized (InstallReferrerReceiver.class) {
            Log.d(TAG, "onAnalyticsInitialized");
            m_canUseAnalytics = true;
            try {
                Activity activity = Globals.getActivity();
                String string = activity.getSharedPreferences(getSharedPreferenceName(activity), 0).getString(REFERRER_KEY, "");
                if (!TextUtils.isEmpty(string)) {
                    sendReferrer(string);
                    storeReferrer(activity, "");
                }
            } catch (Exception e) {
                Log.e(TAG, "Failed to check shared preferences: " + e.toString());
            }
        }
    }

    private static synchronized void storeReferrer(Context context, String str) {
        synchronized (InstallReferrerReceiver.class) {
            Log.d(TAG, "storeReferrer");
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(getSharedPreferenceName(context), 0).edit();
                edit.putString(REFERRER_KEY, str);
                edit.commit();
            } catch (Exception e) {
                Log.e(TAG, "Failed to store shared preferences: " + e.toString());
            }
        }
    }

    private static String getSharedPreferenceName(Context context) {
        return context.getApplicationContext().getPackageName() + REFERRER_TAG;
    }
}
