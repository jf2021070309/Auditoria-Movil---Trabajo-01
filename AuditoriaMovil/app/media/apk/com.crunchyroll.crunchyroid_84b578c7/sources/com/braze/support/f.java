package com.braze.support;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.support.BrazeLogger;
import com.google.android.gms.common.GoogleApiAvailability;
/* loaded from: classes.dex */
public final class f {
    public static final f a = new f();

    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Google Play Services is available.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.b = i;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Google Play Services is unavailable. Connection result: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Unexpected exception while checking for com.google.android.gsf";
        }
    }

    private f() {
    }

    public static final boolean a(Context context) {
        j.f(context, "context");
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, (BrazeLogger.Priority) null, (Throwable) null, new c(isGooglePlayServicesAvailable), 3, (Object) null);
        return false;
    }

    public static final boolean b(Context context) {
        PackageManager.PackageInfoFlags of;
        j.f(context, "context");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageManager.getPackageInfo("com.google.android.gsf", of);
            } else {
                context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.W, e, d.b);
            return false;
        }
    }
}
