package com.unity.androidnotifications;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
/* loaded from: classes2.dex */
public class UnityNotificationUtilities {
    /* JADX INFO: Access modifiers changed from: protected */
    public static int findResourceIdInContextByName(Context context, String str) {
        if (str == null) {
            return 0;
        }
        try {
            Resources resources = context.getResources();
            if (resources != null) {
                int identifier = resources.getIdentifier(str, "mipmap", context.getPackageName());
                return identifier == 0 ? resources.getIdentifier(str, "drawable", context.getPackageName()) : identifier;
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String serializeNotificationIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        Parcel obtain = Parcel.obtain();
        extras.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        return Base64.encodeToString(marshall, 0, marshall.length, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Intent deserializeNotificationIntent(Context context, String str) {
        byte[] decode = Base64.decode(str, 0);
        Bundle bundle = new Bundle();
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
        bundle.readFromParcel(obtain);
        Intent intent = new Intent(context, UnityNotificationManager.class);
        intent.putExtras(bundle);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Class<?> getOpenAppActivity(Context context, boolean z) {
        ApplicationInfo applicationInfo;
        Class<?> cls = null;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            applicationInfo = null;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle.containsKey("custom_notification_android_activity")) {
            try {
                cls = Class.forName(bundle.getString("custom_notification_android_activity"));
            } catch (ClassNotFoundException unused) {
            }
        }
        if (cls == null && z) {
            Log.w("UnityNotifications", "No custom_notification_android_activity found, attempting to find app activity class");
            try {
                return Class.forName("com.unity3d.player.UnityPlayerActivity");
            } catch (ClassNotFoundException unused2) {
                Log.w("UnityNotifications", String.format("Attempting to find : %s, failed!", "com.unity3d.player.UnityPlayerActivity"));
                String format = String.format("%s.UnityPlayerActivity", context.getPackageName());
                try {
                    return Class.forName(format);
                } catch (ClassNotFoundException unused3) {
                    Log.w("UnityNotifications", String.format("Attempting to find class based on package name: %s, failed!", format));
                }
            }
        }
        return cls;
    }
}
