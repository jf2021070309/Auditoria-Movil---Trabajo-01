package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.ez.g;
import com.google.android.gms.measurement.internal.zzgd;
import java.io.IOException;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e {
    public static int a(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static String b(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String c(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder d(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void e(zzgd zzgdVar, String str) {
        zzgdVar.zzaA().zzk().zza(str);
    }

    public static /* bridge */ /* synthetic */ void f(Object obj, int i, int i2, int i3) {
        throw null;
    }

    public static void g(Object obj, IOException iOException, com.amazon.aps.iva.i5.v vVar) {
        vVar.k(new g.a(obj, iOException));
    }
}
