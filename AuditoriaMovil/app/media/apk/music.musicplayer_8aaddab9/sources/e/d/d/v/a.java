package e.d.d.v;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import c.i.d.a;
import e.d.d.q.c;
/* loaded from: classes.dex */
public class a {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f7626b;

    /* renamed from: c  reason: collision with root package name */
    public final c f7627c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7628d;

    public a(Context context, String str, c cVar) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            Object obj = c.i.d.a.a;
            context = i2 >= 24 ? a.e.a(context) : null;
        }
        this.a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f7626b = sharedPreferences;
        this.f7627c = cVar;
        boolean z2 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = z2;
        }
        this.f7628d = z;
    }

    public synchronized boolean a() {
        return this.f7628d;
    }
}
