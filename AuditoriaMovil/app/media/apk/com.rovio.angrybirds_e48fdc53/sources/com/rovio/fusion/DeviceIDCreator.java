package com.rovio.fusion;

import android.app.Activity;
import android.content.SharedPreferences;
import android.provider.Settings;
import java.util.UUID;
/* loaded from: classes2.dex */
class DeviceIDCreator {
    private static String sm_androidId;

    DeviceIDCreator() {
    }

    public static String getUniqueId() {
        if (sm_androidId == null) {
            createDeviceID();
        }
        return sm_androidId;
    }

    public static void createDeviceID() {
        Activity activity = Globals.getActivity();
        sm_androidId = Settings.Secure.getString(activity.getContentResolver(), "android_id");
        if (sm_androidId == null || sm_androidId.equals("9774d56d682e549c")) {
            SharedPreferences sharedPreferences = activity.getSharedPreferences("ANDROID_ID_WORKAROUND", 0);
            if (!sharedPreferences.contains("UDID")) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("UDID", UUID.randomUUID().toString());
                edit.commit();
            }
            sm_androidId = sharedPreferences.getString("UDID", null);
        }
        if (sm_androidId == null) {
            sm_androidId = "";
        }
    }
}
