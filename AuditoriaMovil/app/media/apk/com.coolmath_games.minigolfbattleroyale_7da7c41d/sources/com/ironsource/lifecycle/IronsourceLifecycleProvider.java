package com.ironsource.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
/* loaded from: classes2.dex */
public class IronsourceLifecycleProvider extends ContentProvider {
    private static boolean a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return a;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        a = true;
        d a2 = d.a();
        Context context = getContext();
        if (d.a.compareAndSet(false, true)) {
            a2.b = new Handler(Looper.getMainLooper());
            Application application = (Application) context.getApplicationContext();
            if (application != null) {
                application.registerActivityLifecycleCallbacks(a2);
            }
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
