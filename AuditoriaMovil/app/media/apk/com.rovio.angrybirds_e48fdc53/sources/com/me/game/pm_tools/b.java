package com.me.game.pm_tools;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
/* loaded from: classes5.dex */
public class b extends Application {
    private static final String c = b.class.getSimpleName();
    public static b d;
    private Application a;
    private Handler b = new Handler();

    public static void attachApplication(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if ((applicationContext instanceof Application) && d == null) {
            b bVar = new b();
            d = bVar;
            Application application = (Application) applicationContext;
            bVar.a = application;
            bVar.attachBaseContext(application);
            d.onCreate();
        }
    }

    public static void d(Context context) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(g0.i);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
                context.startActivity(launchIntentForPackage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean a() {
        try {
            System.loadLibrary("mod");
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public boolean b() {
        try {
            Bundle bundle = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData;
            if (bundle == null) {
                return false;
            }
            return !TextUtils.isEmpty(bundle.getString("game_module_sdk"));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean c() {
        try {
            getPackageManager().getPackageInfo(g0.i, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void e(Runnable runnable) {
        x.b(this.b, runnable);
    }

    public void f(Runnable runnable, long j) {
        x.c(this.b, runnable, j);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        d = this;
    }
}
