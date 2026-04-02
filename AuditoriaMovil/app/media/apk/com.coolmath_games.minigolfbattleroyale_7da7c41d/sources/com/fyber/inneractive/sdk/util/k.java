package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
/* loaded from: classes.dex */
public final class k extends l {
    public static String a() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) p().getSystemService("phone");
            String networkOperator = telephonyManager.getNetworkOperator();
            if (telephonyManager.getPhoneType() == 2) {
                TelephonyManager telephonyManager2 = (TelephonyManager) p().getSystemService("phone");
                return telephonyManager2 != null && telephonyManager2.getSimState() == 5 ? telephonyManager.getSimOperator() : networkOperator;
            }
            return networkOperator;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean b() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) p().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (l.d("android.permission.ACCESS_NETWORK_STATE") && activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnectedOrConnecting()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            IAlog.e("Error retrieved when trying to get the network state - Perhaps you forgot to declare android.permission.ACCESS_NETWORK_STATE in your Android manifest file.", new Object[0]);
            return true;
        }
    }

    public static int c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) p().getSystemService("connectivity");
            if (!l.d("android.permission.ACCESS_NETWORK_STATE") || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 8;
            }
            return activeNetworkInfo.getType();
        } catch (Exception unused) {
            return 8;
        }
    }

    public static int d() {
        try {
            if (l.d("android.permission.READ_PHONE_STATE")) {
                TelephonyManager telephonyManager = (TelephonyManager) p().getSystemService("phone");
                return Build.VERSION.SDK_INT >= 24 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String e() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static String f() {
        return a.getPackageName();
    }

    public static String a(Context context) {
        return context.getPackageName();
    }

    public static String g() {
        try {
            return p().getPackageManager().getPackageInfo(p().getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String h() {
        try {
            return ((TelephonyManager) p().getSystemService("phone")).getNetworkCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String i() {
        try {
            return ((TelephonyManager) p().getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a(Intent intent) {
        int i;
        try {
            i = p().getPackageManager().queryIntentActivities(intent, 0).size();
        } catch (Throwable unused) {
            i = 0;
        }
        return i > 0;
    }

    public static boolean j() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return a(intent);
    }

    public static boolean k() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return a(intent);
    }

    public static boolean l() {
        return "mounted".equals(l.y()) && p().checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public static boolean m() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"));
    }

    public static boolean n() {
        boolean z = (p().getResources().getConfiguration().screenLayout & 15) == 4;
        IAlog.a("This device has a tablet resolution? %s", Boolean.valueOf(z));
        return z;
    }

    public static String a(String str) {
        return str == null ? "" : str.substring(0, f(str));
    }

    public static String b(String str) {
        return str == null ? "" : str.substring(f(str));
    }

    private static int f(String str) {
        return Math.min(3, str.length());
    }

    public static boolean o() {
        if (p().getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", p().getPackageName()) != 0) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) p().getSystemService("connectivity");
        try {
            if (connectivityManager.getNetworkInfo(1).getState() != NetworkInfo.State.CONNECTED) {
                if (connectivityManager.getNetworkInfo(1).getState() != NetworkInfo.State.CONNECTING) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
