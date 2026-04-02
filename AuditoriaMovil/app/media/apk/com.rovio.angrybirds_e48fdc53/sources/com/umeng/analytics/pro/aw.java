package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
/* compiled from: DeviceIdSupplier.java */
/* loaded from: classes3.dex */
public class aw {
    private static final String a = "ro.build.version.emui";
    private static final String b = "hw_sc.build.platform.version";

    public static at a(Context context) {
        String str = Build.BRAND;
        bf.a("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("huawei") || str.equalsIgnoreCase("honor") || str.equalsIgnoreCase("华为")) {
            return new ax();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米") || str.equalsIgnoreCase("blackshark")) {
            return new be();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new bd();
        }
        if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase("oneplus") || str.equalsIgnoreCase("realme")) {
            return new bb();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            return new ay();
        }
        if (str.equalsIgnoreCase("nubia")) {
            return new ba();
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("SAMSUNG")) {
            return new bc();
        }
        if (b()) {
            return new av();
        }
        if (a()) {
            return new ax();
        }
        if (str.equalsIgnoreCase("meizu") || str.equalsIgnoreCase("mblu")) {
            return new az();
        }
        return null;
    }

    private static boolean a() {
        String a2 = a(a);
        String a3 = a(b);
        if (!TextUtils.isEmpty(a2) || !TextUtils.isEmpty(a3)) {
            return true;
        }
        return false;
    }

    private static boolean b() {
        if (!TextUtils.isEmpty(a("ro.coolos.version"))) {
            return true;
        }
        return false;
    }

    private static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod(MonitorConstants.CONNECT_TYPE_GET, String.class).invoke(null, str);
        } catch (Throwable th) {
            return "";
        }
    }
}
