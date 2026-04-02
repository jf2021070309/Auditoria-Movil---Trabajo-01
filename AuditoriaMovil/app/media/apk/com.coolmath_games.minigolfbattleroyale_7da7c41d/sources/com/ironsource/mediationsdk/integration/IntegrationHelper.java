package com.ironsource.mediationsdk.integration;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.ironsource.mediationsdk.E;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.warren.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class IntegrationHelper {
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(android.app.Activity r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.integration.IntegrationHelper.a(android.app.Activity, java.lang.String):boolean");
    }

    private static boolean a(Activity activity, String[] strArr) {
        boolean z = true;
        if (strArr == null) {
            return true;
        }
        PackageManager packageManager = activity.getPackageManager();
        Log.i("IntegrationHelper", "*** Services ***");
        for (String str : strArr) {
            try {
            } catch (ClassNotFoundException unused) {
                Log.e("IntegrationHelper", str + " - MISSING");
            }
            if (packageManager.queryIntentServices(new Intent(activity, Class.forName(str)), 65536).size() > 0) {
                Log.i("IntegrationHelper", str + " - VERIFIED");
            } else {
                Log.e("IntegrationHelper", str + " - MISSING");
                z = false;
            }
        }
        return z;
    }

    private static boolean a(Context context, String[] strArr) {
        boolean z;
        String str;
        List<PackageInfo> installedPackages;
        ArrayList arrayList = new ArrayList();
        if (context != null && (installedPackages = context.getPackageManager().getInstalledPackages(8)) != null) {
            for (PackageInfo packageInfo : installedPackages) {
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                if (providerInfoArr != null) {
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        arrayList.add(providerInfo.name);
                    }
                }
            }
        }
        boolean z2 = true;
        if (strArr != null) {
            Log.i("IntegrationHelper", "*** Content Providers ***");
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str2 = strArr[i];
                if (arrayList.contains(str2)) {
                    z = z2;
                    str = "- VERIFIED";
                } else {
                    str = "- MISSING";
                    z = false;
                }
                Log.d("IntegrationHelper", str2 + str);
                i++;
                z2 = z;
            }
        }
        return z2;
    }

    private static boolean a(ArrayList<Pair<String, String>> arrayList) {
        boolean z = true;
        if (arrayList == null) {
            return true;
        }
        Log.i("IntegrationHelper", "*** External Libraries ***");
        Iterator<Pair<String, String>> it = arrayList.iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            try {
                Class.forName((String) next.first);
                Log.i("IntegrationHelper", ((String) next.second) + " - VERIFIED");
            } catch (ClassNotFoundException unused) {
                z = false;
                Log.e("IntegrationHelper", ((String) next.second) + " - MISSING");
            }
        }
        return z;
    }

    private static IntegrationData b(Activity activity, String str) {
        String str2;
        try {
            IntegrationData integrationData = (IntegrationData) Class.forName(str).getMethod("getIntegrationData", Activity.class).invoke(null, activity);
            Log.i("IntegrationHelper", "Adapter " + integrationData.version + " - VERIFIED");
            return integrationData;
        } catch (ClassNotFoundException unused) {
            str2 = "Adapter - MISSING";
            Log.e("IntegrationHelper", str2);
            return null;
        } catch (Exception unused2) {
            str2 = "Adapter version - NOT VERIFIED";
            Log.e("IntegrationHelper", str2);
            return null;
        }
    }

    private static boolean b(Activity activity, String[] strArr) {
        boolean z = true;
        if (strArr == null) {
            return true;
        }
        Log.i("IntegrationHelper", "*** Activities ***");
        for (String str : strArr) {
            try {
            } catch (ClassNotFoundException unused) {
                Log.e("IntegrationHelper", str + " - MISSING");
            }
            if (activity.getPackageManager().queryIntentActivities(new Intent(activity, Class.forName(str)), 65536).size() > 0) {
                Log.i("IntegrationHelper", str + " - VERIFIED");
            } else {
                Log.e("IntegrationHelper", str + " - MISSING");
                z = false;
            }
        }
        return z;
    }

    public static void validateIntegration(final Activity activity) {
        Log.i("IntegrationHelper", "Verifying Integration:");
        Log.i("IntegrationHelper", "*** Permissions ***");
        PackageManager packageManager = activity.getPackageManager();
        if (packageManager.checkPermission("android.permission.INTERNET", activity.getPackageName()) == 0) {
            Log.i("IntegrationHelper", "android.permission.INTERNET - VERIFIED");
        } else {
            Log.e("IntegrationHelper", "android.permission.INTERNET - MISSING");
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", activity.getPackageName()) == 0) {
            Log.i("IntegrationHelper", "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
        } else {
            Log.e("IntegrationHelper", "android.permission.ACCESS_NETWORK_STATE - MISSING");
        }
        String[] strArr = {"AdColony", "AdMob", "AppLovin", "Chartboost", "Facebook", "Fyber", "HyprMX", "InMobi", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "Maio", "MyTarget", "Pangle", "Smaato", "Tapjoy", "UnityAds", BuildConfig.OMSDK_PARTNER_NAME};
        for (int i = 0; i < 16; i++) {
            String str = strArr[i];
            if (a(activity, str)) {
                Log.i("IntegrationHelper", str.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) ? ">>>> IronSource - VERIFIED" : ">>>> " + str + " - VERIFIED");
            } else {
                Log.e("IntegrationHelper", str.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) ? ">>>> IronSource - NOT VERIFIED" : ">>>> " + str + " - NOT VERIFIED");
            }
        }
        new Thread() { // from class: com.ironsource.mediationsdk.integration.IntegrationHelper.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                try {
                    Log.w("IntegrationHelper", "--------------- Google Play Services --------------");
                    if (!activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                        Log.e("IntegrationHelper", "Google Play Services - MISSING");
                        return;
                    }
                    Log.i("IntegrationHelper", "Google Play Services - VERIFIED");
                    E.a();
                    String a = E.a(activity);
                    if (TextUtils.isEmpty(a)) {
                        return;
                    }
                    Log.i("IntegrationHelper", "GAID is: " + a + " (use this for test devices)");
                } catch (Exception unused) {
                    Log.e("IntegrationHelper", "Google Play Services - MISSING");
                }
            }
        }.start();
    }
}
