package e.d.d.m.j.j;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public class e0 {
    public final SharedPreferences a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.d.g f7157b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7158c;

    /* renamed from: d  reason: collision with root package name */
    public TaskCompletionSource<Void> f7159d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7160e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7161f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f7162g;

    /* renamed from: h  reason: collision with root package name */
    public final TaskCompletionSource<Void> f7163h;

    public e0(e.d.d.g gVar) {
        Boolean bool;
        Object obj = new Object();
        this.f7158c = obj;
        this.f7159d = new TaskCompletionSource<>();
        this.f7160e = false;
        this.f7161f = false;
        this.f7163h = new TaskCompletionSource<>();
        gVar.a();
        Context context = gVar.f7040d;
        this.f7157b = gVar;
        SharedPreferences h2 = l.h(context);
        this.a = h2;
        if (h2.contains("firebase_crashlytics_collection_enabled")) {
            this.f7161f = false;
            bool = Boolean.valueOf(h2.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            bool = null;
        }
        this.f7162g = bool == null ? a(context) : bool;
        synchronized (obj) {
            if (b()) {
                this.f7159d.trySetResult(null);
                this.f7160e = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "firebase_crashlytics_collection_enabled"
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r2 == 0) goto L3b
            java.lang.String r5 = r5.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = r2.getApplicationInfo(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r5 == 0) goto L3b
            android.os.Bundle r2 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r2 == 0) goto L3b
            boolean r2 = r2.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r2 == 0) goto L3b
            android.os.Bundle r5 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            boolean r5 = r5.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            goto L3c
        L2a:
            r5 = move-exception
            e.d.d.m.j.f r0 = e.d.d.m.j.f.a
            r2 = 6
            boolean r0 = r0.a(r2)
            if (r0 == 0) goto L3b
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r2 = "Could not read data collection permission from manifest"
            android.util.Log.e(r0, r2, r5)
        L3b:
            r5 = r1
        L3c:
            if (r5 != 0) goto L42
            r5 = 0
            r4.f7161f = r5
            return r1
        L42:
            r0 = 1
            r4.f7161f = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r5 = r0.equals(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.d.m.j.j.e0.a(android.content.Context):java.lang.Boolean");
    }

    public synchronized boolean b() {
        boolean booleanValue;
        Boolean bool = this.f7162g;
        booleanValue = bool != null ? bool.booleanValue() : this.f7157b.i();
        String str = booleanValue ? "ENABLED" : "DISABLED";
        String str2 = this.f7162g == null ? "global Firebase setting" : this.f7161f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
        String.format("Crashlytics automatic data collection %s by %s.", str, str2);
        fVar.a(3);
        return booleanValue;
    }

    public synchronized void c(Boolean bool) {
        Boolean a;
        if (bool != null) {
            try {
                this.f7161f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a = bool;
        } else {
            e.d.d.g gVar = this.f7157b;
            gVar.a();
            a = a(gVar.f7040d);
        }
        this.f7162g = a;
        SharedPreferences.Editor edit = this.a.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
        synchronized (this.f7158c) {
            if (b()) {
                if (!this.f7160e) {
                    this.f7159d.trySetResult(null);
                    this.f7160e = true;
                }
            } else if (this.f7160e) {
                this.f7159d = new TaskCompletionSource<>();
                this.f7160e = false;
            }
        }
    }
}
