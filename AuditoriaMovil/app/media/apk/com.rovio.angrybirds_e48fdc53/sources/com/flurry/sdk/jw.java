package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.flurry.sdk.ls;
/* loaded from: classes2.dex */
public class jw implements ls.a {
    private static final String a = jw.class.getSimpleName();
    private static jw b;
    private String c;
    private String d;

    private jw() {
        lr a2 = lr.a();
        this.c = (String) a2.a("VersionName");
        a2.a("VersionName", (ls.a) this);
        ko.a(4, a, "initSettings, VersionName = " + this.c);
    }

    public static synchronized jw a() {
        jw jwVar;
        synchronized (jw.class) {
            if (b == null) {
                b = new jw();
            }
            jwVar = b;
        }
        return jwVar;
    }

    public static String b() {
        return Build.VERSION.RELEASE;
    }

    public static String c() {
        return Build.DEVICE;
    }

    public static String d() {
        return Build.ID;
    }

    public static String e() {
        return Build.MANUFACTURER;
    }

    public static String f() {
        return Build.MODEL;
    }

    public static String a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            return "unknown";
        }
    }

    public final synchronized String g() {
        String str;
        if (!TextUtils.isEmpty(this.c)) {
            str = this.c;
        } else if (!TextUtils.isEmpty(this.d)) {
            str = this.d;
        } else {
            this.d = h();
            str = this.d;
        }
        return str;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002e -> B:5:0x0019). Please submit an issue!!! */
    private static String h() {
        PackageInfo packageInfo;
        try {
            Context context = ka.a().a;
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th) {
            ko.a(6, a, "", th);
        }
        if (packageInfo.versionName != null) {
            return packageInfo.versionName;
        }
        if (packageInfo.versionCode != 0) {
            return Integer.toString(packageInfo.versionCode);
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    @Override // com.flurry.sdk.ls.a
    public final void a(String str, Object obj) {
        if (str.equals("VersionName")) {
            this.c = (String) obj;
            ko.a(4, a, "onSettingUpdate, VersionName = " + this.c);
            return;
        }
        ko.a(6, a, "onSettingUpdate internal error!");
    }
}
