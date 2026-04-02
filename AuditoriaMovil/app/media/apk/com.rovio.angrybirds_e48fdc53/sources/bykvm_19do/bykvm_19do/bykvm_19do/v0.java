package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.IBinder;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import bykvm_19do.bykvm_19do.bykvm_19do.a1;
import bykvm_19do.bykvm_19do.bykvm_19do.h1;
import bykvm_19do.bykvm_19do.bykvm_19do.j1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v0 implements a1 {
    private static final o0<Boolean> a = new a();

    /* loaded from: classes.dex */
    static final class a extends o0<Boolean> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // bykvm_19do.bykvm_19do.bykvm_19do.o0
        /* renamed from: c */
        public Boolean a(Object... objArr) {
            return Boolean.valueOf(u0.a((Context) objArr[0], "com.huawei.hwid"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b implements j1.b<h1, Pair<String, Boolean>> {
        b() {
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_19do.j1.b
        public Pair<String, Boolean> a(h1 h1Var) {
            if (h1Var == null) {
                return null;
            }
            return new Pair<>(h1Var.a(), Boolean.valueOf(h1Var.c()));
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_19do.j1.b
        /* renamed from: b */
        public h1 a(IBinder iBinder) {
            return h1.a.a(iBinder);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends a1.a {
        long c = 0;

        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Context context) {
        if (context == null) {
            return false;
        }
        return a.b(context).booleanValue();
    }

    private static int e(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    private static Pair<String, Boolean> f(Context context) {
        return (Pair) new j1(context, new Intent("com.uodis.opendevice.OPENIDS_SERVICE").setPackage("com.huawei.hwid"), new b()).a();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.a1
    public boolean a(Context context) {
        return d(context);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_19do.a1
    /* renamed from: c */
    public c b(Context context) {
        String string;
        String string2;
        c cVar = new c();
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                string = Settings.Global.getString(context.getContentResolver(), "pps_oaid");
                string2 = Settings.Global.getString(context.getContentResolver(), "pps_track_limit");
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (!TextUtils.isEmpty(string)) {
                cVar.a = string;
                cVar.b = Boolean.parseBoolean(string2);
                cVar.c = 202003021704L;
                return cVar;
            }
        }
        Pair<String, Boolean> f = f(context);
        if (f != null) {
            cVar.a = (String) f.first;
            cVar.b = ((Boolean) f.second).booleanValue();
            cVar.c = e(context);
        }
        return cVar;
    }
}
