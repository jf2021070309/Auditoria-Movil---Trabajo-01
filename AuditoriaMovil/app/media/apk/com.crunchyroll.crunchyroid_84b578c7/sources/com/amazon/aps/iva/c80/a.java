package com.amazon.aps.iva.c80;

import android.os.RemoteException;
import com.amazon.aps.iva.m6.f;
import com.google.android.gms.internal.ads.zzbzo;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements com.amazon.aps.iva.r6.c {
    public static int a(int i, int i2, int i3) {
        int i4 = i / i2;
        return i4 + i4 + i3;
    }

    public static int b(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static RemoteException c(String str, Throwable th) {
        zzbzo.zzh(str, th);
        return new RemoteException();
    }

    public static String d(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    @Override // com.amazon.aps.iva.r6.c
    public void g(com.amazon.aps.iva.s5.b bVar) {
        int i = f.n;
    }
}
