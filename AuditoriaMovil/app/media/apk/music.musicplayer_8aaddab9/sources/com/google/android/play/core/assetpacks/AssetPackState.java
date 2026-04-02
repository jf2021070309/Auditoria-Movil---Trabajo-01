package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import e.d.b.d.a;
import e.d.b.e.a.a.e0;
import e.d.b.e.a.a.t0;
import e.d.b.e.a.a.w;
/* loaded from: classes2.dex */
public abstract class AssetPackState {
    public static AssetPackState a(Bundle bundle, String str, t0 t0Var, w wVar) {
        double doubleValue;
        int b2 = wVar.b(bundle.getInt(a.c("status", str)), str);
        int i2 = bundle.getInt(a.c("error_code", str));
        long j2 = bundle.getLong(a.c("bytes_downloaded", str));
        long j3 = bundle.getLong(a.c("total_bytes_to_download", str));
        synchronized (t0Var) {
            Double d2 = t0Var.a.get(str);
            doubleValue = d2 == null ? 0.0d : d2.doubleValue();
        }
        return b(str, b2, i2, j2, j3, doubleValue);
    }

    public static AssetPackState b(String str, int i2, int i3, long j2, long j3, double d2) {
        return new e0(str, i2, i3, j2, j3, (int) Math.rint(100.0d * d2));
    }

    public abstract long c();

    public abstract int d();

    public abstract String e();

    public abstract int f();

    public abstract long g();

    public abstract int h();
}
