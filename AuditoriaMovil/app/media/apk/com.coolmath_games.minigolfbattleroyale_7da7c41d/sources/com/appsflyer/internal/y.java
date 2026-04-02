package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        static final y valueOf = new y();
    }

    y() {
    }

    private static boolean valueOf(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d {
        final String AFInAppEventType;
        final String AFKeystoreWrapper;
        final String valueOf;

        d(String str, String str2, String str3) {
            this.AFKeystoreWrapper = str;
            this.valueOf = str2;
            this.AFInAppEventType = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d AFKeystoreWrapper(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        String str3 = "unknown";
        String str4 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                int i = 0;
                if (21 <= Build.VERSION.SDK_INT) {
                    Network[] allNetworks = connectivityManager.getAllNetworks();
                    int length = allNetworks.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                        if (!valueOf(networkInfo)) {
                            i++;
                        } else if (1 != networkInfo.getType()) {
                            if (networkInfo.getType() == 0) {
                            }
                        }
                    }
                } else {
                    if (!valueOf(connectivityManager.getNetworkInfo(1))) {
                        if (!valueOf(connectivityManager.getNetworkInfo(0))) {
                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            if (valueOf(activeNetworkInfo)) {
                                if (1 != activeNetworkInfo.getType()) {
                                    if (activeNetworkInfo.getType() == 0) {
                                    }
                                }
                            }
                        }
                        str3 = "MOBILE";
                    }
                    str3 = "WIFI";
                }
            }
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str2 = telephonyManager.getSimOperatorName();
        } catch (Throwable th) {
            th = th;
            str = null;
        }
        try {
            str4 = telephonyManager.getNetworkOperatorName();
            if (str4 == null || str4.isEmpty()) {
                if (2 == telephonyManager.getPhoneType()) {
                    str4 = "CDMA";
                }
            }
        } catch (Throwable th2) {
            th = th2;
            str = str4;
            str4 = str2;
            AFLogger.AFInAppEventType("Exception while collecting network info. ", th);
            String str5 = str;
            str2 = str4;
            str4 = str5;
            return new d(str3, str4, str2);
        }
        return new d(str3, str4, str2);
    }
}
