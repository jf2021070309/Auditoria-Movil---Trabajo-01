package com.adcolony.sdk;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class h {
    final int a = 30;
    String b = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx  x          xxxxxxx                          xxxx x                          xxxxx";
    String c = "0123456789ABCDEF";
    String d = "0123456789abcdef";

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (a.d()) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) a.c().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.getType() == 1;
                }
                return false;
            } catch (SecurityException e) {
                au.g.b("SecurityException - please ensure you added the ACCESS_NETWORK_STATE permission: " + e.toString());
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        if (a.d()) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) a.c().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    int type = activeNetworkInfo.getType();
                    return type == 0 || type >= 2;
                }
                return false;
            } catch (SecurityException e) {
                au.g.b("SecurityException - please ensure you added the ACCESS_NETWORK_STATE permission: " + e.toString());
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        if (a()) {
            return "wifi";
        }
        if (b()) {
            return "cell";
        }
        return "none";
    }
}
